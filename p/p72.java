package p.p72;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import p.bi5;
import p.iv6;
import p.zn0;
import p.n72;
import java.lang.Object;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.o72;
import p.ua2;

public final class p72 extends p0	// class@002205 from classes.dex
{
    public final int c;
    public final bi5 t;

    public void p72(Flowable p0,bi5 p1,int p2){
       this.c = p2;
       this.t = p1;
    }
    public final void u(iv6 p0){
       p0 tb = this.b;
       p72 tt = this.t;
       switch (this.c){
           case 0:
             break;
           default:
             tb.subscribe(new ua2(p0, tt));
             return;
       }
       if (p0 instanceof zn0) {
          tb.subscribe(new n72(p0, tt, 0));
       }else {
          tb.subscribe(new o72(p0, tt));
       }
       return;
    }
}
