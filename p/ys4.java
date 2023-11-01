package p.ys4;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.zs4;
import p.cd1;
import java.lang.Object;
import p.fn0;
import java.util.concurrent.atomic.AtomicInteger;
import p.gq6;
import io.reactivex.rxjava3.core.Observer;
import p.rn;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.Observable;

public final class ys4 extends AtomicReference implements MaybeObserver, Disposable	// class@002e1b from classes.dex
{
    public final zs4 a;

    public void ys4(zs4 p0){
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
       ys4 ta = this.a;
       ta.c.b(this);
       zs4 t = ta.t;
       if (!ta.get()) {
          int i = 0;
          if (ta.compareAndSet(i, 1)) {
             if (!t.decrementAndGet()) {
                i = 1;
             }
             gq6 ogq6 = ta.x.get();
             if (i && (ogq6 == null && !ogq6.isEmpty())) {
                ta.v.d(ta.a);
             }else if(!ta.decrementAndGet()){
                ta.a();
             }
          }else {
          label_0043 :
             t.decrementAndGet();
             if (!ta.getAndIncrement()) {
                ta.a();
             }
          }
       }else {
          goto label_0043 ;
       }
       return;
    }
    public final void onError(Throwable p0){
       ys4 ta = this.a;
       zs4 c = ta.c;
       c.b(this);
       if (ta.v.a(p0)) {
          if (ta.b == null) {
             ta.y.dispose();
             c.dispose();
          }
          ta.t.decrementAndGet();
          if (!ta.getAndIncrement()) {
             ta.a();
          }
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
    public final void onSuccess(Object p0){
       gq6 ogq6;
       ys4 ta = this.a;
       ta.c.b(this);
       int i = 1;
       if (!ta.get() && ta.compareAndSet(0, i)) {
          ta.a.onNext(p0);
          if (ta.t.decrementAndGet()) {
             i = 0;
          }
          p0 = ta.x.get();
          if (i && (p0 == null && !p0.isEmpty())) {
             ta.v.d(ta.a);
          }else if(!ta.decrementAndGet()){
             ta.a();
          }
       }else {
          zs4 x = ta.x;
          if ((ogq6 = x.get()) == null) {
             ogq6 = new gq6(Observable.bufferSize());
             while (!x.compareAndSet(null, ogq6)) {
                if (x.get() != null) {
                   i = 0;
                   break ;
                }
             }
             if (!i) {
                ogq6 = x.get();
             }
          }
          gq6 ogq61 = ogq6;
          _monitor_enter(ogq61);
          ogq61.offer(p0);
          _monitor_exit(ogq61);
          ta.t.decrementAndGet();
          if (!ta.getAndIncrement()) {
          }
       }
       return;
    }
}
