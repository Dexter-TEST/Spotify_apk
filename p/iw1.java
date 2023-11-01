package p.iw1;
import p.hw1;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import java.lang.Object;
import p.hn0;
import java.lang.String;
import java.lang.NullPointerException;
import java.util.concurrent.TimeUnit;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import java.lang.Error;

public abstract class iw1	// class@001a16 from classes.dex
{
    public static final hw1 a;

    static {
       iw1.a = new hw1();
    }
    public static boolean a(AtomicReference p0,Throwable p1){
       boolean b1;
       hn0 ohn0;
       while (true) {
          Throwable throwable = p0.get();
          boolean b = false;
          if (throwable == iw1.a) {
          }else {
             b1 = true;
             if (throwable == null) {
                ohn0 = p1;
             }else {
                Throwable[] throwableArr = new Throwable[2];
                throwableArr[b] = throwable;
                throwableArr[b1] = p1;
                ohn0 = new hn0(throwableArr);
             }
             while (true) {
                if (p0.compareAndSet(throwable, ohn0)) {
                   b = true;
                }else {
                   if (p0.get() == throwable) {
                      continue ;
                   }
                }
                if (b) {
                }
             }
             return b;
          }
       }
       return b1;
    }
    public static NullPointerException b(String p0){
       return new NullPointerException(p0.concat(" Null values are generally not allowed in 3.x operators and sources."));
    }
    public static void c(Object p0,String p1){
       if (p0 != null) {
          return;
       }
       throw iw1.b(p1);
    }
    public static Throwable d(AtomicReference p0){
       Throwable throwable = p0.get();
       hw1 a = iw1.a;
       if (throwable != a) {
          throwable = p0.getAndSet(a);
       }
       return throwable;
    }
    public static String e(long p0,TimeUnit p1){
       return "The source did not signal an event for "+p0+" "+p1.toString().toLowerCase()+" and has been terminated.";
    }
    public static RuntimeException f(Throwable p0){
       if (p0 instanceof Error) {
          throw p0;
       }
       if (p0 instanceof RuntimeException) {
          return p0;
       }
       return new RuntimeException(p0);
    }
}
