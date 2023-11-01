package p.ty4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.uy4;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.ra6;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.util.concurrent.TimeoutException;
import java.lang.String;
import p.iw1;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.ja2;
import java.lang.Runnable;
import java.lang.Class;

public final class ty4 extends AtomicLong implements Observer, Disposable, uy4	// class@002808 from classes.dex
{
    public final Observer a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler$Worker t;
    public final ra6 v;
    public final AtomicReference w;

    public void ty4(Observer p0,long p1,TimeUnit p2,Scheduler$Worker p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = new ra6();
       this.w = new AtomicReference();
    }
    public final void b(long p0){
       if (this.compareAndSet(p0, Long.MAX_VALUE)) {
          cd1.a(this.w);
          this.a.onError(new TimeoutException(iw1.e(this.b, this.c)));
          this.t.dispose();
       }
       return;
    }
    public void dispose(){
       cd1.a(this.w);
       this.t.dispose();
    }
    public boolean isDisposed(){
       return cd1.b(this.w.get());
    }
    public final void onComplete(){
       long l = Long.MAX_VALUE;
       if (this.getAndSet(l) - l) {
          this.v.dispose();
          this.a.onComplete();
          this.t.dispose();
       }
       return;
    }
    public final void onError(Throwable p0){
       long l = Long.MAX_VALUE;
       if (this.getAndSet(l) - l) {
          this.v.dispose();
          this.a.onError(p0);
          this.t.dispose();
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       long l = this.get();
       if (l - Long.MAX_VALUE) {
          long l1 = 1 + l;
          if (this.compareAndSet(l, l1)) {
             ty4 tv = this.v;
             tv.get().dispose();
             this.a.onNext(p0);
             tv.getClass();
             cd1.c(tv, this.t.b(new ja2(l1, this), this.b, this.c));
          }
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.w, p0);
    }
}
