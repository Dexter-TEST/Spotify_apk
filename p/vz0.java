package p.vz0;
import java.lang.Thread$UncaughtExceptionHandler;
import p.fy0;
import p.es;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Thread;
import java.lang.Throwable;
import java.lang.String;
import android.util.Log;
import p.vc6;

public final class vz0 implements Thread$UncaughtExceptionHandler	// class@002a92 from classes.dex
{
    public final fy0 a;
    public final vc6 b;
    public final Thread$UncaughtExceptionHandler c;
    public final AtomicBoolean d;

    public void vz0(fy0 p0,es p1,Thread$UncaughtExceptionHandler p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = new AtomicBoolean(false);
    }
    public final void uncaughtException(Thread p0,Throwable p1){
       vz0 td;
       vz0 tc;
       try{
          td = this.d;
          td.set(true);
          Throwable throwable = null;
          tc = this.c;
          if (p0 == null) {
             Log.e("FirebaseCrashlytics", "Could not handle uncaught exception; null thread", throwable);
          }else if(p1 == null){
             Log.e("FirebaseCrashlytics", "Could not handle uncaught exception; null throwable", throwable);
          }else {
             this.a.a(this.b, p0, p1);
          }
       }catch(java.lang.Exception e1){
          Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e1);
       }
       Log.isLoggable("FirebaseCrashlytics", 3);
       tc.uncaughtException(p0, p1);
       td.set(false);
       return;
    }
}
