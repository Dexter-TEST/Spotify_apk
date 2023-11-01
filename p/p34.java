package p.p34;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.MaybeObserver;
import java.lang.Object;
import p.cd1;
import java.lang.Throwable;

public final class p34 implements SingleObserver, Disposable	// class@0021e3 from classes.dex
{
    public final MaybeObserver a;
    public Disposable b;

    public void p34(MaybeObserver p0){
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
    public final void onSuccess(Object p0){
       this.b = cd1.a;
       this.a.onSuccess(p0);
    }
}
