package p.ei6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.rxjava3.core.SingleObserver;
import p.fi6;

public final class ei6 extends AtomicBoolean implements Disposable	// class@001494 from classes.dex
{
    public final SingleObserver a;
    public final fi6 b;

    public void ei6(SingleObserver p0,fi6 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       if (this.compareAndSet(false, true)) {
          this.b.c(this);
       }
       return;
    }
    public boolean isDisposed(){
       return this.get();
    }
}
