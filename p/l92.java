package p.l92;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicBoolean;
import p.iv6;
import p.m92;
import p.k92;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Object;
import p.mv6;

public final class l92 extends AtomicBoolean implements FlowableSubscriber, kv6	// class@001d0a from classes.dex
{
    public final iv6 a;
    public final m92 b;
    public final k92 c;
    public kv6 t;

    public void l92(iv6 p0,m92 p1,k92 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(long p0){
       this.t.a(p0);
    }
    public final void cancel(){
       m92 t;
       this.t.cancel();
       if (this.compareAndSet(false, true)) {
          l92 tb = this.b;
          l92 tc = this.c;
          _monitor_enter(tb);
          if ((t = tb.t) != null && t == tc) {
             long l = tc.b - 1;
             tc.b = l;
             if (!(l) && tc.c != null) {
                tb.A(tc);
                _monitor_exit(tb);
             }else {
                _monitor_exit(tb);
             }
          }else {
             _monitor_exit(tb);
          }
       }
       return;
    }
    public final void onComplete(){
       if (this.compareAndSet(false, true)) {
          this.b.z(this.c);
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.compareAndSet(false, true)) {
          this.b.z(this.c);
          this.a.onError(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.t, p0)) {
          this.t = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
