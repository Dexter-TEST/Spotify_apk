package p.s72;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import p.yf2;
import p.iv6;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.r72;
import p.eo5;

public final class s72 extends p0	// class@0025d1 from classes.dex
{
    public final yf2 c;
    public final boolean t;
    public final int v;
    public final int w;

    public void s72(Flowable p0,yf2 p1,int p2,int p3){
       super(p0);
       this.c = p1;
       this.t = false;
       this.v = p2;
       this.w = p3;
    }
    public static FlowableSubscriber subscribe(iv6 p0,yf2 p1,boolean p2,int p3,int p4){
       r72 v6 = new r72(p0, p1, p2, p3, p4);
       return v6;
    }
    public final void u(iv6 p0){
       p0 tb = this.b;
       s72 tc = this.c;
       if (eo5.W(tb, p0, tc)) {
          return;
       }
       tb.subscribe(s72.subscribe(p0, tc, this.t, this.v, this.w));
       return;
    }
}
