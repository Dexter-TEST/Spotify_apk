package p.nk6;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import java.util.concurrent.atomic.AtomicReference;
import p.mk6;
import java.lang.Object;
import p.mv6;
import java.util.concurrent.CancellationException;
import java.lang.Throwable;
import p.kv6;

public final class nk6 extends AtomicReference implements FlowableSubscriber	// class@001ff8 from classes.dex
{
    public final mk6 a;

    public void nk6(mk6 p0){
       super();
       this.a = p0;
    }
    public final void onComplete(){
       mv6 a = mv6.a;
       if (this.get() != a) {
          this.lazySet(a);
          this.a.a(new CancellationException());
       }
       return;
    }
    public final void onError(Throwable p0){
       this.a.a(p0);
    }
    public final void onNext(Object p0){
       if (mv6.b(this)) {
          this.a.a(new CancellationException());
       }
       return;
    }
    public final void onSubscribe(kv6 p0){
       if (mv6.e(this, p0)) {
          p0.a(Long.MAX_VALUE);
       }
       return;
    }
}
