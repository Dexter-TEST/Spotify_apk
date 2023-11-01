package p.yp4;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.pn5;
import p.ab6;
import p.zv6;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.kf6;
import java.util.LinkedList;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import p.yh6;
import p.xh6;
import p.eo5;
import java.lang.Throwable;
import java.util.List;
import p.cd1;
import java.lang.String;
import java.util.Objects;
import p.xp4;
import p.co5;
import p.jl1;
import p.wp4;

public final class yp4 extends pn5 implements Runnable, Disposable	// class@002e02 from classes.dex
{
    public final TimeUnit A;
    public final Scheduler$Worker B;
    public final LinkedList C;
    public Disposable D;
    public final zv6 x;
    public final long y;
    public final long z;

    public void yp4(ab6 p0,zv6 p1,long p2,long p3,TimeUnit p4,Scheduler$Worker p5){
       super(p0, new kf6(14));
       this.x = p1;
       this.y = p2;
       this.z = p3;
       this.A = p4;
       this.B = p5;
       this.C = new LinkedList();
    }
    public void dispose(){
       if (this.v == null) {
          this.v = true;
          _monitor_enter(this);
          this.C.clear();
          _monitor_exit(this);
          this.D.dispose();
          this.B.dispose();
       }
       return;
    }
    public boolean isDisposed(){
       return this.v;
    }
    public final void j(Observer p0,Object p1){
       p0.onNext(p1);
    }
    public final void onComplete(){
       _monitor_enter(this);
       this.C.clear();
       _monitor_exit(this);
       Iterator iterator = new ArrayList(this.C).iterator();
       while (iterator.hasNext()) {
          this.t.offer(iterator.next());
       }
       this.w = true;
       if (this.k()) {
          eo5.j(this.t, this.c, this.B, this);
       }
       return;
    }
    public final void onError(Throwable p0){
       this.w = true;
       _monitor_enter(this);
       this.C.clear();
       _monitor_exit(this);
       this.c.onError(p0);
       this.B.dispose();
    }
    public final void onNext(Object p0){
       _monitor_enter(this);
       Iterator iterator = this.C.iterator();
       while (iterator.hasNext()) {
          iterator.next().add(p0);
       }
       _monitor_exit(this);
       return;
    }
    public final void onSubscribe(Disposable p0){
       yp4 tB = this.B;
       pn5 tc = this.c;
       if (cd1.g(this.D, p0)) {
          this.D = p0;
          Object obj = this.x.get();
          Objects.requireNonNull(obj, "The buffer supplied is null");
          this.C.add(obj);
          tc.onSubscribe(this);
          yp4 tz = this.z;
          this.B.c(this, tz, tz, this.A);
          tB.b(new xp4(this, obj), this.y, this.A);
       }
       return;
    }
    public final void run(){
       if (this.v != null) {
          return;
       }
       Object obj = this.x.get();
       Objects.requireNonNull(obj, "The bufferSupplier returned a null buffer");
       _monitor_enter(this);
       if (this.v != null) {
          _monitor_exit(this);
          return;
       }else {
          this.C.add(obj);
          _monitor_exit(this);
          this.B.b(new wp4(this, obj), this.y, this.A);
          return;
       }
    }
}
