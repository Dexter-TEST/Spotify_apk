package p.ht4;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.n0;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import java.lang.Throwable;

public final class ht4 extends n0 implements CompletableObserver	// class@0018bb from classes.dex
{
    public final Observer a;
    public Disposable b;

    public void ht4(Observer p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.b.dispose();
       this.b = cd1.a;
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
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
