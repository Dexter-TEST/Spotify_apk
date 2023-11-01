package p.ca2;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import p.iv6;
import p.y00;
import p.lv6;
import io.reactivex.rxjava3.core.Flowable;
import p.bn5;
import java.lang.Throwable;
import java.lang.Integer;
import java.lang.Object;
import p.co5;
import p.hn0;
import p.kv6;

public final class ca2 extends AtomicInteger implements FlowableSubscriber	// class@0011c9 from classes.dex
{
    public final iv6 a;
    public final lv6 b;
    public final bn5 c;
    public final y00 t;
    public int v;
    public long w;

    public void ca2(iv6 p0,y00 p1,lv6 p2,Flowable p3){
       super();
       this.a = p0;
       this.b = p2;
       this.c = p3;
       this.t = p1;
    }
    public final void a(){
       if (!this.getAndIncrement()) {
          int i = 1;
          while (true) {
             if (this.b.x != null) {
                return;
             }
             ca2 tw = this.w;
             long l = 0;
             if (tw - l) {
                this.w = l;
                this.b.d(tw);
             }
             this.c.subscribe(this);
             if (i = - i) {
             }
          }
       }
       return;
    }
    public final void onComplete(){
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       ca2 ta = this.a;
       int i = this.v + 1;
       this.v = i;
       if (!this.t.test(Integer.valueOf(i), p0)) {
          ta.onError(p0);
          return;
       }else {
          this.a();
          return;
       }
    }
    public final void onNext(Object p0){
       this.w = this.w + 1;
       this.a.onNext(p0);
    }
    public final void onSubscribe(kv6 p0){
       this.b.e(p0);
    }
}
