package p.ra6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import p.cd1;

public final class ra6 extends AtomicReference implements Disposable	// class@0024ad from classes.dex
{

    public void ra6(){
       super();
    }
    public void ra6(ra6 p0){
       super();
       this.lazySet(p0);
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
}
