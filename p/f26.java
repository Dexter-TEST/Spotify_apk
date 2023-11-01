package p.f26;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.co5;
import p.hn0;
import io.reactivex.rxjava3.disposables.Disposable;

public final class f26 implements SingleObserver	// class@001547 from classes.dex
{
    public final SingleObserver a;
    public boolean b;

    public void f26(SingleObserver p0){
       super();
       this.a = p0;
    }
    public final void onError(Throwable p0){
       if (this.b != null) {
          RxJavaPlugins.c(p0);
       }else {
          this.a.onError(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       this.a.onSubscribe(p0);
       return;
    }
    public final void onSuccess(Object p0){
       if (this.b == null) {
          this.a.onSuccess(p0);
       }
       return;
    }
}
