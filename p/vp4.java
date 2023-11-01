package p.vp4;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.pn5;
import p.ab6;
import p.zv6;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import p.kf6;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import java.util.Collection;
import p.yh6;
import p.xh6;
import p.eo5;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import p.co5;
import p.jl1;

public final class vp4 extends pn5 implements Runnable, Disposable	// class@002a3d from classes.dex
{
    public final Scheduler A;
    public Disposable B;
    public Collection C;
    public final AtomicReference D;
    public final zv6 x;
    public final long y;
    public final TimeUnit z;

    public void vp4(ab6 p0,zv6 p1,long p2,TimeUnit p3,Scheduler p4){
       super(p0, new kf6(14));
       this.D = new AtomicReference();
       this.x = p1;
       this.y = p2;
       this.z = p3;
       this.A = p4;
    }
    public void dispose(){
       cd1.a(this.D);
       this.B.dispose();
    }
    public boolean isDisposed(){
       boolean b = (this.D.get() == cd1.a)? true: false;
       return b;
    }
    public final void j(Observer p0,Object p1){
       this.c.onNext(p1);
    }
    public final void onComplete(){
       _monitor_enter(this);
       vp4 tC = this.C;
       this.C = null;
       _monitor_exit(this);
       if (tC != null) {
          this.t.offer(tC);
          this.w = true;
          if (this.k()) {
             eo5.j(this.t, this.c, null, this);
          }
       }
       cd1.a(this.D);
       return;
    }
    public final void onError(Throwable p0){
       _monitor_enter(this);
       this.C = null;
       _monitor_exit(this);
       this.c.onError(p0);
       cd1.a(this.D);
    }
    public final void onNext(Object p0){
       vp4 tC;
       _monitor_enter(this);
       if ((tC = this.C) == null) {
          _monitor_exit(this);
          return;
       }else {
          tC.add(p0);
          _monitor_exit(this);
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       pn5 tc = this.c;
       if (cd1.g(this.B, p0)) {
          this.B = p0;
          p0 = this.x.get();
          Objects.requireNonNull(p0, "The buffer supplied is null");
          this.C = p0;
          tc.onSubscribe(this);
          vp4 tD = this.D;
          if (!cd1.b(tD.get())) {
             vp4 ty = this.y;
             cd1.d(tD, this.A.e(this, ty, ty, this.z));
          }
       }
       return;
    }
    public final void run(){
       vp4 tC;
       Object obj = this.x.get();
       Objects.requireNonNull(obj, "The bufferSupplier returned a null buffer");
       _monitor_enter(this);
       if ((tC = this.C) != null) {
          this.C = obj;
       }
       _monitor_exit(this);
       if (tC == null) {
          cd1.a(this.D);
          return;
       }else {
          this.l(tC, this);
          return;
       }
    }
}
