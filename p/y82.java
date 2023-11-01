package p.y82;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import p.iv6;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.zn0;
import p.w82;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.x82;

public final class y82 extends p0	// class@002d69 from classes.dex
{
    public final Scheduler c;
    public final boolean t;
    public final int v;

    public void y82(Flowable p0,Scheduler p1,int p2){
       super(p0);
       this.c = p1;
       this.t = false;
       this.v = p2;
    }
    public final void u(iv6 p0){
       Scheduler$Worker worker = this.c.b();
       y82 tv = this.v;
       y82 tt = this.t;
       p0 tb = this.b;
       if (p0 instanceof zn0) {
          tb.subscribe(new w82(p0, worker, tt, tv));
       }else {
          tb.subscribe(new x82(p0, worker, tt, tv));
       }
       return;
    }
}
