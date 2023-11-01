package p.jj6;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.SingleSource;
import p.yf2;
import p.iv6;
import p.ij6;
import io.reactivex.rxjava3.core.SingleObserver;
import p.pj6;

public final class jj6 extends Flowable	// class@001aec from classes.dex
{
    public final int b;
    public final SingleSource c;
    public final yf2 t;

    public void jj6(SingleSource p0,yf2 p1,int p2){
       this.b = p2;
       super();
       this.c = p0;
       this.t = p1;
    }
    public final void u(iv6 p0){
       jj6 tc = this.c;
       jj6 tt = this.t;
       switch (this.b){
           case 0:
           default:
             tc.subscribe(new pj6(p0, tt));
             return;
       }
       tc.subscribe(new ij6(p0, tt));
       return;
    }
}
