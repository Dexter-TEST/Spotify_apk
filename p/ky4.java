package p.ky4;
import p.z1;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observer;
import p.jy4;
import p.ab6;
import io.reactivex.rxjava3.core.Scheduler$Worker;

public final class ky4 extends z1	// class@001ca8 from classes.dex
{
    public final long b;
    public final TimeUnit c;
    public final Scheduler t;

    public void ky4(long p0,TimeUnit p1,ObservableSource p2,Scheduler p3){
       super(p2);
       this.b = p0;
       this.c = p1;
       this.t = p3;
    }
    public final void subscribeActual(Observer p0){
       jy4 v6 = new jy4(new ab6(p0), this.b, this.c, this.t.b());
       this.a.subscribe(v6);
    }
}
