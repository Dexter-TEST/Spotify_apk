package p.rs4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import p.yf2;
import io.reactivex.rxjava3.core.Observer;
import p.eb3;
import p.qs4;

public final class rs4 extends z1	// class@00254c from classes.dex
{
    public final yf2 b;
    public final boolean c;
    public final int t;
    public final int v;

    public void rs4(ObservableSource p0,yf2 p1,boolean p2,int p3,int p4){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final void subscribeActual(Observer p0){
       z1 ta = this.a;
       if (eb3.I(ta, p0, this.b)) {
          return;
       }
       qs4 v0 = new qs4(this.t, this.v, p0, this.b, this.c);
       ta.subscribe(v0);
       return;
    }
}
