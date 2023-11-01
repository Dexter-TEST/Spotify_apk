package p.fj6;
import io.reactivex.rxjava3.core.SingleObserver;
import java.util.concurrent.atomic.AtomicReference;
import p.w00;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import p.co5;

public final class fj6 extends AtomicReference implements SingleObserver	// class@0015dd from classes.dex
{
    public final SingleObserver a;
    public final w00 b;
    public Object c;

    public void fj6(SingleObserver p0,w00 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
    public final void onSuccess(Object p0){
       fj6 tc = this.c;
       this.c = null;
       p0 = this.b.apply(tc, p0);
       Objects.requireNonNull(p0, "The resultSelector returned a null value");
       this.a.onSuccess(p0);
    }
}
