package p.az4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import p.ir0;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;
import p.hn0;

public final class az4 extends AtomicBoolean implements Observer, Disposable	// class@001021 from classes.dex
{
    public final Observer a;
    public final Object b;
    public final ir0 c;
    public final boolean t;
    public Disposable v;

    public void az4(Observer p0,Object p1,ir0 p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final void a(){
       if (this.compareAndSet(false, true)) {
          this.c.accept(this.b);
       }
       return;
    }
    public void dispose(){
       cd1 a = cd1.a;
       if (this.t != null) {
          this.a();
          this.v.dispose();
          this.v = a;
       }else {
          this.v.dispose();
          this.v = a;
          this.a();
       }
       return;
    }
    public boolean isDisposed(){
       return this.get();
    }
    public final void onComplete(){
       az4 ta = this.a;
       if (this.t != null) {
          if (this.compareAndSet(false, true)) {
             this.c.accept(this.b);
          }
          ta.onComplete();
       }else {
          ta.onComplete();
          this.a();
       }
       return;
    }
    public final void onError(Throwable p0){
       az4 ta = this.a;
       if (this.t != null) {
          if (this.compareAndSet(false, true)) {
             this.c.accept(this.b);
          }
          ta.onError(p0);
       }else {
          ta.onError(p0);
          this.a();
       }
       return;
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.v, p0)) {
          this.v = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
