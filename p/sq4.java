package p.sq4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import p.yf2;
import p.ro1;
import io.reactivex.rxjava3.core.Observer;
import p.rq4;

public final class sq4 extends z1	// class@00267d from classes.dex
{
    public final yf2 b;
    public final ro1 c;
    public final int t;
    public final int v;

    public void sq4(ObservableSource p0,yf2 p1,ro1 p2,int p3,int p4){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final void subscribeActual(Observer p0){
       rq4 v6 = new rq4(this.t, this.v, p0, this.b, this.c);
       this.a.subscribe(v6);
    }
}
