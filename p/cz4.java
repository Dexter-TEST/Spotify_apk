package p.cz4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import p.ec7;
import java.lang.Throwable;
import java.lang.Object;
import p.f37;
import p.cd1;

public final class cz4 extends AtomicInteger implements Observer, Disposable, Runnable	// class@0012a9 from classes.dex
{
    public final Observer a;
    public final long b;
    public final int c;
    public final AtomicBoolean t;
    public long v;
    public Disposable w;
    public ec7 x;

    public void cz4(Observer p0,long p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = new AtomicBoolean();
       this.lazySet(1);
    }
    public void dispose(){
       if (this.t.compareAndSet(false, true)) {
          this.run();
       }
       return;
    }
    public boolean isDisposed(){
       return this.t.get();
    }
    public final void onComplete(){
       cz4 tx;
       if ((tx = this.x) != null) {
          this.x = null;
          tx.onComplete();
       }
       this.a.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       cz4 tx;
       if ((tx = this.x) != null) {
          this.x = null;
          tx.onError(p0);
       }
       this.a.onError(p0);
       return;
    }
    public final void onNext(Object p0){
       cz4 tx;
       f37 uof37;
       if ((tx = this.x) == null && !this.t.get()) {
          this.getAndIncrement();
          tx = ec7.a(this.c, this);
          this.x = tx;
          uof37 = new f37(tx);
          this.a.onNext(uof37);
       }else {
          uof37 = null;
       }
       if (tx != null) {
          tx.onNext(p0);
          long l = this.v + 1;
          this.v = l;
          if ((l - this.b) >= 0) {
             this.v = 0;
             this.x = null;
             tx.onComplete();
          }
          if (uof37 != null && uof37.a()) {
             this.x = null;
             tx.onComplete();
          }
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
    public final void run(){
       if (!this.decrementAndGet()) {
          this.w.dispose();
       }
       return;
    }
}
