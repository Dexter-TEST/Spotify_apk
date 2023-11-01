package p.my4;
import p.z1;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import p.ly4;
import io.reactivex.rxjava3.core.Scheduler$Worker;

public final class my4 extends z1	// class@001f2d from classes.dex
{
    public final long b;
    public final TimeUnit c;
    public final Scheduler t;
    public final boolean v;

    public void my4(Observable p0,long p1,TimeUnit p2,Scheduler p3,boolean p4){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final void subscribeActual(Observer p0){
       ly4 v7 = new ly4(p0, this.b, this.c, this.t.b(), this.v);
       this.a.subscribe(v7);
    }
}
