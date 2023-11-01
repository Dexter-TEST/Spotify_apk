package p.dx4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.MaybeObserver;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.cd1;

public final class dx4 implements Observer, Disposable	// class@0013d6 from classes.dex
{
    public final MaybeObserver a;
    public Disposable b;
    public Object c;
    public boolean t;

    public void dx4(MaybeObserver p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.b.dispose();
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public final void onComplete(){
       if (this.t != null) {
          return;
       }
       this.t = true;
       dx4 tc = this.c;
       this.c = null;
       dx4 ta = this.a;
       if (tc == null) {
          ta.onComplete();
       }else {
          ta.onSuccess(tc);
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.t != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.t = true;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.t != null) {
          return;
       }
       if (this.c != null) {
          this.t = true;
          this.b.dispose();
          this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
          return;
       }else {
          this.c = p0;
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
