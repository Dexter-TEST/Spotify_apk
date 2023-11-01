package p.jx4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observer;
import p.ix4;

public final class jx4 extends z1	// class@001b63 from classes.dex
{
    public final long b;
    public final TimeUnit c;
    public final Scheduler t;
    public final int v;
    public final boolean w;

    public void jx4(ObservableSource p0,long p1,TimeUnit p2,Scheduler p3,int p4,boolean p5){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
    }
    public final void subscribeActual(Observer p0){
       ix4 v8 = new ix4(p0, this.b, this.c, this.t, this.v, this.w);
       this.a.subscribe(v8);
    }
}
