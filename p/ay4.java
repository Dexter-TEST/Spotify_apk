package p.ay4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.zx4;
import p.yf2;
import p.rn;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import p.cd1;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.core.SingleObserver;
import p.co5;

public final class ay4 extends AtomicInteger implements Observer, Disposable	// class@001018 from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public final boolean c;
    public final rn t;
    public final AtomicReference v;
    public Disposable w;
    public boolean x;
    public boolean y;
    public static final zx4 z;

    static {
       ay4.z = new zx4(null);
    }
    public void ay4(Observer p0,yf2 p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = new rn();
       this.v = new AtomicReference();
    }
    public final void a(){
       zx4 andSet;
       zx4 z = ay4.z;
       if ((andSet = this.v.getAndSet(z)) != null && andSet != z) {
          cd1.a(andSet);
       }
       return;
    }
    public final void b(){
       zx4 ozx4;
       if (this.getAndIncrement()) {
          return;
       }
       ay4 ta = this.a;
       ay4 tt = this.t;
       ay4 tv = this.v;
       int i = 1;
       while (true) {
          if (this.y != null) {
             return;
          }
          if (tt.get() != null && this.c == null) {
             tt.d(ta);
             return;
          }else {
             ay4 tx = this.x;
             int i1 = ((ozx4 = tv.get()) == null)? 1: 0;
             if (tx != null && i1) {
                tt.d(ta);
                return;
             }else if(!i1 && ozx4.b != null){
                do {
                } while (tv.compareAndSet(ozx4, null) || tv.get() != ozx4);
                ta.onNext(ozx4.b);
             }else if(!(i = - i)){
                break ;
             }
          }
       }
       return;
    }
    public void dispose(){
       this.y = true;
       this.w.dispose();
       this.a();
       this.t.b();
    }
    public boolean isDisposed(){
       return this.y;
    }
    public final void onComplete(){
       this.x = true;
       this.b();
    }
    public final void onError(Throwable p0){
       if (this.t.a(p0)) {
          if (this.c == null) {
             this.a();
          }
          this.x = true;
          this.b();
       }
       return;
    }
    public final void onNext(Object p0){
       zx4 ozx4;
       zx4 ozx41;
       zx4 z = ay4.z;
       ay4 tv = this.v;
       if ((ozx4 = tv.get()) != null) {
          cd1.a(ozx4);
       }
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null SingleSource");
       ozx4 = new zx4(this);
       while ((ozx41 = tv.get()) != z) {
          while (true) {
             if (tv.compareAndSet(ozx41, ozx4)) {
                ozx41 = 1;
             }else {
                if (tv.get() != ozx41) {
                   ozx41 = 0;
                }
             }
             if (ozx41) {
                p0.subscribe(ozx4);
                break ;
             }else {
                continue ;
             }
          }
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.w, p0)) {
          this.w = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
