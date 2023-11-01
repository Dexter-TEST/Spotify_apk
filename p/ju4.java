package p.ju4;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observer;
import p.iu4;
import io.reactivex.rxjava3.disposables.Disposable;
import p.n77;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Runnable;

public final class ju4 extends Observable	// class@001b49 from classes.dex
{
    public final Scheduler a;
    public final long b;
    public final long c;
    public final long t;
    public final long v;
    public final TimeUnit w;

    public void ju4(long p0,long p1,long p2,long p3,TimeUnit p4,Scheduler p5){
       super();
       this.t = p2;
       this.v = p3;
       this.w = p4;
       this.a = p5;
       this.b = p0;
       this.c = p1;
    }
    public final void subscribeActual(Observer p0){
       iu4 v7 = new iu4(p0, this.b, this.c);
       p0.onSubscribe(v7);
       ju4 ta = this.a;
       if (ta instanceof n77) {
          Scheduler$Worker worker = ta.b();
          cd1.e(v7, worker);
          worker.c(v7, this.t, this.v, this.w);
       }else {
          cd1.e(v7, ta.e(v7, this.t, this.v, this.w));
       }
       return;
    }
}
