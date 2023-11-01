package p.rj6;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.function.BiConsumer;
import io.reactivex.rxjava3.core.SingleObserver;
import p.c82;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.NullPointerException;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;

public final class rj6 implements Disposable, BiConsumer	// class@0024fe from classes.dex
{
    public final SingleObserver a;
    public final c82 b;

    public void rj6(SingleObserver p0,c82 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0,Object p1){
       if (p1 != null) {
          this.a.onError(p1);
       }else if(p0 != null){
          this.a.onSuccess(p0);
       }else {
          this.a.onError(new NullPointerException("The CompletionStage terminated with null."));
       }
       return;
    }
    public void dispose(){
       this.b.set(null);
    }
    public boolean isDisposed(){
       boolean b = (this.b.get() == null)? true: false;
       return b;
    }
}
