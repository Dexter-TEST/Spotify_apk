package p.j72;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import p.iv6;
import p.ir0;
import p.fv1;
import p.b5;
import java.lang.Object;
import java.lang.Class;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.mv6;
import p.rl1;

public final class j72 implements FlowableSubscriber, kv6	// class@001a7d from classes.dex
{
    public final iv6 a;
    public final ir0 b;
    public final fv1 c;
    public final b5 t;
    public kv6 v;

    public void j72(iv6 p0,ir0 p1,fv1 p2,b5 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.t = p3;
       this.c = p2;
    }
    public final void a(long p0){
       this.c.getClass();
       this.v.a(p0);
       return;
    }
    public final void cancel(){
       j72 tv = this.v;
       mv6 a = mv6.a;
       if (tv != a) {
          this.v = a;
          this.t.run();
          tv.cancel();
       }
       return;
    }
    public final void onComplete(){
       if (this.v != mv6.a) {
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.v != mv6.a) {
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
       j72 ta = this.a;
       this.b.accept(p0);
       if (mv6.g(this.v, p0)) {
          this.v = p0;
          ta.onSubscribe(this);
       }
       return;
    }
}
