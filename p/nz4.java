package p.nz4;
import java.lang.Runnable;
import p.lz4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.ra6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p.ec7;
import p.f37;
import java.lang.Object;
import p.mz4;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.kf6;
import java.lang.Throwable;

public final class nz4 extends lz4 implements Runnable	// class@00207c from classes.dex
{
    public final Scheduler D;
    public final boolean E;
    public final long F;
    public final Scheduler$Worker G;
    public long H;
    public ec7 I;
    public final ra6 J;

    public void nz4(int p0,long p1,long p2,Observer p3,Scheduler p4,TimeUnit p5,boolean p6){
       super(p3, p1, p5, p0);
       this.D = p4;
       this.F = p2;
       this.E = p6;
       this.G = (p6)? p4.b(): null;
       this.J = new ra6();
       return;
    }
    public final void a(){
       nz4 tG;
       this.J.dispose();
       if ((tG = this.G) != null) {
          tG.dispose();
       }
       return;
    }
    public final void b(){
       lz4 tc;
       if (!this.A.get()) {
          this.w = 1;
          this.C.getAndIncrement();
          ec7 uoec7 = ec7.a(this.v, this);
          this.I = uoec7;
          f37 uof37 = new f37(uoec7);
          this.a.onNext(uof37);
          mz4 omz4 = new mz4(this, 1);
          nz4 tJ = this.J;
          if (this.E != null) {
             tc = this.c;
             tJ.getClass();
             cd1.c(tJ, this.G.c(omz4, tc, tc, this.t));
          }else {
             tc = this.c;
             tJ.getClass();
             cd1.c(tJ, this.D.e(omz4, tc, tc, this.t));
          }
          if (uof37.a()) {
             this.I.onComplete();
          }
       }
       return;
    }
    public final void c(){
       Object obj;
       if (this.getAndIncrement()) {
          return;
       }
       lz4 tb = this.b;
       lz4 ta = this.a;
       nz4 tI = this.I;
       int i = 1;
       do {
          if (this.B != null) {
             tb.clear();
             tI = null;
             this.I = tI;
          }else {
             lz4 tx = this.x;
             int i1 = ((obj = tb.poll()) == null)? 1: 0;
             if (tx != null && i1) {
                if ((tx = this.y) != null) {
                   if (tI != null) {
                      tI.onError(tx);
                   }
                   ta.onError(tx);
                }else if(tI != null){
                   tI.onComplete();
                }
                ta.onComplete();
                this.a();
                this.B = true;
             }else if(!i1){
                long l = 0;
                if (obj instanceof mz4) {
                   if ((obj.b - this.w) && this.E != null) {
                      continue ;
                   }else {
                      this.H = l;
                      tI = this.e(tI);
                   }
                }else if(tI != null){
                   tI.onNext(obj);
                   long l1 = this.H + 1;
                   if (!(l1 - this.F)) {
                      this.H = l;
                      tI = this.e(tI);
                   }else {
                      this.H = l1;
                   }
                }
             }
          }
       } while (!(i = - i));
       return;
    }
    public final ec7 e(ec7 p0){
       if (p0 != null) {
          p0.onComplete();
          p0 = null;
       }
       if (this.A.get()) {
          this.a();
       }else {
          long l = this.w + 1;
          this.w = l;
          this.C.getAndIncrement();
          p0 = ec7.a(this.v, this);
          this.I = p0;
          f37 uof37 = new f37(p0);
          this.a.onNext(uof37);
          if (this.E != null) {
             lz4 tc = this.c;
             nz4 tJ = this.J;
             tJ.getClass();
             cd1.d(tJ, this.G.c(new mz4(this, l), tc, tc, this.t));
          }
          if (uof37.a()) {
             p0.onComplete();
          }
       }
       return p0;
    }
    public final void run(){
       this.d();
    }
}
