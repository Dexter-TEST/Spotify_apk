package p.pu4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.MaybeObserver;
import java.lang.Object;
import p.cd1;
import java.lang.Throwable;

public final class pu4 implements Observer, Disposable	// class@0022d3 from classes.dex
{
    public final MaybeObserver a;
    public Disposable b;
    public Object c;

    public void pu4(MaybeObserver p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.b.dispose();
       this.b = cd1.a;
    }
    public boolean isDisposed(){
       boolean b = (this.b == cd1.a)? true: false;
       return b;
    }
    public final void onComplete(){
       this.b = cd1.a;
       pu4 tc = this.c;
       pu4 ta = this.a;
       if (tc != null) {
          this.c = null;
          ta.onSuccess(tc);
       }else {
          ta.onComplete();
       }
       return;
    }
    public final void onError(Throwable p0){
       this.b = cd1.a;
       this.c = null;
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.c = p0;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
