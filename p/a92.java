package p.a92;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import p.lb;
import p.iv6;
import p.z82;
import p.b5;
import io.reactivex.rxjava3.core.FlowableSubscriber;

public final class a92 extends p0	// class@000f39 from classes.dex
{
    public final int c;
    public final boolean t;
    public final boolean v;
    public final b5 w;

    public void a92(Flowable p0,int p1,lb p2){
       super(p0);
       this.c = p1;
       this.t = true;
       this.v = false;
       this.w = p2;
    }
    public final void u(iv6 p0){
       z82 v6 = new z82(p0, this.c, this.t, this.v, this.w);
       this.b.subscribe(v6);
    }
}
