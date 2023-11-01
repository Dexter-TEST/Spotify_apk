package p.hv4;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.Observer;
import p.iv4;
import java.lang.Object;

public final class hv4 extends AtomicReference implements Disposable	// class@0018cd from classes.dex
{
    public final Observer a;

    public void hv4(Observer p0,iv4 p1){
       super();
       this.a = p0;
       this.lazySet(p1);
    }
    public void dispose(){
       iv4 andSet;
       if ((andSet = this.getAndSet(null)) != null) {
          andSet.a(this);
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == null)? true: false;
       return b;
    }
}
