package p.f34;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.yf2;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import p.co5;

public final class f34 extends AtomicReference implements Observer, MaybeObserver, Disposable	// class@00154f from classes.dex
{
    public final Observer a;
    public final yf2 b;

    public void f34(Observer p0,yf2 p1){
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
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onNext(Object p0){
       this.a.onNext(p0);
    }
    public final void onSubscribe(Disposable p0){
       cd1.c(this, p0);
    }
    public final void onSuccess(Object p0){
       p0 = this.b.apply(p0);
       Objects.requireNonNull(p0, "The mapper returned a null Publisher");
       if (!this.isDisposed()) {
          p0.subscribe(this);
       }
       return;
    }
}
