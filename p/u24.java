package p.u24;
import io.reactivex.rxjava3.core.MaybeObserver;
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
import p.hn0;

public final class u24 extends AtomicReference implements MaybeObserver, Disposable, hi3	// class@00282c from classes.dex
{
    public final ir0 a;
    public final ir0 b;
    public final b5 c;

    public void u24(ir0 p0,ir0 p1,b5 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void dispose(){
       cd1.a(this);
    }
    public final boolean hasCustomOnError(){
       boolean b = (this.b != co5.i)? true: false;
       return b;
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       this.lazySet(cd1.a);
       this.c.run();
       return;
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
