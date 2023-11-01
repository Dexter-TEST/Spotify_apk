package p.v72;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import p.yf2;
import p.iv6;
import p.u72;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.eo5;
import p.na2;

public final class v72 extends p0	// class@002996 from classes.dex
{
    public final int c;
    public final yf2 t;
    public final boolean v;
    public final int w;

    public void v72(Flowable p0,yf2 p1,int p2){
       this.c = 2;
       super(p0);
       this.t = p1;
       this.w = p2;
       this.v = false;
    }
    public void v72(Flowable p0,yf2 p1,boolean p2,int p3,int p4){
       this.c = p4;
       super(p0);
       this.t = p1;
       this.v = p2;
       this.w = p3;
    }
    public final void u(iv6 p0){
       u72 v0;
       p0 tb = this.b;
       switch (this.c){
           case 0:
             v0 = new u72(p0, this.t, this.v, this.w, 0);
             tb.subscribe(v0);
             return;
           case 1:
             u72 v01 = new u72(p0, this.t, this.v, this.w, 1);
             tb.subscribe(v0);
             return;
           default:
             v72 tt = this.t;
             if (!eo5.W(tb, p0, tt)) {
                tb.subscribe(new na2(this.w, tt, p0, this.v));
             }
             return;
       }
    }
}
