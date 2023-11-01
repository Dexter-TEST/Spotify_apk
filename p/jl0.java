package p.jl0;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.core.CompletableSource;
import p.ra6;
import p.cd1;
import java.lang.Object;
import java.lang.Throwable;

public final class jl0 extends AtomicReference implements CompletableObserver, Disposable, Runnable	// class@001af8 from classes.dex
{
    public final CompletableObserver a;
    public final ra6 b;
    public final CompletableSource c;

    public void jl0(CompletableObserver p0,CompletableSource p1){
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
    public final void onComplete(){
       this.a.onComplete();
    }
    public final void onError(Throwable p0){
       this.a.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
    public final void run(){
       this.c.subscribe(this);
    }
}
