package p.x82;
import p.v82;
import p.iv6;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Object;
import p.yh6;
import p.kv6;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.mv6;
import p.wn5;
import p.vn5;
import p.fq6;

public final class x82 extends v82	// class@002c29 from classes.dex
{
    public final iv6 E;

    public void x82(iv6 p0,Scheduler$Worker p1,boolean p2,int p3){
       super(p1, p2, p3);
       this.E = p0;
    }
    public final void e(){
       Object obj;
       x82 tE = this.E;
       v82 tx = this.x;
       v82 tC = this.C;
       int i = 1;
       do {
          long l = this.v.get();
          while (true) {
             if (v8 = tC - l) {
                v82 tz = this.z;
                boolean b = ((obj = tx.poll()) == null)? true: false;
                if (this.d(tz, b, tE)) {
                   return;
                }else if(b){
                label_0063 :
                   if (!v8 && this.d(this.z, tx.isEmpty(), tE)) {
                      return;
                   }else {
                      int i1 = this.get();
                      if (i == i1) {
                         this.C = tC;
                         i = - i;
                         if (!(i = this.addAndGet(i))) {
                            break ;
                         }else {
                            continue ;
                         }
                      }else {
                         i = i1;
                         continue ;
                      }
                   }
                }else {
                   tE.onNext(obj);
                   tC = tC + 1;
                   if (!(tC - (long)this.t)) {
                      if (l - Long.MAX_VALUE) {
                         long l1 = - tC;
                         l = this.v.addAndGet(l1);
                      }
                      this.w.a(tC);
                      tC = 0;
                   }
                }
             }else {
                goto label_0063 ;
             }
          }
          return;
       } while (!(i = this.addAndGet(i)));
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
       x82 tE = this.E;
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
                }else {
                   tE.onNext(obj);
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
          long l = this.C + 1;
          if (!(l - (long)this.t)) {
             this.C = 0;
             this.w.a(l);
          }else {
             this.C = l;
          }
       }
       return obj;
    }
}
