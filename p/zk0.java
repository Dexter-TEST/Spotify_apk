package p.zk0;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import p.fn0;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class zk0 extends AtomicInteger implements CompletableObserver, Disposable	// class@002f10 from classes.dex
{
    public final CompletableObserver a;
    public final AtomicBoolean b;
    public final fn0 c;

    public void zk0(CompletableObserver p0,AtomicBoolean p1,fn0 p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.lazySet(p3);
    }
    public void dispose(){
       this.c.dispose();
       this.b.set(true);
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final void onComplete(){
       if (!this.decrementAndGet()) {
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       this.c.dispose();
       if (this.b.compareAndSet(false, true)) {
          this.a.onError(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       this.c.c(p0);
    }
}
