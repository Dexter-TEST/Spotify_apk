package p.wz4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Iterator;
import p.w00;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.String;
import java.util.Objects;
import p.co5;
import p.cd1;

public final class wz4 implements Observer, Disposable	// class@002bd8 from classes.dex
{
    public final Observer a;
    public final Iterator b;
    public final w00 c;
    public Disposable t;
    public boolean v;

    public void wz4(Observer p0,Iterator p1,w00 p2){
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
       wz4 ta = this.a;
       wz4 tb = this.b;
       if (this.v != null) {
          return;
       }
       Object obj = tb.next();
       Objects.requireNonNull(obj, "The iterator returned a null value");
       p0 = this.c.apply(p0, obj);
       Objects.requireNonNull(p0, "The zipper function returned a null value");
       ta.onNext(p0);
       if (!tb.hasNext()) {
          this.v = true;
          this.t.dispose();
          ta.onComplete();
       }
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
