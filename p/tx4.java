package p.tx4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import p.yf2;
import io.reactivex.rxjava3.core.Observer;
import p.eb3;
import p.sx4;

public final class tx4 extends z1	// class@0027ff from classes.dex
{
    public final yf2 b;
    public final int c;
    public final boolean t;

    public void tx4(ObservableSource p0,yf2 p1,int p2,boolean p3){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final void subscribeActual(Observer p0){
       z1 ta = this.a;
       tx4 tb = this.b;
       if (eb3.I(ta, p0, tb)) {
          return;
       }
       ta.subscribe(new sx4(p0, tb, this.c, this.t));
       return;
    }
}
