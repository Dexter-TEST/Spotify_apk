package p.wz3;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Looper;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.jg1;
import java.lang.Runnable;

public abstract class wz3 implements Disposable	// class@002bd7 from classes.dex
{
    public final AtomicBoolean a;

    public void wz3(){
       super();
       this.a = new AtomicBoolean();
    }
    public final void dispose(){
       if (this.a.compareAndSet(false, true)) {
          if (Looper.myLooper() == Looper.getMainLooper()) {
             this.f();
          }else {
             id.a().c(new jg1(9, this));
          }
       }
       return;
    }
    public abstract void f();
    public final boolean isDisposed(){
       return this.a.get();
    }
}
