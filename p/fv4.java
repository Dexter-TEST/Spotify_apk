package p.fv4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.yf2;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.NullPointerException;
import java.lang.String;
import p.co5;
import p.hn0;
import p.cd1;

public final class fv4 implements Observer, Disposable	// class@001646 from classes.dex
{
    public final Observer a;
    public final yf2 b;
    public Disposable c;

    public void fv4(Observer p0,yf2 p1){
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
       NullPointerException obj;
       fv4 ta = this.a;
       if ((obj = this.b.apply(p0)) == null) {
          obj = new NullPointerException("The supplied value is null");
          obj.initCause(p0);
          ta.onError(obj);
          return;
       }else {
          ta.onNext(obj);
          ta.onComplete();
          return;
       }
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.c, p0)) {
          this.c = p0;
          this.a.onSubscribe(this);
       }
       return;
    }
}
