package p.wx4;
import io.reactivex.rxjava3.core.MaybeObserver;
import java.util.concurrent.atomic.AtomicReference;
import p.xx4;
import java.lang.Object;
import java.lang.Throwable;
import p.rn;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;

public final class wx4 extends AtomicReference implements MaybeObserver	// class@002bc6 from classes.dex
{
    public final xx4 a;
    public Object b;

    public void wx4(xx4 p0){
       super();
       this.a = p0;
    }
    public final void onComplete(){
       wx4 ta = this.a;
       xx4 v = ta.v;
       while (true) {
          if (v.compareAndSet(this, null)) {
             v = 1;
          }else {
             if (v.get() != this) {
                v = 0;
             }
          }
          if (v) {
             ta.b();
             break ;
          }
          break ;
       }
       return;
    }
    public final void onError(Throwable p0){
       wx4 ta = this.a;
       xx4 v = ta.v;
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
