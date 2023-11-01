package p.jy4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import p.ab6;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import java.lang.Throwable;
import java.lang.Object;
import p.cd1;

public final class jy4 extends AtomicReference implements Observer, Disposable, Runnable	// class@001b6c from classes.dex
{
    public final Observer a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler$Worker t;
    public Disposable v;
    public boolean w;

    public void jy4(ab6 p0,long p1,TimeUnit p2,Scheduler$Worker p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public void dispose(){
       this.v.dispose();
       this.t.dispose();
    }
    public boolean isDisposed(){
       return this.t.isDisposed();
    }
    public final void onComplete(){
       this.a.onComplete();
       this.t.dispose();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
       this.t.dispose();
    }
    public final void onNext(Object p0){
       if (this.w == null) {
          this.w = true;
          this.a.onNext(p0);
          if ((p0 = this.get()) != null) {
             p0.dispose();
          }
          cd1.c(this, this.t.b(this, this.b, this.c));
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.v, p0)) {
          this.v = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void run(){
       this.w = false;
    }
}
