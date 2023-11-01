package p.mp4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import p.zv6;
import io.reactivex.rxjava3.core.Observer;
import p.kp4;
import p.lp4;

public final class mp4 extends z1	// class@001ede from classes.dex
{
    public final int b;
    public final int c;
    public final zv6 t;

    public void mp4(ObservableSource p0,int p1,int p2,zv6 p3){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final void subscribeActual(Observer p0){
       mp4 tt = this.t;
       z1 ta = this.a;
       mp4 tc = this.c;
       mp4 tb = this.b;
       if (tc == tb) {
          kp4 okp4 = new kp4(p0, tb, tt);
          if (okp4.a()) {
             ta.subscribe(okp4);
          }
       }else {
          ta.subscribe(new lp4(p0, tb, tc, tt));
       }
       return;
    }
}
