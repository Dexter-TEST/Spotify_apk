package p.u72;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicInteger;
import p.iv6;
import p.yf2;
import java.util.concurrent.atomic.AtomicLong;
import p.fn0;
import p.rn;
import java.util.concurrent.atomic.AtomicReference;
import p.mv6;
import p.vv7;
import java.lang.Object;
import p.gq6;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.MaybeSource;
import p.t72;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.co5;
import io.reactivex.rxjava3.core.SingleSource;
import p.w72;
import io.reactivex.rxjava3.core.SingleObserver;

public final class u72 extends AtomicInteger implements FlowableSubscriber, kv6	// class@002857 from classes.dex
{
    public final AtomicReference A;
    public kv6 B;
    public boolean C;
    public final int a;
    public final iv6 b;
    public final boolean c;
    public final int t;
    public final AtomicLong v;
    public final fn0 w;
    public final AtomicInteger x;
    public final rn y;
    public final yf2 z;

    public void u72(iv6 p0,yf2 p1,boolean p2,int p3,int p4){
       this.a = p4;
       if (p4 != 1) {
          super();
          this.b = p0;
          this.z = p1;
          this.c = p2;
          this.t = p3;
          this.v = new AtomicLong();
          this.w = new fn0();
          this.y = new rn();
          this.x = new AtomicInteger(1);
          this.A = new AtomicReference();
          return;
       }else {
          super();
          this.b = p0;
          this.z = p1;
          this.c = p2;
          this.t = p3;
          this.v = new AtomicLong();
          this.w = new fn0();
          this.y = new rn();
          this.x = new AtomicInteger(1);
          this.A = new AtomicReference();
          return;
       }
    }
    public final void a(long p0){
       u72 tv = this.v;
       switch (this.a){
           case 0:
             if (mv6.f(p0)) {
                vv7.a(tv, p0);
                this.d();
             }
             break;
           default:
             if (mv6.f(p0)) {
                vv7.a(tv, p0);
                this.d();
             }
             return;
       }
       return;
    }
    public final void b(){
       gq6 ogq6;
       u72 tA = this.A;
       switch (this.a){
           case 0:
             if ((ogq6 = tA.get()) != null) {
                ogq6.clear();
             }
             break;
           default:
             if ((ogq6 = tA.get()) != null) {
                ogq6.clear();
             }
             return;
       }
       return;
    }
    public final void cancel(){
       switch (this.a){
           case 0:
           default:
             this.C = true;
             this.B.cancel();
             this.w.dispose();
             this.y.b();
             return;
       }
       this.C = true;
       this.B.cancel();
       this.w.dispose();
       this.y.b();
       return;
    }
    public final void d(){
       switch (this.a){
           case 0:
             if (!this.getAndIncrement()) {
                this.e();
             }
             break;
           default:
             if (!this.getAndIncrement()) {
                this.e();
             }
             return;
       }
       return;
    }
    public final void e(){
       u72 b;
       int i2;
       gq6 ogq6;
       Object obj;
       int i3;
       int i4;
       gq6 ogq62;
       gq6 ogq63;
       u72 ou72 = this;
       int i = Integer.MAX_VALUE;
       switch (ou72.a){
           case 0:
             b = ou72.b;
             u72 x = ou72.x;
             u72 a = ou72.A;
             int i1 = 1;
             do {
                long l = ou72.v.get();
                long l1 = 0;
                while (true) {
                   if (v16 = l1 - l) {
                      if (ou72.C != null) {
                         this.b();
                         break ;
                      }else if(ou72.c == null && ou72.y.get() != null){
                         this.b();
                         ou72.y.e(b);
                         break ;
                      }else if(!x.get()){
                         i2 = 1;
                      }else {
                         i2 = 0;
                      }
                      obj = ((ogq6 = a.get()) != null)? ogq6.poll(): null;
                      i3 = (obj == null)? 1: 0;
                      if (i2 && i3) {
                         ou72.y.e(b);
                         break ;
                      }else if(i3){
                      label_0076 :
                         if (!v16) {
                            if (ou72.C != null) {
                               this.b();
                               break ;
                            }else if(ou72.c == null && ou72.y.get() != null){
                               this.b();
                               ou72.y.e(b);
                               break ;
                            }else if(!x.get()){
                               i2 = 1;
                            }else {
                               i2 = 0;
                            }
                            gq6 ogq61 = ((ogq61 = a.get()) != null && !ogq61.isEmpty())? 0: 1;
                            if (i2 && ogq61) {
                               ou72.y.e(b);
                               break ;
                            }
                         }
                         if (l1) {
                            vv7.H(ou72.v, l1);
                            if (ou72.t != i) {
                               ou72.B.a(l1);
                            }
                         }
                         i4 = - i1;
                         if (ou72.addAndGet(i4)) {
                            continue ;
                         }
                      }else {
                         b.onNext(obj);
                         l1 = l1 + 1;
                      }
                   }else {
                      goto label_0076 ;
                   }
                }
             } while (!ou72.addAndGet(i4));
             break;
           default:
             b = ou72.b;
             u72 x1 = ou72.x;
             u72 a1 = ou72.A;
             i2 = 1;
             while (true) {
                long l2 = ou72.v.get();
                long l3 = 0;
                break ;
             }
             while (true) {
                if (v14 = l3 - l2) {
                   if (ou72.C != null) {
                      this.b();
                      break ;
                   }else if(ou72.c == null && ou72.y.get() != null){
                      this.b();
                      ou72.y.e(ou72.b);
                      break ;
                   }else if(!x1.get()){
                      obj = 1;
                   }else {
                      obj = 0;
                   }
                   Object obj1 = ((ogq62 = a1.get()) != null)? ogq62.poll(): null;
                   i3 = (obj1 == null)? 1: 0;
                   if (obj && i3) {
                      ou72.y.e(b);
                      break ;
                   }else if(i3){
                   label_0141 :
                      if (!v14) {
                         if (ou72.C != null) {
                            this.b();
                            break ;
                         }else if(ou72.c == null && ou72.y.get() != null){
                            this.b();
                            ou72.y.e(b);
                            break ;
                         }else if(!x1.get()){
                            obj1 = 1;
                         }else {
                            obj1 = 0;
                         }
                         ogq63 = ((ogq63 = a1.get()) != null && !ogq63.isEmpty())? 0: 1;
                         if (obj1 && ogq63) {
                            ou72.y.e(b);
                            break ;
                         }
                      }
                      if (l3) {
                         vv7.H(ou72.v, l3);
                         if (ou72.t != Integer.MAX_VALUE) {
                            ou72.B.a(l3);
                         }
                      }else {
                         ogq63 = Integer.MAX_VALUE;
                      }
                      if (!(i2 = - i2)) {
                         break ;
                      }else {
                         obj1 = Integer.MAX_VALUE;
                      }
                   }else {
                      b.onNext(obj1);
                      l3 = l3 + 1;
                      obj1 = Integer.MAX_VALUE;
                   }
                }else {
                   goto label_0141 ;
                }
             }
             return;
       }
       return;
    }
    public final gq6 f(){
       gq6 ogq6;
       u72 tA = this.A;
       int i = 1;
       switch (this.a){
           case 0:
             if ((ogq6 = tA.get()) == null) {
                ogq6 = new gq6(Flowable.a);
                while (!tA.compareAndSet(null, ogq6)) {
                   if (tA.get() != null) {
                      i = 0;
                      break ;
                   }
                }
                if (!i) {
                   ogq6 = tA.get();
                }
             }
             break;
           default:
             if ((ogq6 = tA.get()) == null) {
                ogq6 = new gq6(Flowable.a);
                while (!tA.compareAndSet(null, ogq6)) {
                   if (tA.get() != null) {
                      i = 0;
                      break ;
                   }
                }
                if (!i) {
                   ogq6 = tA.get();
                }
             }
             return ogq6;
       }
       return ogq6;
    }
    public final void onComplete(){
       u72 tx = this.x;
       switch (this.a){
           case 0:
           default:
             tx.decrementAndGet();
             this.d();
             return;
       }
       tx.decrementAndGet();
       this.d();
       return;
    }
    public final void onError(Throwable p0){
       u72 tx = this.x;
       u72 tw = this.w;
       u72 tc = this.c;
       u72 ty = this.y;
       switch (this.a){
           case 0:
             tx.decrementAndGet();
             if (ty.a(p0)) {
                if (tc == null) {
                   tw.dispose();
                }
                this.d();
             }
             break;
           default:
             tx.decrementAndGet();
             if (ty.a(p0)) {
                if (tc == null) {
                   tw.dispose();
                }
                this.d();
             }
             return;
       }
       return;
    }
    public final void onNext(Object p0){
       switch (this.a){
           case 0:
             p0 = this.z.apply(p0);
             Objects.requireNonNull(p0, "The mapper returned a null MaybeSource");
             this.x.getAndIncrement();
             t72 ot72 = new t72(this);
             if (this.C == null && this.w.c(ot72)) {
                p0.subscribe(ot72);
             }
             break;
           default:
             p0 = this.z.apply(p0);
             Objects.requireNonNull(p0, "The mapper returned a null SingleSource");
             this.x.getAndIncrement();
             w72 ow72 = new w72(this);
             if (this.C == null && this.w.c(ow72)) {
                p0.subscribe(ow72);
             }
             return;
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       u72 tt = this.t;
       u72 tb = this.b;
       switch (this.a){
           case 0:
             if (mv6.g(this.B, p0)) {
                this.B = p0;
                tb.onSubscribe(this);
                if (tt == Integer.MAX_VALUE) {
                   p0.a(Long.MAX_VALUE);
                }else {
                   p0.a((long)tt);
                }
             }
             break;
           default:
             if (mv6.g(this.B, p0)) {
                this.B = p0;
                tb.onSubscribe(this);
                if (tt == Integer.MAX_VALUE) {
                   p0.a(Long.MAX_VALUE);
                }else {
                   p0.a((long)tt);
                }
             }
             return;
       }
       return;
    }
}
