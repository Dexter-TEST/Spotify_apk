package p.cc7;
import p.g92;
import p.gq6;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import p.bc7;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import p.iv6;
import java.lang.Throwable;
import java.lang.Runnable;
import java.lang.String;
import p.iw1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.kv6;
import java.lang.IllegalStateException;
import p.rl1;

public final class cc7 extends g92	// class@0011e0 from classes.dex
{
    public final bc7 A;
    public final AtomicLong B;
    public boolean C;
    public final gq6 b;
    public final AtomicReference c;
    public final boolean t;
    public boolean v;
    public Throwable w;
    public final AtomicReference x;
    public boolean y;
    public final AtomicBoolean z;

    public void cc7(){
       super();
       this.b = new gq6(8);
       this.c = new AtomicReference(null);
       this.t = true;
       this.x = new AtomicReference();
       this.z = new AtomicBoolean();
       this.A = new bc7(this);
       this.B = new AtomicLong();
    }
    public final void A(){
       int i2;
       Object obj;
       cc7 v;
       int i3;
       long l1;
       cc7 uocc7 = this;
       if (uocc7.A.getAndIncrement()) {
          return;
       }
       int i = 1;
       iv6 oiv6 = uocc7.x.get();
       int i1 = 1;
       while (true) {
          if (oiv6 != null) {
             if (uocc7.C != null) {
                cc7 b = uocc7.b;
                i2 = uocc7.t ^ i;
                do {
                   obj = null;
                   if (uocc7.y != null) {
                      uocc7.x.lazySet(obj);
                      break ;
                   }else {
                      v = uocc7.v;
                      if (i2 && (v != null && uocc7.w != null)) {
                         b.clear();
                         uocc7.x.lazySet(obj);
                         oiv6.onError(uocc7.w);
                         break ;
                      }else {
                         oiv6.onNext(obj);
                         if (v != null) {
                            uocc7.x.lazySet(obj);
                            if ((b = uocc7.w) != null) {
                               oiv6.onError(b);
                               break ;
                            }else {
                               oiv6.onComplete();
                               break ;
                            }
                         }
                      }
                   }
                   i3 = - i;
                } while (!uocc7.A.addAndGet(i3));
             }else {
                cc7 b1 = uocc7.b;
                int i4 = uocc7.t ^ 0x01;
                int i5 = 1;
                while (true) {
                   long l = uocc7.B.get();
                   int i6 = 0;
                   break ;
                }
                while (true) {
                   if (v16 = l - i6) {
                      v = uocc7.v;
                      int i7 = ((obj = b1.poll()) == null)? 1: 0;
                      Object obj1 = obj;
                      l1 = i6;
                      if (!this.z(i4, v, i7, oiv6, b1)) {
                         if (i7) {
                         label_00a7 :
                            if (v16 || !this.z(i4, uocc7.v, b1.isEmpty(), oiv6, b1)) {
                               if ((l1) && (l - Long.MAX_VALUE)) {
                                  long l2 = - l1;
                                  uocc7.B.addAndGet(l2);
                               }
                               i2 = - i5;
                               if (uocc7.A.addAndGet(i2)) {
                                  obj1 = 1;
                               }
                            }
                         }else {
                            oiv6.onNext(obj1);
                            i6 = l1 + 1;
                            obj1 = 1;
                         }
                      }
                   }else {
                      l1 = i6;
                      goto label_00a7 ;
                   }
                }
             }
             break ;
          }else if(!(i1 = - i1)){
             return;
          }else {
             oiv6 = uocc7.x.get();
             i = 1;
          }
       }
       return;
    }
    public final void onComplete(){
       Runnable andSet;
       if (this.v == null && this.y == null) {
          this.v = true;
          if ((andSet = this.c.getAndSet(null)) != null) {
             andSet.run();
          }
          this.A();
       }
       return;
    }
    public final void onError(Throwable p0){
       Runnable andSet;
       iw1.c(p0, "onError called with a null Throwable.");
       if (this.v == null && this.y == null) {
          this.w = p0;
          this.v = true;
          if ((andSet = this.c.getAndSet(null)) != null) {
             andSet.run();
          }
          this.A();
          return;
       }else {
          RxJavaPlugins.c(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       iw1.c(p0, "onNext called with a null value.");
       if (this.v == null && this.y == null) {
          this.b.offer(p0);
          this.A();
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (this.v == null && this.y == null) {
          p0.a(Long.MAX_VALUE);
       }else {
          p0.cancel();
       }
       return;
    }
    public final void u(iv6 p0){
       if (!this.z.get() && this.z.compareAndSet(false, true)) {
          p0.onSubscribe(this.A);
          this.x.set(p0);
          if (this.y != null) {
             this.x.lazySet(null);
          }else {
             this.A();
          }
       }else {
          p0.onSubscribe(rl1.a);
          p0.onError(new IllegalStateException("This processor allows only a single Subscriber"));
       }
       return;
    }
    public final boolean z(boolean p0,boolean p1,boolean p2,iv6 p3,gq6 p4){
       if (this.y != null) {
          p4.clear();
          this.x.lazySet(null);
          return true;
       }else if(p1){
          if (p0 && this.w != null) {
             p4.clear();
             this.x.lazySet(null);
             p3.onError(this.w);
             return true;
          }else if(p2){
             cc7 tw = this.w;
             this.x.lazySet(null);
             if (tw != null) {
                p3.onError(tw);
             }else {
                p3.onComplete();
             }
             return true;
          }
       }
       return false;
    }
}
