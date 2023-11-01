package p.v00;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.u00;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import p.hn0;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class v00 extends AtomicReference implements SingleObserver, Disposable	// class@002953 from classes.dex
{
    public final u00 a;

    public void v00(u00 p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == cd1.a)? true: false;
       return b;
    }
    public final void onError(Throwable p0){
       this.lazySet(cd1.a);
       this.a.accept(null, p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
    public final void onSuccess(Object p0){
       this.lazySet(cd1.a);
       this.a.accept(p0, null);
       return;
    }
}
