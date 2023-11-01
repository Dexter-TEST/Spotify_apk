package p.if7;
import p.ey0;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import p.tu6;
import p.a28;
import java.lang.Object;
import java.util.concurrent.CountDownLatch;
import p.g54;
import java.util.concurrent.Executor;
import p.bu0;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import java.lang.IllegalStateException;
import java.lang.Exception;
import java.lang.Throwable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.CancellationException;
import java.io.File;
import java.io.FilenameFilter;
import p.ly0;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;

public abstract class if7	// class@001985 from classes.dex
{
    public static final ey0 a;
    public static final ExecutorService b;

    static {
       if7.a = new ey0(3);
       if7.b = tu6.h("awaitEvenIfOnMainThread task continuation executor");
    }
    public static Object a(a28 p0){
       CountDownLatch uCountDownLa = new CountDownLatch(1);
       p0.h(if7.b, new g54(uCountDownLa));
       if (Looper.getMainLooper() == Looper.myLooper()) {
          uCountDownLa.await(4, TimeUnit.SECONDS);
       }else {
          uCountDownLa.await();
       }
       if (p0.f()) {
          return p0.e();
       }else if(p0.d == null){
          a28 a = p0.a;
          _monitor_enter(a);
          _monitor_exit(a);
          if (p0.c != null) {
             throw new IllegalStateException(p0.d());
          }else {
             throw new TimeoutException();
          }
       }else {
          throw new CancellationException("Task is already canceled");
       }
    }
    public static int b(File p0,FilenameFilter p1,int p2){
       File[] uFileArray;
       if ((uFileArray = p0.listFiles(p1)) == null) {
          return 0;
       }
       return if7.c(Arrays.asList(uFileArray), p2);
    }
    public static int c(List p0,int p1){
       int i = p0.size();
       Collections.sort(p0, ly0.C);
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return i;
          }
          File uFile = iterator.next();
          if (i <= p1) {
             break ;
          }else {
             if7.d(uFile);
             i = i - 1;
          }
       }
       return i;
    }
    public static void d(File p0){
       if (p0.isDirectory()) {
          File[] uFileArray = p0.listFiles();
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             if7.d(uFileArray[i]);
          }
       }
       p0.delete();
       return;
    }
}
