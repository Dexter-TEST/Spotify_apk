package p.ma2;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import java.util.concurrent.atomic.AtomicReference;
import p.na2;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import p.iw1;
import p.kv6;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.yh6;
import p.ya4;
import java.lang.String;
import p.mv6;
import p.wn5;
import p.vn5;
import p.fq6;

public final class ma2 extends AtomicReference implements FlowableSubscriber	// class@001e56 from classes.dex
{
    public final na2 a;
    public final long b;
    public final int c;
    public yh6 t;
    public boolean v;
    public int w;

    public void ma2(na2 p0,long p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onComplete(){
       ma2 ta = this.a;
       if (!(this.b - ta.B)) {
          this.v = true;
          ta.d();
       }
       return;
    }
    public final void onError(Throwable p0){
       ma2 ta = this.a;
       if (!(this.b - ta.B)) {
          na2 w = ta.w;
          w.getClass();
          if (iw1.a(w, p0)) {
             if (ta.t == null) {
                ta.y.cancel();
                ta.v = true;
             }
             this.v = true;
             ta.d();
          label_002a :
             return;
          }
       }
       RxJavaPlugins.c(p0);
       goto label_002a ;
    }
    public final void onNext(Object p0){
       ma2 ta = this.a;
       if (!(this.b - ta.B)) {
          if (this.w == null && !this.t.offer(p0)) {
             this.onError(new ya4("Queue full?!"));
             return;
          }else {
             ta.d();
          }
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.e(this, p0)) {
          if (p0 instanceof wn5) {
             vn5 ovn5 = p0;
             int i = ovn5.b(7);
             boolean b = true;
             if (i == b) {
                this.w = i;
                this.t = ovn5;
                this.v = b;
                this.a.d();
                return;
             }else if(i == 2){
                this.w = i;
                this.t = ovn5;
                p0.a((long)this.c);
                return;
             }
          }
          this.t = new fq6(this.c);
          p0.a((long)this.c);
       }
       return;
    }
}
