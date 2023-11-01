package p.ru4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.SingleObserver;
import java.lang.Object;
import p.cd1;
import java.util.NoSuchElementException;
import java.lang.Throwable;

public final class ru4 implements Observer, Disposable	// class@00255e from classes.dex
{
    public final SingleObserver a;
    public final Object b;
    public Disposable c;
    public Object t;

    public void ru4(SingleObserver p0,Object p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       this.c.dispose();
       this.c = cd1.a;
    }
    public boolean isDisposed(){
       boolean b = (this.c == cd1.a)? true: false;
       return b;
    }
    public final void onComplete(){
       this.c = cd1.a;
       ru4 tt = this.t;
       ru4 ta = this.a;
       if (tt != null) {
          this.t = null;
          ta.onSuccess(tt);
       }else if((tt = this.b) != null){
          ta.onSuccess(tt);
       }else {
          ta.onError(new NoSuchElementException());
       }
       return;
    }
    public final void onError(Throwable p0){
       this.c = cd1.a;
       this.t = null;
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.t = p0;
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
