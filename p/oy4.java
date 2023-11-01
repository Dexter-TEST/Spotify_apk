package p.oy4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.ry4;
import p.cd1;
import java.lang.Object;
import p.uy4;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class oy4 extends AtomicReference implements Observer, Disposable	// class@0021b5 from classes.dex
{
    public final ry4 a;
    public final long b;

    public void oy4(long p0,ry4 p1){
       super();
       this.b = p0;
       this.a = p1;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       cd1 a = cd1.a;
       if (this.get() != a) {
          this.lazySet(a);
          this.a.b(this.b);
       }
       return;
    }
    public final void onError(Throwable p0){
       cd1 a = cd1.a;
       if (this.get() != a) {
          this.lazySet(a);
          this.a.a(this.b, p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       p0 = this.get();
       cd1 a = cd1.a;
       if (p0 != a) {
          p0.dispose();
          this.lazySet(a);
          this.a.b(this.b);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
}
