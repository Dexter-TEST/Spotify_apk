package p.q62;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import p.s93;
import java.util.concurrent.atomic.AtomicInteger;
import p.iv6;
import p.yf2;
import p.ro1;
import p.gq6;
import java.lang.Math;
import p.rn;
import java.util.concurrent.atomic.AtomicLong;
import p.mv6;
import p.vv7;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import p.r93;
import java.lang.Throwable;
import p.yh6;
import p.co5;
import java.lang.Class;
import java.lang.String;
import java.util.Objects;
import p.bn5;

public final class q62 extends AtomicInteger implements FlowableSubscriber, kv6, s93	// class@00233c from classes.dex
{
    public boolean A;
    public boolean B;
    public r93 C;
    public final iv6 a;
    public final yf2 b;
    public final int c;
    public final int t;
    public final ro1 v;
    public final rn w;
    public final AtomicLong x;
    public final gq6 y;
    public kv6 z;

    public void q62(iv6 p0,yf2 p1,int p2,int p3,ro1 p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.y = new gq6(Math.min(p3, p2));
       this.w = new rn();
       this.x = new AtomicLong();
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          vv7.a(this.x, p0);
          this.d();
       }
       return;
    }
    public final void b(){
       r93 or93;
       q62 tC = this.C;
       this.C = null;
       if (tC != null) {
          mv6.b(tC);
       }
       while ((or93 = this.y.poll()) != null) {
          mv6.b(or93);
       }
       return;
    }
    public final void cancel(){
       if (this.A != null) {
          return;
       }
       this.A = true;
       this.z.cancel();
       this.w.b();
       if (!this.getAndIncrement()) {
          do {
             this.b();
          } while (!this.decrementAndGet());
       }
       return;
    }
    public final void d(){
       r93 or93;
       r93 t;
       long l1;
       int i1;
       long l2;
       r93 v1;
       Object obj;
       int i3;
       q62 oq62 = this;
       if (this.getAndIncrement()) {
          return;
       }
       q62 c = oq62.C;
       q62 a = oq62.a;
       q62 v = oq62.v;
       int i = 1;
       while (true) {
          long l = oq62.x.get();
          if (c == null) {
             if (v != ro1.c && oq62.w.get() != null) {
             }else {
                or93 = oq62.y.poll();
                if (oq62.B != null && or93 == null) {
                   oq62.w.e(oq62.a);
                   return;
                }else if(or93 != null){
                   oq62.C = or93;
                label_004d :
                   if (or93 != null && (t = or93.t) != null) {
                      l1 = 0;
                      while (true) {
                         ro1 a1 = ro1.a;
                         i1 = i;
                         l2 = 1;
                         if (v17 = l1 - l) {
                            if (oq62.A != null) {
                               this.b();
                               return;
                            }else if(v == a1 && oq62.w.get() != null){
                               oq62.C = null;
                               mv6.b(or93);
                               this.b();
                               oq62.w.e(oq62.a);
                               return;
                            }else {
                               v1 = or93.v;
                               boolean i2 = ((obj = t.poll()) == null)? 1: 0;
                               if (v1 != null && i2) {
                                  oq62.C = null;
                                  oq62.z.a(l2);
                                  or93 = null;
                                  v1 = 1;
                               label_00bc :
                                  if (!v17) {
                                     if (oq62.A != null) {
                                        this.b();
                                        return;
                                     }else if(v == a1 && oq62.w.get() != null){
                                        oq62.C = null;
                                        or93.getClass();
                                        mv6.b(or93);
                                        this.b();
                                        oq62.w.e(oq62.a);
                                        return;
                                     }else {
                                        i2 = t.isEmpty();
                                        if (or93.v != null && i2) {
                                           oq62.C = null;
                                           oq62.z.a(l2);
                                           or93 = null;
                                           v1 = 1;
                                        }
                                     }
                                  }
                                  l2 = 0;
                               }else if(i2){
                               label_00bb :
                                  i3 = 0;
                                  goto label_00bc ;
                               }else {
                                  a.onNext(obj);
                                  l1 = l1 + l2;
                                  or93.a(l2);
                                  i = i1;
                               }
                            }
                         }else {
                            goto label_00bb ;
                         }
                      }
                      return;
                   }else {
                      i1 = i;
                      i3 = 0;
                      l2 = 0;
                      l1 = 0;
                   }
                   if ((l1 - l2) && (l - Long.MAX_VALUE)) {
                      long l3 = - l1;
                      oq62.x.addAndGet(l3);
                   }
                   if (v1) {
                      v1 = or93;
                      i = i1;
                   }else {
                      i3 = - i1;
                      if (!(i = oq62.addAndGet(i3))) {
                      }else {
                         v1 = or93;
                         continue ;
                      }
                   }
                }else {
                   goto label_004d ;
                }
             }
          }else {
             or93 = c;
             goto label_004d ;
          }
       }
       this.b();
       oq62.w.e(oq62.a);
       return;
    }
    public final void onComplete(){
       this.B = true;
       this.d();
    }
    public final void onError(Throwable p0){
       if (this.w.a(p0)) {
          this.B = true;
          this.d();
       }
       return;
    }
    public final void onNext(Object p0){
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null Publisher");
       r93 or93 = new r93(this, this.t);
       if (this.A != null) {
          return;
       }
       this.y.offer(or93);
       p0.subscribe(or93);
       if (this.A != null) {
          mv6.b(or93);
          if (!this.getAndIncrement()) {
             do {
                this.b();
             } while (!this.decrementAndGet());
          }
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       q62 tc;
       if (mv6.g(this.z, p0)) {
          this.z = p0;
          this.a.onSubscribe(this);
          long l = ((tc = this.c) == Integer.MAX_VALUE)? Long.MAX_VALUE: (long)tc;
          p0.a(l);
       }
       return;
    }
}
