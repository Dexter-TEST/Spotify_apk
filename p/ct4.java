package p.ct4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import p.yf2;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.Iterator;
import p.k11;
import p.zo4;
import p.co5;
import p.cd1;

public final class ct4 extends AtomicInteger implements Observer, Disposable	// class@001273 from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public Disposable c;
    public boolean t;
    public boolean v;

    public void ct4(Observer p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.t = true;
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.t;
    }
    public final void onComplete(){
       if (this.v == null) {
          this.v = true;
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (this.v != null) {
          RxJavaPlugins.c(p0);
       }else {
          this.v = true;
          this.a.onError(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       if (this.v != null) {
          return;
       }
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null Stream");
       Iterator iterator = k11.p(p0);
       while (iterator.hasNext()) {
          if (this.t != null) {
             this.v = true;
             break ;
          }else {
             Object obj = iterator.next();
             Objects.requireNonNull(obj, "The Stream\'s Iterator.next returned a null value");
             if (this.t != null) {
                this.v = true;
                break ;
             }else {
                this.a.onNext(obj);
                if (this.t != null) {
                   this.v = true;
                   break ;
                }
             }
          }
       }
       zo4.x(p0);
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
