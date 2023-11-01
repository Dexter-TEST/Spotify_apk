package p.zx4;
import io.reactivex.rxjava3.core.SingleObserver;
import java.util.concurrent.atomic.AtomicReference;
import p.ay4;
import java.lang.Throwable;
import java.lang.Object;
import p.rn;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;

public final class zx4 extends AtomicReference implements SingleObserver	// class@002f85 from classes.dex
{
    public final ay4 a;
    public Object b;

    public void zx4(ay4 p0){
       super();
       this.a = p0;
    }
    public final void onError(Throwable p0){
       zx4 ta = this.a;
       ay4 v = ta.v;
       while (true) {
          if (v.compareAndSet(this, null)) {
             v = 1;
          }else {
             if (v.get() != this) {
                v = 0;
             }
          }
          if (v) {
             if (ta.t.a(p0)) {
                if (ta.c == null) {
                   ta.w.dispose();
                   ta.a();
                }
                ta.b();
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
       this.a.b();
    }
}
