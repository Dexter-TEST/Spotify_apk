package p.ux4;
import io.reactivex.rxjava3.core.CompletableObserver;
import java.util.concurrent.atomic.AtomicReference;
import p.vx4;
import java.lang.Object;
import p.rn;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;

public final class ux4 extends AtomicReference implements CompletableObserver	// class@00293d from classes.dex
{
    public final vx4 a;

    public void ux4(vx4 p0){
       super();
       this.a = p0;
    }
    public final void onComplete(){
       ux4 ta = this.a;
       vx4 v = ta.v;
       while (true) {
          if (v.compareAndSet(this, null)) {
             v = 1;
          }else {
             if (v.get() != this) {
                v = 0;
             }
          }
          if (v && ta.w != null) {
             ta.t.c(ta.a);
             break ;
          }
          break ;
       }
       return;
    }
    public final void onError(Throwable p0){
       ux4 ta = this.a;
       vx4 v = ta.v;
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
                if (ta.c != null) {
                   if (ta.w != null) {
                      ta.t.c(ta.a);
                      break ;
                   }
                }else {
                   ta.x.dispose();
                   ta.a();
                   ta.t.c(ta.a);
                   break ;
                }
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
}
