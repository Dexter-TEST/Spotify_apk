package p.vy4;
import p.z1;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import p.ty4;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ja2;
import p.uy4;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.sy4;

public final class vy4 extends z1	// class@002a8d from classes.dex
{
    public final long b;
    public final TimeUnit c;
    public final Scheduler t;
    public final ObservableSource v;

    public void vy4(Observable p0,long p1,TimeUnit p2,Scheduler p3,ObservableSource p4){
       super(p0);
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final void subscribeActual(Observer p0){
       ty4 v0;
       z1 ta = this.a;
       long l = 0;
       vy4 tt = this.t;
       if (this.v == null) {
          v0 = new ty4(p0, this.b, this.c, tt.b());
          p0.onSubscribe(v0);
          ty4 v = v0.v;
          v.getClass();
          cd1.c(v, v0.t.b(new ja2(l, v0), v0.b, v0.c));
          ta.subscribe(v0);
       }else {
          sy4 v01 = new sy4(p0, this.b, this.c, tt.b(), this.v);
          p0.onSubscribe(v0);
          sy4 v1 = v0.v;
          v1.getClass();
          cd1.c(v1, v0.t.b(new ja2(l, v0), v0.b, v0.c));
          ta.subscribe(v0);
       }
       return;
    }
}
