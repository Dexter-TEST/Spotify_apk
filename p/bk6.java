package p.bk6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.yf2;
import java.lang.Object;
import p.cd1;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import p.zo4;
import p.co5;

public final class bk6 implements SingleObserver, Disposable	// class@0010e2 from classes.dex
{
    public final MaybeObserver a;
    public final yf2 b;
    public Disposable c;

    public void bk6(MaybeObserver p0,yf2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       bk6 tc = this.c;
       this.c = cd1.a;
       tc.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
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
       bk6 ta = this.a;
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null item");
       if (zo4.A(p0)) {
          ta.onSuccess(zo4.i(p0));
       }else {
          ta.onComplete();
       }
       return;
    }
}
