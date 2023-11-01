package p.us4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import p.bt4;
import p.yf2;
import p.zs4;
import p.ts4;
import p.ab6;
import p.tw4;
import p.uw4;

public final class us4 extends z1	// class@002910 from classes.dex
{
    public final int b;
    public final Object c;
    public final boolean t;

    public void us4(ObservableSource p0,Object p1,boolean p2,int p3){
       this.b = p3;
       super(p0);
       this.c = p1;
       this.t = p2;
    }
    public final void subscribeActual(Observer p0){
       z1 ta = this.a;
       us4 tt = this.t;
       us4 tc = this.c;
       switch (this.b){
           case 0:
             ta.subscribe(new ts4(p0, tc, tt));
             return;
           case 1:
             ta.subscribe(new zs4(p0, tc, tt));
             return;
           case 2:
             ta.subscribe(new bt4(p0, tc, tt));
             return;
           default:
             ab6 uoab6 = new ab6(p0);
             if (tt != null) {
                ta.subscribe(new tw4(tc, uoab6));
             }else {
                ta.subscribe(new uw4(tc, uoab6));
             }
             return;
       }
    }
}
