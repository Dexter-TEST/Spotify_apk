package p.pz4;
import java.lang.Runnable;
import p.lz4;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import java.util.LinkedList;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p.ec7;
import p.f37;
import p.e52;
import p.kf6;
import java.util.Iterator;
import java.util.List;
import java.lang.Throwable;

public final class pz4 extends lz4 implements Runnable	// class@0022ff from classes.dex
{
    public final long D;
    public final Scheduler$Worker E;
    public final LinkedList F;
    public static final Object G;
    public static final Object H;

    static {
       pz4.G = new Object();
       pz4.H = new Object();
    }
    public void pz4(Observer p0,long p1,long p2,TimeUnit p3,Scheduler$Worker p4,int p5){
       super(p0, p1, p3, p5);
       this.D = p2;
       this.E = p4;
       this.F = new LinkedList();
    }
    public final void a(){
       this.E.dispose();
    }
    public final void b(){
       lz4 olz4 = this;
       if (!olz4.A.get()) {
          olz4.w = 1;
          olz4.C.getAndIncrement();
          ec7 uoec7 = ec7.a(olz4.v, olz4);
          pz4 f = olz4.F;
          f.add(uoec7);
          f37 uof37 = new f37(uoec7);
          olz4.a.onNext(uof37);
          olz4.E.b(new e52(1, olz4, false), olz4.c, olz4.t);
          pz4 d = olz4.D;
          olz4.E.c(new e52(1, olz4, 1), d, d, olz4.t);
          if (uof37.a()) {
             uoec7.onComplete();
             f.remove(uoec7);
          }
       }
       return;
    }
    public final void c(){
       Iterator iterator;
       if (this.getAndIncrement()) {
          return;
       }
       lz4 tb = this.b;
       lz4 ta = this.a;
       pz4 tF = this.F;
       int i = 1;
       do {
          if (this.B != null) {
             tb.clear();
             tF.clear();
          }else {
             lz4 tx = this.x;
             Iterator obj = tb.poll();
             boolean b = false;
             int i1 = (obj == null)? 1: 0;
             if (tx != null && i1) {
                if ((tx = this.y) != null) {
                   obj = tF.iterator();
                   while (obj.hasNext()) {
                      obj.next().onError(tx);
                   }
                   ta.onError(tx);
                }else {
                   iterator = tF.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().onComplete();
                   }
                   ta.onComplete();
                }
                this.a();
                this.B = true;
             }else if(!i1){
                if (obj == pz4.G) {
                   if (!this.A.get()) {
                      long l = this.w + 1;
                      this.w = l;
                      this.C.getAndIncrement();
                      ec7 uoec7 = ec7.a(this.v, this);
                      tF.add(uoec7);
                      f37 obj1 = new f37(uoec7);
                      ta.onNext(obj1);
                      this.E.b(new e52(true, this, b), this.c, this.t);
                      if (obj1.a()) {
                         uoec7.onComplete();
                      }
                   }
                }else if(obj == pz4.H){
                   if (!tF.isEmpty()) {
                      tF.remove(b).onComplete();
                   }
                }else {
                   iterator = tF.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().onNext(obj);
                   }
                }
             }
          }
       } while (!(i = - i));
       return;
    }
    public final void run(){
       this.d();
    }
}
