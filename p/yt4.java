package p.yt4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.lang.Throwable;

public final class yt4 implements Observer, Disposable	// class@002e23 from classes.dex
{
    public final Observer a;
    public Disposable b;

    public void yt4(Observer p0){
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
