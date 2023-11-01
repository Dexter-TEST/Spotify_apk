package p.vw4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ab6;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import p.wr4;

public abstract class vw4 extends AtomicReference implements Observer, Disposable	// class@002a7b from classes.dex
{
    public final Observer a;
    public final ObservableSource b;
    public final AtomicReference c;
    public Disposable t;

    public void vw4(ObservableSource p0,ab6 p1){
       super();
       this.c = new AtomicReference();
       this.a = p1;
       this.b = p0;
    }
    public abstract void a();
    public abstract void b();
    public void dispose(){
       cd1.a(this.c);
       this.t.dispose();
    }
    public boolean isDisposed(){
       boolean b = (this.c.get() == cd1.a)? true: false;
       return b;
    }
    public final void onComplete(){
       cd1.a(this.c);
       this.a();
    }
    public final void onError(Throwable p0){
       cd1.a(this.c);
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.lazySet(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.g(this.t, p0)) {
          this.t = p0;
          this.a.onSubscribe(this);
          if (this.c.get() == null) {
             this.b.subscribe(new wr4(this, 1));
          }
       }
       return;
    }
}
