package p.ok6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import java.lang.Class;
import java.lang.Throwable;
import p.cd1;
import p.z47;

public final class ok6 implements SingleObserver, Disposable	// class@00213c from classes.dex
{
    public final SingleObserver a;
    public final TimeUnit b;
    public final Scheduler c;
    public final long t;
    public Disposable v;

    public void ok6(SingleObserver p0,TimeUnit p1,Scheduler p2,boolean p3){
       long l;
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       if (p3) {
          p2.getClass();
          l = Scheduler.a(p1);
       }else {
          l = 0;
       }
       this.t = l;
       return;
    }
    public void dispose(){
       this.v.dispose();
    }
    public boolean isDisposed(){
       return this.v.isDisposed();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.v, p0)) {
          this.v = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       this.c.getClass();
       ok6 tb = this.b;
       this.a.onSuccess(new z47(p0, (Scheduler.a(tb) - this.t), tb));
    }
}
