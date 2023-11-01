package p.wy4;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.Observer;
import p.cd1;
import java.lang.Object;
import java.lang.Long;
import p.jl1;

public final class wy4 extends AtomicReference implements Disposable, Runnable	// class@002bcf from classes.dex
{
    public final Observer a;

    public void wy4(Observer p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == cd1.a)? true: false;
       return b;
    }
    public final void run(){
       if (!this.isDisposed()) {
          wy4 ta = this.a;
          ta.onNext(Long.valueOf(0));
          this.lazySet(jl1.a);
          ta.onComplete();
       }
       return;
    }
}
