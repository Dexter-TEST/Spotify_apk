package p.dy4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;
import java.lang.Throwable;
import p.cd1;

public final class dy4 implements Observer, Disposable	// class@0013df from classes.dex
{
    public final Observer a;
    public Disposable b;
    public Object c;

    public void dy4(Observer p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       this.c = null;
       this.b.dispose();
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
    }
    public final void onComplete(){
       dy4 tc = this.c;
       dy4 ta = this.a;
       if (tc != null) {
          this.c = null;
          ta.onNext(tc);
       }
       ta.onComplete();
       return;
    }
    public final void onError(Throwable p0){
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
