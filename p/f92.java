package p.f92;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicLong;
import p.iv6;
import p.yf2;
import p.mv6;
import java.lang.Object;
import p.vv7;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import p.co5;
import p.hn0;

public final class f92 extends AtomicLong implements FlowableSubscriber, kv6	// class@001581 from classes.dex
{
    public final iv6 a;
    public kv6 b;
    public Object c;
    public long t;
    public final yf2 v;

    public void f92(iv6 p0,yf2 p1){
       super();
       this.a = p0;
       this.v = p1;
    }
    public final void a(long p0){
       if (mv6.f(p0)) {
          while (true) {
             long l = this.get();
             long l1 = Long.MIN_VALUE;
             long l2 = l & l1;
             if (l2) {
                if (this.compareAndSet(l1, 0x8000000000000001)) {
                   f92 ta = this.a;
                   ta.onNext(this.c);
                   ta.onComplete();
                   break ;
                }
             }else {
                if (this.compareAndSet(l, vv7.c(l, p0))) {
                   this.b.a(p0);
                   break ;
                }
             }
          }
       }
       return;
    }
    public final void cancel(){
       this.b.cancel();
    }
    public final void onComplete(){
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       f92 ta = this.a;
       Object obj = this.v.apply(p0);
       Objects.requireNonNull(obj, "The valueSupplier returned a null value");
       f92 tt = this.t;
       if (tt) {
          vv7.H(this, tt);
       }
       while (true) {
          long l = this.get();
          long l1 = l & Long.MIN_VALUE;
          if (l1) {
             break ;
          }else {
             l = l & Long.MAX_VALUE;
             if (l) {
                this.lazySet(0x8000000000000001);
                ta.onNext(obj);
                ta.onComplete();
                break ;
             }else {
                this.c = obj;
                if (this.compareAndSet(0, Long.MIN_VALUE)) {
                   break ;
                }else {
                   this.c = null;
                }
             }
          }
       }
       return;
    }
    public final void onNext(Object p0){
       this.t = this.t + 1;
       this.a.onNext(p0);
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
