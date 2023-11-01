package p.qz4;
import p.z1;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import p.oz4;
import p.nz4;
import p.pz4;
import io.reactivex.rxjava3.core.Scheduler$Worker;

public final class qz4 extends z1	// class@002445 from classes.dex
{
    public final long b;
    public final long c;
    public final TimeUnit t;
    public final Scheduler v;
    public final long w;
    public final int x;
    public final boolean y;

    public void qz4(Observable p0,long p1,long p2,TimeUnit p3,Scheduler p4,long p5,int p6,boolean p7){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = p7;
    }
    public final void subscribeActual(Observer p0){
       oz4 v1;
       qz4 oqz4 = this;
       z1 a = oqz4.a;
       if (!(oqz4.b - oqz4.c)) {
          if (!(oqz4.w - Long.MAX_VALUE)) {
             v1 = new oz4(p0, oqz4.b, oqz4.t, oqz4.v, oqz4.x);
             a.subscribe(v1);
             return;
          }else {
             nz4 v11 = new nz4(oqz4.x, oqz4.b, oqz4.w, p0, oqz4.v, oqz4.t, oqz4.y);
             a.subscribe(v1);
             return;
          }
       }else {
          pz4 v12 = new pz4(p0, oqz4.b, oqz4.c, oqz4.t, oqz4.v.b(), oqz4.x);
          a.subscribe(v1);
          return;
       }
    }
}
