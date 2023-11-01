package p.fl1;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import p.hi3;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import p.d25;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class fl1 extends AtomicReference implements CompletableObserver, Disposable, hi3	// class@0015ea from classes.dex
{

    public void fl1(){
       super();
    }
    public void dispose(){
       cd1.a(this);
    }
    public final boolean hasCustomOnError(){
       return false;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == cd1.a)? true: false;
       return b;
    }
    public final void onComplete(){
       this.lazySet(cd1.a);
    }
    public final void onError(Throwable p0){
       this.lazySet(cd1.a);
       RxJavaPlugins.c(new d25(p0));
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
}
