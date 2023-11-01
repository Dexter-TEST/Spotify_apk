package p.mk0;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.ObservableSource;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;

public final class mk0 extends AtomicReference implements Observer, CompletableObserver, Disposable	// class@001eae from classes.dex
{
    public final Observer a;
    public ObservableSource b;

    public void mk0(ObservableSource p0,Observer p1){
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
       mk0 tb;
       if ((tb = this.b) == null) {
          this.a.onComplete();
       }else {
          this.b = null;
          tb.subscribe(this);
       }
       return;
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       cd1.c(this, p0);
    }
}
