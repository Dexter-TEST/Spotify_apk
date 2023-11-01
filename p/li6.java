package p.li6;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import p.cd1;
import java.lang.Object;
import p.ay5;
import java.lang.Throwable;

public final class li6 extends AtomicReference implements CompletableObserver, Disposable	// class@001d5f from classes.dex
{
    public final SingleObserver a;
    public final SingleSource b;

    public void li6(SingleObserver p0,SingleSource p1){
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
       this.b.subscribe(new ay5(this, this.a, 0));
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
