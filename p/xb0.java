package p.xb0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.tb0;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public final class xb0 extends AtomicReference implements Disposable	// class@002c40 from classes.dex
{

    public void xb0(tb0 p0){
       super(p0);
    }
    public void dispose(){
       tb0 andSet;
       if (this.get() != null && (andSet = this.getAndSet(null)) != null) {
          andSet.cancel();
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == null)? true: false;
       return b;
    }
}
