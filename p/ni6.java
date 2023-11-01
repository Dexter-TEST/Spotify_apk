package p.ni6;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import p.kv6;
import p.cd1;
import java.lang.Object;
import p.ay5;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.mv6;

public final class ni6 extends AtomicReference implements FlowableSubscriber, Disposable	// class@001fe6 from classes.dex
{
    public final SingleObserver a;
    public final SingleSource b;
    public boolean c;
    public kv6 t;

    public void ni6(SingleObserver p0,SingleSource p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.t.cancel();
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       this.b.subscribe(new ay5(this, this.a, 0));
       return;
    }
    public final void onError(Throwable p0){
       if (this.c != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.c = true;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       this.t.cancel();
       this.onComplete();
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.t, p0)) {
          this.t = p0;
          this.a.onSubscribe(this);
          p0.a(Long.MAX_VALUE);
       }
       return;
    }
}
