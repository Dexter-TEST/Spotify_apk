package p.qk6;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.SingleSource;
import java.util.concurrent.TimeUnit;
import p.s62;
import java.lang.Object;
import p.cd1;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.lang.String;
import p.iw1;

public final class qk6 extends AtomicReference implements SingleObserver, Runnable, Disposable	// class@0023be from classes.dex
{
    public final SingleObserver a;
    public final AtomicReference b;
    public final s62 c;
    public SingleSource t;
    public final long v;
    public final TimeUnit w;

    public void qk6(SingleObserver p0,SingleSource p1,long p2,TimeUnit p3){
       super();
       this.a = p0;
       this.t = p1;
       this.v = p2;
       this.w = p3;
       this.b = new AtomicReference();
       this.c = (p1 != null)? new s62(3, p0): null;
       return;
    }
    public void dispose(){
       qk6 tc;
       cd1.a(this);
       cd1.a(this.b);
       if ((tc = this.c) != null) {
          cd1.a(tc);
       }
       return;
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onError(Throwable p0){
       Disposable uDisposable = this.get();
       cd1 a = cd1.a;
       if (uDisposable != a && this.compareAndSet(uDisposable, a)) {
          cd1.a(this.b);
          this.a.onError(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
    public final void onSuccess(Object p0){
       Disposable uDisposable = this.get();
       cd1 a = cd1.a;
       if (uDisposable != a && this.compareAndSet(uDisposable, a)) {
          cd1.a(this.b);
          this.a.onSuccess(p0);
       }
       return;
    }
    public final void run(){
       qk6 tt;
       Disposable uDisposable = this.get();
       cd1 a = cd1.a;
       if (uDisposable != a && this.compareAndSet(uDisposable, a)) {
          if (uDisposable != null) {
             uDisposable.dispose();
          }
          if ((tt = this.t) == null) {
             this.a.onError(new TimeoutException(iw1.e(this.v, this.w)));
          }else {
             this.t = null;
             tt.subscribe(this.c);
          }
       }
       return;
    }
}
