package p.bv4;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Runnable;
import p.zz;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.yh6;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Object;
import p.cd1;
import p.on5;
import p.vn5;
import p.gq6;
import p.co5;

public final class bv4 extends zz implements Observer, Runnable	// class@001142 from classes.dex
{
    public int A;
    public boolean B;
    public final Observer a;
    public final Scheduler$Worker b;
    public final boolean c;
    public final int t;
    public yh6 v;
    public Disposable w;
    public Throwable x;
    public boolean y;
    public boolean z;

    public void bv4(Observer p0,Scheduler$Worker p1,boolean p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final boolean a(boolean p0,boolean p1,Observer p2){
       if (this.z != null) {
          this.v.clear();
          return true;
       }else if(p0){
          bv4 tx = this.x;
          if (this.c != null) {
             if (p1) {
                this.z = true;
                if (tx != null) {
                   p2.onError(tx);
                }else {
                   p2.onComplete();
                }
                this.b.dispose();
                return true;
             }
          }else if(tx != null){
             this.z = true;
             this.v.clear();
             p2.onError(tx);
             this.b.dispose();
             return true;
          }else if(p1){
             this.z = true;
             p2.onComplete();
             this.b.dispose();
             return true;
          }
       }
       return false;
    }
    public final int b(int p0){
       if (!((p0 & 2))) {
          return 0;
       }
       this.B = true;
       return 2;
    }
    public final void c(){
       if (!this.getAndIncrement()) {
          this.b.a(this);
       }
       return;
    }
    public final void clear(){
       this.v.clear();
    }
    public void dispose(){
       if (this.z == null) {
          this.z = true;
          this.w.dispose();
          this.b.dispose();
          if (this.B == null && !this.getAndIncrement()) {
             this.v.clear();
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.z;
    }
    public final boolean isEmpty(){
       return this.v.isEmpty();
    }
    public final void onComplete(){
       if (this.y != null) {
          return;
       }
       this.y = true;
       this.c();
       return;
    }
    public final void onError(Throwable p0){
       if (this.y != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.x = p0;
          this.y = true;
          this.c();
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.y != null) {
          return;
       }
       if (this.A != 2) {
          this.v.offer(p0);
       }
       this.c();
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.w, p0)) {
          this.w = p0;
          if (p0 instanceof on5) {
             int i = p0.b(7);
             boolean b = true;
             if (i == b) {
                this.A = i;
                this.v = p0;
                this.y = b;
                this.a.onSubscribe(this);
                this.c();
                return;
             }else if(i == 2){
                this.A = i;
                this.v = p0;
                this.a.onSubscribe(this);
                return;
             }
          }
          this.v = new gq6(this.t);
          this.a.onSubscribe(this);
       }
       return;
    }
    public final Object poll(){
       return this.v.poll();
    }
    public final void run(){
       bv4 ty;
       bv4 tx1;
       Object obj;
       boolean b1;
       boolean b = true;
       if (this.B != null) {
          int i = 1;
          while (this.z == null) {
             ty = this.y;
             bv4 tx = this.x;
             if (this.c == null && (ty != null && tx != null)) {
                this.z = b;
                this.a.onError(this.x);
                this.b.dispose();
                break ;
             }else {
                this.a.onNext(null);
                if (ty != null) {
                   this.z = b;
                   if ((tx1 = this.x) != null) {
                      this.a.onError(tx1);
                   }else {
                      this.a.onComplete();
                   }
                   this.b.dispose();
                   break ;
                }
             }
          }
       }else {
          tx1 = this.v;
          ty = this.a;
          int i1 = 1;
          while (!this.a(this.y, tx1.isEmpty(), ty)) {
             while (true) {
                bv4 ty1 = this.y;
                if ((obj = tx1.poll()) == null) {
                   b1 = true;
                label_006c :
                   if (!this.a(ty1, b1, ty)) {
                      if (b1) {
                         if (i1 = - i1) {
                         }
                      }else {
                         ty.onNext(obj);
                      }
                   }
                }else {
                   b1 = false;
                   goto label_006c ;
                }
             }
          }
       }
       return;
    }
}
