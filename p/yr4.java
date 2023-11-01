package p.yr4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.yf2;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.core.Notification;
import p.yj4;
import java.lang.String;
import java.util.Objects;
import p.co5;
import p.cd1;

public final class yr4 implements Observer, Disposable	// class@002e12 from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public boolean c;
    public Disposable t;

    public void yr4(Observer p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.t.dispose();
    }
    public boolean isDisposed(){
       return this.t.isDisposed();
    }
    public final void onComplete(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       this.a.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       if (this.c != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.c = true;
          this.a.onError(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       Notification a;
       int i;
       if (this.c != null) {
          if (p0 instanceof Notification && p0.a instanceof yj4) {
             RxJavaPlugins.c(p0.b());
          }
          return;
       }else {
          p0 = this.b.apply(p0);
          Objects.requireNonNull(p0, "The selector returned a null Notification");
          a = p0.a;
          if (a instanceof yj4) {
             this.t.dispose();
             this.onError(p0.b());
          }else if(a == null){
             i = 1;
          }else {
             i = 0;
          }
          if (i) {
             this.t.dispose();
             this.onComplete();
          }else if(a != null && !a instanceof yj4){
             a = null;
          }
          this.a.onNext(a);
          return;
       }
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.t, p0)) {
          this.t = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
