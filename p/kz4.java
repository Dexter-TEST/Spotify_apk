package p.kz4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.ObservableSource;
import p.yf2;
import p.kf6;
import p.fn0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import p.rn;
import p.xv4;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import p.jz4;
import java.lang.String;
import java.util.Objects;
import p.ec7;
import p.iz4;
import java.lang.Throwable;
import p.co5;
import java.lang.Class;
import p.cd1;
import java.util.Iterator;
import p.iw1;

public final class kz4 extends AtomicInteger implements Observer, Disposable, Runnable	// class@001cb1 from classes.dex
{
    public final AtomicBoolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final rn E;
    public Disposable F;
    public final Observer a;
    public final ObservableSource b;
    public final yf2 c;
    public final int t;
    public final fn0 v;
    public final xv4 w;
    public final ArrayList x;
    public final kf6 y;
    public final AtomicLong z;

    public void kz4(Observer p0,ObservableSource p1,yf2 p2,int p3){
       super();
       this.a = p0;
       this.y = new kf6(14);
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = new fn0();
       this.x = new ArrayList();
       this.z = new AtomicLong(1);
       this.A = new AtomicBoolean();
       this.E = new rn();
       this.w = new xv4(this);
       AtomicLong uAtomicLong = new AtomicLong();
    }
    public final void a(){
       iz4 obj1;
       if (this.getAndIncrement()) {
          return;
       }
       kz4 ta = this.a;
       kz4 ty = this.y;
       kz4 tx = this.x;
       int i = 1;
       do {
          if (this.B != null) {
             ty.clear();
             tx.clear();
          }else {
             kz4 tC = this.C;
             ec7 obj = ty.poll();
             boolean b = false;
             int i1 = (obj == null)? 1: 0;
             if (tC != null && (i1 && this.E.get() == null)) {
                this.b(ta);
                this.B = true;
             }else if(!i1){
                if (obj instanceof jz4) {
                   if (!this.A.get()) {
                      obj1 = this.c.apply(obj.a);
                      Objects.requireNonNull(obj1, "The closingIndicator returned a null ObservableSource");
                      this.z.getAndIncrement();
                      obj = ec7.a(this.t, this);
                      iz4 oiz4 = new iz4(this, obj);
                      ta.onNext(oiz4);
                      iz4 t = oiz4.t;
                      if (!t.get() && t.compareAndSet(b, true)) {
                         b = true;
                      }
                      if (b) {
                         obj.onComplete();
                      }else {
                         tx.add(obj);
                         this.v.c(oiz4);
                         obj1.subscribe(oiz4);
                      }
                   }
                }else if(obj instanceof iz4){
                   obj1 = obj.b;
                   tx.remove(obj1);
                   this.v.b(obj);
                   obj1.onComplete();
                }else {
                   Iterator iterator = tx.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().onNext(obj);
                   }
                }
             }else if(this.D != null && !tx.size()){
                this.F.dispose();
                tC = this.w;
                tC.getClass();
                cd1.a(tC);
                this.v.dispose();
                this.b(ta);
                this.B = true;
             }
          }
       } while (!(i = - i));
       return;
    }
    public final void b(Observer p0){
       kz4 tE = this.E;
       tE.getClass();
       Throwable throwable = iw1.d(tE);
       kz4 tx = this.x;
       if (throwable == null) {
          Iterator iterator = tx.iterator();
          while (iterator.hasNext()) {
             iterator.next().onComplete();
          }
          p0.onComplete();
       }else if(throwable != iw1.a){
          Iterator iterator1 = tx.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().onError(throwable);
          }
          p0.onError(throwable);
       }
       return;
    }
    public void dispose(){
       kz4 tw;
       if (this.A.compareAndSet(false, true)) {
          if (!(this.z.decrementAndGet())) {
             this.F.dispose();
             tw = this.w;
             tw.getClass();
             cd1.a(tw);
             this.v.dispose();
             this.E.b();
             this.B = true;
             this.a();
          }else {
             tw = this.w;
             tw.getClass();
             cd1.a(tw);
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.A.get();
    }
    public final void onComplete(){
       kz4 tw = this.w;
       tw.getClass();
       cd1.a(tw);
       this.v.dispose();
       this.C = true;
       this.a();
    }
    public final void onError(Throwable p0){
       kz4 tw = this.w;
       tw.getClass();
       cd1.a(tw);
       this.v.dispose();
       if (this.E.a(p0)) {
          this.C = true;
          this.a();
       }
       return;
    }
    public final void onNext(Object p0){
       this.y.offer(p0);
       this.a();
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.F, p0)) {
          this.F = p0;
          this.a.onSubscribe(this);
          this.b.subscribe(this.w);
       }
       return;
    }
    public final void run(){
       if (!(this.z.decrementAndGet())) {
          this.F.dispose();
          kz4 tw = this.w;
          tw.getClass();
          cd1.a(tw);
          this.v.dispose();
          this.E.b();
          this.B = true;
          this.a();
       }
       return;
    }
}
