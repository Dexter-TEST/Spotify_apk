package p.cq4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import p.u00;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.co5;
import p.cd1;

public final class cq4 implements Observer, Disposable	// class@00125a from classes.dex
{
    public final Observer a;
    public final u00 b;
    public final Object c;
    public Disposable t;
    public boolean v;

    public void cq4(Observer p0,Object p1,u00 p2){
       super();
       this.a = p0;
       this.b = p2;
       this.c = p1;
    }
    public void dispose(){
       this.t.dispose();
    }
    public boolean isDisposed(){
       return this.t.isDisposed();
    }
    public final void onComplete(){
       if (this.v != null) {
          return;
       }
       this.v = true;
       cq4 ta = this.a;
       ta.onNext(this.c);
       ta.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       if (this.v != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.v = true;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.v != null) {
          return;
       }
       this.b.accept(this.c, p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.t, p0)) {
          this.t = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
