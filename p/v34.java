package p.v34;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import p.yf2;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import p.co5;
import p.hn0;
import p.cd1;

public final class v34 implements MaybeObserver, Disposable	// class@002974 from classes.dex
{
    public final MaybeObserver a;
    public final yf2 b;
    public Disposable c;

    public void v34(MaybeObserver p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final void onComplete(){
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       Object obj = this.b.apply(p0);
       Objects.requireNonNull(obj, "The itemSupplier returned a null value");
       this.a.onSuccess(obj);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       this.a.onSuccess(p0);
    }
}
