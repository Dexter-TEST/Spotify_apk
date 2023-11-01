package p.j62;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.n62;
import p.kv6;
import java.util.concurrent.atomic.AtomicInteger;
import p.yf2;
import p.m62;
import p.rn;
import java.lang.Object;
import p.yh6;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Throwable;
import p.iv6;
import p.mv6;
import p.wn5;
import p.vn5;
import p.fq6;

public abstract class j62 extends AtomicInteger implements FlowableSubscriber, n62, kv6	// class@001a74 from classes.dex
{
    public final rn A;
    public boolean B;
    public int C;
    public final m62 a;
    public final yf2 b;
    public final int c;
    public final int t;
    public kv6 v;
    public int w;
    public yh6 x;
    public boolean y;
    public boolean z;

    public void j62(yf2 p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
       this.t = p1 - (p1 >> 2);
       this.a = new m62(this);
       this.A = new rn();
    }
    public abstract void e();
    public abstract void f();
    public final void onComplete(){
       this.y = true;
       this.e();
    }
    public final void onNext(Object p0){
       if (this.C != 2 && !this.x.offer(p0)) {
          this.v.cancel();
          this.onError(new IllegalStateException("Queue full?!"));
          return;
       }else {
          this.e();
          return;
       }
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.v, p0)) {
          this.v = p0;
          if (p0 instanceof wn5) {
             vn5 ovn5 = p0;
             int i = ovn5.b(7);
             boolean b = true;
             if (i == b) {
                this.C = i;
                this.x = ovn5;
                this.y = b;
                this.f();
                this.e();
                return;
             }else if(i == 2){
                this.C = i;
                this.x = ovn5;
                this.f();
                p0.a((long)this.c);
                return;
             }
          }
          this.x = new fq6(this.c);
          this.f();
          p0.a((long)this.c);
       }
       return;
    }
}
