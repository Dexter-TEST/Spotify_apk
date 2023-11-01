package p.ex4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Object;
import java.util.NoSuchElementException;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.cd1;

public final class ex4 implements Observer, Disposable	// class@001518 from classes.dex
{
    public final SingleObserver a;
    public final Object b;
    public Disposable c;
    public Object t;
    public boolean v;

    public void ex4(SingleObserver p0,Object p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final void onComplete(){
       if (this.v != null) {
          return;
       }
       this.v = true;
       ex4 tt = this.t;
       this.t = null;
       if (tt == null) {
          tt = this.b;
       }
       ex4 ta = this.a;
       if (tt != null) {
          ta.onSuccess(tt);
       }else {
          ta.onError(new NoSuchElementException());
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.v != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.v = true;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.v != null) {
          return;
       }
       if (this.t != null) {
          this.v = true;
          this.c.dispose();
          this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
          return;
       }else {
          this.t = p0;
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
