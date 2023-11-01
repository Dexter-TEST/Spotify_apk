package p.o34;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.MaybeObserver;
import java.lang.Object;
import p.cd1;
import java.lang.Throwable;

public final class o34 implements CompletableObserver, Disposable	// class@0020a0 from classes.dex
{
    public final MaybeObserver a;
    public Disposable b;

    public void o34(MaybeObserver p0){
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
