package p.aj6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ir0;
import p.b5;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;
import p.jl1;

public final class aj6 implements SingleObserver, Disposable	// class@000f96 from classes.dex
{
    public final SingleObserver a;
    public final ir0 b;
    public final b5 c;
    public Disposable t;

    public void aj6(SingleObserver p0,ir0 p1,b5 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void dispose(){
       this.c.run();
       this.t.dispose();
       this.t = cd1.a;
       return;
    }
    public boolean isDisposed(){
       return this.t.isDisposed();
    }
    public final void onError(Throwable p0){
       cd1 a = cd1.a;
       if (this.t != a) {
          this.t = a;
          this.a.onError(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       aj6 ta = this.a;
       this.b.accept(p0);
       if (cd1.g(this.t, p0)) {
          this.t = p0;
          ta.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       cd1 a = cd1.a;
       if (this.t != a) {
          this.t = a;
          this.a.onSuccess(p0);
       }
       return;
    }
}
