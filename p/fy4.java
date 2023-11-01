package p.fy4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observer;
import p.ey4;

public final class fy4 extends z1	// class@001661 from classes.dex
{
    public final long b;
    public final long c;
    public final TimeUnit t;
    public final Scheduler v;
    public final int w;
    public final boolean x;

    public void fy4(ObservableSource p0,long p1,long p2,TimeUnit p3,Scheduler p4,int p5,boolean p6){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
    }
    public final void subscribeActual(Observer p0){
       ey4 v10 = new ey4(this.w, this.b, this.c, p0, this.v, this.t, this.x);
       this.a.subscribe(v10);
    }
}
