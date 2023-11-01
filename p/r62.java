package p.r62;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import p.ro1;
import p.wj6;
import p.iv6;
import p.q62;
import p.yf2;
import io.reactivex.rxjava3.core.FlowableSubscriber;

public final class r62 extends p0	// class@002484 from classes.dex
{
    public final yf2 c;
    public final int t;
    public final int v;
    public final ro1 w;

    public void r62(Flowable p0,int p1,int p2,ro1 p3){
       super(p0);
       this.c = wj6.a;
       this.t = p1;
       this.v = p2;
       this.w = p3;
    }
    public final void u(iv6 p0){
       q62 v6 = new q62(p0, this.c, this.t, this.v, this.w);
       this.b.subscribe(v6);
    }
}
