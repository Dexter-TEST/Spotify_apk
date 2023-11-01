package p.na2;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicInteger;
import p.ma2;
import java.util.concurrent.atomic.AtomicReference;
import p.mv6;
import p.yf2;
import p.iv6;
import java.util.concurrent.atomic.AtomicLong;
import p.rn;
import p.vv7;
import java.lang.Object;
import java.lang.Throwable;
import p.yh6;
import p.co5;
import java.lang.Class;
import p.iw1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.util.Objects;
import p.bn5;

public final class na2 extends AtomicInteger implements FlowableSubscriber, kv6	// class@001f9a from classes.dex
{
    public final AtomicLong A;
    public long B;
    public final iv6 a;
    public final yf2 b;
    public final int c;
    public final boolean t;
    public boolean v;
    public final rn w;
    public boolean x;
    public kv6 y;
    public final AtomicReference z;
    public static final ma2 C;

    static {
       ma2 oma2 = new ma2(null, -1, 1);
       na2.C = oma2;
       mv6.b(oma2);
    }
    public void na2(int p0,yf2 p1,iv6 p2,boolean p3){
       super();
       this.z = new AtomicReference();
       this.A = new AtomicLong();
       this.a = p2;
       this.b = p1;
       this.c = p0;
       this.t = p3;
       this.w = new rn();
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          vv7.a(this.A, p0);
          if (!(this.B)) {
             this.y.a(Long.MAX_VALUE);
          }else {
             this.d();
          }
       }
       return;
    }
    public final void b(){
       ma2 andSet;
       ma2 c = na2.C;
       if ((andSet = this.z.getAndSet(c)) != c && andSet != null) {
          mv6.b(andSet);
       }
       return;
    }
    public final void cancel(){
       if (this.x == null) {
          this.x = true;
          this.y.cancel();
          this.b();
          this.w.b();
       }
       return;
    }
    public final void d(){
       na2 z;
       int i2;
       na2 ona2 = this;
       if (this.getAndIncrement()) {
          return;
       }
       na2 a = ona2.a;
       int i = 1;
       while (true) {
          if (ona2.x != null) {
             return;
          }
          if (ona2.v != null) {
             if (ona2.t != null) {
                if (ona2.z.get() == null) {
                   ona2.w.e(a);
                   return;
                }
             }else if(ona2.w.get() != null){
                this.b();
                ona2.w.e(a);
                return;
             }else if(ona2.z.get() == null){
                break ;
             }
          }
          Object obj = ona2.z.get();
          Object obj1 = null;
          ma2 oma2 = (obj != null)? obj.t: obj1;
          if (oma2 != null) {
             long l = ona2.A.get();
             long l1 = 0;
             while (true) {
                if (v15 = l1 - l) {
                   if (ona2.x != null) {
                      return;
                   }else {
                      ma2 v = obj.v;
                      Object obj2 = oma2.poll();
                      int i1 = (obj2 == null)? 1: 0;
                      if (obj == ona2.z.get()) {
                         if (v != null) {
                            if (ona2.t == null) {
                               if (ona2.w.get() != null) {
                                  ona2.w.e(a);
                                  return;
                               }else if(i1){
                                  z = ona2.z;
                                  do {
                                  } while (z.compareAndSet(obj, obj1) || z.get() != obj);
                               }
                            }else if(i1){
                               z = ona2.z;
                               do {
                               } while (z.compareAndSet(obj, obj1) || z.get() != obj);
                            }
                         }
                         if (i1) {
                         label_00db :
                            obj2 = 0;
                         label_00dc :
                            if (!v15 && obj.v != null) {
                               if (ona2.t == null) {
                                  if (ona2.w.get() != null) {
                                     this.b();
                                     ona2.w.e(a);
                                     return;
                                  }else if(oma2.isEmpty()){
                                     z = ona2.z;
                                     do {
                                     } while (z.compareAndSet(obj, obj1) || z.get() != obj);
                                  }
                               }else if(oma2.isEmpty()){
                                  z = ona2.z;
                                  do {
                                  } while (z.compareAndSet(obj, obj1) || z.get() != obj);
                               }
                               i2 = 1;
                            }
                            if ((l1) && ona2.x == null) {
                               if (l - Long.MAX_VALUE) {
                                  long l2 = - l1;
                                  ona2.A.addAndGet(l2);
                               }
                               if (obj.w != 1) {
                                  obj.get().a(l1);
                               }
                            }else {
                               i2 = 1;
                            }
                            if (obj2) {
                               continue ;
                            }
                         }else {
                            a.onNext(obj2);
                            l1 = l1 + 1;
                         }
                      }
                      obj2 = 1;
                      goto label_00dc ;
                   }
                }else {
                   goto label_00db ;
                }
             }
             a.onComplete();
             return;
          }else {
             i2 = 1;
          }
          int i3 = - i;
          if (!ona2.addAndGet(i3)) {
             return;
          }else {
             continue ;
          }
       }
    }
    public final void onComplete(){
       if (this.v != null) {
          return;
       }
       this.v = true;
       this.d();
       return;
    }
    public final void onError(Throwable p0){
       if (this.v == null) {
          na2 tw = this.w;
          tw.getClass();
          if (iw1.a(tw, p0)) {
             if (this.t == null) {
                this.b();
             }
             this.v = true;
             this.d();
          label_0020 :
             return;
          }
       }
       RxJavaPlugins.c(p0);
       goto label_0020 ;
    }
    public final void onNext(Object p0){
       ma2 oma2;
       ma2 oma21;
       if (this.v != null) {
          return;
       }
       long l = this.B + 1;
       this.B = l;
       if ((oma2 = this.z.get()) != null) {
          mv6.b(oma2);
       }
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The publisher returned is null");
       oma2 = new ma2(this, l, this.c);
       while ((oma21 = this.z.get()) != na2.C) {
          na2 tz = this.z;
          while (true) {
             if (tz.compareAndSet(oma21, oma2)) {
                oma21 = 1;
             }else {
                if (tz.get() != oma21) {
                   oma21 = 0;
                }
             }
             if (oma21) {
                p0.subscribe(oma2);
                break ;
             }else {
                continue ;
             }
          }
          return;
       }
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.y, p0)) {
          this.y = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
