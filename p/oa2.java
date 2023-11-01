package p.oa2;
import io.reactivex.rxjava3.core.CompletableObserver;
import java.util.concurrent.atomic.AtomicReference;
import p.pa2;
import java.lang.Object;
import p.rn;
import java.lang.Throwable;
import p.kv6;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;

public final class oa2 extends AtomicReference implements CompletableObserver	// class@0020de from classes.dex
{
    public final pa2 a;

    public void oa2(pa2 p0){
       super();
       this.a = p0;
    }
    public final void onComplete(){
       oa2 ta = this.a;
       pa2 v = ta.v;
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
       oa2 ta = this.a;
       pa2 v = ta.v;
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
                   ta.x.cancel();
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
