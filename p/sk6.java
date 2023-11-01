package p.sk6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.SingleObserver;
import p.cd1;
import java.lang.Object;
import java.lang.Long;

public final class sk6 extends AtomicReference implements Disposable, Runnable	// class@002649 from classes.dex
{
    public final SingleObserver a;

    public void sk6(SingleObserver p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void run(){
       this.a.onSuccess(Long.valueOf(0));
    }
}
