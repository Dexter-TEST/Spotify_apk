package p.b34;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import p.bi5;
import java.lang.Object;
import p.cd1;
import java.lang.Throwable;
import p.co5;

public final class b34 implements MaybeObserver, Disposable	// class@001047 from classes.dex
{
    public final MaybeObserver a;
    public final bi5 b;
    public Disposable c;

    public void b34(MaybeObserver p0,bi5 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       b34 tc = this.c;
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
       b34 ta = this.a;
       if (this.b.test(p0)) {
          ta.onSuccess(p0);
       }else {
          ta.onComplete();
       }
       return;
    }
}
