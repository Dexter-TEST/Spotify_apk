package p.r34;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import p.yf2;
import java.lang.Object;
import p.cd1;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import p.co5;

public final class r34 implements MaybeObserver, Disposable	// class@00246b from classes.dex
{
    public final MaybeObserver a;
    public final yf2 b;
    public Disposable c;

    public void r34(MaybeObserver p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       r34 tc = this.c;
       this.c = cd1.a;
       tc.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final void onComplete(){
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null item");
       this.a.onSuccess(p0);
    }
}
