package p.wl0;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.CompletableObserver;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import java.util.NoSuchElementException;
import java.lang.String;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.disposables.Disposable;

public final class wl0 extends CompletableFuture implements MaybeObserver, SingleObserver, CompletableObserver	// class@002b59 from classes.dex
{
    public final AtomicReference a;
    public final boolean b;
    public final Object c;

    public void wl0(){
       super();
       this.b = false;
       this.c = null;
       this.a = new AtomicReference();
    }
    public final boolean cancel(boolean p0){
       cd1.a(this.a);
       return super.cancel(p0);
    }
    public final boolean complete(Object p0){
       cd1.a(this.a);
       return super.complete(p0);
    }
    public final boolean completeExceptionally(Throwable p0){
       cd1.a(this.a);
       return super.completeExceptionally(p0);
    }
    public final void onComplete(){
       if (this.b != null) {
          this.complete(this.c);
       }else {
          this.completeExceptionally(new NoSuchElementException("The source was empty"));
       }
       return;
    }
    public final void onError(Throwable p0){
       this.a.lazySet(cd1.a);
       if (!this.completeExceptionally(p0)) {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.a, p0);
    }
    public final void onSuccess(Object p0){
       this.a.lazySet(cd1.a);
       this.complete(p0);
    }
}
