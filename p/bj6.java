package p.bj6;
import io.reactivex.rxjava3.core.SingleObserver;
import p.ir0;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.disposables.Disposable;
import p.co5;
import p.jl1;

public final class bj6 implements SingleObserver	// class@0010d9 from classes.dex
{
    public final SingleObserver a;
    public final ir0 b;
    public boolean c;

    public void bj6(SingleObserver p0,ir0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onError(Throwable p0){
       if (this.c != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.a.onError(p0);
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       this.b.accept(p0);
       this.a.onSubscribe(p0);
    }
    public final void onSuccess(Object p0){
       if (this.c != null) {
          return;
       }
       this.a.onSuccess(p0);
       return;
    }
}
