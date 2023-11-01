package p.ox4;
import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.disposables.Disposable;

public abstract class ox4 extends CompletableFuture implements Observer	// class@0021ac from classes.dex
{
    public final AtomicReference a;
    public Object b;

    public void ox4(){
       super();
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
    public final void onError(Throwable p0){
       this.b = null;
       this.a.lazySet(cd1.a);
       if (!this.completeExceptionally(p0)) {
          RxJavaPlugins.c(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.a, p0);
    }
}
