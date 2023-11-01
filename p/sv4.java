package p.sv4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import p.tv4;
import p.k92;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Object;
import p.cd1;

public final class sv4 extends AtomicBoolean implements Observer, Disposable	// class@0026a8 from classes.dex
{
    public final Observer a;
    public final tv4 b;
    public final k92 c;
    public Disposable t;

    public void sv4(Observer p0,tv4 p1,k92 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void dispose(){
       tv4 c;
       this.t.dispose();
       if (this.compareAndSet(false, true)) {
          sv4 tb = this.b;
          sv4 tc = this.c;
          _monitor_enter(tb);
          if ((c = tb.c) != null && c == tc) {
             long l = tc.b - 1;
             tc.b = l;
             if (!(l) && tc.c != null) {
                tb.b(tc);
                _monitor_exit(tb);
             }else {
                _monitor_exit(tb);
             }
          }else {
             _monitor_exit(tb);
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.t.isDisposed();
    }
    public final void onComplete(){
       if (this.compareAndSet(false, true)) {
          this.b.a(this.c);
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.compareAndSet(false, true)) {
          this.b.a(this.c);
          this.a.onError(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.t, p0)) {
          this.t = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
