package p.di6;
import io.reactivex.rxjava3.core.SingleObserver;
import p.fn0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class di6 implements SingleObserver	// class@001354 from classes.dex
{
    public final fn0 a;
    public final SingleObserver b;
    public final AtomicBoolean c;
    public Disposable t;

    public void di6(SingleObserver p0,fn0 p1,AtomicBoolean p2){
       super();
       this.b = p0;
       this.a = p1;
       this.c = p2;
    }
    public final void onError(Throwable p0){
       if (this.c.compareAndSet(false, true)) {
          di6 ta = this.a;
          ta.b(this.t);
          ta.dispose();
          this.b.onError(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       this.t = p0;
       this.a.c(p0);
    }
    public final void onSuccess(Object p0){
       if (this.c.compareAndSet(false, true)) {
          di6 ta = this.a;
          ta.b(this.t);
          ta.dispose();
          this.b.onSuccess(p0);
       }
       return;
    }
}
