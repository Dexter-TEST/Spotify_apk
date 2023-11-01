package p.ks4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Object;
import java.util.NoSuchElementException;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;

public final class ks4 implements Observer, Disposable	// class@001c74 from classes.dex
{
    public final SingleObserver a;
    public final long b;
    public final Object c;
    public Disposable t;
    public long v;
    public boolean w;

    public void ks4(SingleObserver p0,long p1,Object p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void dispose(){
       this.t.dispose();
    }
    public boolean isDisposed(){
       return this.t.isDisposed();
    }
    public final void onComplete(){
       ks4 tc;
       if (this.w == null) {
          this.w = true;
          ks4 ta = this.a;
          if ((tc = this.c) != null) {
             ta.onSuccess(tc);
          }else {
             ta.onError(new NoSuchElementException());
          }
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.w != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.w = true;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.w != null) {
          return;
       }
       ks4 tv = this.v;
       if (!(tv - this.b)) {
          this.w = true;
          this.t.dispose();
          this.a.onSuccess(p0);
          return;
       }else {
          this.v = tv + 1;
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.t, p0)) {
          this.t = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
