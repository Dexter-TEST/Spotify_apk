package p.r92;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import p.mv6;
import p.s92;
import p.iv6;
import java.lang.Throwable;
import java.lang.Object;
import p.bn5;

public final class r92 extends AtomicInteger implements FlowableSubscriber, kv6	// class@00249f from classes.dex
{
    public final bn5 a;
    public final AtomicReference b;
    public final AtomicLong c;
    public q92 t;

    public void r92(Flowable p0){
       super();
       this.a = p0;
       this.b = new AtomicReference();
       this.c = new AtomicLong();
    }
    public final void a(long p0){
       mv6.c(this.b, this.c, p0);
    }
    public final void cancel(){
       mv6.b(this.b);
    }
    public final void onComplete(){
       this.t.cancel();
       this.t.z.onComplete();
    }
    public final void onError(Throwable p0){
       this.t.cancel();
       this.t.z.onError(p0);
    }
    public final void onNext(Object p0){
       if (!this.getAndIncrement()) {
          while (true) {
             if (this.b.get() == mv6.a) {
                return;
             }
             this.a.subscribe(this.t);
             if (this.decrementAndGet()) {
             }
          }
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       mv6.d(this.b, this.c, p0);
    }
}
