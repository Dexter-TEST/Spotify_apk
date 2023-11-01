package p.m0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.hi3;
import java.util.concurrent.atomic.AtomicReference;
import p.b5;
import p.ir0;
import p.ad1;
import java.lang.Object;
import p.cd1;
import p.co5;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.hn0;

public abstract class m0 extends AtomicReference implements Disposable, hi3	// class@001e01 from classes.dex
{
    public final AtomicReference a;
    public final ir0 b;
    public final b5 c;

    public void m0(b5 p0,ir0 p1,ad1 p2){
       super();
       this.b = p1;
       this.c = p0;
       this.a = new AtomicReference(p2);
    }
    final void a(){
       ad1 andSet;
       if ((andSet = this.a.getAndSet(null)) != null) {
          andSet.b(this);
       }
       return;
    }
    public final void dispose(){
       cd1.a(this);
       this.a();
    }
    public final boolean hasCustomOnError(){
       boolean b = (this.b != co5.i)? true: false;
       return b;
    }
    public final boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       cd1 a = cd1.a;
       if (this.get() != a) {
          this.lazySet(a);
          this.c.run();
       }
       this.a();
       return;
    }
    public final void onError(Throwable p0){
       cd1 a = cd1.a;
       if (this.get() != a) {
          this.lazySet(a);
          this.b.accept(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       this.a();
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
}
