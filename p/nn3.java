package p.nn3;
import java.lang.Thread$UncaughtExceptionHandler;
import p.on3;
import io.reactivex.rxjava3.core.Observable;
import p.sx0;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Throwable;
import p.fr0;
import p.tx0;
import android.os.Looper;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.TimeUnit;
import java.lang.Class;
import java.lang.String;
import java.util.Objects;
import p.p20;
import io.reactivex.rxjava3.core.CompletableObserver;
import java.util.concurrent.CountDownLatch;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.RuntimeException;
import p.iw1;

public final class nn3 implements Thread$UncaughtExceptionHandler	// class@002010 from classes.dex
{
    public final Thread$UncaughtExceptionHandler a;
    public final fr0 b;
    public final Observable c;
    public final tx0 d;

    public void nn3(Thread$UncaughtExceptionHandler p0,on3 p1,Observable p2,sx0 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void uncaughtException(Thread p0,Throwable p1){
       p20 c;
       p20 c1;
       p20 b1;
       this.d.a(this.b);
       if (Looper.getMainLooper() != Looper.myLooper()) {
          Completable uCompletable = this.c.ignoreElements();
          TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
          uCompletable.getClass();
          Objects.requireNonNull(mILLISECONDS, "unit is null");
          p20 op20 = new p20();
          uCompletable.subscribe(op20);
          if (op20.getCount()) {
             boolean b = true;
             long l = 5000;
             try{
                if (!op20.await(l, mILLISECONDS)) {
                   op20.t = b;
                   if ((c1 = op20.c) != null) {
                      c1.dispose();
                   }
                }
             }catch(java.lang.InterruptedException e8){
                op20.t = b;
                if ((c = op20.c) != null) {
                   c.dispose();
                }
                throw iw1.f(e8);
             }
          }
          if ((b1 = op20.b) != null) {
             throw iw1.f(b1);
          }
       }
       this.a.uncaughtException(p0, p1);
       return;
    }
}
