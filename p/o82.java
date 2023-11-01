package p.o82;
import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import p.iv6;
import p.n82;
import p.kv6;
import p.n77;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import java.lang.Runnable;

public final class o82 extends Flowable	// class@0020cb from classes.dex
{
    public final Scheduler b;
    public final long c;
    public final long t;
    public final TimeUnit v;

    public void o82(long p0,long p1,TimeUnit p2,Scheduler p3){
       super();
       this.c = p0;
       this.t = p1;
       this.v = p2;
       this.b = p3;
    }
    public final void u(iv6 p0){
       n82 on82 = new n82(p0);
       p0.onSubscribe(on82);
       o82 tb = this.b;
       n82 c = on82.c;
       if (tb instanceof n77) {
          Scheduler$Worker worker = tb.b();
          cd1.e(c, worker);
          worker.c(on82, this.c, this.t, this.v);
       }else {
          cd1.e(c, tb.e(on82, this.c, this.t, this.v));
       }
       return;
    }
}
