package p.rq4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.q93;
import java.util.concurrent.atomic.AtomicInteger;
import p.yf2;
import p.ro1;
import p.rn;
import java.util.ArrayDeque;
import p.p93;
import java.lang.Object;
import p.yh6;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import p.co5;
import p.cd1;
import p.on5;
import p.vn5;
import p.gq6;

public final class rq4 extends AtomicInteger implements Observer, Disposable, q93	// class@00253b from classes.dex
{
    public boolean A;
    public int B;
    public boolean C;
    public p93 D;
    public int E;
    public final Observer a;
    public final yf2 b;
    public final int c;
    public final int t;
    public final ro1 v;
    public final rn w;
    public final ArrayDeque x;
    public yh6 y;
    public Disposable z;

    public void rq4(int p0,int p1,Observer p2,yf2 p3,ro1 p4){
       super();
       this.a = p2;
       this.b = p3;
       this.c = p0;
       this.t = p1;
       this.v = p4;
       this.w = new rn();
       this.x = new ArrayDeque();
    }
    public final void a(){
       rq4 tD;
       p93 op93;
       if ((tD = this.D) != null) {
          tD.dispose();
       }
       while ((op93 = this.x.poll()) != null) {
          op93.dispose();
       }
       return;
    }
    public final void b(){
       Object obj;
       p93 op93;
       p93 op931;
       Object obj1;
       int i3;
       if (this.getAndIncrement()) {
          return;
       }
       rq4 ty = this.y;
       rq4 tx = this.x;
       rq4 ta = this.a;
       rq4 tv = this.v;
       int i = 1;
    label_0011 :
       rq4 tE = this.E;
       while (true) {
          ro1 a = ro1.a;
          if (tE != this.c) {
             if (this.C != null) {
                ty.clear();
                this.a();
                return;
             }else if(tv == a && this.w.get() != null){
                ty.clear();
                this.a();
                this.w.d(this.a);
                return;
             }else if((obj = ty.poll()) == null){
             label_007e :
                this.E = tE;
                if (this.C != null) {
                   ty.clear();
                   this.a();
                   return;
                }else if(tv == a && this.w.get() != null){
                   ty.clear();
                   this.a();
                   this.w.d(this.a);
                   return;
                }else if((tE = this.D) == null){
                   if (tv == ro1.b && this.w.get() != null) {
                      ty.clear();
                      this.a();
                      this.w.d(ta);
                      return;
                   }else {
                      tE = this.A;
                      int i1 = ((op93 = tx.poll()) == null)? 1: 0;
                      if (tE != null && i1) {
                         if (this.w.get() != null) {
                            ty.clear();
                            this.a();
                            this.w.d(ta);
                            break ;
                         }else {
                            ta.onComplete();
                            break ;
                         }
                      }else if(!i1){
                         this.D = op93;
                      }
                      op931 = op93;
                   }
                }
                if (op931 != null) {
                   op93 = op931.c;
                   while (true) {
                      if (this.C != null) {
                         ty.clear();
                         this.a();
                         return;
                      }else {
                         p93 t = op931.t;
                         if (tv == a && this.w.get() != null) {
                            ty.clear();
                            this.a();
                            this.w.d(ta);
                            return;
                         }else {
                            p93 op932 = null;
                            int i2 = ((obj1 = op93.poll()) == null)? 1: 0;
                            if (t != null && i2) {
                               this.D = op932;
                               i3 = this.E - 1;
                               this.E = i3;
                               goto label_0011 ;
                            }else if(i2){
                               ta.onNext(obj1);
                            }
                         }
                      }
                   }
                   return;
                }
                if (!(i = - i)) {
                   return;
                }else {
                   goto label_0011 ;
                }
             }else {
                obj = this.b.apply(obj);
                Objects.requireNonNull(obj, "The mapper returned a null ObservableSource");
                p93 op933 = new p93(this, this.t);
                tx.offer(op933);
                obj.subscribe(op933);
                i3 = tE + 1;
             }
          }else {
             goto label_007e ;
          }
       }
    }
    public void dispose(){
       if (this.C != null) {
          return;
       }
       this.C = true;
       this.z.dispose();
       this.w.b();
       if (!this.getAndIncrement()) {
          do {
             this.y.clear();
             this.a();
          } while (!this.decrementAndGet());
       }
       return;
    }
    public boolean isDisposed(){
       return this.C;
    }
    public final void onComplete(){
       this.A = true;
       this.b();
    }
    public final void onError(Throwable p0){
       if (this.w.a(p0)) {
          this.A = true;
          this.b();
       }
       return;
    }
    public final void onNext(Object p0){
       if (this.B == null) {
          this.y.offer(p0);
       }
       this.b();
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.z, p0)) {
          this.z = p0;
          if (p0 instanceof on5) {
             int i = p0.b(3);
             boolean b = true;
             if (i == b) {
                this.B = i;
                this.y = p0;
                this.A = b;
                this.a.onSubscribe(this);
                this.b();
                return;
             }else if(i == 2){
                this.B = i;
                this.y = p0;
                this.a.onSubscribe(this);
                return;
             }
          }
          this.y = new gq6(this.t);
          this.a.onSubscribe(this);
       }
       return;
    }
}
