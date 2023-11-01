package p.qb2;
import p.gj1;
import android.content.Context;
import p.ob2;
import p.ij1;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Class;
import android.content.ContentResolver;
import android.database.ContentObserver;
import java.lang.Runnable;
import android.os.Handler;
import java.util.concurrent.ThreadPoolExecutor;
import p.ap5;
import p.wn0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import p.pb2;
import java.util.concurrent.Executor;
import p.dc2;
import p.r8;
import p.io2;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import p.en6;
import java.lang.Throwable;

public final class qb2 implements gj1	// class@00236a from classes.dex
{
    public final Context a;
    public final ob2 b;
    public final gg1 c;
    public final Object t;
    public Handler v;
    public Executor w;
    public ThreadPoolExecutor x;
    public ap5 y;
    public x01 z;

    public void qb2(Context p0,ob2 p1){
       gg1 d = ij1.d;
       super();
       this.t = new Object();
       if (p0 == null) {
          throw new NullPointerException("Context cannot be null");
       }
       this.a = p0.getApplicationContext();
       this.b = p1;
       this.c = d;
       return;
    }
    public final void a(){
       qb2 tz;
       qb2 tt = this.t;
       _monitor_enter(tt);
       this.y = null;
       if ((tz = this.z) != null) {
          this.c.getClass();
          this.a.getContentResolver().unregisterContentObserver(tz);
          this.z = null;
       }
       if ((tz = this.v) != null) {
          tz.removeCallbacks(null);
       }
       this.v = null;
       if ((tz = this.x) != null) {
          tz.shutdown();
       }
       this.w = null;
       this.x = null;
       _monitor_exit(tt);
       return;
    }
    public final void b(ap5 p0){
       qb2 tt = this.t;
       _monitor_enter(tt);
       this.y = p0;
       _monitor_exit(tt);
       this.c();
    }
    public final void c(){
       qb2 tt = this.t;
       _monitor_enter(tt);
       if (this.y == null) {
          _monitor_exit(tt);
          return;
       }else if(this.w == null){
          ThreadPoolExecutor v1 = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new wn0("emojiCompat"));
          v1.allowCoreThreadTimeOut(true);
          this.x = v1;
          this.w = v1;
       }
       this.w.execute(new pb2(this, 0));
       _monitor_exit(tt);
       return;
    }
    public final dc2 d(){
       try{
          this.c.getClass();
          r8 or8 = io2.l(this.a, this.b);
          if (or8.b != null) {
             throw new RuntimeException(en6.o("fetchFonts failed \(", or8.b, "\)"));
          }
          if ((or8 = or8.c) != null && or8.length) {
             return or8[0];
          }
          throw new RuntimeException("fetchFonts failed \(empty result\)");
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          throw new RuntimeException("provider not found", e0);
       }
    }
}
