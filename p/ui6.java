package p.ui6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ir0;
import java.lang.Object;
import java.lang.Throwable;
import p.cd1;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class ui6 implements SingleObserver, Disposable	// class@0028b9 from classes.dex
{
    public final SingleObserver a;
    public final ir0 b;
    public Disposable c;

    public void ui6(SingleObserver p0,ir0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       this.a.onSuccess(p0);
       this.b.accept(p0);
       return;
    }
}
