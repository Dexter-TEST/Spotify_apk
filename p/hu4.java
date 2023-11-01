package p.hu4;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observer;
import p.gu4;
import io.reactivex.rxjava3.disposables.Disposable;
import p.n77;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Runnable;

public final class hu4 extends Observable	// class@0018c4 from classes.dex
{
    public final Scheduler a;
    public final long b;
    public final long c;
    public final TimeUnit t;

    public void hu4(long p0,long p1,TimeUnit p2,Scheduler p3){
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.a = p3;
    }
    public final void subscribeActual(Observer p0){
       gu4 ogu4 = new gu4(p0);
       p0.onSubscribe(ogu4);
       hu4 ta = this.a;
       if (ta instanceof n77) {
          Scheduler$Worker worker = ta.b();
          cd1.e(ogu4, worker);
          worker.c(ogu4, this.b, this.c, this.t);
       }else {
          cd1.e(ogu4, ta.e(ogu4, this.b, this.c, this.t));
       }
       return;
    }
}
