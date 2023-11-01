package p.rw1;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class rw1 extends AtomicBoolean implements Runnable, Disposable	// class@00256d from classes.dex
{
    public final Runnable a;

    public void rw1(Runnable p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.lazySet(true);
    }
    public boolean isDisposed(){
       return this.get();
    }
    public final void run(){
       if (this.get()) {
          return;
       }
       this.a.run();
       this.lazySet(true);
       return;
    }
}
