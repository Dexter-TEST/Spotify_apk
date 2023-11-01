package p.x72;
import io.reactivex.rxjava3.core.Flowable;
import p.bn5;
import p.vt5;
import p.iv6;
import p.u72;
import p.yf2;

public final class x72 extends Flowable	// class@002c20 from classes.dex
{
    public final bn5 b;
    public final yf2 c;
    public final boolean t;
    public final int v;

    public void x72(bn5 p0,vt5 p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = Integer.MAX_VALUE;
    }
    public final void u(iv6 p0){
       u72 v6 = new u72(p0, this.c, this.t, this.v, 1);
       this.b.subscribe(v6);
    }
}
