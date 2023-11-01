package p.gy4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p.xv4;
import p.rn;
import p.cd1;
import java.lang.Object;
import p.xe7;
import java.lang.Throwable;

public final class gy4 extends AtomicInteger implements Observer, Disposable	// class@0017a3 from classes.dex
{
    public final Observer a;
    public final AtomicReference b;
    public final xv4 c;
    public final rn t;

    public void gy4(Observer p0){
       super();
       this.a = p0;
       this.b = new AtomicReference();
       this.c = new xv4(this, 2);
       this.t = new rn();
    }
    public void dispose(){
       cd1.a(this.b);
       cd1.a(this.c);
    }
    public boolean isDisposed(){
       return cd1.b(this.b.get());
    }
    public final void onComplete(){
       cd1.a(this.c);
       xe7.K(this.a, this, this.t);
    }
    public final void onError(Throwable p0){
       cd1.a(this.c);
       xe7.L(this.a, p0, this, this.t);
    }
    public final void onNext(Object p0){
       xe7.N(this.a, p0, this, this.t);
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.b, p0);
    }
}
