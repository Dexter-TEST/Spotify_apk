package p.ss4;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.ts4;
import p.cd1;
import java.lang.Object;
import p.fn0;
import java.lang.Throwable;

public final class ss4 extends AtomicReference implements CompletableObserver, Disposable	// class@00268e from classes.dex
{
    public final ts4 a;

    public void ss4(ts4 p0){
       this.a = p0;
       super();
    }
    public void dispose(){
       cd1.a(this);
    }
    public boolean isDisposed(){
       return cd1.b(this.get());
    }
    public final void onComplete(){
       ss4 ta = this.a;
       ta.v.b(this);
       ta.onComplete();
    }
    public final void onError(Throwable p0){
       ss4 ta = this.a;
       ta.v.b(this);
       ta.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       cd1.e(this, p0);
    }
}
