package p.ga0;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import p.hi3;
import java.util.concurrent.atomic.AtomicReference;
import p.ir0;
import p.b5;
import p.cd1;
import p.co5;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class ga0 extends AtomicReference implements CompletableObserver, Disposable, hi3	// class@0016cb from classes.dex
{
    public final ir0 a;
    public final b5 b;

    public void ga0(ir0 p0,b5 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       cd1.a(this);
    }
    public final boolean hasCustomOnError(){
       boolean b = (this.a != co5.i)? true: false;
       return b;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == cd1.a)? true: false;
       return b;
    }
    public final void onComplete(){
       this.b.run();
       this.lazySet(cd1.a);
       return;
    }
    public final void onError(Throwable p0){
       this.a.accept(p0);
       this.lazySet(cd1.a);
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
}
