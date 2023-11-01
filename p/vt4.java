package p.vt4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.tt4;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;

public final class vt4 extends AtomicReference implements Observer, Disposable	// class@002a60 from classes.dex
{
    public final tt4 a;
    public final boolean b;

    public void vt4(tt4 p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       this.a.c(this);
    }
    public final void onError(Throwable p0){
       this.a.b(p0);
    }
    public final void onNext(Object p0){
       this.a.e(p0, this.b);
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
}
