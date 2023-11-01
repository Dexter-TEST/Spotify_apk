package p.sy4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.uy4;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ra6;
import java.util.concurrent.atomic.AtomicLong;
import p.cd1;
import p.kv4;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.ja2;
import java.lang.Runnable;
import java.lang.Class;

public final class sy4 extends AtomicReference implements Observer, Disposable, uy4	// class@0026c3 from classes.dex
{
    public final Observer a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler$Worker t;
    public final ra6 v;
    public final AtomicLong w;
    public final AtomicReference x;
    public ObservableSource y;

    public void sy4(Observer p0,long p1,TimeUnit p2,Scheduler$Worker p3,ObservableSource p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.y = p4;
       this.v = new ra6();
       this.w = new AtomicLong();
       this.x = new AtomicReference();
    }
    public final void b(long p0){
       if (this.w.compareAndSet(p0, Long.MAX_VALUE)) {
          cd1.a(this.x);
          sy4 ty = this.y;
          this.y = null;
          ty.subscribe(new kv4(this.a, this, 1));
          this.t.dispose();
       }
       return;
    }
    public void dispose(){
       cd1.a(this.x);
       cd1.a(this);
       this.t.dispose();
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       if (this.w.getAndSet(Long.MAX_VALUE) - Long.MAX_VALUE) {
          this.v.dispose();
          this.a.onComplete();
          this.t.dispose();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.w.getAndSet(Long.MAX_VALUE) - Long.MAX_VALUE) {
          this.v.dispose();
          this.a.onError(p0);
          this.t.dispose();
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       sy4 tw = this.w;
       long l = tw.get();
       if (l - Long.MAX_VALUE) {
          long l1 = 1 + l;
          if (tw.compareAndSet(l, l1)) {
             tw = this.v;
             tw.get().dispose();
             this.a.onNext(p0);
             tw.getClass();
             cd1.c(tw, this.t.b(new ja2(l1, this), this.b, this.c));
          }
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.x, p0);
    }
}
