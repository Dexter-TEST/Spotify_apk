package p.dv4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.bi5;
import java.lang.Object;
import java.lang.Throwable;
import p.co5;
import p.hn0;
import p.cd1;

public final class dv4 implements Observer, Disposable	// class@0013c4 from classes.dex
{
    public final Observer a;
    public final bi5 b;
    public Disposable c;

    public void dv4(Observer p0,bi5 p1){
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
       dv4 ta = this.a;
       if (this.b.test(p0)) {
          ta.onComplete();
       }else {
          ta.onError(p0);
       }
       return;
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
