package p.wq4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import p.yf2;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.rn;
import p.lq4;
import java.lang.Throwable;
import java.lang.Object;
import p.yh6;
import p.cd1;
import p.on5;
import p.vn5;
import p.gq6;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import p.zv6;
import p.co5;

public final class wq4 extends AtomicInteger implements Observer, Disposable, Runnable	// class@002b88 from classes.dex
{
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public final Observer a;
    public final yf2 b;
    public final int c;
    public final rn t;
    public final lq4 v;
    public final boolean w;
    public final Scheduler$Worker x;
    public yh6 y;
    public Disposable z;

    public void wq4(Observer p0,yf2 p1,int p2,boolean p3,Scheduler$Worker p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.w = p3;
       this.t = new rn();
       this.v = new lq4(p0, this, 2);
       this.x = p4;
    }
    public final void a(){
       if (this.getAndIncrement()) {
          return;
       }
       this.x.a(this);
       return;
    }
    public void dispose(){
       this.C = true;
       this.z.dispose();
       this.v.a();
       this.x.dispose();
       this.t.b();
    }
    public boolean isDisposed(){
       return this.C;
    }
    public final void onComplete(){
       this.B = true;
       this.a();
    }
    public final void onError(Throwable p0){
       if (this.t.a(p0)) {
          this.B = true;
          this.a();
       }
       return;
    }
    public final void onNext(Object p0){
       if (this.D == null) {
          this.y.offer(p0);
       }
       this.a();
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.z, p0)) {
          this.z = p0;
          if (p0 instanceof on5) {
             int i = p0.b(3);
             boolean b = true;
             if (i == b) {
                this.D = i;
                this.y = p0;
                this.B = b;
                this.a.onSubscribe(this);
                this.a();
                return;
             }else if(i == 2){
                this.D = i;
                this.y = p0;
                this.a.onSubscribe(this);
                return;
             }
          }
          this.y = new gq6(this.c);
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void run(){
       Object obj;
       wq4 ta = this.a;
       wq4 ty = this.y;
       wq4 tt = this.t;
       while (true) {
          if (this.A == null) {
             if (this.C != null) {
                ty.clear();
                return;
             }else {
                boolean b = true;
                if (this.w == null && tt.get() != null) {
                   ty.clear();
                   this.C = b;
                   tt.d(ta);
                   this.x.dispose();
                   return;
                }else {
                   wq4 tB = this.B;
                   int i = ((obj = ty.poll()) == null)? 1: 0;
                   if (tB != null && i) {
                      this.C = b;
                      tt.d(ta);
                      this.x.dispose();
                      return;
                   }else if(!i){
                      Object obj1 = this.b.apply(obj);
                      Objects.requireNonNull(obj1, "The mapper returned a null ObservableSource");
                      if (obj1 instanceof zv6) {
                         if ((obj1 = obj1.get()) != null && this.C == null) {
                            ta.onNext(obj1);
                         }
                      }else {
                         this.A = b;
                         obj1.subscribe(this.v);
                      label_00ab :
                         if (!this.decrementAndGet()) {
                            break ;
                         }
                      }
                   }else {
                      goto label_00ab ;
                   }
                }
             }
          }else {
             goto label_00ab ;
          }
       }
       return;
    }
}
