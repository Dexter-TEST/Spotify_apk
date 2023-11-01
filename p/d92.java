package p.d92;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicLong;
import p.iv6;
import p.mv6;
import p.vv7;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Object;
import p.ya4;
import java.lang.String;

public final class d92 extends AtomicLong implements FlowableSubscriber, kv6	// class@001301 from classes.dex
{
    public final iv6 a;
    public kv6 b;
    public boolean c;

    public void d92(iv6 p0){
       super();
       this.a = p0;
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          vv7.a(this, p0);
       }
       return;
    }
    public final void cancel(){
       this.b.cancel();
    }
    public final void onComplete(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       this.a.onComplete();
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
       if (this.c != null) {
          return;
       }
       if (this.get()) {
          this.a.onNext(p0);
          vv7.H(this, 1);
       }else {
          this.b.cancel();
          this.onError(new ya4("could not emit value due to lack of requests"));
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
          p0.a(Long.MAX_VALUE);
       }
       return;
    }
}
