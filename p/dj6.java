package p.dj6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.yf2;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.SingleSource;
import p.ay5;
import p.co5;

public final class dj6 extends AtomicReference implements SingleObserver, Disposable	// class@00135c from classes.dex
{
    public final SingleObserver a;
    public final yf2 b;

    public void dj6(SingleObserver p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this, p0)) {
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       dj6 ta = this.a;
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The single returned by the mapper is null");
       if (!this.isDisposed()) {
          p0.subscribe(new ay5(this, ta, 2));
       }
       return;
    }
}
