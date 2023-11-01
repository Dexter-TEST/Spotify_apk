package p.uj6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.lang.Throwable;
import p.cd1;

public final class uj6 implements SingleObserver, Disposable	// class@0028c2 from classes.dex
{
    public final SingleObserver a;
    public Disposable b;

    public void uj6(SingleObserver p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.b.dispose();
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public final void onError(Throwable p0){
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
       this.a.onSuccess(p0);
    }
}
