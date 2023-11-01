package p.wi6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import p.b5;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;

public final class wi6 implements SingleObserver, Disposable	// class@002b44 from classes.dex
{
    public final SingleObserver a;
    public final b5 b;
    public Disposable c;

    public void wi6(SingleObserver p0,b5 p1){
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
       this.b.run();
       return;
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
       this.b.run();
       return;
    }
}
