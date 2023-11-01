package p.q72;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.r72;
import java.lang.Object;
import p.kv6;
import p.mv6;
import java.lang.Throwable;
import p.rn;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p.yh6;
import p.iv6;
import p.fq6;
import p.ya4;
import java.lang.String;
import p.wn5;
import p.vn5;

public final class q72 extends AtomicReference implements FlowableSubscriber, Disposable	// class@002345 from classes.dex
{
    public final long a;
    public final r72 b;
    public final int c;
    public final int t;
    public boolean v;
    public yh6 w;
    public long x;
    public int y;

    public void q72(r72 p0,int p1,long p2){
       super();
       this.a = p2;
       this.b = p0;
       this.t = p1;
       this.c = p1 >> 2;
    }
    public final void a(long p0){
       if (this.y != 1) {
          long l = this.x + p0;
          if ((l - (long)this.c) >= 0) {
             this.x = 0;
             this.get().a(l);
          }else {
             this.x = l;
          }
       }
       return;
    }
    public void dispose(){
       mv6.b(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == mv6.a)? true: false;
       return b;
    }
    public final void onComplete(){
       this.v = true;
       this.b.d();
    }
    public final void onError(Throwable p0){
       this.lazySet(mv6.a);
       q72 tb = this.b;
       if (tb.y.a(p0)) {
          this.v = true;
          if (tb.c == null) {
             tb.C.cancel();
             q72[] andSet = tb.A.getAndSet(r72.J);
             int len = andSet.length;
             for (int i = 0; i < len; i = i + 1) {
                andSet[i].dispose();
             }
          }
          tb.d();
       }
       return;
    }
    public final void onNext(Object p0){
       q72 tw;
       fq6 uofq6;
       if (this.y != 2) {
          q72 tb = this.b;
          if (!tb.get() && tb.compareAndSet(0, 1)) {
             long l = tb.B.get();
             tw = this.w;
             if ((l) && (tw == null && !tw.isEmpty())) {
                tb.a.onNext(p0);
                if (l - Long.MAX_VALUE) {
                   tb.B.decrementAndGet();
                }
                this.a(1);
             }else if(tw == null){
                tw = new fq6(tb.v);
                this.w = tw;
             }
             if (!tw.offer(p0)) {
                tb.onError(new ya4("Inner queue full?!"));
             }
             if (tb.decrementAndGet()) {
                tb.e();
             }
          }else if((tw = this.w) == null){
             uofq6 = new fq6(tb.v);
             this.w = uofq6;
          }
          if (!uofq6.offer(p0)) {
             tb.onError(new ya4("Inner queue full?!"));
          }else if(tb.getAndIncrement()){
          }
       }else {
          this.b.d();
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
                this.y = i;
                this.w = ovn5;
                this.v = b;
                this.b.d();
                return;
             }else if(i == 2){
                this.y = i;
                this.w = ovn5;
             }
          }
          p0.a((long)this.t);
       }
       return;
    }
}
