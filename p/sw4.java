package p.sw4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observer;
import p.ab6;
import p.pw4;
import p.qw4;

public final class sw4 extends z1	// class@0026b1 from classes.dex
{
    public final long b;
    public final TimeUnit c;
    public final Scheduler t;
    public final boolean v;

    public void sw4(ObservableSource p0,long p1,TimeUnit p2,Scheduler p3,boolean p4){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final void subscribeActual(Observer p0){
       pw4 this.v;
       ab6 uoab6 = new ab6(p0);
       z1 ta = this.a;
       if (this.v != null) {
          this.v = new pw4(uoab6, this.b, this.c, this.t);
          ta.subscribe(this.v);
       }else {
          qw4 this.v1 = new qw4(uoab6, this.b, this.c, this.t);
          ta.subscribe(this.v);
       }
       return;
    }
}
