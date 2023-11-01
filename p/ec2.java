package p.ec2;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.bi5;
import p.ir0;
import p.b5;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.hn0;

public final class ec2 extends AtomicReference implements Observer, Disposable	// class@00145c from classes.dex
{
    public final bi5 a;
    public final ir0 b;
    public final b5 c;
    public boolean t;

    public void ec2(bi5 p0,ir0 p1,b5 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       if (this.t != null) {
          return;
       }
       this.t = true;
       this.c.run();
       return;
    }
    public final void onError(Throwable p0){
       if (this.t != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.t = true;
          this.b.accept(p0);
          return;
       }
    }
    public final void onNext(Object p0){
       if (this.t != null) {
          return;
       }
       if (!this.a.test(p0)) {
          this.dispose();
          this.onComplete();
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
}
