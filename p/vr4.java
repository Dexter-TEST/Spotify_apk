package p.vr4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observer;
import p.ab6;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.ur4;

public final class vr4 extends z1	// class@002a4e from classes.dex
{
    public final long b;
    public final TimeUnit c;
    public final Scheduler t;
    public final boolean v;

    public void vr4(ObservableSource p0,long p1,TimeUnit p2,Scheduler p3,boolean p4){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final void subscribeActual(Observer p0){
       Observer observer = (this.v != null)? p0: new ab6(p0);
       ur4 this.t = new ur4(observer, this.b, this.c, this.t.b(), this.v);
       this.a.subscribe(this.t);
       return;
    }
}
