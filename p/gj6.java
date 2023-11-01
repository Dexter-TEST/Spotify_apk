package p.gj6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import p.yf2;
import p.w00;
import java.lang.Object;
import p.fj6;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.SingleSource;
import p.co5;

public final class gj6 implements SingleObserver, Disposable	// class@00171f from classes.dex
{
    public final yf2 a;
    public final fj6 b;

    public void gj6(SingleObserver p0,yf2 p1,w00 p2){
       super();
       this.b = new fj6(p0, p2);
       this.a = p1;
    }
    public void dispose(){
       cd1.a(this.b);
    }
    public boolean isDisposed(){
       return cd1.b(this.b.get());
    }
    public final void onError(Throwable p0){
       this.b.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       gj6 tb = this.b;
       if (cd1.e(tb, p0)) {
          tb.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       gj6 tb = this.b;
       Object obj = this.a.apply(p0);
       Objects.requireNonNull(obj, "The mapper returned a null MaybeSource");
       if (cd1.c(tb, null)) {
          tb.c = p0;
          obj.subscribe(tb);
       }
       return;
    }
}
