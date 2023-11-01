package p.rv4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.SingleObserver;
import p.w00;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.util.Objects;
import p.co5;
import p.cd1;

public final class rv4 implements Observer, Disposable	// class@002567 from classes.dex
{
    public final SingleObserver a;
    public final w00 b;
    public Object c;
    public Disposable t;

    public void rv4(SingleObserver p0,w00 p1,Object p2){
       super();
       this.a = p0;
       this.c = p2;
       this.b = p1;
    }
    public void dispose(){
       this.t.dispose();
    }
    public boolean isDisposed(){
       return this.t.isDisposed();
    }
    public final void onComplete(){
       rv4 tc;
       if ((tc = this.c) != null) {
          this.c = null;
          this.a.onSuccess(tc);
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.c != null) {
          this.c = null;
          this.a.onError(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       rv4 tc;
       if ((tc = this.c) != null) {
          p0 = this.b.apply(tc, p0);
          Objects.requireNonNull(p0, "The reducer returned a null value");
          this.c = p0;
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.t, p0)) {
          this.t = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
