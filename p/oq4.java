package p.oq4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import p.yf2;
import p.ro1;
import java.lang.Math;
import io.reactivex.rxjava3.core.Observer;
import p.eb3;
import p.ab6;
import p.nq4;
import p.mq4;
import p.kz4;

public final class oq4 extends z1	// class@00216e from classes.dex
{
    public final int b;
    public final yf2 c;
    public final int t;
    public final Object v;

    public void oq4(ObservableSource p0,ObservableSource p1,yf2 p2,int p3){
       this.b = 1;
       super(p0);
       this.v = p1;
       this.c = p2;
       this.t = p3;
    }
    public void oq4(ObservableSource p0,yf2 p1,int p2,ro1 p3){
       this.b = 0;
       super(p0);
       this.c = p1;
       this.v = p3;
       this.t = Math.max(8, p2);
    }
    public final void subscribeActual(Observer p0){
       boolean b;
       oq4 tt = this.t;
       oq4 tv = this.v;
       oq4 tc = this.c;
       z1 ta = this.a;
       switch (this.b){
           case 0:
             break;
           default:
             ta.subscribe(new kz4(p0, tv, tc, tt));
             return;
       }
       if (!eb3.I(ta, p0, tc)) {
          if (tv == ro1.a) {
             ta.subscribe(new nq4(new ab6(p0), tc, tt));
          }else if(tv == ro1.c){
             b = true;
          }else {
             b = false;
          }
          ta.subscribe(new mq4(p0, tc, tt, b));
       }
       return;
    }
}
