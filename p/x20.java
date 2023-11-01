package p.x20;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.util.concurrent.LinkedBlockingQueue;
import p.cd1;
import java.util.Queue;
import p.ak4;
import java.lang.Throwable;
import p.yj4;

public final class x20 extends AtomicReference implements Observer, Disposable	// class@002bf1 from classes.dex
{
    public final Queue a;
    public static final Object b;

    static {
       x20.b = new Object();
    }
    public void x20(LinkedBlockingQueue p0){
       super();
       this.a = p0;
    }
    public void dispose(){
       if (cd1.a(this)) {
          this.a.offer(x20.b);
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == cd1.a)? true: false;
       return b;
    }
    public final void onComplete(){
       this.a.offer(ak4.a);
    }
    public final void onError(Throwable p0){
       this.a.offer(new yj4(p0));
    }
    public final void onNext(Object p0){
       this.a.offer(p0);
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
}
