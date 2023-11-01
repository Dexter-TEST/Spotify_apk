package p.wa2;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicBoolean;
import p.iv6;
import io.reactivex.rxjava3.core.Scheduler;
import p.p50;
import java.lang.Object;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.mv6;

public final class wa2 extends AtomicBoolean implements FlowableSubscriber, kv6	// class@002af8 from classes.dex
{
    public final iv6 a;
    public final Scheduler b;
    public kv6 c;

    public void wa2(iv6 p0,Scheduler p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(long p0){
       this.c.a(p0);
    }
    public final void cancel(){
       if (this.compareAndSet(false, true)) {
          this.b.c(new p50(2, this));
       }
       return;
    }
    public final void onComplete(){
       if (!this.get()) {
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.get()) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (!this.get()) {
          this.a.onNext(p0);
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
