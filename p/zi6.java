package p.zi6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.b5;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;

public final class zi6 extends AtomicReference implements SingleObserver, Disposable	// class@002f04 from classes.dex
{
    public final SingleObserver a;
    public Disposable b;

    public void zi6(SingleObserver p0,b5 p1){
       super();
       this.a = p0;
       this.lazySet(p1);
    }
    public void dispose(){
       b5 andSet;
       if ((andSet = this.getAndSet(null)) != null) {
          andSet.run();
          this.b.dispose();
       }
       return;
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       this.a.onSuccess(p0);
    }
}
