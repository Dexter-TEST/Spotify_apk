package p.lt4;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import p.kv6;
import p.mv6;
import java.lang.Throwable;

public final class lt4 implements FlowableSubscriber, Disposable	// class@001dbd from classes.dex
{
    public final Observer a;
    public kv6 b;

    public void lt4(Observer p0){
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
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
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
