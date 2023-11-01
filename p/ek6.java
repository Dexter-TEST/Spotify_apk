package p.ek6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.Scheduler;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;

public final class ek6 extends AtomicReference implements SingleObserver, Disposable, Runnable	// class@0014a6 from classes.dex
{
    public final SingleObserver a;
    public final Scheduler b;
    public Object c;
    public Throwable t;

    public void ek6(SingleObserver p0,Scheduler p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onError(Throwable p0){
       this.t = p0;
       cd1.c(this, this.b.c(this));
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this, p0)) {
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       this.c = p0;
       cd1.c(this, this.b.c(this));
    }
    public final void run(){
       ek6 tt = this.t;
       ek6 ta = this.a;
       if (tt != null) {
          ta.onError(tt);
       }else {
          ta.onSuccess(this.c);
       }
       return;
    }
}
