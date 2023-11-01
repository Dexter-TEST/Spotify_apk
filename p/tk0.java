package p.tk0;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.jl1;
import io.reactivex.rxjava3.disposables.Disposable;

public final class tk0 extends Completable	// class@002787 from classes.dex
{
    public static final tk0 a;

    static {
       tk0.a = new tk0();
    }
    public void tk0(){
       super();
    }
    public final void o(CompletableObserver p0){
       p0.onSubscribe(jl1.a);
       p0.onComplete();
    }
}
