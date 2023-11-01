package p.et4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.yf2;
import java.lang.Object;
import p.cd1;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.String;
import java.util.Objects;
import p.co5;

public final class et4 implements Observer, Disposable	// class@0014f4 from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public Disposable c;

    public void et4(Observer p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
       this.c = cd1.a;
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final void onComplete(){
       cd1 a = cd1.a;
       if (this.c == a) {
          return;
       }
       this.c = a;
       this.a.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       cd1 a = cd1.a;
       if (this.c == a) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.c = a;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.c == cd1.a) {
          return;
       }
       p0 = this.b.apply(p0).iterator();
       while (p0.hasNext()) {
          Object obj = p0.next();
          Objects.requireNonNull(obj, "The iterator returned a null value");
          this.a.onNext(obj);
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
