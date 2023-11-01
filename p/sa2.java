package p.sa2;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicInteger;
import p.ra2;
import p.iv6;
import p.yf2;
import p.rn;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.vv7;
import java.lang.Object;
import p.cd1;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.core.SingleObserver;
import p.co5;
import p.mv6;

public final class sa2 extends AtomicInteger implements FlowableSubscriber, kv6	// class@0025ec from classes.dex
{
    public long A;
    public final iv6 a;
    public final yf2 b;
    public final boolean c;
    public final rn t;
    public final AtomicLong v;
    public final AtomicReference w;
    public kv6 x;
    public boolean y;
    public boolean z;
    public static final ra2 B;

    static {
       sa2.B = new ra2(null);
    }
    public void sa2(iv6 p0,yf2 p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = new rn();
       this.v = new AtomicLong();
       this.w = new AtomicReference();
    }
    public final void a(long p0){
       vv7.a(this.v, p0);
       this.d();
    }
    public final void b(){
       ra2 andSet;
       ra2 b = sa2.B;
       if ((andSet = this.w.getAndSet(b)) != null && andSet != b) {
          cd1.a(andSet);
       }
       return;
    }
    public final void cancel(){
       this.z = true;
       this.x.cancel();
       this.b();
       this.t.b();
    }
    public final void d(){
       ra2 ora2;
       if (this.getAndIncrement()) {
          return;
       }
       sa2 ta = this.a;
       sa2 tt = this.t;
       sa2 tw = this.w;
       sa2 tv = this.v;
       sa2 tA = this.A;
       int i = 1;
       while (true) {
          if (this.z != null) {
             return;
          }
          if (tt.get() != null && this.c == null) {
             tt.e(ta);
             return;
          }else {
             sa2 ty = this.y;
             int i1 = ((ora2 = tw.get()) == null)? 1: 0;
             if (ty != null && i1) {
                tt.e(ta);
                return;
             }else if(!i1 && (ora2.b != null && (tA - tv.get()))){
                do {
                } while (tw.compareAndSet(ora2, null) || tw.get() != ora2);
                ta.onNext(ora2.b);
                tA = tA + 1;
             }else {
                this.A = tA;
                if (!(i = - i)) {
                   break ;
                }
             }
          }
       }
       return;
    }
    public final void onComplete(){
       this.y = true;
       this.d();
    }
    public final void onError(Throwable p0){
       if (this.t.a(p0)) {
          if (this.c == null) {
             this.b();
          }
          this.y = true;
          this.d();
       }
       return;
    }
    public final void onNext(Object p0){
       ra2 ora2;
       ra2 ora21;
       ra2 b = sa2.B;
       sa2 tw = this.w;
       if ((ora2 = tw.get()) != null) {
          cd1.a(ora2);
       }
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null SingleSource");
       ora2 = new ra2(this);
       while ((ora21 = tw.get()) != b) {
          while (true) {
             if (tw.compareAndSet(ora21, ora2)) {
                ora21 = 1;
             }else {
                if (tw.get() != ora21) {
                   ora21 = 0;
                }
             }
             if (ora21) {
                p0.subscribe(ora2);
                break ;
             }else {
                continue ;
             }
          }
          return;
       }
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.x, p0)) {
          this.x = p0;
          this.a.onSubscribe(this);
          p0.a(Long.MAX_VALUE);
       }
       return;
    }
}
