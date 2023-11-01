package p.zm5;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.rxjava3.core.Observer;
import p.an5;

public final class zm5 extends AtomicBoolean implements Disposable	// class@002f27 from classes.dex
{
    public final Observer a;
    public final an5 b;

    public void zm5(Observer p0,an5 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       if (this.compareAndSet(false, true)) {
          this.b.a(this);
       }
       return;
    }
    public boolean isDisposed(){
       return this.get();
    }
}
