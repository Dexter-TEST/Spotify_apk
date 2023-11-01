package p.yy4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.SingleObserver;
import java.util.Collection;
import java.lang.Object;
import java.lang.Throwable;
import p.cd1;

public final class yy4 implements Observer, Disposable	// class@002e50 from classes.dex
{
    public final SingleObserver a;
    public Collection b;
    public Disposable c;

    public void yy4(SingleObserver p0,Collection p1){
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
       yy4 tb = this.b;
       this.b = null;
       this.a.onSuccess(tb);
    }
    public final void onError(Throwable p0){
       this.b = null;
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.b.add(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
