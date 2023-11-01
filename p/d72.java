package p.d72;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicLong;
import p.eb6;
import java.util.concurrent.TimeUnit;
import io.reactivex.rxjava3.core.Scheduler$Worker;
import p.mv6;
import p.vv7;
import io.reactivex.rxjava3.disposables.Disposable;
import p.c72;
import p.iv6;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Object;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class d72 extends AtomicLong implements FlowableSubscriber, kv6	// class@0012f0 from classes.dex
{
    public final iv6 a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler$Worker t;
    public kv6 v;
    public c72 w;
    public long x;
    public boolean y;

    public void d72(eb6 p0,long p1,TimeUnit p2,Scheduler$Worker p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          vv7.a(this, p0);
       }
       return;
    }
    public final void cancel(){
       this.v.cancel();
       this.t.dispose();
    }
    public final void onComplete(){
       d72 tw;
       if (this.y != null) {
          return;
       }
       this.y = true;
       if ((tw = this.w) != null) {
          tw.dispose();
       }
       if (tw != null) {
          tw.a();
       }
       this.a.onComplete();
       this.t.dispose();
       return;
    }
    public final void onError(Throwable p0){
       d72 tw;
       if (this.y != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.y = true;
          if ((tw = this.w) != null) {
             tw.dispose();
          }
          this.a.onError(p0);
          this.t.dispose();
          return;
       }
    }
    public final void onNext(Object p0){
       d72 tw;
       if (this.y != null) {
          return;
       }
       long l = this.x + 1;
       this.x = l;
       if ((tw = this.w) != null) {
          tw.dispose();
       }
       c72 uoc72 = new c72(p0, l, this);
       this.w = uoc72;
       cd1.c(uoc72, this.t.b(uoc72, this.b, this.c));
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.v, p0)) {
          this.v = p0;
          this.a.onSubscribe(this);
          p0.a(Long.MAX_VALUE);
       }
       return;
    }
}
