package p.mk6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.nk6;
import java.lang.Throwable;
import java.lang.Object;
import p.cd1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Class;
import p.mv6;

public final class mk6 extends AtomicReference implements SingleObserver, Disposable	// class@001eb4 from classes.dex
{
    public final SingleObserver a;
    public final nk6 b;

    public void mk6(SingleObserver p0){
       super();
       this.a = p0;
       this.b = new nk6(this);
    }
    public final void a(Throwable p0){
       Disposable andSet;
       cd1 a = cd1.a;
       if (this.get() != a && (andSet = this.getAndSet(a)) != a) {
          if (andSet != null) {
             andSet.dispose();
          }
          this.a.onError(p0);
          return;
       }else {
          RxJavaPlugins.c(p0);
          return;
       }
    }
    public void dispose(){
       cd1.a(this);
       mk6 tb = this.b;
       tb.getClass();
       mv6.b(tb);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onError(Throwable p0){
       mk6 tb = this.b;
       tb.getClass();
       mv6.b(tb);
       cd1 a = cd1.a;
       if (this.get() != a && this.getAndSet(a) != a) {
          this.a.onError(p0);
          return;
       }else {
          RxJavaPlugins.c(p0);
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
    public final void onSuccess(Object p0){
       mk6 tb = this.b;
       tb.getClass();
       mv6.b(tb);
       cd1 a = cd1.a;
       if (this.getAndSet(a) != a) {
          this.a.onSuccess(p0);
       }
       return;
    }
}
