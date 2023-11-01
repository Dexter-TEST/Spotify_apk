package p.fc7;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import p.gc7;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;

public final class fc7 extends AtomicBoolean implements Disposable	// class@0015a2 from classes.dex
{
    public final Observer a;
    public final gc7 b;

    public void fc7(gc7 p0,Observer p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void dispose(){
       if (this.compareAndSet(false, true)) {
          gc7 w = this.b.w;
          do {
          } while (w.compareAndSet(this, null) || w.get() != this);
       }
       return;
    }
    public boolean isDisposed(){
       return this.get();
    }
}
