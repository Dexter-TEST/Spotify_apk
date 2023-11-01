package p.cl0;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.jl1;
import io.reactivex.rxjava3.disposables.Disposable;

public final class cl0 extends Completable	// class@001229 from classes.dex
{
    public static final cl0 a;

    static {
       cl0.a = new cl0();
    }
    public void cl0(){
       super();
    }
    public final void o(CompletableObserver p0){
       p0.onSubscribe(jl1.b);
    }
}
