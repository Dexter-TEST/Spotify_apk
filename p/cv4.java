package p.cv4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observer;
import p.n77;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.bv4;

public final class cv4 extends z1	// class@001285 from classes.dex
{
    public final Scheduler b;
    public final boolean c;
    public final int t;

    public void cv4(ObservableSource p0,Scheduler p1,boolean p2,int p3){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final void subscribeActual(Observer p0){
       cv4 tb = this.b;
       z1 ta = this.a;
       if (tb instanceof n77) {
          ta.subscribe(p0);
       }else {
          ta.subscribe(new bv4(p0, tb.b(), this.c, this.t));
       }
       return;
    }
}
