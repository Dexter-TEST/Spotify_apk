package p.ez4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import p.cz4;
import p.dz4;

public final class ez4 extends z1	// class@001529 from classes.dex
{
    public final long b;
    public final long c;
    public final int t;

    public void ez4(ObservableSource p0,long p1,long p2,int p3){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final void subscribeActual(Observer p0){
       z1 ta = this.a;
       ez4 tb = this.b;
       if (!(tb - this.c)) {
          ta.subscribe(new cz4(p0, tb, this.t));
       }else {
          dz4 v0 = new dz4(p0, this.b, this.c, this.t);
          ta.subscribe(v0);
       }
       return;
    }
}
