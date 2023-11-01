package p.at4;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.bt4;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import p.fn0;
import p.rn;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.Observer;
import p.gq6;
import io.reactivex.rxjava3.core.Observable;

public final class at4 extends AtomicReference implements SingleObserver, Disposable	// class@000fec from classes.dex
{
    public final bt4 a;

    public void at4(bt4 p0){
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
       at4 ta = this.a;
       bt4 c = ta.c;
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
       at4 ta = this.a;
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
          bt4 x = ta.x;
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
