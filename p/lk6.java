package p.lk6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.SingleSource;
import p.ra6;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;

public final class lk6 extends AtomicReference implements SingleObserver, Disposable, Runnable	// class@001d71 from classes.dex
{
    public final SingleObserver a;
    public final ra6 b;
    public final SingleSource c;

    public void lk6(SingleObserver p0,SingleSource p1){
       super();
       this.a = p0;
       this.c = p1;
       this.b = new ra6();
    }
    public void dispose(){
       cd1.a(this);
       this.b.dispose();
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
    public final void onSuccess(Object p0){
       this.a.onSuccess(p0);
    }
    public final void run(){
       this.c.subscribe(this);
    }
}
