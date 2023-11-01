package p.q34;
import p.c36;
import io.reactivex.rxjava3.core.Maybe;
import java.lang.Object;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.jl1;
import io.reactivex.rxjava3.disposables.Disposable;

public final class q34 extends Maybe implements c36	// class@002324 from classes.dex
{
    public final Object a;

    public void q34(Object p0){
       super();
       this.a = p0;
    }
    public final void d(MaybeObserver p0){
       p0.onSubscribe(jl1.a);
       p0.onSuccess(this.a);
    }
    public final Object get(){
       return this.a;
    }
}
