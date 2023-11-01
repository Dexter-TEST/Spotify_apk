package p.kr0;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import p.hi3;
import java.util.concurrent.atomic.AtomicReference;
import p.ir0;
import p.cd1;
import p.co5;
import java.lang.Object;
import java.lang.Throwable;
import p.hn0;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class kr0 extends AtomicReference implements SingleObserver, Disposable, hi3	// class@001c68 from classes.dex
{
    public final ir0 a;
    public final ir0 b;

    public void kr0(ir0 p0,ir0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       cd1.a(this);
    }
    public final boolean hasCustomOnError(){
       boolean b = (this.b != co5.i)? true: false;
       return b;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == cd1.a)? true: false;
       return b;
    }
    public final void onError(Throwable p0){
       this.lazySet(cd1.a);
       this.b.accept(p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
    public final void onSuccess(Object p0){
       this.lazySet(cd1.a);
       this.a.accept(p0);
       return;
    }
}
