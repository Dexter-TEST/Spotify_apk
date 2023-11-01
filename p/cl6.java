package p.cl6;
import io.reactivex.rxjava3.core.SingleObserver;
import java.util.concurrent.atomic.AtomicReference;
import p.bl6;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import p.yf2;
import java.lang.String;
import java.util.Objects;
import p.co5;

public final class cl6 extends AtomicReference implements SingleObserver	// class@00122f from classes.dex
{
    public final bl6 a;
    public final int b;

    public void cl6(bl6 p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onError(Throwable p0){
       this.a.a(this.b, p0);
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
    public final void onSuccess(Object p0){
       bl6 t;
       cl6 ta = this.a;
       bl6 a = ta.a;
       if ((t = ta.t) != null) {
          t[this.b] = p0;
       }
       if (!ta.decrementAndGet()) {
          Object obj = ta.b.apply(t);
          Objects.requireNonNull(obj, "The zipper returned a null value");
          ta.t = null;
          a.onSuccess(obj);
       }
       return;
    }
}
