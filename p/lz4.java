package p.lz4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.TimeUnit;
import p.kf6;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Throwable;
import java.lang.Object;
import p.cd1;

public abstract class lz4 extends AtomicInteger implements Observer, Disposable	// class@001df3 from classes.dex
{
    public final AtomicBoolean A;
    public boolean B;
    public final AtomicInteger C;
    public final Observer a;
    public final kf6 b;
    public final long c;
    public final TimeUnit t;
    public final int v;
    public long w;
    public boolean x;
    public Throwable y;
    public Disposable z;

    public void lz4(Observer p0,long p1,TimeUnit p2,int p3){
       super();
       this.a = p0;
       this.b = new kf6(14);
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.A = new AtomicBoolean();
       this.C = new AtomicInteger(1);
    }
    public abstract void a();
    public abstract void b();
    abstract void c();
    public final void d(){
       if (!this.C.decrementAndGet()) {
          this.a();
          this.z.dispose();
          this.B = true;
          this.c();
       }
       return;
    }
    public final void dispose(){
       if (this.A.compareAndSet(false, true)) {
          this.d();
       }
       return;
    }
    public final boolean isDisposed(){
       return this.A.get();
    }
    public final void onComplete(){
       this.x = true;
       this.c();
    }
    public final void onError(Throwable p0){
       this.y = p0;
       this.x = true;
       this.c();
    }
    public final void onNext(Object p0){
       this.b.offer(p0);
       this.c();
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.z, p0)) {
          this.z = p0;
          this.a.onSubscribe(this);
          this.b();
       }
       return;
    }
}
