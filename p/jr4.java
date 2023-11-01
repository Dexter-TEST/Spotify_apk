package p.jr4;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.Observer;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.lang.NullPointerException;
import p.iw1;
import p.kr4;
import p.tb0;
import p.xb0;
import java.lang.Class;

public final class jr4 extends AtomicReference implements ObservableEmitter, Disposable	// class@001b2e from classes.dex
{
    public final Observer a;

    public void jr4(Observer p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       if (!this.isDisposed()) {
          this.a.onComplete();
          this.dispose();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (!this.tryOnError(p0)) {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (p0 == null) {
          this.onError(iw1.b("onNext called with a null value."));
          return;
       }else if(!this.isDisposed()){
          this.a.onNext(p0);
       }
       return;
    }
    public final ObservableEmitter serialize(){
       return new kr4(this);
    }
    public void setCancellable(tb0 p0){
       cd1.d(this, new xb0(p0));
    }
    public final void setDisposable(Disposable p0){
       cd1.d(this, p0);
    }
    public final String toString(){
       Object[] objArray = new Object[]{jr4.class.getSimpleName(),super.toString()};
       return String.format("%s{%s}", objArray);
    }
    public final boolean tryOnError(Throwable p0){
       NullPointerException nullPointerE;
       if (p0 == null) {
          nullPointerE = iw1.b("onError called with a null Throwable.");
       }
       if (!this.isDisposed()) {
          this.a.onError(nullPointerE);
          this.dispose();
          return true;
       }else {
          return false;
       }
    }
}
