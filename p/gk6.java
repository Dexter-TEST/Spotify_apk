package p.gk6;
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
import p.hn0;

public final class gk6 extends AtomicReference implements SingleObserver, Disposable	// class@001728 from classes.dex
{
    public final SingleObserver a;
    public final yf2 b;

    public void gk6(SingleObserver p0,yf2 p1){
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
       Object obj = this.b.apply(p0);
       Objects.requireNonNull(obj, "The nextFunction returned a null SingleSource.");
       obj.subscribe(new ay5(this, this.a, 0));
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this, p0)) {
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       this.a.onSuccess(p0);
    }
}
