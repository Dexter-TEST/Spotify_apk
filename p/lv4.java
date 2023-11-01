package p.lv4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Throwable;
import java.lang.Object;

public final class lv4 extends AtomicReference implements Observer, Disposable	// class@001dcf from classes.dex
{
    public final Observer a;
    public Disposable b;

    public void lv4(Observer p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.b.dispose();
       cd1.a(this);
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public final void onComplete(){
       cd1.a(this);
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       cd1.a(this);
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
