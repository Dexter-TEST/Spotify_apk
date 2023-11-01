package p.ll0;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.fn0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.disposables.Disposable;

public final class ll0 implements CompletableObserver	// class@001d74 from classes.dex
{
    public final fn0 a;
    public final AtomicBoolean b;
    public final CompletableObserver c;

    public void ll0(CompletableObserver p0,fn0 p1,AtomicBoolean p2){
       super();
       this.a = p1;
       this.b = p2;
       this.c = p0;
    }
    public final void onComplete(){
       if (this.b.compareAndSet(false, true)) {
          this.a.dispose();
          this.c.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.b.compareAndSet(false, true)) {
          this.a.dispose();
          this.c.onError(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       this.a.c(p0);
    }
}
