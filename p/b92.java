package p.b92;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicLong;
import p.iv6;
import p.c92;
import p.mv6;
import p.vv7;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Object;
import p.ir0;
import p.co5;

public final class b92 extends AtomicLong implements FlowableSubscriber, kv6	// class@00107b from classes.dex
{
    public final iv6 a;
    public final ir0 b;
    public kv6 c;
    public boolean t;

    public void b92(iv6 p0,c92 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          vv7.a(this, p0);
       }
       return;
    }
    public final void cancel(){
       this.c.cancel();
    }
    public final void onComplete(){
       if (this.t != null) {
          return;
       }
       this.t = true;
       this.a.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       if (this.t != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.t = true;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.t != null) {
          return;
       }
       if (this.get()) {
          this.a.onNext(p0);
          vv7.H(this, 1);
       }else {
          this.b.accept(p0);
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
          p0.a(Long.MAX_VALUE);
       }
       return;
    }
}
