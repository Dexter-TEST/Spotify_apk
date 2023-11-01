package p.y24;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import p.cd1;
import java.lang.Object;
import p.x24;
import java.lang.Throwable;

public final class y24 extends AtomicReference implements CompletableObserver, Disposable	// class@002d37 from classes.dex
{
    public final MaybeObserver a;
    public final MaybeSource b;

    public void y24(MaybeObserver p0,MaybeSource p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       this.b.subscribe(new x24(this, this.a, 0));
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this, p0)) {
          this.a.onSubscribe(this);
       }
       return;
    }
}
