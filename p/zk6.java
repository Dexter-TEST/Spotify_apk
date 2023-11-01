package p.zk6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.Scheduler;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;

public final class zk6 extends AtomicReference implements SingleObserver, Disposable, Runnable	// class@002f16 from classes.dex
{
    public final SingleObserver a;
    public final Scheduler b;
    public Disposable c;

    public void zk6(SingleObserver p0,Scheduler p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       Disposable andSet;
       cd1 a = cd1.a;
       if ((andSet = this.getAndSet(a)) != a) {
          this.c = andSet;
          this.b.c(this);
       }
       return;
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this, p0)) {
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       this.a.onSuccess(p0);
    }
    public final void run(){
       this.c.dispose();
    }
}
