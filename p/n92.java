package p.n92;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import p.iv6;
import p.lv6;
import io.reactivex.rxjava3.core.Flowable;
import p.bn5;
import java.lang.Throwable;
import java.lang.Object;
import p.kv6;

public final class n92 extends AtomicInteger implements FlowableSubscriber	// class@001f90 from classes.dex
{
    public final iv6 a;
    public final lv6 b;
    public final bn5 c;
    public long t;
    public long v;

    public void n92(iv6 p0,long p1,lv6 p2,Flowable p3){
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
             n92 tv = this.v;
             long l = 0;
             if (tv - l) {
                this.v = l;
                this.b.d(tv);
             }
             this.c.subscribe(this);
             if (i = - i) {
             }
          }
       }
       return;
    }
    public final void onComplete(){
       n92 tt = this.t;
       if (tt - Long.MAX_VALUE) {
          this.t = tt - 1;
       }
       if (tt) {
          this.a();
       }else {
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.v = this.v + 1;
       this.a.onNext(p0);
    }
    public final void onSubscribe(kv6 p0){
       this.b.e(p0);
    }
}
