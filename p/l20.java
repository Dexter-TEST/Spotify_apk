package p.l20;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CountDownLatch;
import p.ra6;
import p.jl1;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import p.cd1;

public final class l20 extends CountDownLatch implements MaybeObserver, SingleObserver, CompletableObserver, Disposable	// class@001cca from classes.dex
{
    public Object a;
    public Throwable b;
    public final ra6 c;

    public void l20(){
       super(1);
       this.c = new ra6();
    }
    public void dispose(){
       this.c.dispose();
       this.countDown();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final void onComplete(){
       this.c.lazySet(jl1.a);
       this.countDown();
    }
    public final void onError(Throwable p0){
       this.b = p0;
       this.c.lazySet(jl1.a);
       this.countDown();
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.c, p0);
    }
    public final void onSuccess(Object p0){
       this.a = p0;
       this.c.lazySet(jl1.a);
       this.countDown();
    }
}
