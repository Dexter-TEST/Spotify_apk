package p.t72;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.u72;
import p.cd1;
import java.lang.Object;
import p.fn0;
import java.util.concurrent.atomic.AtomicInteger;
import p.gq6;
import p.iv6;
import p.rn;
import p.kv6;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicLong;
import p.vv7;

public final class t72 extends AtomicReference implements MaybeObserver, Disposable	// class@002713 from classes.dex
{
    public final u72 a;

    public void t72(u72 p0){
       this.a = p0;
       super();
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       t72 ta = this.a;
       ta.w.b(this);
       u72 x = ta.x;
       u72 t = ta.t;
       if (!ta.get()) {
          int i = 0;
          if (ta.compareAndSet(i, 1)) {
             x = (!x.decrementAndGet())? 1: 0;
             gq6 ogq6 = ta.A.get();
             if (x && (ogq6 == null && !ogq6.isEmpty())) {
                i = 1;
             }
             if (i) {
                ta.y.e(ta.b);
             }else if(t != Integer.MAX_VALUE){
                ta.B.a(1);
             }
             if (ta.decrementAndGet()) {
                ta.e();
             }
          }else {
          label_0056 :
             x.decrementAndGet();
             if (t != Integer.MAX_VALUE) {
                ta.B.a(1);
             }
             ta.d();
          }
       }else {
          goto label_0056 ;
       }
       return;
    }
    public final void onError(Throwable p0){
       t72 ta = this.a;
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
       t72 ta = this.a;
       ta.w.b(this);
       if (!ta.get()) {
          int i = 0;
          if (ta.compareAndSet(i, 1)) {
             int i1 = (!ta.x.decrementAndGet())? 1: 0;
             if (ta.v.get()) {
                ta.b.onNext(p0);
                p0 = ta.A.get();
                if (i1 && (p0 == null && !p0.isEmpty())) {
                   i = 1;
                }
                if (i) {
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
          label_0075 :
             ogq6 = ta.f();
             _monitor_enter(ogq6);
             ogq6.offer(p0);
             _monitor_exit(ogq6);
             ta.x.decrementAndGet();
             if (!ta.getAndIncrement()) {
             }
          }
       }else {
          goto label_0075 ;
       }
       return;
    }
}
