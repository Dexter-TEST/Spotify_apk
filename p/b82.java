package p.b82;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.n0;
import p.iv6;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import java.lang.Throwable;
import p.kv6;

public final class b82 extends n0 implements CompletableObserver	// class@001072 from classes.dex
{
    public final iv6 a;
    public Disposable b;

    public void b82(iv6 p0){
       super();
       this.a = p0;
    }
    public final void cancel(){
       this.b.dispose();
       this.b = cd1.a;
    }
    public final void onComplete(){
       this.b = cd1.a;
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.b = cd1.a;
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
