package p.r72;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicInteger;
import p.q72;
import p.iv6;
import p.yf2;
import p.rn;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Math;
import java.lang.Object;
import p.mv6;
import p.vv7;
import p.yh6;
import p.xh6;
import java.lang.Throwable;
import p.co5;
import p.gq6;
import p.fq6;
import java.lang.System;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.util.Objects;
import p.bn5;
import p.zv6;
import p.ya4;

public final class r72 extends AtomicInteger implements FlowableSubscriber, kv6	// class@00248d from classes.dex
{
    public final AtomicReference A;
    public final AtomicLong B;
    public kv6 C;
    public long D;
    public long E;
    public int F;
    public int G;
    public final int H;
    public final iv6 a;
    public final yf2 b;
    public final boolean c;
    public final int t;
    public final int v;
    public xh6 w;
    public boolean x;
    public final rn y;
    public boolean z;
    public static final q72[] I;
    public static final q72[] J;

    static {
       q72[] oq72Array = new q72[0];
       r72.I = oq72Array;
       q72[] oq72Array1 = new q72[0];
       r72.J = oq72Array1;
    }
    public void r72(iv6 p0,yf2 p1,boolean p2,int p3,int p4){
       super();
       this.y = new rn();
       AtomicReference uAtomicRefer = new AtomicReference();
       this.A = uAtomicRefer;
       this.B = new AtomicLong();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.H = Math.max(1, (p3 >> 1));
       uAtomicRefer.lazySet(r72.I);
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          vv7.a(this.B, p0);
          this.d();
       }
       return;
    }
    public final boolean b(){
       r72 tw;
       if (this.z != null) {
          if ((tw = this.w) != null) {
             tw.clear();
          }
          return true;
       }else if(this.c == null && this.y.get() != null){
          if ((tw = this.w) != null) {
             tw.clear();
          }
          this.y.e(this.a);
          return true;
       }else {
          return false;
       }
    }
    public final void cancel(){
       q72[] andSet;
       r72 tw;
       if (this.z == null) {
          this.z = true;
          this.C.cancel();
          q72[] j = r72.J;
          if ((andSet = this.A.getAndSet(j)) != j) {
             int len = andSet.length;
             for (int i = 0; i < len; i = i + 1) {
                andSet[i].dispose();
             }
             this.y.b();
          }
          if (!this.getAndIncrement() && (tw = this.w) != null) {
             tw.clear();
          }
       }
       return;
    }
    public final void d(){
       if (!this.getAndIncrement()) {
          this.e();
       }
       return;
    }
    public final void e(){
       long l3;
       q72 obj;
       int i4;
       q72 w2;
       q72[] oq72Array1;
       int i6;
       long l4;
       Object obj1;
       long l6;
       r72 or72 = this;
       r72 a = or72.a;
       int i = 1;
       while (true) {
          if (this.b()) {
             return;
          }
          r72 w = or72.w;
          long l = or72.B.get();
          int i1 = (!(l - Long.MAX_VALUE))? 1: 0;
          long l1 = 1;
          int i2 = 0;
          if (w != null) {
             long l2 = i2;
             l3 = l2;
             while (true) {
                if (l - i2) {
                   obj = w.poll();
                   if (this.b()) {
                      return;
                   }else if(obj == null){
                   label_0041 :
                      if (l2 - i2) {
                         if (i1) {
                            l = Long.MAX_VALUE;
                         }else {
                            l = - l2;
                            l = or72.B.addAndGet(l);
                         }
                      }
                   }else {
                      a.onNext(obj);
                      l3 = l3 + l1;
                      l2 = l2 + l1;
                      l = l - l1;
                   }
                }else {
                   goto label_0041 ;
                }
             }
             return;
          }else {
             l3 = i2;
          }
          r72 w1 = or72.w;
          q72[] oq72Array = or72.A.get();
          int len = oq72Array.length;
          if (or72.x != null && (w1 == null && (!w1.isEmpty() || len))) {
             or72.y.e(or72.a);
             return;
          }else {
             int i3 = i;
             if (len) {
                r72 e = or72.E;
                w = or72.F;
                if (len <= w || (oq72Array[w].a - e)) {
                   if (len <= w) {
                      i4 = 0;
                   }
                   int i5 = 0;
                   while (i5 < len && (oq72Array[i4].a - e)) {
                      if ((i4 = i4 + 1) == len) {
                         i4 = 0;
                      }
                      i5 = i5 + 1;
                   }
                   or72.F = i4;
                   or72.E = oq72Array[i4].a;
                }
                e = i4;
                i4 = 0;
                i = 0;
                while (true) {
                   if (i < len) {
                      if (this.b()) {
                         return;
                      }else {
                         object oobject = oq72Array[e];
                         l1 = 0;
                         while (true) {
                            if ((w2 = oobject.w) == null) {
                               oq72Array1 = oq72Array;
                               i6 = len;
                            label_0132 :
                               obj = oobject.w;
                               if (oobject.v != null && (obj == null && !obj.isEmpty())) {
                                  or72.g(oobject);
                                  if (this.b()) {
                                     return;
                                  }else {
                                     l3 = l3 + 1;
                                     i4 = 1;
                                  }
                               }else {
                                  oobject = 1;
                               }
                               if (!(l)) {
                                  len = i4;
                                  l1 = 1;
                               label_016d :
                                  or72.F = e;
                                  or72.E = oq72Array1[e].a;
                                  l4 = l3;
                                  l = 0;
                               }else {
                                  int i7 = e + 1;
                                  len = i6;
                                  if (i7 == len) {
                                     i7 = 0;
                                  }
                                  i = i + 1;
                                  oq72Array = oq72Array1;
                                  i2 = 0;
                               }
                            }else {
                               oq72Array1 = oq72Array;
                               i6 = len;
                               long l5 = i2;
                               while (true) {
                                  if (l - i2) {
                                     if (this.b()) {
                                     }else if((obj1 = w2.poll()) == null){
                                     label_010a :
                                        if (l5 - i2) {
                                           if (!i1) {
                                              l6 = - l5;
                                              l = or72.B.addAndGet(l6);
                                           }else {
                                              l = Long.MAX_VALUE;
                                           }
                                           oobject.a(l5);
                                           l5 = 0;
                                        }else {
                                           int i8 = i2;
                                        }
                                        if ((l - l5) && obj1 != null) {
                                           oq72Array = oq72Array1;
                                           len = i6;
                                           l6 = 0;
                                        }else {
                                           goto label_0132 ;
                                        }
                                     }else {
                                        a.onNext(obj1);
                                        l = l - 1;
                                        l5 = l5 + 1;
                                     }
                                  }else {
                                     goto label_010a ;
                                  }
                               }
                            }
                         }
                      }
                   }else {
                      oq72Array1 = oq72Array;
                      len = i4;
                      goto label_016d ;
                   }
                }
             }else {
                int i9 = i2;
                l4 = l3;
                len = 0;
             }
             if ((l4 - l) && or72.z == null) {
                or72.C.a(l4);
             }
             if (len) {
                i = i3;
             }else {
                i4 = - i3;
                if (!(i = or72.addAndGet(i4))) {
                   return;
                }else {
                   continue ;
                }
             }
          }
       }
    }
    public final xh6 f(){
       r72 tw;
       if ((tw = this.w) == null) {
          tw = (this.t == Integer.MAX_VALUE)? new gq6(this.v): new fq6(this.t);
          this.w = tw;
       }
       return tw;
    }
    public final void g(q72 p0){
       int len;
       q72[] i3;
       while (true) {
          r72 tA = this.A;
          q72[] oq72Array = tA.get();
          if (!(len = oq72Array.length)) {
          }else {
             int i = 0;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   if (oq72Array[i1] == p0) {
                   label_0019 :
                      if (i1 < 0) {
                         return;
                      }
                      int i2 = 1;
                      if (len == i2) {
                         i3 = r72.I;
                      }else {
                         int i4 = len - 1;
                         q72[] oq72Array1 = new q72[i4];
                         System.arraycopy(oq72Array, i, oq72Array1, i, i1);
                         int i5 = i1 + 1;
                         len = len - i1;
                         len = len - i2;
                         System.arraycopy(oq72Array, i5, oq72Array1, i1, len);
                         i3 = oq72Array1;
                      }
                      while (true) {
                         if (tA.compareAndSet(oq72Array, i3)) {
                            i = 1;
                         }else {
                            if (tA.get() == oq72Array) {
                               continue ;
                            }
                         }
                         if (i) {
                         }
                      }
                      return;
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   i1 = -1;
                   goto label_0019 ;
                }
             }
          }
       }
       return;
    }
    public final void onComplete(){
       if (this.x != null) {
          return;
       }
       this.x = true;
       this.d();
       return;
    }
    public final void onError(Throwable p0){
       if (this.x != null) {
          RxJavaPlugins.c(p0);
          return;
       }else if(this.y.a(p0)){
          this.x = true;
          if (this.c == null) {
             q72[] andSet = this.A.getAndSet(r72.J);
             int len = andSet.length;
             for (int i = 0; i < len; i = i + 1) {
                andSet[i].dispose();
             }
          }
          this.d();
       }
       return;
    }
    public final void onNext(Object p0){
       r72 tw;
       int i2;
       r72 tH;
       q72[] oq72Array;
       if (this.x != null) {
          return;
       }
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null Publisher");
       int i = 0;
       if (p0 instanceof zv6) {
          p0 = p0.get();
          int i1 = Integer.MAX_VALUE;
          if (p0 != null) {
             if (!this.get() && this.compareAndSet(i, 1)) {
                long l = this.B.get();
                tw = this.w;
                if ((l) && (tw == null && !tw.isEmpty())) {
                   this.a.onNext(p0);
                   if (l - Long.MAX_VALUE) {
                      this.B.decrementAndGet();
                   }
                   if (this.t != i1 && this.z == null) {
                      i2 = this.G + 1;
                      this.G = i2;
                      tH = this.H;
                      if (i2 == tH) {
                         this.G = i;
                         this.C.a((long)tH);
                      }
                   }
                }else if(tw == null){
                   tw = this.f();
                }
                if (!tw.offer(p0)) {
                   this.onError(new ya4("Scalar queue full?!"));
                }
                if (this.decrementAndGet()) {
                   this.e();
                }
             }else if(!this.f().offer(p0)){
                this.onError(new ya4("Scalar queue full?!"));
             }else if(this.getAndIncrement()){
             }
          }else if(this.t != i1 && this.z == null){
             i2 = this.G + 1;
             this.G = i2;
             tH = this.H;
             if (i2 == tH) {
                this.G = i;
                this.C.a((long)tH);
             }
          }
       }else {
          r72 tD = this.D;
          this.D = 1 + tD;
          q72 oq72 = new q72(this, this.v, tD);
          while (true) {
             tw = this.A;
             if ((oq72Array = tw.get()) == r72.J) {
                oq72.dispose();
             }else {
                int len = oq72Array.length;
                int i3 = len + 1;
                q72[] oq72Array1 = new q72[i3];
                System.arraycopy(oq72Array, i, oq72Array1, i, len);
                oq72Array1[len] = oq72;
                while (true) {
                   if (tw.compareAndSet(oq72Array, oq72Array1)) {
                      tw = 1;
                   }else {
                      if (tw.get() != oq72Array) {
                         tw = 0;
                      }
                   }
                   if (tw) {
                      i = 1;
                   }else {
                      continue ;
                   }
                }
             }
          }
          if (i) {
             p0.subscribe(oq72);
          }
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       r72 tt;
       if (mv6.g(this.C, p0)) {
          this.C = p0;
          this.a.onSubscribe(this);
          if (this.z == null) {
             if ((tt = this.t) == Integer.MAX_VALUE) {
                p0.a(Long.MAX_VALUE);
             }else {
                p0.a((long)tt);
             }
          }
       }
       return;
    }
}
