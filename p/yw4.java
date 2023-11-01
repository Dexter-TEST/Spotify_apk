package p.yw4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.w00;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.util.Objects;
import p.co5;
import p.cd1;

public final class yw4 implements Observer, Disposable	// class@002e3e from classes.dex
{
    public final Observer a;
    public final w00 b;
    public Object c;
    public Disposable t;
    public boolean v;

    public void yw4(Observer p0,w00 p1,Object p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
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
       this.a.onComplete();
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
       p0 = this.b.apply(this.c, p0);
       Objects.requireNonNull(p0, "The accumulator returned a null value");
       this.c = p0;
       this.a.onNext(p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.t, p0)) {
          this.t = p0;
          yw4 ta = this.a;
          ta.onSubscribe(this);
          ta.onNext(this.c);
       }
       return;
    }
}
