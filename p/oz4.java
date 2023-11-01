package p.oz4;
import java.lang.Runnable;
import p.lz4;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler;
import p.ra6;
import p.p50;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p.ec7;
import p.f37;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import p.kf6;
import java.lang.Throwable;

public final class oz4 extends lz4 implements Runnable	// class@0021be from classes.dex
{
    public final Scheduler D;
    public ec7 E;
    public final ra6 F;
    public final p50 G;
    public static final Object H;

    static {
       oz4.H = new Object();
    }
    public void oz4(Observer p0,long p1,TimeUnit p2,Scheduler p3,int p4){
       super(p0, p1, p2, p4);
       this.D = p3;
       this.F = new ra6();
       this.G = new p50(4, this);
    }
    public final void a(){
       this.F.dispose();
    }
    public final void b(){
       if (!this.A.get()) {
          this.C.getAndIncrement();
          ec7 uoec7 = ec7.a(this.v, this.G);
          this.E = uoec7;
          this.w = 1;
          f37 uof37 = new f37(uoec7);
          this.a.onNext(uof37);
          lz4 tc = this.c;
          oz4 tF = this.F;
          tF.getClass();
          cd1.c(tF, this.D.e(this, tc, tc, this.t));
          if (uof37.a()) {
             this.E.onComplete();
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
       oz4 tE = this.E;
       int i = 1;
       do {
          if (this.B != null) {
             tb.clear();
             this.E = null;
             tE = null;
          }else {
             lz4 tx = this.x;
             int i1 = ((obj = tb.poll()) == null)? 1: 0;
             if (tx != null && i1) {
                if ((tx = this.y) != null) {
                   if (tE != null) {
                      tE.onError(tx);
                   }
                   ta.onError(tx);
                }else if(tE != null){
                   tE.onComplete();
                }
                ta.onComplete();
                this.a();
                this.B = true;
             }else if(!i1){
                if (obj == oz4.H) {
                   if (tE != null) {
                      tE.onComplete();
                      this.E = null;
                      tE = null;
                   }
                   if (this.A.get()) {
                      this.F.dispose();
                   }else {
                      long l = this.w + 1;
                      this.w = l;
                      this.C.getAndIncrement();
                      tE = ec7.a(this.v, this.G);
                      this.E = tE;
                      f37 l1 = new f37(tE);
                      ta.onNext(l1);
                      if (l1.a()) {
                         tE.onComplete();
                      }
                   }
                }else if(tE != null){
                   tE.onNext(obj);
                }
             }
          }
       } while (!(i = - i));
       return;
    }
    public final void run(){
       this.b.offer(oz4.H);
       this.c();
    }
}
