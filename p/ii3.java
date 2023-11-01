package p.ii3;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.hi3;
import java.util.concurrent.atomic.AtomicReference;
import p.ir0;
import p.b5;
import p.mb;
import p.cd1;
import p.co5;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.hn0;

public final class ii3 extends AtomicReference implements Observer, Disposable, hi3	// class@00199c from classes.dex
{
    public final ir0 a;
    public final ir0 b;
    public final b5 c;
    public final ir0 t;

    public void ii3(ir0 p0,ir0 p1,b5 p2,mb p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public void dispose(){
       cd1.a(this);
    }
    public final boolean hasCustomOnError(){
       boolean b = (this.b != co5.i)? true: false;
       return b;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == cd1.a)? true: false;
       return b;
    }
    public final void onComplete(){
       if (!this.isDisposed()) {
          this.lazySet(cd1.a);
          this.c.run();
       }
       return;
    }
    public final void onError(Throwable p0){
       if (!this.isDisposed()) {
          this.lazySet(cd1.a);
          this.b.accept(p0);
       }else {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onNext(Object p0){
       if (!this.isDisposed()) {
          this.a.accept(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this, p0)) {
          this.t.accept(this);
       }
       return;
    }
}
