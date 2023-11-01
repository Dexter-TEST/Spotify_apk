package p.k93;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observer;
import java.lang.String;
import p.co5;

public abstract class k93 extends Observable	// class@001bcc from classes.dex
{

    public void k93(){
       super();
    }
    public abstract Object a();
    public abstract void b(Observer p0);
    public final void subscribeActual(Observer p0){
       co5.q(p0, "observer");
       this.b(p0);
       p0.onNext(this.a());
    }
}
