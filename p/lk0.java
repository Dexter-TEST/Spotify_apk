package p.lk0;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.CompletableSource;
import p.cd1;
import java.lang.Object;
import p.kk0;
import java.lang.Throwable;

public final class lk0 extends AtomicReference implements CompletableObserver, Disposable	// class@001d6b from classes.dex
{
    public final CompletableObserver a;
    public final CompletableSource b;

    public void lk0(CompletableObserver p0,CompletableSource p1){
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
       this.b.subscribe(new kk0(this, this.a, 0));
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
