package p.da2;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import p.iv6;
import p.bi5;
import p.lv6;
import io.reactivex.rxjava3.core.Flowable;
import p.bn5;
import java.lang.Throwable;
import java.lang.Object;
import p.co5;
import p.hn0;
import p.kv6;

public final class da2 extends AtomicInteger implements FlowableSubscriber	// class@00130b from classes.dex
{
    public final iv6 a;
    public final lv6 b;
    public final bn5 c;
    public final bi5 t;
    public long v;
    public long w;

    public void da2(iv6 p0,long p1,bi5 p2,lv6 p3,Flowable p4){
       super();
       this.a = p0;
       this.b = p3;
       this.c = p4;
       this.t = p2;
       this.v = p1;
    }
    public final void a(){
       if (!this.getAndIncrement()) {
          int i = 1;
          while (true) {
             if (this.b.x != null) {
                return;
             }
             da2 tw = this.w;
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
       da2 tv = this.v;
       if (tv - Long.MAX_VALUE) {
          this.v = tv - 1;
       }
       da2 ta = this.a;
       if (!(tv)) {
          ta.onError(p0);
       }else if(!this.t.test(p0)){
          ta.onError(p0);
          return;
       }else {
          this.a();
       }
       return;
    }
    public final void onNext(Object p0){
       this.w = this.w + 1;
       this.a.onNext(p0);
    }
    public final void onSubscribe(kv6 p0){
       this.b.e(p0);
    }
}
