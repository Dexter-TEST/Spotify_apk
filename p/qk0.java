package p.qk0;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cd1;

public final class qk0 implements CompletableObserver, Disposable, Runnable	// class@0023b8 from classes.dex
{
    public final CompletableObserver a;
    public final Scheduler b;
    public Disposable c;
    public boolean t;

    public void qk0(CompletableObserver p0,Scheduler p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.t = true;
       this.b.c(this);
    }
    public boolean isDisposed(){
       return this.t;
    }
    public final void onComplete(){
       if (this.t != null) {
          return;
       }
       this.a.onComplete();
       return;
    }
    public final void onError(Throwable p0){
       if (this.t != null) {
          RxJavaPlugins.c(p0);
          return;
       }else {
          this.a.onError(p0);
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
    public final void run(){
       this.c.dispose();
       this.c = cd1.a;
    }
}
