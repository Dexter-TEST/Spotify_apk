package p.z82;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.a00;
import p.iv6;
import p.b5;
import java.util.concurrent.atomic.AtomicLong;
import p.gq6;
import p.fq6;
import p.mv6;
import p.vv7;
import p.kv6;
import java.util.concurrent.atomic.AtomicInteger;
import p.yh6;
import java.lang.Throwable;
import java.lang.Object;
import p.xh6;
import p.ya4;
import java.lang.String;
import p.co5;

public final class z82 extends a00 implements FlowableSubscriber	// class@002ea7 from classes.dex
{
    public boolean A;
    public final iv6 a;
    public final xh6 b;
    public final boolean c;
    public final b5 t;
    public kv6 v;
    public boolean w;
    public boolean x;
    public Throwable y;
    public final AtomicLong z;

    public void z82(iv6 p0,int p1,boolean p2,boolean p3,b5 p4){
       super();
       this.z = new AtomicLong();
       this.a = p0;
       this.t = p4;
       this.c = p3;
       gq6 ogq6 = (p2)? new gq6(p1): new fq6(p1);
       this.b = ogq6;
       return;
    }
    public final void a(long p0){
       if (this.A == null && mv6.f(p0)) {
          vv7.a(this.z, p0);
          this.e();
       }
       return;
    }
    public final int b(int p0){
       if (!((p0 & 2))) {
          return 0;
       }
       this.A = true;
       return 2;
    }
    public final void cancel(){
       if (this.w == null) {
          this.w = true;
          this.v.cancel();
          if (this.A == null && !this.getAndIncrement()) {
             this.b.clear();
          }
       }
       return;
    }
    public final void clear(){
       this.b.clear();
    }
    public final boolean d(boolean p0,boolean p1,iv6 p2){
       z82 ty;
       if (this.w != null) {
          this.b.clear();
          return true;
       }else if(p0){
          if (this.c != null) {
             if (p1) {
                if ((ty = this.y) != null) {
                   p2.onError(ty);
                }else {
                   p2.onComplete();
                }
                return true;
             }
          }else if((ty = this.y) != null){
             this.b.clear();
             p2.onError(ty);
             return true;
          }else if(p1){
             p2.onComplete();
             return true;
          }
       }
       return false;
    }
    public final void e(){
       Object obj;
       if (!this.getAndIncrement()) {
          z82 tb = this.b;
          z82 ta = this.a;
          int i = 1;
          while (true) {
             if (this.d(this.x, tb.isEmpty(), ta)) {
                return;
             }
             long l = this.z.get();
             int i1 = 0;
             long l1 = i1;
             while (true) {
                if (v10 = l1 - l) {
                   z82 tx = this.x;
                   boolean b = ((obj = tb.poll()) == null)? true: false;
                   if (this.d(tx, b, ta)) {
                      return;
                   }else if(b){
                   label_0042 :
                      if (!v10 && this.d(this.x, tb.isEmpty(), ta)) {
                         return;
                      }else if((l1 - i1) && (l - Long.MAX_VALUE)){
                         long l2 = - l1;
                         this.z.addAndGet(l2);
                      }
                      if (i = - i) {
                      }
                   }else {
                      ta.onNext(obj);
                      l1 = l1 + 1;
                   }
                }else {
                   goto label_0042 ;
                }
             }
          }
       }
       return;
    }
    public final boolean isEmpty(){
       return this.b.isEmpty();
    }
    public final void onComplete(){
       this.x = true;
       if (this.A != null) {
          this.a.onComplete();
       }else {
          this.e();
       }
       return;
    }
    public final void onError(Throwable p0){
       this.y = p0;
       this.x = true;
       if (this.A != null) {
          this.a.onError(p0);
       }else {
          this.e();
       }
       return;
    }
    public final void onNext(Object p0){
       if (!this.b.offer(p0)) {
          this.v.cancel();
          p0 = new ya4("Buffer is full");
          this.t.run();
          this.onError(p0);
          return;
       }else if(this.A != null){
          this.a.onNext(null);
       }else {
          this.e();
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.v, p0)) {
          this.v = p0;
          this.a.onSubscribe(this);
          p0.a(Long.MAX_VALUE);
       }
       return;
    }
    public final Object poll(){
       return this.b.poll();
    }
}
