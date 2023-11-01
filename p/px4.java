package p.px4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;

public final class px4 extends AtomicReference implements Observer, Disposable	// class@0022ed from classes.dex
{
    public final Observer a;
    public final AtomicReference b;

    public void px4(Observer p0){
       super();
       this.a = p0;
       this.b = new AtomicReference();
    }
    public void dispose(){
       cd1.a(this.b);
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.b, p0);
    }
}
