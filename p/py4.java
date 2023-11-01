package p.py4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ry4;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.ObservableSource;
import p.yf2;
import p.ra6;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Throwable;
import p.cd1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.kv4;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import p.oy4;
import java.lang.Class;
import p.co5;

public final class py4 extends AtomicReference implements Observer, Disposable, ry4	// class@0022f6 from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public final ra6 c;
    public final AtomicLong t;
    public final AtomicReference v;
    public ObservableSource w;

    public void py4(ObservableSource p0,Observer p1,yf2 p2){
       super();
       this.a = p1;
       this.b = p2;
       this.c = new ra6();
       this.w = p0;
       this.t = new AtomicLong();
       this.v = new AtomicReference();
    }
    public final void a(long p0,Throwable p1){
       if (this.t.compareAndSet(p0, Long.MAX_VALUE)) {
          cd1.a(this);
          this.a.onError(p1);
       }else {
          RxJavaPlugins.c(p1);
       }
       return;
    }
    public final void b(long p0){
       if (this.t.compareAndSet(p0, Long.MAX_VALUE)) {
          cd1.a(this.v);
          py4 tw = this.w;
          this.w = null;
          tw.subscribe(new kv4(this.a, this, 1));
       }
       return;
    }
    public void dispose(){
       cd1.a(this.v);
       cd1.a(this);
       this.c.dispose();
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       long l = Long.MAX_VALUE;
       if (this.t.getAndSet(l) - l) {
          py4 tc = this.c;
          tc.dispose();
          this.a.onComplete();
          tc.dispose();
       }
       return;
    }
    public final void onError(Throwable p0){
       long l = Long.MAX_VALUE;
       if (this.t.getAndSet(l) - l) {
          py4 tc = this.c;
          tc.dispose();
          this.a.onError(p0);
          tc.dispose();
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       Disposable uDisposable;
       py4 tt = this.t;
       long l = tt.get();
       if (l - Long.MAX_VALUE) {
          long l1 = 1 + l;
          if (tt.compareAndSet(l, l1)) {
             py4 tc = this.c;
             if ((uDisposable = tc.get()) != null) {
                uDisposable.dispose();
             }
             this.a.onNext(p0);
             p0 = this.b.apply(p0);
             Objects.requireNonNull(p0, "The itemTimeoutIndicator returned a null ObservableSource.");
             oy4 ooy4 = new oy4(l1, this);
             tc.getClass();
             if (cd1.c(tc, ooy4)) {
                p0.subscribe(ooy4);
             }
             return;
          }
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.v, p0);
    }
}
