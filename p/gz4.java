package p.gz4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import p.fz4;
import java.util.concurrent.atomic.AtomicReference;
import p.kf6;
import p.rn;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Throwable;
import p.iw1;
import p.ec7;
import java.lang.Class;
import p.f37;
import p.ed1;
import p.cd1;

public final class gz4 extends AtomicInteger implements Observer, Disposable, Runnable	// class@0017ac from classes.dex
{
    public ec7 A;
    public final Observer a;
    public final int b;
    public final fz4 c;
    public final AtomicReference t;
    public final AtomicInteger v;
    public final kf6 w;
    public final rn x;
    public final AtomicBoolean y;
    public boolean z;
    public static final Object B;

    static {
       gz4.B = new Object();
    }
    public void gz4(Observer p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new fz4(this);
       this.t = new AtomicReference();
       this.v = new AtomicInteger(1);
       this.w = new kf6(14);
       this.x = new rn();
       this.y = new AtomicBoolean();
    }
    public final void a(){
       gz4 tz;
       Throwable throwable;
       Object obj;
       int i1;
       if (this.getAndIncrement()) {
          return;
       }
       gz4 ta = this.a;
       gz4 tw = this.w;
       gz4 tx = this.x;
       int i = 1;
       while (true) {
          ec7 uoec7 = null;
          if (!this.v.get()) {
             tw.clear();
             this.A = uoec7;
             return;
          }else {
             gz4 tA = this.A;
             if ((tz = this.z) != null && tx.get() != null) {
                tw.clear();
                throwable = iw1.d(tx);
                if (tA != null) {
                   this.A = uoec7;
                   tA.onError(throwable);
                }
                ta.onError(throwable);
                return;
             }else if((obj = tw.poll()) == null){
                i1 = 1;
             }else {
                i1 = 0;
             }
             if (tz != null && i1) {
                tx.getClass();
                if ((throwable = iw1.d(tx)) == null) {
                   if (tA != null) {
                      this.A = uoec7;
                      tA.onComplete();
                   }
                   ta.onComplete();
                   break ;
                }else if(tA != null){
                   this.A = uoec7;
                   tA.onError(throwable);
                }
                ta.onError(throwable);
                break ;
             }else if(i1){
                if (!(i = - i)) {
                   return;
                }
             }else if(obj != gz4.B){
                tA.onNext(obj);
             }else if(tA != null){
                this.A = uoec7;
                tA.onComplete();
             }
             if (!this.y.get()) {
                ec7 uoec71 = ec7.a(this.b, this);
                this.A = uoec71;
                this.v.getAndIncrement();
                f37 uoec72 = new f37(uoec71);
                ta.onNext(uoec72);
                if (uoec72.a()) {
                   uoec71.onComplete();
                }
             }
          }
       }
       return;
    }
    public final void b(){
       this.w.offer(gz4.B);
       this.a();
    }
    public void dispose(){
       if (this.y.compareAndSet(false, true)) {
          this.c.dispose();
          if (!this.v.decrementAndGet()) {
             cd1.a(this.t);
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.y.get();
    }
    public final void onComplete(){
       this.c.dispose();
       this.z = true;
       this.a();
    }
    public final void onError(Throwable p0){
       this.c.dispose();
       if (this.x.a(p0)) {
          this.z = true;
          this.a();
       }
       return;
    }
    public final void onNext(Object p0){
       this.w.offer(p0);
       this.a();
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this.t, p0)) {
          this.b();
       }
       return;
    }
    public final void run(){
       if (!this.v.decrementAndGet()) {
          cd1.a(this.t);
       }
       return;
    }
}
