package p.qv4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.w00;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.util.Objects;
import p.co5;
import p.cd1;

public final class qv4 implements Observer, Disposable	// class@002421 from classes.dex
{
    public final MaybeObserver a;
    public final w00 b;
    public boolean c;
    public Object t;
    public Disposable v;

    public void qv4(MaybeObserver p0,w00 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.v.dispose();
    }
    public boolean isDisposed(){
       return this.v.isDisposed();
    }
    public final void onComplete(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       qv4 tt = this.t;
       this.t = null;
       qv4 ta = this.a;
       if (tt != null) {
          ta.onSuccess(tt);
       }else {
          ta.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.c != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.c = true;
          this.t = null;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       qv4 tt;
       if (this.c == null) {
          if ((tt = this.t) == null) {
             this.t = p0;
          }else {
             p0 = this.b.apply(tt, p0);
             Objects.requireNonNull(p0, "The reducer returned a null value");
             this.t = p0;
          }
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
}
