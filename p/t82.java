package p.t82;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicInteger;
import p.iv6;
import java.util.concurrent.atomic.AtomicReference;
import p.s82;
import p.rn;
import java.util.concurrent.atomic.AtomicLong;
import p.mv6;
import p.vv7;
import java.lang.Object;
import java.lang.Throwable;
import p.cd1;
import p.xe7;

public final class t82 extends AtomicInteger implements FlowableSubscriber, kv6	// class@00271c from classes.dex
{
    public final int a;
    public final iv6 b;
    public boolean c;
    public boolean t;
    public final AtomicLong v;
    public final AtomicReference w;
    public Object x;
    public Serializable y;

    public void t82(iv6 p0,int p1){
       this.a = p1;
       if (p1 != 1) {
          super();
          this.b = p0;
          this.w = new AtomicReference();
          this.x = new s82(this, 0);
          this.y = new rn();
          this.v = new AtomicLong();
          return;
       }else {
          super();
          this.v = new AtomicLong();
          this.w = new AtomicReference();
          this.b = p0;
          return;
       }
    }
    public final void a(long p0){
       t82 tv = this.v;
       switch (this.a){
           case 0:
           default:
             if (mv6.f(p0)) {
                vv7.a(tv, p0);
                this.d();
             }
             return;
       }
       mv6.c(this.w, tv, p0);
       return;
    }
    public final boolean b(boolean p0,boolean p1,iv6 p2,AtomicReference p3){
       t82 ty;
       if (this.t != null) {
          p3.lazySet(null);
       }else if(p0){
          if ((ty = this.y) != null) {
             p3.lazySet(null);
             p2.onError(ty);
          }else if(p1){
             p2.onComplete();
          }
       }
       ty = false;
    label_0020 :
       return p0;
       p0 = true;
       goto label_0020 ;
    }
    public final void cancel(){
       switch (this.a){
           case 0:
           default:
             if (this.t == null) {
                this.t = true;
                this.x.cancel();
                if (!this.getAndIncrement()) {
                   this.w.lazySet(null);
                }
             }
             return;
       }
       mv6.b(this.w);
       cd1.a(this.x);
       this.y.b();
       return;
    }
    public final void d(){
       Object andSet;
       if (this.getAndIncrement()) {
       }else {
          t82 tb = this.b;
          t82 tv = this.v;
          t82 tw = this.w;
          int i = 1;
          do {
             long l = 0;
             while (true) {
                boolean b = false;
                if (l - tv.get()) {
                   t82 tc = this.c;
                   boolean b1 = ((andSet = tw.getAndSet(null)) == null)? true: false;
                   if (!this.b(tc, b1, tb, tw)) {
                      if (b1) {
                      label_0038 :
                         if (!(l - tv.get())) {
                            tc = this.c;
                            if (tw.get() == null) {
                               b = true;
                            }
                            if (!this.b(tc, b, tb, tw)) {
                            label_0050 :
                               if (l) {
                                  vv7.H(tv, l);
                               }
                               if (i = - i) {
                                  continue ;
                               }
                            }
                         }else {
                            goto label_0050 ;
                         }
                      }else {
                         tb.onNext(andSet);
                         l = l + 1;
                      }
                   }
                }else {
                   goto label_0038 ;
                }
             }
          } while (!(i = - i));
       }
       return;
    }
    public final void onComplete(){
       boolean b = true;
       switch (this.a){
           case 0:
             break;
           default:
             this.c = b;
             this.d();
             return;
       }
       this.c = b;
       if (this.t != null) {
          t82 tb = this.b;
          t82 ty = this.y;
          if (!this.getAndIncrement()) {
             ty.e(tb);
          }
       }
       return;
    }
    public final void onError(Throwable p0){
       switch (this.a){
           case 0:
           default:
             this.y = p0;
             this.c = true;
             this.d();
             return;
       }
       cd1.a(this.x);
       xe7.M(this.b, p0, this, this.y);
       return;
    }
    public final void onNext(Object p0){
       switch (this.a){
           case 0:
           default:
             this.w.lazySet(p0);
             this.d();
             return;
       }
       xe7.O(this.b, p0, this, this.y);
       return;
    }
    public final void onSubscribe(kv6 p0){
       switch (this.a){
           case 0:
           default:
             if (mv6.g(this.x, p0)) {
                this.x = p0;
                this.b.onSubscribe(this);
                p0.a(Long.MAX_VALUE);
             }
             return;
       }
       mv6.d(this.w, this.v, p0);
       return;
    }
}
