package p.qw1;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import p.ra6;
import p.cd1;
import java.lang.Throwable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class qw1 extends AtomicReference implements Runnable, Disposable	// class@002427 from classes.dex
{
    public final ra6 a;
    public final ra6 b;

    public void qw1(Runnable p0){
       super(p0);
       this.a = new ra6();
       this.b = new ra6();
    }
    public void dispose(){
       if (this.getAndSet(null) != null) {
          this.a.dispose();
          this.b.dispose();
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == null)? true: false;
       return b;
    }
    public final void run(){
       Runnable runnable;
       qw1 tb = this.b;
       qw1 ta = this.a;
       cd1 a = cd1.a;
       if ((runnable = this.get()) != null) {
          runnable.run();
          this.lazySet(null);
          ta.lazySet(a);
          tb.lazySet(a);
       }
       return;
    }
}
