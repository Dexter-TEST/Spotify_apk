package p.gy0;
import java.util.concurrent.Callable;
import p.ly0;
import java.util.Date;
import java.lang.Throwable;
import java.lang.Thread;
import p.vc6;
import java.lang.Object;
import p.kf6;
import java.lang.String;
import p.i77;
import android.util.Log;
import p.hh0;
import java.io.File;
import p.wh0;
import java.io.FileOutputStream;
import p.xj0;
import java.io.Closeable;
import p.es;
import java.util.concurrent.atomic.AtomicReference;
import p.uc6;
import p.vh4;
import p.if7;
import java.util.ArrayList;
import java.io.FilenameFilter;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import p.i51;
import p.a28;
import p.vv7;
import p.wx0;
import p.m07;
import p.fh5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import p.pv6;

public final class gy0 implements Callable	// class@00179f from classes.dex
{
    public final Date a;
    public final Throwable b;
    public final Thread c;
    public final vc6 t;
    public final ly0 v;

    public void gy0(ly0 p0,Date p1,Throwable p2,Thread p3,vc6 p4){
       this.v = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.t = p4;
       super();
    }
    public final Object call(){
       int i;
       String str1;
       wh0 owh0;
       Closeable uCloseable;
       a28 uoa28;
       hh0 ohh0;
       int i2;
       int i3;
       String str2;
       gy0 ogy0 = this;
       gy0 v = ogy0.v;
       v.d.d();
       gy0 a = ogy0.a;
       long l = a.getTime() / 1000;
       v.t.v(ogy0.b, ogy0.c, "crash", l, true);
       gy0 c = ogy0.c;
       gy0 b = ogy0.b;
       String str = "SessionCrash";
       try{
          i = 0;
          if ((str1 = v.g()) == null) {
             Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", i);
          }else {
             File uFile = v.h();
             str = str1.concat(str);
             try{
                ohh0 = new hh0(uFile, str);
                byte[] uobyteArray = new byte[4096];
                try{
                   owh0 = new wh0(ohh0, uobyteArray);
                   gy0 ogy01 = v;
                   wh0 owh01 = owh0;
                   i3 = owh0;
                   str2 = "crash";
                   i2 = ohh0;
                   try{
                      int i4 = 1;
                      ogy01.r(owh01, c, b, l, str2, i4);
                      owh0 = i3;
                      uCloseable = i2;
                   label_0098 :
                      xj0.h0(owh0, "Failed to flush to session begin file.");
                      xj0.l(uCloseable, "Failed to close fatal exception file output stream.");
                   }catch(java.lang.Exception e0){
                   }
                   owh0 = i3;
                }catch(java.lang.Exception e0){
                   i3 = str2;
                   i2 = ohh0;
                }
             }catch(java.lang.Exception e0){
                i2 = ohh0;
                owh0 = i;
             }
             uCloseable = i2;
          }
          v.o(a.getTime());
          gy0 t = ogy0.t;
          uc6 b1 = t.h.get().b;
          vh4 b2 = b1.b;
          v.e(b1.a, true);
          ly0.b(v);
          ArrayList uArrayList = new ArrayList();
          File[] uFileArray = new File(v.h(), "native-sessions").listFiles();
          ey0 a1 = if7.a;
          File[] uFileArray1 = new File(v.h(), "fatal-sessions").listFiles(a1);
          if (uFileArray == null) {
             uFileArray = new File[0];
          }
          if (uFileArray1 == null) {
             uFileArray1 = new File[0];
          }
          uArrayList.addAll(Arrays.asList(uFileArray));
          uArrayList.addAll(Arrays.asList(uFileArray1));
          int i1 = b2 - if7.c(uArrayList, b2);
          if7.b(v.h(), ly0.A, (i1 - if7.b(new File(v.h(), "nonfatal-sessions"), a1, i1)));
          if (!v.c.b()) {
             uoa28 = vv7.t(i);
          }else {
             wx0 a2 = v.f.a;
             uoa28 = t.i.get().a.g(a2, new fh5(ogy0, a2));
          }
          return uoa28;
       }catch(java.lang.Exception e0){
          owh0 = i;
          uCloseable = owh0;
       }
       Log.e("FirebaseCrashlytics", "An error occurred in the fatal exception logger", e0);
       goto label_0098 ;
    }
}
