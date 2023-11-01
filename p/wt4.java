package p.wt4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import p.ku4;
import p.yf2;
import p.w00;
import io.reactivex.rxjava3.disposables.Disposable;
import p.vt4;
import p.tt4;
import p.fn0;
import p.st4;
import p.fs4;
import p.ir0;
import p.b5;

public final class wt4 extends z1	// class@002ba2 from classes.dex
{
    public final int b;
    public final Object c;
    public final Object t;
    public final Object v;
    public final Object w;

    public void wt4(ObservableSource p0,Object p1,Object p2,Object p3,Object p4,int p5){
       this.b = p5;
       super(p0);
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = p4;
    }
    public final void subscribeActual(Observer p0){
       vt4 ovt4;
       vt4 ovt41;
       boolean b = true;
       wt4 tc = this.c;
       z1 ta = this.a;
       wt4 tw = this.w;
       wt4 tv = this.v;
       wt4 tt = this.t;
       switch (this.b){
           case 0:
             st4 ost4 = new st4(p0, tt, tv, tw);
             p0.onSubscribe(ost4);
             ovt4 = new vt4(ost4, b);
             st4 c = ost4.c;
             c.c(ovt4);
             ovt41 = new vt4(ost4, false);
             c.c(ovt41);
             ta.subscribe(ovt4);
             tc.subscribe(ovt41);
             return;
           case 1:
             ku4 oku4 = new ku4(p0, tt, tv, tw);
             p0.onSubscribe(oku4);
             ovt4 = new vt4(oku4, b);
             ku4 c1 = oku4.c;
             c1.c(ovt4);
             ovt41 = new vt4(oku4, false);
             c1.c(ovt41);
             ta.subscribe(ovt4);
             tc.subscribe(ovt41);
             return;
           default:
             fs4 v0 = new fs4(p0, tc, tt, tv, tw);
             ta.subscribe(v0);
             return;
       }
    }
}
