package p.r82;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import p.yf2;
import p.iv6;
import java.lang.Integer;
import p.rl1;
import p.eb6;
import java.lang.String;
import p.ap5;
import p.cc7;
import p.bb6;
import java.lang.Object;
import java.util.Objects;
import p.bn5;
import p.r92;
import p.q92;
import p.g92;
import p.kv6;
import java.lang.Throwable;
import p.co5;
import p.f92;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.e92;
import p.zn0;
import p.n72;
import p.q82;

public final class r82 extends p0	// class@002496 from classes.dex
{
    public final int c;
    public final yf2 t;

    public void r82(Flowable p0,yf2 p1,int p2){
       this.c = p2;
       this.t = p1;
    }
    public final void u(iv6 p0){
       cc7 uocc7;
       Object obj;
       r92 or92;
       int i = 0;
       Integer integer = Integer.valueOf(i);
       String str = "capacityHint";
       int i1 = 8;
       String str1 = "handler returned a null Publisher";
       p0 tb = this.b;
       r82 tt = this.t;
       switch (this.c){
           case 0:
             if (p0 instanceof zn0) {
                tb.subscribe(new n72(p0, tt, 1));
             }else {
                tb.subscribe(new q82(p0, tt));
             }
             return;
             break;
           case 1:
             e92 uoe92 = new e92(p0, tt);
             p0.onSubscribe(uoe92);
             tb.subscribe(uoe92);
             return;
           case 2:
             tb.subscribe(new f92(p0, tt));
             return;
           case 3:
             eb6 uoeb6 = new eb6(p0);
             ap5.E(i1, str);
             uocc7 = new cc7();
             if (!uocc7 instanceof bb6) {
                uocc7 = new bb6(uocc7);
             }
             obj = tt.apply(uocc7);
             Objects.requireNonNull(obj, str1);
             or92 = new r92(tb);
             q92 oq92 = new q92(uoeb6, uocc7, or92, i);
             or92.t = oq92;
             p0.onSubscribe(oq92);
             obj.subscribe(or92);
             or92.onNext(integer);
             return;
             break;
           default:
             eb6 uoeb61 = new eb6(p0);
             ap5.E(i1, str);
             uocc7 = new cc7();
             if (!uocc7 instanceof bb6) {
                bb6 uobb6 = new bb6(uocc7);
             }
             obj = tt.apply(uocc7);
             Objects.requireNonNull(obj, str1);
             or92 = new r92(tb);
             q92 oq921 = new q92(uoeb61, uocc7, or92, 1);
             or92.t = oq921;
             p0.onSubscribe(oq921);
             obj.subscribe(or92);
             or92.onNext(integer);
             return;
       }
    }
}
