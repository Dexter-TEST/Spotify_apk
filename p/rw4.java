package p.rw4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import p.ab6;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import p.cd1;
import java.lang.Throwable;
import java.lang.Object;

public abstract class rw4 extends AtomicReference implements Observer, Disposable, Runnable	// class@002570 from classes.dex
{
    public final Observer a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler t;
    public final AtomicReference v;
    public Disposable w;

    public void rw4(ab6 p0,long p1,TimeUnit p2,Scheduler p3){
       super();
       this.v = new AtomicReference();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public abstract void a();
    public void dispose(){
       cd1.a(this.v);
       this.w.dispose();
    }
    public boolean isDisposed(){
       return this.w.isDisposed();
    }
    public final void onComplete(){
       cd1.a(this.v);
       this.a();
    }
    public final void onError(Throwable p0){
       cd1.a(this.v);
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.lazySet(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.w, p0)) {
          this.w = p0;
          this.a.onSubscribe(this);
          rw4 tb = this.b;
          cd1.c(this.v, this.t.e(this, tb, tb, this.c));
       }
       return;
    }
}
