package p.dk6;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import p.jl1;
import io.reactivex.rxjava3.disposables.Disposable;

public final class dk6 extends Single	// class@001365 from classes.dex
{
    public static final dk6 a;

    static {
       dk6.a = new dk6();
    }
    public void dk6(){
       super();
    }
    public final void subscribeActual(SingleObserver p0){
       p0.onSubscribe(jl1.b);
    }
}
