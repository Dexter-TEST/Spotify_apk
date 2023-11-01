package p.lu4;
import p.c36;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import p.ww4;
import io.reactivex.rxjava3.disposables.Disposable;

public final class lu4 extends Observable implements c36	// class@001dc6 from classes.dex
{
    public final Object a;

    public void lu4(Object p0){
       super();
       this.a = p0;
    }
    public final Object get(){
       return this.a;
    }
    public final void subscribeActual(Observer p0){
       ww4 oww4 = new ww4(p0, this.a);
       p0.onSubscribe(oww4);
       oww4.run();
    }
}
