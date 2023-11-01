package p.xu4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p.tq4;
import p.rn;
import java.lang.Object;
import p.gq6;
import p.cd1;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.Observable;

public final class xu4 extends AtomicInteger implements Observer, Disposable	// class@002ced from classes.dex
{
    public final Observer a;
    public final AtomicReference b;
    public final tq4 c;
    public final rn t;
    public gq6 v;
    public Object w;
    public boolean x;
    public boolean y;
    public int z;

    public void xu4(Observer p0){
       super();
       this.a = p0;
       this.b = new AtomicReference();
       this.c = new tq4(this, 1);
       this.t = new rn();
    }
    public final void a(){
       xu4 tz;
       xu4 tv;
       xu4 ta = this.a;
       int i = 1;
       int i1 = 1;
       while (true) {
          if (this.x != null) {
             this.w = null;
             this.v = null;
             return;
          }else if(this.t.get() != null){
             this.w = null;
             this.v = null;
             this.t.d(ta);
             return;
          }else if((tz = this.z) == i){
             tz = this.w;
             this.w = null;
             this.z = 2;
             ta.onNext(tz);
             tz = 2;
          }
          xu4 ty = this.y;
          Object obj = ((tv = this.v) != null)? tv.poll(): null;
          int i2 = (obj == null)? 1: 0;
          if (ty != null && (i2 && tz == 2)) {
             this.v = null;
             ta.onComplete();
             return;
          }else if(i2){
             if (!(i1 = - i1)) {
                break ;
             }
          }else {
             ta.onNext(obj);
          }
       }
       return;
    }
    public void dispose(){
       this.x = true;
       cd1.a(this.b);
       cd1.a(this.c);
       this.t.b();
       if (!this.getAndIncrement()) {
          this.v = null;
          this.w = null;
       }
       return;
    }
    public boolean isDisposed(){
       return cd1.b(this.b.get());
    }
    public final void onComplete(){
       this.y = true;
       if (!this.getAndIncrement()) {
          this.a();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.t.a(p0)) {
          cd1.a(this.c);
          if (!this.getAndIncrement()) {
             this.a();
          }
       }
       return;
    }
    public final void onNext(Object p0){
       xu4 tv;
       if (this.compareAndSet(0, 1)) {
          this.a.onNext(p0);
          if (!this.decrementAndGet()) {
             return;
          }
       }else if((tv = this.v) == null){
          tv = new gq6(Observable.bufferSize());
          this.v = tv;
       }
       tv.offer(p0);
       if (this.getAndIncrement()) {
          return;
       }
       this.a();
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.b, p0);
    }
}
