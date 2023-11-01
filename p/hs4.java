package p.hs4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import p.gs4;

public final class hs4 extends z1	// class@0018b2 from classes.dex
{
    public final long b;
    public final Object c;
    public final boolean t;

    public void hs4(ObservableSource p0,long p1,Object p2,boolean p3){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final void subscribeActual(Observer p0){
       gs4 v6 = new gs4(p0, this.b, this.c, this.t);
       this.a.subscribe(v6);
    }
}
