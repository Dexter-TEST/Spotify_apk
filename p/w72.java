package p.w72;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.u72;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import p.fn0;
import p.rn;
import p.kv6;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p.iv6;
import p.gq6;
import p.vv7;

public final class w72 extends AtomicReference implements SingleObserver, Disposable	// class@002add from classes.dex
{
    public final u72 a;

    public void w72(u72 p0){
       this.a = p0;
       super();
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onError(Throwable p0){
       w72 ta = this.a;
       u72 w = ta.w;
       w.b(this);
       if (ta.y.a(p0)) {
          if (ta.c == null) {
             ta.B.cancel();
             w.dispose();
          }else if(ta.t != Integer.MAX_VALUE){
             ta.B.a(1);
          }
          ta.x.decrementAndGet();
          ta.d();
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
    public final void onSuccess(Object p0){
       gq6 ogq6;
       w72 ta = this.a;
       ta.w.b(this);
       if (!ta.get()) {
          int i = 0;
          if (ta.compareAndSet(i, 1)) {
             if (!ta.x.decrementAndGet()) {
                i = 1;
             }
             if (ta.v.get()) {
                ta.b.onNext(p0);
                p0 = ta.A.get();
                if (i && (p0 == null && !p0.isEmpty())) {
                   ta.y.e(ta.b);
                }else {
                   vv7.H(ta.v, 1);
                   if (ta.t != Integer.MAX_VALUE) {
                      ta.B.a(1);
                   }
                }
             }else {
                ogq6 = ta.f();
                _monitor_enter(ogq6);
                ogq6.offer(p0);
                _monitor_exit(ogq6);
             }
             if (ta.decrementAndGet()) {
                ta.e();
             }
          }else {
          label_0070 :
             ogq6 = ta.f();
             _monitor_enter(ogq6);
             ogq6.offer(p0);
             _monitor_exit(ogq6);
             ta.x.decrementAndGet();
             if (!ta.getAndIncrement()) {
             }
          }
       }else {
          goto label_0070 ;
       }
       return;
    }
}
