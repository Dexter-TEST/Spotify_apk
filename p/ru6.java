package p.ru6;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicInteger;
import p.iv6;
import p.rn;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.kg4;
import java.lang.Throwable;
import p.mv6;
import p.xe7;
import java.lang.Object;
import java.lang.IllegalStateException;

public final class ru6 extends AtomicInteger implements FlowableSubscriber, kv6	// class@002560 from classes.dex
{
    public final iv6 a;
    public final rn b;
    public final AtomicLong c;
    public final AtomicReference t;
    public final AtomicBoolean v;
    public boolean w;

    public void ru6(iv6 p0){
       super();
       this.a = p0;
       this.b = new rn();
       this.c = new AtomicLong();
       this.t = new AtomicReference();
       this.v = new AtomicBoolean();
    }
    public final void a(long p0){
       if ((p0) <= 0) {
          this.cancel();
          this.onError(new IllegalArgumentException(kg4.k("§3.9 violated: positive request amount required but it was ", p0)));
       }else {
          mv6.c(this.t, this.c, p0);
       }
       return;
    }
    public final void cancel(){
       if (this.w == null) {
          mv6.b(this.t);
       }
       return;
    }
    public final void onComplete(){
       this.w = true;
       ru6 ta = this.a;
       ru6 tb = this.b;
       if (!this.getAndIncrement()) {
          tb.e(ta);
       }
       return;
    }
    public final void onError(Throwable p0){
       this.w = true;
       xe7.M(this.a, p0, this, this.b);
    }
    public final void onNext(Object p0){
       xe7.O(this.a, p0, this, this.b);
    }
    public final void onSubscribe(kv6 p0){
       if (this.v.compareAndSet(false, true)) {
          this.a.onSubscribe(this);
          mv6.d(this.t, this.c, p0);
       }else {
          p0.cancel();
          this.cancel();
          this.onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
       }
       return;
    }
}
