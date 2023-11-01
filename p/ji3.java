package p.ji3;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import io.reactivex.rxjava3.disposables.Disposable;
import p.hi3;
import java.util.concurrent.atomic.AtomicReference;
import p.ir0;
import p.b5;
import p.m82;
import java.lang.Object;
import p.mv6;
import p.co5;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.hn0;

public final class ji3 extends AtomicReference implements FlowableSubscriber, kv6, Disposable, hi3	// class@001ae0 from classes.dex
{
    public final ir0 a;
    public final ir0 b;
    public final b5 c;
    public final ir0 t;

    public void ji3(ir0 p0,ir0 p1,b5 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = m82.a;
    }
    public final void a(long p0){
       this.get().a(p0);
    }
    public final void cancel(){
       mv6.b(this);
    }
    public void dispose(){
       mv6.b(this);
    }
    public final boolean hasCustomOnError(){
       boolean b = (this.b != co5.i)? true: false;
       return b;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == mv6.a)? true: false;
       return b;
    }
    public final void onComplete(){
       mv6 a = mv6.a;
       if (this.get() != a) {
          this.lazySet(a);
          this.c.run();
       }
       return;
    }
    public final void onError(Throwable p0){
       mv6 a = mv6.a;
       if (this.get() != a) {
          this.lazySet(a);
          this.b.accept(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       if (!this.isDisposed()) {
          this.a.accept(p0);
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.e(this, p0)) {
          this.t.accept(this);
       }
       return;
    }
}
