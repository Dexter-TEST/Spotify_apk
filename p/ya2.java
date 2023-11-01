package p.ya2;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicReference;
import p.xa2;
import java.lang.Object;
import p.mv6;
import java.lang.Throwable;
import p.rn;
import p.yh6;
import p.wn5;
import p.vn5;
import p.fq6;

public final class ya2 extends AtomicReference implements FlowableSubscriber, kv6	// class@002d7b from classes.dex
{
    public final xa2 a;
    public final int b;
    public final int c;
    public yh6 t;
    public long v;
    public boolean w;
    public int x;

    public void ya2(xa2 p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p1 - (p1 >> 2);
    }
    public final void a(long p0){
       if (this.x != 1) {
          long l = this.v + p0;
          if ((l - (long)this.c) >= 0) {
             this.v = 0;
             this.get().a(l);
          }else {
             this.v = l;
          }
       }
       return;
    }
    public final void cancel(){
       mv6.b(this);
    }
    public final void onComplete(){
       this.w = true;
       this.a.c();
    }
    public final void onError(Throwable p0){
       ya2 ta = this.a;
       if (ta.v.a(p0)) {
          this.w = true;
          ta.c();
       }
       return;
    }
    public final void onNext(Object p0){
       if (this.x != 2) {
          this.t.offer(p0);
       }
       this.a.c();
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.e(this, p0)) {
          if (p0 instanceof wn5) {
             vn5 ovn5 = p0;
             int i = ovn5.b(7);
             boolean b = true;
             if (i == b) {
                this.x = i;
                this.t = ovn5;
                this.w = b;
                this.a.c();
                return;
             }else if(i == 2){
                this.x = i;
                this.t = ovn5;
                p0.a((long)this.b);
                return;
             }
          }
          this.t = new fq6(this.b);
          p0.a((long)this.b);
       }
       return;
    }
}
