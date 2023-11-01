package p.zp4;
import p.z1;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import p.zv6;
import io.reactivex.rxjava3.core.Observer;
import p.vp4;
import p.ab6;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.up4;
import p.yp4;

public final class zp4 extends z1	// class@002f40 from classes.dex
{
    public final long b;
    public final long c;
    public final TimeUnit t;
    public final Scheduler v;
    public final zv6 w;
    public final int x;
    public final boolean y;

    public void zp4(ObservableSource p0,long p1,long p2,TimeUnit p3,Scheduler p4,zv6 p5,int p6,boolean p7){
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
       up4 v2;
       zp4 ozp4 = this;
       Observer observer = p0;
       zp4 b = ozp4.b;
       z1 a = ozp4.a;
       if (!(b - ozp4.c) && ozp4.x == Integer.MAX_VALUE) {
          vp4 v9 = new vp4(new ab6(observer), ozp4.w, b, ozp4.t, ozp4.v);
          a.subscribe(v9);
          return;
       }else {
          Scheduler$Worker worker = ozp4.v.b();
          zp4 b1 = ozp4.b;
          zp4 c = ozp4.c;
          if (!(b1 - c)) {
             v2 = new up4(new ab6(observer), ozp4.w, b1, ozp4.t, ozp4.x, ozp4.y, worker);
             a.subscribe(v2);
             return;
          }else {
             yp4 v21 = new yp4(new ab6(observer), ozp4.w, b1, c, ozp4.t, worker);
             a.subscribe(v2);
             return;
          }
       }
    }
}
