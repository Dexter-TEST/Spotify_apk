package p.ki6;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.SingleObserver;
import p.ra6;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ji6;

public final class ki6 extends Single	// class@001c1e from classes.dex
{
    public final SingleSource a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler t;
    public final boolean v;

    public void ki6(SingleSource p0,long p1,TimeUnit p2,Scheduler p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final void subscribeActual(SingleObserver p0){
       ra6 ora6 = new ra6();
       p0.onSubscribe(ora6);
       this.a.subscribe(new ji6(this, ora6, p0));
    }
}
