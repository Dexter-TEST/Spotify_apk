package p.z34;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import p.cd1;
import java.lang.Object;
import p.ay5;
import java.lang.Throwable;

public final class z34 extends AtomicReference implements MaybeObserver, Disposable	// class@002e7d from classes.dex
{
    public final SingleObserver a;
    public final SingleSource b;

    public void z34(SingleObserver p0,SingleSource p1){
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
       Disposable uDisposable;
       if ((uDisposable = this.get()) != cd1.a && this.compareAndSet(uDisposable, null)) {
          this.b.subscribe(new ay5(this.a, this));
       }
       return;
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
    public final void onSuccess(Object p0){
       this.a.onSuccess(p0);
    }
}
