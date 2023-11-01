package p.c44;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.w81;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;
import java.lang.Object;

public final class c44 extends w81 implements MaybeObserver	// class@001194 from classes.dex
{
    public Disposable c;

    public void c44(Observer p0){
       super(p0);
    }
    public void dispose(){
       super.dispose();
       this.c.dispose();
    }
    public final void onComplete(){
       if ((this.get() & 0x36)) {
       }else {
          this.lazySet(2);
          this.a.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       if ((this.get() & 0x36)) {
          RxJavaPlugins.c(p0);
       }else {
          this.lazySet(2);
          this.a.onError(p0);
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
    public final void onSuccess(Object p0){
       this.a(p0);
    }
}
