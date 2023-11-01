package p.pi6;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.SingleSource;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import p.ay5;

public final class pi6 extends AtomicReference implements SingleObserver, Disposable	// class@00226c from classes.dex
{
    public final SingleObserver a;
    public final SingleSource b;

    public void pi6(SingleObserver p0,SingleSource p1){
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
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this, p0)) {
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       this.b.subscribe(new ay5(this, this.a, 0));
    }
}
