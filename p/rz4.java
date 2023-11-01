package p.rz4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.ab6;
import p.w00;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import p.co5;

public final class rz4 extends AtomicReference implements Observer, Disposable	// class@00258a from classes.dex
{
    public final Observer a;
    public final w00 b;
    public final AtomicReference c;
    public final AtomicReference t;

    public void rz4(ab6 p0,w00 p1){
       super();
       this.c = new AtomicReference();
       this.t = new AtomicReference();
       this.a = p0;
       this.b = p1;
    }
    public void dispose(){
       cd1.a(this.c);
       cd1.a(this.t);
    }
    public boolean isDisposed(){
       return cd1.b(this.c.get());
    }
    public final void onComplete(){
       cd1.a(this.t);
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       cd1.a(this.t);
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       Object obj;
       rz4 ta = this.a;
       if ((obj = this.get()) != null) {
          p0 = this.b.apply(p0, obj);
          Objects.requireNonNull(p0, "The combiner returned a null value");
          ta.onNext(p0);
       }
       return;
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this.c, p0);
    }
}
