package p.ws4;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.yf2;
import p.rn;
import p.fn0;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.CompletableSource;
import p.vs4;
import p.co5;
import p.cd1;

public final class ws4 extends AtomicInteger implements Disposable, Observer	// class@002b99 from classes.dex
{
    public final CompletableObserver a;
    public final rn b;
    public final yf2 c;
    public final boolean t;
    public final fn0 v;
    public Disposable w;
    public boolean x;

    public void ws4(CompletableObserver p0,yf2 p1,boolean p2){
       super();
       this.a = p0;
       this.c = p1;
       this.t = p2;
       this.b = new rn();
       this.v = new fn0();
       this.lazySet(1);
    }
    public void dispose(){
       this.x = true;
       this.w.dispose();
       this.v.dispose();
       this.b.b();
    }
    public boolean isDisposed(){
       return this.w.isDisposed();
    }
    public final void onComplete(){
       if (!this.decrementAndGet()) {
          this.b.c(this.a);
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.b.a(p0)) {
          if (this.t != null) {
             if (!this.decrementAndGet()) {
                this.b.c(this.a);
             }
          }else {
             this.x = true;
             this.w.dispose();
             this.v.dispose();
             this.b.c(this.a);
          }
       }
       return;
    }
    public final void onNext(Object p0){
       p0 = this.c.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null CompletableSource");
       this.getAndIncrement();
       vs4 ovs4 = new vs4(this);
       if (this.x == null && this.v.c(ovs4)) {
          p0.subscribe(ovs4);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.w, p0)) {
          this.w = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
