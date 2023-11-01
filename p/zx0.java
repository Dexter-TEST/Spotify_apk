package p.zx0;
import java.lang.Runnable;
import p.ly0;
import java.util.Date;
import java.lang.Throwable;
import java.lang.Thread;
import java.lang.Object;
import java.lang.String;
import p.i77;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p.xj0;
import java.lang.StringBuilder;
import p.hh0;
import java.io.File;
import p.wh0;
import java.io.FileOutputStream;
import java.io.Closeable;

public final class zx0 implements Runnable	// class@002f81 from classes.dex
{
    public final Date a;
    public final Throwable b;
    public final Thread c;
    public final ly0 t;

    public void zx0(ly0 p0,Date p1,Throwable p2,Thread p3){
       this.t = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public final void run(){
       String str1;
       Closeable uCloseable;
       wh0 owh0;
       int i2;
       zx0 ozx0 = this;
       zx0 t = ozx0.t;
       if (!t.j()) {
          long l = ozx0.a.getTime() / 1000;
          t.t.v(ozx0.b, ozx0.c, "error", l, false);
          zx0 c = ozx0.c;
          zx0 b = ozx0.b;
          String str = t.g();
          int i = 3;
          if (str == null) {
             Log.isLoggable("FirebaseCrashlytics", i);
          }else {
             int i1 = 0;
             try{
                Objects.toString(b);
                c.getName();
                Log.isLoggable("FirebaseCrashlytics", i);
                str1 = str+"SessionEvent"+xj0.J0(t.a.getAndIncrement());
                File uFile = t.h();
                try{
                   hh0 ohh0 = new hh0(uFile, str1);
                   byte[] uobyteArray = new byte[4096];
                   try{
                      owh0 = new wh0(ohh0, uobyteArray);
                      uobyteArray = 0;
                      zx0 ozx01 = t;
                      wh0 owh01 = owh0;
                      i2 = owh0;
                      try{
                         int i3 = uobyteArray;
                         ozx01.r(owh01, c, b, l, "error", i3);
                         owh0 = i2;
                      }catch(java.lang.Exception e0){
                      }
                      i1 = i2;
                   }catch(java.lang.Exception e0){
                      i2 = owh0;
                   }
                }catch(java.lang.Exception e0){
                }
             }catch(java.lang.Exception e0){
                uCloseable = i1;
                Log.e("FirebaseCrashlytics", "An error occurred in the non-fatal exception logger", e0);
                owh0 = i1;
             }
             xj0.h0(owh0, "Failed to flush to non-fatal file.");
             xj0.l(uCloseable, "Failed to close non-fatal file output stream.");
             try{
                str1 = 64;
                t.n(str1, str);
             }catch(java.lang.Exception e0){
                Log.e("FirebaseCrashlytics", "An error occurred when trimming non-fatal files.", e0);
             }
          }
       }
       return;
    }
}
