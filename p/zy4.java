package p.zy4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.rxjava3.core.Scheduler;
import p.p50;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;

public final class zy4 extends AtomicBoolean implements Observer, Disposable	// class@002f8e from classes.dex
{
    public final Observer a;
    public final Scheduler b;
    public Disposable c;

    public void zy4(Observer p0,Scheduler p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       if (this.compareAndSet(false, true)) {
          this.b.c(new p50(3, this));
       }
       return;
    }
    public boolean isDisposed(){
       return this.get();
    }
    public final void onComplete(){
       if (!this.get()) {
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.get()) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (!this.get()) {
          this.a.onNext(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
