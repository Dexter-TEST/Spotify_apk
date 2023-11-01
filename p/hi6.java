package p.hi6;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.SingleObserver;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.lang.NullPointerException;
import p.iw1;
import p.tb0;
import p.xb0;
import java.lang.Class;

public final class hi6 extends AtomicReference implements SingleEmitter, Disposable	// class@00185c from classes.dex
{
    public final SingleObserver a;

    public void hi6(SingleObserver p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onError(Throwable p0){
       if (!this.tryOnError(p0)) {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public void onSuccess(Object p0){
       Disposable andSet;
       cd1 a = cd1.a;
       if (this.get() != a && (andSet = this.getAndSet(a)) != a) {
          hi6 ta = this.a;
          if (p0 == null) {
             ta.onError(iw1.b("onSuccess called with a null value."));
          }else {
             ta.onSuccess(p0);
          }
          if (andSet != null) {
             andSet.dispose();
          }
       }
       return;
    }
    public void setCancellable(tb0 p0){
       cd1.d(this, new xb0(p0));
    }
    public final void setDisposable(Disposable p0){
       cd1.d(this, p0);
    }
    public final String toString(){
       Object[] objArray = new Object[]{hi6.class.getSimpleName(),super.toString()};
       return String.format("%s{%s}", objArray);
    }
    public final boolean tryOnError(Throwable p0){
       NullPointerException nullPointerE;
       cd1 a;
       Disposable andSet;
       if (p0 == null) {
          nullPointerE = iw1.b("onError called with a null Throwable.");
       }
       a = cd1.a;
       if (this.get() != a && (andSet = this.getAndSet(a)) != a) {
          this.a.onError(nullPointerE);
          if (andSet != null) {
             andSet.dispose();
          }
          return true;
       }else {
          return false;
       }
    }
}
