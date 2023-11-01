package p.h82;
import io.reactivex.rxjava3.core.Observer;
import p.kv6;
import p.iv6;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Throwable;

public final class h82 implements Observer, kv6	// class@0017fd from classes.dex
{
    public final iv6 a;
    public Disposable b;

    public void h82(iv6 p0){
       super();
       this.a = p0;
    }
    public final void a(long p0){
    }
    public final void cancel(){
       this.b.dispose();
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
       this.b = p0;
       this.a.onSubscribe(this);
    }
}
