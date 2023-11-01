package p.zc1;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import p.hi3;
import java.util.concurrent.atomic.AtomicReference;
import p.ir0;
import p.b5;
import p.ad1;
import java.lang.Object;
import p.mv6;
import p.co5;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.hn0;
import p.kv6;

public final class zc1 extends AtomicReference implements FlowableSubscriber, Disposable, hi3	// class@002ec9 from classes.dex
{
    public final AtomicReference a;
    public final ir0 b;
    public final ir0 c;
    public final b5 t;

    public void zc1(ir0 p0,ir0 p1,b5 p2,ad1 p3){
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.a = new AtomicReference(p3);
    }
    public void dispose(){
       ad1 andSet;
       mv6.b(this);
       if ((andSet = this.a.getAndSet(null)) != null) {
          andSet.b(this);
       }
       return;
    }
    public final boolean hasCustomOnError(){
       boolean b = (this.c != co5.i)? true: false;
       return b;
    }
    public boolean isDisposed(){
       boolean b = (mv6.a == this.get())? true: false;
       return b;
    }
    public final void onComplete(){
       ad1 andSet;
       mv6 a = mv6.a;
       if (this.get() != a) {
          this.lazySet(a);
          this.t.run();
       }
       if ((andSet = this.a.getAndSet(null)) != null) {
          andSet.b(this);
       }
       return;
    }
    public final void onError(Throwable p0){
       ad1 andSet;
       mv6 a = mv6.a;
       if (this.get() != a) {
          this.lazySet(a);
          this.c.accept(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       if ((andSet = this.a.getAndSet(null)) != null) {
          andSet.b(this);
       }
       return;
    }
    public final void onNext(Object p0){
       if (this.get() != mv6.a) {
          this.b.accept(p0);
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.e(this, p0)) {
          p0.a(Long.MAX_VALUE);
       }
       return;
    }
}
