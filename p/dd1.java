package p.dd1;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ir0;
import p.b5;
import java.lang.Object;
import p.cd1;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.jl1;

public final class dd1 implements Observer, Disposable	// class@001324 from classes.dex
{
    public final Observer a;
    public final ir0 b;
    public final b5 c;
    public Disposable t;

    public void dd1(Observer p0,ir0 p1,b5 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void dispose(){
       dd1 tt = this.t;
       cd1 a = cd1.a;
       if (tt != a) {
          this.t = a;
          this.c.run();
          tt.dispose();
       }
       return;
    }
    public boolean isDisposed(){
       return this.t.isDisposed();
    }
    public final void onComplete(){
       cd1 a = cd1.a;
       if (this.t != a) {
          this.t = a;
          this.a.onComplete();
       }
       return;
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
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       dd1 ta = this.a;
       this.b.accept(p0);
       if (cd1.g(this.t, p0)) {
          this.t = p0;
          ta.onSubscribe(this);
       }
       return;
    }
}
