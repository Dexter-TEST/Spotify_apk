package p.mr4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ab6;
import p.yf2;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.lr4;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import p.co5;

public final class mr4 implements Observer, Disposable	// class@001eee from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public Disposable c;
    public final AtomicReference t;
    public long v;
    public boolean w;

    public void mr4(ab6 p0,yf2 p1){
       super();
       this.t = new AtomicReference();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
       cd1.a(this.t);
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final void onComplete(){
       Disposable uDisposable;
       if (this.w != null) {
          return;
       }
       this.w = true;
       mr4 tt = this.t;
       if ((uDisposable = tt.get()) != cd1.a) {
          if (uDisposable != null) {
             uDisposable.a();
          }
          cd1.a(tt);
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       cd1.a(this.t);
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       Disposable uDisposable;
       int i;
       if (this.w != null) {
          return;
       }
       long l = this.v + 1;
       this.v = l;
       if ((uDisposable = this.t.get()) != null) {
          uDisposable.dispose();
       }
       Object obj = this.b.apply(p0);
       Objects.requireNonNull(obj, "The ObservableSource supplied is null");
       lr4 olr4 = new lr4(this, l, p0);
       p0 = this.t;
       while (true) {
          if (p0.compareAndSet(uDisposable, olr4)) {
             i = 1;
          }else {
             if (p0.get() != uDisposable) {
                i = 0;
             }
          }
          if (i) {
             obj.subscribe(olr4);
             break ;
          }
          break ;
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
