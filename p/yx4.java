package p.yx4;
import io.reactivex.rxjava3.core.Observable;
import p.yf2;
import io.reactivex.rxjava3.core.Observer;
import p.io2;
import p.xx4;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ay4;

public final class yx4 extends Observable	// class@002e47 from classes.dex
{
    public final int a;
    public final Observable b;
    public final yf2 c;
    public final boolean t;

    public void yx4(Observable p0,yf2 p1,boolean p2,int p3){
       this.a = p3;
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
    }
    public final void subscribeActual(Observer p0){
       yx4 tt = this.t;
       yx4 tc = this.c;
       yx4 tb = this.b;
       switch (this.a){
           case 0:
             if (!io2.z(tb, tc, p0)) {
                tb.subscribe(new xx4(p0, tc, tt));
             }
             break;
           default:
             if (!io2.A(tb, tc, p0)) {
                tb.subscribe(new ay4(p0, tc, tt));
             }
             return;
       }
       return;
    }
}
