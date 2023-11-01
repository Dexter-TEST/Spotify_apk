package p.r93;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicReference;
import p.s93;
import java.lang.Object;
import p.mv6;
import p.q62;
import java.lang.Class;
import java.lang.Throwable;
import p.rn;
import p.ro1;
import p.yh6;
import p.ya4;
import p.wn5;
import p.vn5;
import p.gq6;
import p.fq6;

public final class r93 extends AtomicReference implements FlowableSubscriber, kv6	// class@0024a0 from classes.dex
{
    public final s93 a;
    public final int b;
    public final int c;
    public yh6 t;
    public boolean v;
    public long w;
    public int x;

    public void r93(s93 p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p1 - (p1 >> 2);
    }
    public final void a(long p0){
       if (this.x != 1) {
          long l = this.w + p0;
          if ((l - (long)this.c) >= 0) {
             this.w = 0;
             this.get().a(l);
          }else {
             this.w = l;
          }
       }
       return;
    }
    public final void cancel(){
       mv6.b(this);
    }
    public final void onComplete(){
       r93 ta = this.a;
       ta.getClass();
       this.v = true;
       ta.d();
    }
    public final void onError(Throwable p0){
       r93 ta = this.a;
       if (ta.w.a(p0)) {
          this.v = true;
          if (ta.v != ro1.c) {
             ta.z.cancel();
          }
          ta.d();
       }
       return;
    }
    public final void onNext(Object p0){
       if (this.x == null) {
          r93 ta = this.a;
          ta.getClass();
          if (this.t.offer(p0)) {
             ta.d();
          }else {
             mv6.b(this);
             if (ta.w.a(new ya4())) {
                this.v = true;
                if (ta.v != ro1.c) {
                   ta.z.cancel();
                }
                ta.d();
             }
          }
       }else {
          this.a.d();
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       r93 tb;
       if (mv6.e(this, p0)) {
          long l = Long.MAX_VALUE;
          if (p0 instanceof wn5) {
             vn5 ovn5 = p0;
             int i = ovn5.b(3);
             boolean b = true;
             if (i == b) {
                this.x = i;
                this.t = ovn5;
                this.v = b;
                r93 ta = this.a;
                ta.getClass();
                this.v = b;
                ta.d();
                return;
             }else if(i == 2){
                this.x = i;
                this.t = ovn5;
                if ((tb = this.b) >= null) {
                   l = (long)tb;
                }
                p0.a(l);
                return;
             }
          }
          gq6 ogq6 = ((tb = this.b) < null)? new gq6((- tb)): new fq6(tb);
          this.t = ogq6;
          if ((tb = this.b) >= null) {
             l = (long)tb;
          }
          p0.a(l);
       }
       return;
    }
}
