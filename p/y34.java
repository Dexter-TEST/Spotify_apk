package p.y34;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.ra6;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;

public final class y34 extends AtomicReference implements MaybeObserver, Disposable	// class@002d3f from classes.dex
{
    public final ra6 a;
    public final MaybeObserver b;

    public void y34(MaybeObserver p0){
       super();
       this.b = p0;
       this.a = new ra6();
    }
    public void dispose(){
       cd1.a(this);
       this.a.dispose();
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       this.b.onComplete();
    }
    public final void onError(Throwable p0){
       this.b.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
    public final void onSuccess(Object p0){
       this.b.onSuccess(p0);
    }
}
