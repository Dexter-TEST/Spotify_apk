package p.iy4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.bi5;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.co5;
import p.cd1;

public final class iy4 implements Observer, Disposable	// class@001a2b from classes.dex
{
    public final Observer a;
    public final bi5 b;
    public Disposable c;
    public boolean t;

    public void iy4(Observer p0,bi5 p1){
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
    public final void onComplete(){
       if (this.t != null) {
          return;
       }
       this.t = true;
       this.a.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       if (this.t != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.t = true;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.t != null) {
          return;
       }
       iy4 ta = this.a;
       if (!this.b.test(p0)) {
          this.t = true;
          this.c.dispose();
          ta.onComplete();
          return;
       }else {
          ta.onNext(p0);
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
