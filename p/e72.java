package p.e72;
import p.p0;
import p.b72;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Flowable;
import p.iv6;
import p.d72;
import p.eb6;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import io.reactivex.rxjava3.core.FlowableSubscriber;

public final class e72 extends p0	// class@001430 from classes.dex
{
    public final long c;
    public final TimeUnit t;
    public final Scheduler v;

    public void e72(b72 p0,TimeUnit p1,Scheduler p2){
       super(p0);
       this.c = 100;
       this.t = p1;
       this.v = p2;
    }
    public final void u(iv6 p0){
       d72 v6 = new d72(new eb6(p0), this.c, this.t, this.v.b());
       this.b.subscribe(v6);
    }
}
