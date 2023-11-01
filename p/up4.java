package p.up4;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.pn5;
import p.ab6;
import p.zv6;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.kf6;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.util.Collection;
import p.yh6;
import p.xh6;
import p.eo5;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import p.co5;
import p.cd1;
import p.jl1;

public final class up4 extends pn5 implements Runnable, Disposable	// class@0028f6 from classes.dex
{
    public final int A;
    public final boolean B;
    public final Scheduler$Worker C;
    public Collection D;
    public Disposable E;
    public Disposable F;
    public long G;
    public long H;
    public final zv6 x;
    public final long y;
    public final TimeUnit z;

    public void up4(ab6 p0,zv6 p1,long p2,TimeUnit p3,int p4,boolean p5,Scheduler$Worker p6){
       super(p0, new kf6(14));
       this.x = p1;
       this.y = p2;
       this.z = p3;
       this.A = p4;
       this.B = p5;
       this.C = p6;
    }
    public void dispose(){
       if (this.v == null) {
          this.v = true;
          this.F.dispose();
          this.C.dispose();
          _monitor_enter(this);
          this.D = null;
          _monitor_exit(this);
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
       this.C.dispose();
       _monitor_enter(this);
       up4 tD = this.D;
       this.D = null;
       _monitor_exit(this);
       if (tD != null) {
          this.t.offer(tD);
          this.w = true;
          if (this.k()) {
             eo5.j(this.t, this.c, this, this);
          }
       }
       return;
    }
    public final void onError(Throwable p0){
       _monitor_enter(this);
       this.D = null;
       _monitor_exit(this);
       this.c.onError(p0);
       this.C.dispose();
    }
    public final void onNext(Object p0){
       up4 tD;
       _monitor_enter(this);
       if ((tD = this.D) == null) {
          _monitor_exit(this);
          return;
       }else {
          tD.add(p0);
          if (tD.size() < this.A) {
             _monitor_exit(this);
             return;
          }else {
             this.D = null;
             this.G = this.G + 1;
             _monitor_exit(this);
             if (this.B != null) {
                this.E.dispose();
             }
             this.m(tD, this);
             p0 = this.x.get();
             Objects.requireNonNull(p0, "The buffer supplied is null");
             _monitor_enter(this);
             this.D = p0;
             this.H = this.H + 1;
             _monitor_exit(this);
             if (this.B != null) {
                up4 ty = this.y;
                this.E = this.C.c(this, ty, ty, this.z);
             }
             return;
          }
       }
    }
    public final void onSubscribe(Disposable p0){
       pn5 tc = this.c;
       if (cd1.g(this.F, p0)) {
          this.F = p0;
          Object obj = this.x.get();
          Objects.requireNonNull(obj, "The buffer supplied is null");
          this.D = obj;
          tc.onSubscribe(this);
          up4 ty = this.y;
          this.E = this.C.c(this, ty, ty, this.z);
       }
       return;
    }
    public final void run(){
       up4 tD;
       Object obj = this.x.get();
       Objects.requireNonNull(obj, "The bufferSupplier returned a null buffer");
       _monitor_enter(this);
       if ((tD = this.D) != null && !(this.G - this.H)) {
          this.D = obj;
          _monitor_exit(this);
          this.m(tD, this);
          return;
       }else {
          _monitor_exit(this);
          return;
       }
    }
}
