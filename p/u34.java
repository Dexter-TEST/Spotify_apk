package p.u34;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import p.bi5;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import p.hn0;
import p.cd1;

public final class u34 implements MaybeObserver, SingleObserver, Disposable	// class@002835 from classes.dex
{
    public final MaybeObserver a;
    public final bi5 b;
    public Disposable c;

    public void u34(MaybeObserver p0,bi5 p1){
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
       u34 ta = this.a;
       if (this.b.test(p0)) {
          ta.onComplete();
       }else {
          ta.onError(p0);
       }
       return;
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
