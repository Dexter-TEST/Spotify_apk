package p.pv4;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import p.ov4;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Long;
import java.lang.Object;

public final class pv4 extends Observable	// class@0022db from classes.dex
{
    public final long a;
    public final long b;

    public void pv4(long p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void subscribeActual(Observer p0){
       pv4 ta = this.a;
       ov4 v6 = new ov4(p0, ta, (ta + this.b));
       p0.onSubscribe(v6);
       if (v6.t != null) {
       }else {
          v6 = v6.c;
          while (true) {
             ov4 a = v6.a;
             if ((v6 - v6.b) && !v6.get()) {
                a.onNext(Long.valueOf(v6));
                long l = v6 + 1;
             }else if(!v6.get()){
                v6.lazySet(1);
                a.onComplete();
             }
          }
       }
       return;
    }
}
