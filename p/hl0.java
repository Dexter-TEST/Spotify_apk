package p.hl0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.il0;
import java.lang.Object;

public final class hl0 extends AtomicReference implements Disposable	// class@001871 from classes.dex
{
    public final CompletableObserver a;

    public void hl0(CompletableObserver p0,il0 p1){
       super();
       this.a = p0;
       this.lazySet(p1);
    }
    public void dispose(){
       il0 andSet;
       if ((andSet = this.getAndSet(null)) != null) {
          andSet.v(this);
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == null)? true: false;
       return b;
    }
}
