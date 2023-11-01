package p.mq4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.yf2;
import p.rn;
import p.lq4;
import p.yh6;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import p.zv6;
import p.co5;
import p.cd1;
import p.on5;
import p.vn5;
import p.gq6;

public final class mq4 extends AtomicInteger implements Observer, Disposable	// class@001ee6 from classes.dex
{
    public boolean A;
    public boolean B;
    public int C;
    public final Observer a;
    public final yf2 b;
    public final int c;
    public final rn t;
    public final lq4 v;
    public final boolean w;
    public yh6 x;
    public Disposable y;
    public boolean z;

    public void mq4(Observer p0,yf2 p1,int p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.w = p3;
       this.t = new rn();
       this.v = new lq4(p0, this, 0);
    }
    public final void a(){
       Object obj;
       if (this.getAndIncrement()) {
          return;
       }
       mq4 ta = this.a;
       mq4 tx = this.x;
       mq4 tt = this.t;
       while (true) {
          if (this.z == null) {
             if (this.B != null) {
                tx.clear();
                return;
             }else {
                boolean b = true;
                if (this.w == null && tt.get() != null) {
                   tx.clear();
                   this.B = b;
                   tt.d(ta);
                   return;
                }else {
                   mq4 tA = this.A;
                   int i = ((obj = tx.poll()) == null)? 1: 0;
                   if (tA != null && i) {
                      this.B = b;
                      tt.d(ta);
                      return;
                   }else if(!i){
                      Object obj1 = this.b.apply(obj);
                      Objects.requireNonNull(obj1, "The mapper returned a null ObservableSource");
                      if (obj1 instanceof zv6) {
                         if ((obj1 = obj1.get()) != null && this.B == null) {
                            ta.onNext(obj1);
                         }
                      }else {
                         this.z = b;
                         obj1.subscribe(this.v);
                      label_009e :
                         if (!this.decrementAndGet()) {
                            break ;
                         }
                      }
                   }else {
                      goto label_009e ;
                   }
                }
             }
          }else {
             goto label_009e ;
          }
       }
       return;
    }
    public void dispose(){
       this.B = true;
       this.y.dispose();
       this.v.a();
       this.t.b();
    }
    public boolean isDisposed(){
       return this.B;
    }
    public final void onComplete(){
       this.A = true;
       this.a();
    }
    public final void onError(Throwable p0){
       if (this.t.a(p0)) {
          this.A = true;
          this.a();
       }
       return;
    }
    public final void onNext(Object p0){
       if (this.C == null) {
          this.x.offer(p0);
       }
       this.a();
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.y, p0)) {
          this.y = p0;
          if (p0 instanceof on5) {
             int i = p0.b(3);
             boolean b = true;
             if (i == b) {
                this.C = i;
                this.x = p0;
                this.A = b;
                this.a.onSubscribe(this);
                this.a();
                return;
             }else if(i == 2){
                this.C = i;
                this.x = p0;
                this.a.onSubscribe(this);
                return;
             }
          }
          this.x = new gq6(this.c);
          this.a.onSubscribe(this);
       }
       return;
    }
}
