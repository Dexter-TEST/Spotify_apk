package p.i72;
import p.p0;
import io.reactivex.rxjava3.core.Flowable;
import p.yf2;
import p.ap5;
import p.iv6;
import p.zn0;
import p.g72;
import p.y00;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.h72;

public final class i72 extends p0	// class@00193a from classes.dex
{
    public final yf2 c;
    public final y00 t;

    public void i72(Flowable p0,yf2 p1){
       super(p0);
       this.c = p1;
       this.t = ap5.w;
    }
    public final void u(iv6 p0){
       i72 tt = this.t;
       i72 tc = this.c;
       p0 tb = this.b;
       if (p0 instanceof zn0) {
          tb.subscribe(new g72(p0, tc, tt));
       }else {
          tb.subscribe(new h72(p0, tc, tt));
       }
       return;
    }
}
