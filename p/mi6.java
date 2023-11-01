package p.mi6;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import p.cd1;
import java.lang.Object;
import p.ay5;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class mi6 extends AtomicReference implements Observer, Disposable	// class@001ea2 from classes.dex
{
    public final SingleObserver a;
    public final SingleSource b;
    public boolean c;

    public void mi6(SingleObserver p0,SingleSource p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       this.b.subscribe(new ay5(this, this.a, 0));
       return;
    }
    public final void onError(Throwable p0){
       if (this.c != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.c = true;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       this.get().dispose();
       this.onComplete();
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this, p0)) {
          this.a.onSubscribe(this);
       }
       return;
    }
}
