package p.k82;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.CompletableObserver;
import java.lang.Object;
import p.kv6;
import p.mv6;
import java.lang.Throwable;

public final class k82 implements FlowableSubscriber, Disposable	// class@001bc3 from classes.dex
{
    public final CompletableObserver a;
    public kv6 b;

    public void k82(CompletableObserver p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.b.cancel();
       this.b = mv6.a;
    }
    public boolean isDisposed(){
       boolean b = (this.b == mv6.a)? true: false;
       return b;
    }
    public final void onComplete(){
       this.b = mv6.a;
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.b = mv6.a;
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
}