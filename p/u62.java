package p.u62;
import io.reactivex.rxjava3.core.Flowable;
import p.bn5;
import p.vt5;
import p.ro1;
import p.iv6;
import p.t62;
import p.yf2;
import io.reactivex.rxjava3.core.FlowableSubscriber;

public final class u62 extends Flowable	// class@00284e from classes.dex
{
    public final int b;
    public final yf2 c;
    public final ro1 t;
    public final int v;
    public final bn5 w;

    public void u62(bn5 p0,vt5 p1,ro1 p2,int p3,int p4){
       this.b = p4;
       super();
       this.w = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
    }
    public final void u(iv6 p0){
       u62 tc = this.c;
       u62 tt = this.t;
       u62 tv = this.v;
       u62 tw = this.w;
       switch (this.b){
           case 0:
           default:
             tw.subscribe(new t62(p0, tc, tv, tt));
             return;
       }
       tw.subscribe(new t62(p0, tc, tv, tt));
       return;
    }
}
