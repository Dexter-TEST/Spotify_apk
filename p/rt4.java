package p.rt4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import p.yf2;
import io.reactivex.rxjava3.core.Observer;
import p.ot4;

public final class rt4 extends z1	// class@002555 from classes.dex
{
    public final yf2 b;
    public final yf2 c;
    public final int t;
    public final boolean v;

    public void rt4(ObservableSource p0,yf2 p1,yf2 p2,int p3,boolean p4){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final void subscribeActual(Observer p0){
       ot4 v6 = new ot4(p0, this.b, this.c, this.t, this.v);
       this.a.subscribe(v6);
    }
}
