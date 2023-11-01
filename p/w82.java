package p.w82;
import p.v82;
import p.zn0;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Object;
import p.yh6;
import p.iv6;
import p.kv6;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.mv6;
import p.wn5;
import p.vn5;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.fq6;

public final class w82 extends v82	// class@002ae6 from classes.dex
{
    public final zn0 E;
    public long F;

    public void w82(zn0 p0,Scheduler$Worker p1,boolean p2,int p3){
       super(p1, p2, p3);
       this.E = p0;
    }
    public final void e(){
       Object obj;
       w82 tE = this.E;
       v82 tx = this.x;
       v82 tC = this.C;
       w82 tF = this.F;
       int i = 1;
       do {
          long l = this.v.get();
          while (true) {
             if (v10 = tC - l) {
                v82 tz = this.z;
                boolean b = ((obj = tx.poll()) == null)? true: false;
                if (this.d(tz, b, tE)) {
                   return;
                }else if(b){
                label_0059 :
                   if (!v10 && this.d(this.z, tx.isEmpty(), tE)) {
                      return;
                   }else {
                      this.C = tC;
                      this.F = tF;
                      if (!(i = - i)) {
                         break ;
                      }else {
                         continue ;
                      }
                   }
                }else {
                   long l1 = 1;
                   if (tE.c(obj)) {
                      tC = tC + l1;
                   }
                   tF = tF + l1;
                   if (!(tF - (long)this.t)) {
                      this.w.a(tF);
                      tF = 0;
                   }
                }
             }else {
                goto label_0059 ;
             }
          }
          return;
       } while (!(i = - i));
    }
    public final void f(){
       v82 tA;
       boolean b = true;
       int i = 1;
       while (true) {
          if (this.y != null) {
             return;
          }
          this.E.onNext(null);
          if (this.z != null) {
             this.y = b;
             if ((tA = this.A) != null) {
                this.E.onError(tA);
                break ;
             }else {
                this.E.onComplete();
                break ;
             }
          }else if(!(i = - i)){
             return;
          }
       }
       this.a.dispose();
       return;
    }
    public final void g(){
       w82 tE = this.E;
       v82 tx = this.x;
       v82 tC = this.C;
       int i = 1;
       do {
          long l = this.v.get();
          while (true) {
             if (tC - l) {
                Object obj = tx.poll();
                if (this.y != null) {
                   break ;
                }else if(obj == null){
                   this.y = true;
                   tE.onComplete();
                   this.a.dispose();
                   return;
                }else if(tE.c(obj)){
                   tC = tC + 1;
                }
             }else if(this.y != null){
                return;
             }else if(tx.isEmpty()){
                this.y = true;
                tE.onComplete();
                this.a.dispose();
                return;
             }else {
                this.C = tC;
                if (!(i = - i)) {
                   return;
                }
                continue ;
             }
          }
          return;
       } while (!(i = - i));
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.w, p0)) {
          this.w = p0;
          if (p0 instanceof wn5) {
             vn5 ovn5 = p0;
             int i = ovn5.b(7);
             int i1 = 1;
             if (i == i1) {
                this.B = i1;
                this.x = ovn5;
                this.z = i1;
                this.E.onSubscribe(this);
                return;
             }else if(i == 2){
                this.B = 2;
                this.x = ovn5;
                this.E.onSubscribe(this);
                p0.a((long)this.c);
                return;
             }
          }
          this.x = new fq6(this.c);
          this.E.onSubscribe(this);
          p0.a((long)this.c);
       }
       return;
    }
    public final Object poll(){
       Object obj;
       if ((obj = this.x.poll()) != null && this.B != 1) {
          long l = this.F + 1;
          if (!(l - (long)this.t)) {
             this.F = 0;
             this.w.a(l);
          }else {
             this.F = l;
          }
       }
       return obj;
    }
}
