package p.es4;
import io.reactivex.rxjava3.core.Observer;
import p.zz;
import p.b5;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.vn5;
import p.yh6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import p.cd1;
import p.on5;

public final class es4 extends zz implements Observer	// class@0014eb from classes.dex
{
    public final Observer a;
    public final b5 b;
    public Disposable c;
    public on5 t;
    public boolean v;

    public void es4(Observer p0,b5 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(){
       if (this.compareAndSet(0, 1)) {
          this.b.run();
       }
       return;
    }
    public final int b(int p0){
       es4 tt = this.t;
       boolean b = false;
       if (tt == null || ((p0 & 0x04))) {
          return b;
       }
       if (p0 = tt.b(p0)) {
          if (p0 == 1) {
             b = true;
          }
          this.v = b;
       }
       return p0;
    }
    public final void clear(){
       this.t.clear();
    }
    public void dispose(){
       this.c.dispose();
       this.a();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final boolean isEmpty(){
       return this.t.isEmpty();
    }
    public final void onComplete(){
       this.a.onComplete();
       this.a();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
       this.a();
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          if (p0 instanceof on5) {
             this.t = p0;
          }
          this.a.onSubscribe(this);
       }
       return;
    }
    public final Object poll(){
       Object obj;
       if ((obj = this.t.poll()) == null && this.v != null) {
          this.a();
       }
       return obj;
    }
}
