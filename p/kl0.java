package p.kl0;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.nc0;
import java.lang.Object;
import p.fn0;
import java.lang.Throwable;
import io.reactivex.rxjava3.disposables.Disposable;

public final class kl0 implements CompletableObserver	// class@001c33 from classes.dex
{
    public final nc0 a;

    public void kl0(nc0 p0){
       this.a = p0;
       super();
    }
    public final void onComplete(){
       kl0 ta = this.a;
       ta.c.dispose();
       ta.t.onComplete();
    }
    public final void onError(Throwable p0){
       kl0 ta = this.a;
       ta.c.dispose();
       ta.t.onError(p0);
    }
    public final void onSubscribe(Disposable p0){
       this.a.c.c(p0);
    }
}
