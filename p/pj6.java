package p.pj6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p.kv6;
import java.util.concurrent.atomic.AtomicLong;
import p.iv6;
import p.yf2;
import java.util.concurrent.atomic.AtomicReference;
import p.mv6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import p.bn5;
import p.co5;

public final class pj6 extends AtomicLong implements SingleObserver, FlowableSubscriber, kv6	// class@002275 from classes.dex
{
    public final iv6 a;
    public final yf2 b;
    public final AtomicReference c;
    public Disposable t;

    public void pj6(iv6 p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new AtomicReference();
    }
    public final void a(long p0){
       mv6.c(this.c, this, p0);
    }
    public final void cancel(){
       this.t.dispose();
       mv6.b(this.c);
    }
    public final void onComplete(){
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       this.t = p0;
       this.a.onSubscribe(this);
    }
    public final void onSubscribe(kv6 p0){
       mv6.d(this.c, this, p0);
    }
    public final void onSuccess(Object p0){
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "the mapper returned a null Publisher");
       if (this.c.get() != mv6.a) {
          p0.subscribe(this);
       }
       return;
    }
}
