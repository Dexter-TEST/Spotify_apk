package p.br4;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.MaybeSource;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;

public final class br4 extends AtomicReference implements Observer, MaybeObserver, Disposable	// class@00111e from classes.dex
{
    public final Observer a;
    public MaybeSource b;
    public boolean c;

    public void br4(Observer p0,MaybeSource p1){
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
       if (this.c != null) {
          this.a.onComplete();
       }else {
          this.c = true;
          cd1.c(this, null);
          br4 tb = this.b;
          this.b = null;
          tb.subscribe(this);
       }
       return;
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       if (cd1.e(this, p0) && this.c == null) {
          this.a.onSubscribe(this);
       }
       return;
    }
    public final void onSuccess(Object p0){
       br4 ta = this.a;
       ta.onNext(p0);
       ta.onComplete();
    }
}
