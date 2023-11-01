package p.av4;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import p.jl1;
import io.reactivex.rxjava3.disposables.Disposable;

public final class av4 extends Observable	// class@000ffd from classes.dex
{
    public static final av4 a;

    static {
       av4.a = new av4();
    }
    public void av4(){
       super();
    }
    public final void subscribeActual(Observer p0){
       p0.onSubscribe(jl1.b);
    }
}
