package p.qy4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ry4;
import java.util.concurrent.atomic.AtomicLong;
import p.yf2;
import p.ra6;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import p.cd1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import p.oy4;
import java.lang.Class;
import p.co5;

public final class qy4 extends AtomicLong implements Observer, Disposable, ry4	// class@00243c from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public final ra6 c;
    public final AtomicReference t;

    public void qy4(Observer p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new ra6();
       this.t = new AtomicReference();
    }
    public final void a(long p0,Throwable p1){
       if (this.compareAndSet(p0, Long.MAX_VALUE)) {
          cd1.a(this.t);
          this.a.onError(p1);
       }else {
          RxJavaPlugins.c(p1);
       }
       return;
    }
    public final void b(long p0){
       if (this.compareAndSet(p0, Long.MAX_VALUE)) {
          cd1.a(this.t);
          this.a.onError(new TimeoutException());
       }
       return;
    }
    public void dispose(){
       cd1.a(this.t);
       this.c.dispose();
    }
    public boolean isDisposed(){
       return cd1.b(this.t.get());
    }
    public final void onComplete(){
       long l = Long.MAX_VALUE;
       if (this.getAndSet(l) - l) {
          this.c.dispose();
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       long l = Long.MAX_VALUE;
       if (this.getAndSet(l) - l) {
          this.c.dispose();
          this.a.onError(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       Disposable uDisposable;
       long l = this.get();
       if (l - Long.MAX_VALUE) {
          long l1 = 1 + l;
          if (this.compareAndSet(l, l1)) {
             qy4 tc = this.c;
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
       cd1.e(this.t, p0);
    }
}
