package p.ta2;
import io.reactivex.rxjava3.core.Flowable;
import p.bn5;
import p.vt5;
import p.iv6;
import p.sa2;
import p.yf2;

public final class ta2 extends Flowable	// class@00272f from classes.dex
{
    public final bn5 b;
    public final yf2 c;
    public final boolean t;

    public void ta2(bn5 p0,vt5 p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
    }
    public final void u(iv6 p0){
       this.b.subscribe(new sa2(p0, this.c, this.t));
    }
}
