package p.ms4;
import p.c36;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import p.jl1;
import io.reactivex.rxjava3.disposables.Disposable;

public final class ms4 extends Observable implements c36	// class@001ef7 from classes.dex
{
    public static final ms4 a;

    static {
       ms4.a = new ms4();
    }
    public void ms4(){
       super();
    }
    public final Object get(){
       return null;
    }
    public final void subscribeActual(Observer p0){
       p0.onSubscribe(jl1.a);
       p0.onComplete();
    }
}
