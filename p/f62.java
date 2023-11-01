package p.f62;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import java.util.concurrent.atomic.AtomicReference;
import p.e62;
import java.lang.Object;
import p.kv6;
import java.lang.Throwable;
import p.iw1;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.io.Serializable;
import p.gq6;
import p.mv6;

public final class f62 extends AtomicReference implements FlowableSubscriber	// class@001568 from classes.dex
{
    public final e62 a;
    public final int b;
    public final int c;
    public final int t;
    public int v;

    public void f62(e62 p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p2 - (p2 >> 2);
    }
    public final void a(){
       int i;
       if ((i = this.v + 1) == this.t) {
          this.v = 0;
          this.get().a((long)i);
       }else {
          this.v = i;
       }
       return;
    }
    public final void onComplete(){
       this.a.g(this.b);
    }
    public final void onError(Throwable p0){
       f62 ta = this.a;
       f62 tb = this.b;
       if (iw1.a(ta.D, p0)) {
          if (ta.w == null) {
             ta.d();
             ta.C = true;
             ta.f();
          }else {
             ta.g(tb);
          }
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       int i;
       f62 ta = this.a;
       f62 tb = this.b;
       _monitor_enter(ta);
       e62 v = ta.v;
       e62 y = ta.y;
       if (v[tb] == null) {
          y = y + 1;
          ta.y = y;
       }
       v[tb] = p0;
       if (v.length == y) {
          ta.t.a(ta.c[tb], v.clone());
          i = 0;
       }else {
          i = 1;
       }
       _monitor_exit(ta);
       if (i) {
          ta.c[tb].a();
       }else {
          ta.f();
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       long l = (long)this.c;
       if (mv6.e(this, p0)) {
          p0.a(l);
       }
       return;
    }
}
