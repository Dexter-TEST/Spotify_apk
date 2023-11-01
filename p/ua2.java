package p.ua2;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import p.iv6;
import p.bi5;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.co5;
import p.mv6;

public final class ua2 implements FlowableSubscriber, kv6	// class@002871 from classes.dex
{
    public final iv6 a;
    public final bi5 b;
    public kv6 c;
    public boolean t;

    public void ua2(iv6 p0,bi5 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(long p0){
       this.c.a(p0);
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
       ua2 ta = this.a;
       if (!this.b.test(p0)) {
          this.t = true;
          this.c.cancel();
          ta.onComplete();
          return;
       }else {
          ta.onNext(p0);
          return;
       }
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
