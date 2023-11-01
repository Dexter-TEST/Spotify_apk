package p.yq4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import p.yf2;
import p.ro1;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Math;
import io.reactivex.rxjava3.core.Observer;
import p.ab6;
import p.xq4;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.wq4;

public final class yq4 extends z1	// class@002e0a from classes.dex
{
    public final yf2 b;
    public final int c;
    public final ro1 t;
    public final Scheduler v;

    public void yq4(ObservableSource p0,yf2 p1,int p2,ro1 p3,Scheduler p4){
       super(p0);
       this.b = p1;
       this.t = p3;
       this.c = Math.max(8, p2);
       this.v = p4;
    }
    public final void subscribeActual(Observer p0){
       yq4 tt;
       yq4 tv = this.v;
       z1 ta = this.a;
       if ((tt = this.t) == ro1.a) {
          ta.subscribe(new xq4(new ab6(p0), this.b, this.c, tv.b()));
       }else {
          yq4 tb = this.b;
          yq4 tc = this.c;
          boolean b = (tt == ro1.c)? true: false;
          wq4 v0 = new wq4(p0, tb, tc, b, tv.b());
          ta.subscribe(v0);
       }
       return;
    }
}
