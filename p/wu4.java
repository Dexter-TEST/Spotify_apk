package p.wu4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p.s82;
import p.rn;
import p.cd1;
import java.lang.Object;
import p.xe7;
import java.lang.Throwable;

public final class wu4 extends AtomicInteger implements Observer, Disposable	// class@002bab from classes.dex
{
    public final Observer a;
    public final AtomicReference b;
    public final s82 c;
    public final rn t;
    public boolean v;
    public boolean w;

    public void wu4(Observer p0){
       super();
       this.a = p0;
       this.b = new AtomicReference();
       this.c = new s82(this, 2);
       this.t = new rn();
    }
    public void dispose(){
       cd1.a(this.b);
       cd1.a(this.c);
       this.t.b();
    }
    public boolean isDisposed(){
       return cd1.b(this.b.get());
    }
    public final void onComplete(){
       this.v = true;
       if (this.w != null) {
          xe7.K(this.a, this, this.t);
       }
       return;
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
