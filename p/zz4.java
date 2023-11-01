package p.zz4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;

public final class zz4 extends AtomicReference implements Observer, Disposable	// class@002f97 from classes.dex
{
    public final Observer a;
    public final AtomicReference b;

    public void zz4(Observer p0){
       super();
       this.b = new AtomicReference();
       this.a = p0;
    }
    public void dispose(){
       cd1.a(this.b);
       cd1.a(this);
    }
    public boolean isDisposed(){
       boolean b = (this.b.get() == cd1.a)? true: false;
       return b;
    }
    public final void onComplete(){
       this.dispose();
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.dispose();
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this.b, p0)) {
          this.a.onSubscribe(this);
       }
       return;
    }
}
