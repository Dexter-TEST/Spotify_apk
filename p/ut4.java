package p.ut4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.tt4;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;

public final class ut4 extends AtomicReference implements Observer, Disposable	// class@002919 from classes.dex
{
    public final tt4 a;
    public final boolean b;
    public final int c;

    public void ut4(tt4 p0,boolean p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       this.a.d(this.b, this);
    }
    public final void onError(Throwable p0){
       this.a.a(p0);
    }
    public final void onNext(Object p0){
       if (cd1.a(this)) {
          this.a.d(this.b, this);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
}
