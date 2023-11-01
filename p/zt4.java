package p.zt4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.CompletableObserver;
import java.lang.Object;
import java.lang.Throwable;

public final class zt4 implements Observer, Disposable	// class@002f61 from classes.dex
{
    public final CompletableObserver a;
    public Disposable b;

    public void zt4(CompletableObserver p0){
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
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
    }
    public final void onSubscribe(Disposable p0){
       this.b = p0;
       this.a.onSubscribe(this);
    }
}
