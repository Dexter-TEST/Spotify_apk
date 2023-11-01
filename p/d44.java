package p.d44;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Object;
import p.cd1;
import java.util.NoSuchElementException;
import java.lang.String;
import java.lang.Throwable;

public final class d44 implements MaybeObserver, Disposable	// class@0012d7 from classes.dex
{
    public final SingleObserver a;
    public final Object b;
    public Disposable c;

    public void d44(SingleObserver p0,Object p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
       this.c = cd1.a;
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public final void onComplete(){
       d44 tb;
       this.c = cd1.a;
       d44 ta = this.a;
       if ((tb = this.b) != null) {
          ta.onSuccess(tb);
       }else {
          ta.onError(new NoSuchElementException("The MaybeSource is empty"));
       }
       return;
    }
    public final void onError(Throwable p0){
       this.c = cd1.a;
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
       this.c = cd1.a;
       this.a.onSuccess(p0);
    }
}
