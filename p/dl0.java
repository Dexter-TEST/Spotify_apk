package p.dl0;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.Scheduler;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;

public final class dl0 extends AtomicReference implements CompletableObserver, Disposable, Runnable	// class@001368 from classes.dex
{
    public final CompletableObserver a;
    public final Scheduler b;
    public Throwable c;

    public void dl0(CompletableObserver p0,Scheduler p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       cd1.c(this, this.b.c(this));
    }
    public final void onError(Throwable p0){
       this.c = p0;
       cd1.c(this, this.b.c(this));
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this, p0)) {
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void run(){
       dl0 tc = this.c;
       dl0 ta = this.a;
       if (tc != null) {
          this.c = null;
          ta.onError(tc);
       }else {
          ta.onComplete();
       }
       return;
    }
}
