package p.u82;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Object;
import p.iv6;
import p.lv6;
import p.kv6;
import p.ca2;
import p.y00;
import p.p92;
import p.tp2;
import java.util.concurrent.atomic.AtomicInteger;
import p.bn5;
import p.t82;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.CompletableSource;
import p.s82;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.wa2;
import io.reactivex.rxjava3.core.Scheduler;

public final class u82 extends p0	// class@00285f from classes.dex
{
    public final int c;
    public final Object t;

    public void u82(Flowable p0,Object p1,int p2){
       this.c = p2;
       this.t = p1;
    }
    public final void u(iv6 p0){
       lv6 olv6;
       u82 tt = this.t;
       p0 tb = this.b;
       switch (this.c){
           case 0:
             t82 ot82 = new t82(p0, 0);
             p0.onSubscribe(ot82);
             tb.subscribe(ot82);
             tt.subscribe(ot82.x);
             return;
           case 1:
             olv6 = new lv6();
             p0.onSubscribe(olv6);
             tp2.v(tt);
             p92 op92 = new p92(p0, olv6, tb);
             if (!op92.getAndIncrement()) {
                int i = 1;
                while (op92.b.x == null) {
                   p92 t = op92.t;
                   if (t) {
                      op92.t = 0;
                      op92.b.d(t);
                   }
                   op92.c.subscribe(op92);
                   if (i = - i) {
                   }
                }
             }
             return;
             break;
           case 2:
             olv6 = new lv6();
             p0.onSubscribe(olv6);
             new ca2(p0, tt, olv6, tb).a();
             return;
           default:
             tb.subscribe(new wa2(p0, tt));
             return;
       }
    }
}
