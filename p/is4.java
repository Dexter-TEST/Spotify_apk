package p.is4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.MaybeObserver;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;

public final class is4 implements Observer, Disposable	// class@0019f6 from classes.dex
{
    public final MaybeObserver a;
    public final long b;
    public Disposable c;
    public long t;
    public boolean v;

    public void is4(MaybeObserver p0,long p1){
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
       if (this.v == null) {
          this.v = true;
          this.a.onComplete();
       }
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
       is4 tt = this.t;
       if (!(tt - this.b)) {
          this.v = true;
          this.c.dispose();
          this.a.onSuccess(p0);
          return;
       }else {
          this.t = tt + 1;
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
