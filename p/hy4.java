package p.hy4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.bi5;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.co5;
import p.cd1;

public final class hy4 implements Observer, Disposable	// class@0018e8 from classes.dex
{
    public final Observer a;
    public final bi5 b;
    public Disposable c;
    public boolean t;

    public void hy4(Observer p0,bi5 p1){
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
       if (this.t == null) {
          this.t = true;
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.t == null) {
          this.t = true;
          this.a.onError(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       if (this.t == null) {
          hy4 ta = this.a;
          ta.onNext(p0);
          if (this.b.test(p0)) {
             this.t = true;
             this.c.dispose();
             ta.onComplete();
          }
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
