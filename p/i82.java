package p.i82;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.wn5;
import p.iv6;
import java.lang.Object;
import p.kv6;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.Throwable;
import p.mv6;

public final class i82 implements FlowableSubscriber, wn5	// class@001942 from classes.dex
{
    public final iv6 a;
    public kv6 b;

    public void i82(iv6 p0){
       super();
       this.a = p0;
    }
    public final void a(long p0){
    }
    public final int b(int p0){
       return (p0 & 0x02);
    }
    public final void cancel(){
       this.b.cancel();
    }
    public final void clear(){
    }
    public final boolean isEmpty(){
       return true;
    }
    public final boolean offer(Object p0){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public final void onComplete(){
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
          p0.a(Long.MAX_VALUE);
       }
       return;
    }
    public final Object poll(){
       return null;
    }
}
