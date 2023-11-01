package p.a34;
import p.c36;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.jl1;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;

public final class a34 extends Maybe implements c36	// class@000f07 from classes.dex
{
    public static final a34 a;

    static {
       a34.a = new a34();
    }
    public void a34(){
       super();
    }
    public final void d(MaybeObserver p0){
       p0.onSubscribe(jl1.a);
       p0.onComplete();
    }
    public final Object get(){
       return null;
    }
}
