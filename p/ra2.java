package p.ra2;
import io.reactivex.rxjava3.core.SingleObserver;
import java.util.concurrent.atomic.AtomicReference;
import p.sa2;
import java.lang.Throwable;
import java.lang.Object;
import p.rn;
import p.kv6;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;

public final class ra2 extends AtomicReference implements SingleObserver	// class@0024a9 from classes.dex
{
    public final sa2 a;
    public Object b;

    public void ra2(sa2 p0){
       super();
       this.a = p0;
    }
    public final void onError(Throwable p0){
       ra2 ta = this.a;
       sa2 w = ta.w;
       while (true) {
          if (w.compareAndSet(this, null)) {
             w = 1;
          }else {
             if (w.get() != this) {
                w = 0;
             }
          }
          if (w) {
             if (ta.t.a(p0)) {
                if (ta.c == null) {
                   ta.x.cancel();
                   ta.b();
                }
                ta.d();
                break ;
             }
          }else {
             RxJavaPlugins.c(p0);
             break ;
          }
          break ;
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
    public final void onSuccess(Object p0){
       this.b = p0;
       this.a.d();
    }
}
