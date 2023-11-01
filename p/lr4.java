package p.lr4;
import p.ed1;
import p.mr4;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class lr4 extends ed1	// class@001dab from classes.dex
{
    public final mr4 b;
    public final long c;
    public final Object t;
    public boolean v;
    public final AtomicBoolean w;

    public void lr4(mr4 p0,long p1,Object p2){
       super();
       this.w = new AtomicBoolean();
       this.b = p0;
       this.c = p1;
       this.t = p2;
    }
    public final void a(){
       if (this.w.compareAndSet(false, true)) {
          lr4 tb = this.b;
          lr4 tt = this.t;
          if (!(this.c - tb.v)) {
             tb.a.onNext(tt);
          }
       }
       return;
    }
    public final void onComplete(){
       if (this.v != null) {
          return;
       }
       this.v = true;
       this.a();
       return;
    }
    public final void onError(Throwable p0){
       if (this.v != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.v = true;
          this.b.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.v != null) {
          return;
       }
       this.v = true;
       this.dispose();
       this.a();
       return;
    }
}
