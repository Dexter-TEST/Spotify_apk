package p.jk6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.SingleObserver;
import p.kk6;
import java.lang.Object;

public final class jk6 extends AtomicReference implements Disposable	// class@001af5 from classes.dex
{
    public final SingleObserver a;

    public void jk6(SingleObserver p0,kk6 p1){
       super();
       this.a = p0;
       this.lazySet(p1);
    }
    public void dispose(){
       kk6 andSet;
       if ((andSet = this.getAndSet(null)) != null) {
          andSet.c(this);
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == null)? true: false;
       return b;
    }
}
