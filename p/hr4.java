package p.hr4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Object;
import p.cd1;
import java.lang.Long;
import java.lang.Throwable;

public final class hr4 implements Observer, Disposable	// class@0018aa from classes.dex
{
    public final SingleObserver a;
    public Disposable b;
    public long c;

    public void hr4(SingleObserver p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.b.dispose();
       this.b = cd1.a;
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public final void onComplete(){
       this.b = cd1.a;
       this.a.onSuccess(Long.valueOf(this.c));
    }
    public final void onError(Throwable p0){
       this.b = cd1.a;
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.c = this.c + 1;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.b, p0)) {
          this.b = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
