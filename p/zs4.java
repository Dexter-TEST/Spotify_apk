package p.zs4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.yf2;
import p.fn0;
import p.rn;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import p.gq6;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.MaybeSource;
import p.ys4;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.co5;
import p.cd1;

public final class zs4 extends AtomicInteger implements Observer, Disposable	// class@002f59 from classes.dex
{
    public final Observer a;
    public final boolean b;
    public final fn0 c;
    public final AtomicInteger t;
    public final rn v;
    public final yf2 w;
    public final AtomicReference x;
    public Disposable y;
    public boolean z;

    public void zs4(Observer p0,yf2 p1,boolean p2){
       super();
       this.a = p0;
       this.w = p1;
       this.b = p2;
       this.c = new fn0();
       this.v = new rn();
       this.t = new AtomicInteger(1);
       this.x = new AtomicReference();
    }
    public final void a(){
       gq6 ogq6;
       gq6 ogq61;
       gq6 ogq62;
       zs4 ta = this.a;
       zs4 tt = this.t;
       zs4 tx = this.x;
       int i = 1;
       while (true) {
          if (this.z != null) {
             if ((ogq6 = this.x.get()) != null) {
                ogq6.clear();
             }
             return;
          }else if(this.b == null && this.v.get() != null){
             if ((ogq61 = this.x.get()) != null) {
                ogq61.clear();
                break ;
             }
             break ;
          }else {
             int i1 = 0;
             int i2 = (!tt.get())? 1: 0;
             Object obj = ((ogq62 = tx.get()) != null)? ogq62.poll(): null;
             if (obj == null) {
                i1 = 1;
             }
             if (i2 && i1) {
                this.v.d(ta);
                return;
             }else if(i1){
                if (!(i = - i)) {
                   return;
                }
                continue ;
             }else {
                ta.onNext(obj);
             }
          }
       }
       this.v.d(ta);
       return;
    }
    public void dispose(){
       this.z = true;
       this.y.dispose();
       this.c.dispose();
       this.v.b();
    }
    public boolean isDisposed(){
       return this.z;
    }
    public final void onComplete(){
       this.t.decrementAndGet();
       if (!this.getAndIncrement()) {
          this.a();
       }
       return;
    }
    public final void onError(Throwable p0){
       this.t.decrementAndGet();
       if (this.v.a(p0)) {
          if (this.b == null) {
             this.c.dispose();
          }
          if (!this.getAndIncrement()) {
             this.a();
          }
       }
       return;
    }
    public final void onNext(Object p0){
       p0 = this.w.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null MaybeSource");
       this.t.getAndIncrement();
       ys4 oys4 = new ys4(this);
       if (this.z == null && this.c.c(oys4)) {
          p0.subscribe(oys4);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.y, p0)) {
          this.y = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
