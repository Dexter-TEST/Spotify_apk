package p.rk6;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.SingleObserver;
import p.qk6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class rk6 extends Single	// class@002507 from classes.dex
{
    public final SingleSource a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler t;
    public final SingleSource v;

    public void rk6(SingleSource p0,long p1,TimeUnit p2,Scheduler p3,SingleSource p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final void subscribeActual(SingleObserver p0){
       qk6 v6 = new qk6(p0, this.v, this.b, this.c);
       p0.onSubscribe(v6);
       cd1.c(v6.b, this.t.d(v6, this.b, this.c));
       this.a.subscribe(v6);
    }
}
