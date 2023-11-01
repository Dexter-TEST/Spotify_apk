package p.i34;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.j34;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class i34 implements MaybeObserver	// class@001918 from classes.dex
{
    public final j34 a;

    public void i34(j34 p0){
       this.a = p0;
       super();
    }
    public final void onComplete(){
       this.a.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.a.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.a, p0);
    }
    public final void onSuccess(Object p0){
       this.a.a.onSuccess(p0);
    }
}
