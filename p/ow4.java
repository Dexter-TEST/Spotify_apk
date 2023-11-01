package p.ow4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.hv6;
import io.reactivex.rxjava3.core.ObservableSource;
import p.rn;
import p.xv4;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Object;
import p.xe7;
import java.lang.Throwable;

public final class ow4 extends AtomicInteger implements Observer, Disposable	// class@0021a3 from classes.dex
{
    public final Observer a;
    public final AtomicInteger b;
    public final rn c;
    public final hv6 t;
    public final xv4 v;
    public final AtomicReference w;
    public final ObservableSource x;
    public boolean y;

    public void ow4(Observer p0,hv6 p1,ObservableSource p2){
       super();
       this.a = p0;
       this.t = p1;
       this.x = p2;
       this.b = new AtomicInteger();
       this.c = new rn();
       this.v = new xv4(this, 1);
       this.w = new AtomicReference();
    }
    public final void a(){
       if (!this.b.getAndIncrement()) {
          while (true) {
             if (this.isDisposed()) {
                return;
             }
             if (this.y == null) {
                this.y = true;
                this.x.subscribe(this);
             }
             if (this.b.decrementAndGet()) {
             }
          }
       }
       return;
    }
    public void dispose(){
       cd1.a(this.w);
       cd1.a(this.v);
    }
    public boolean isDisposed(){
       return cd1.b(this.w.get());
    }
    public final void onComplete(){
       cd1.a(this.v);
       xe7.K(this.a, this, this.c);
    }
    public final void onError(Throwable p0){
       cd1.c(this.w, null);
       this.y = false;
       this.t.onNext(p0);
    }
    public final void onNext(Object p0){
       xe7.N(this.a, p0, this, this.c);
    }
    public final void onSubscribe(Disposable p0){
       cd1.c(this.w, p0);
    }
}
