package p.pt4;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import p.qt4;
import io.reactivex.rxjava3.core.Observer;

public final class pt4 extends Observable	// class@0022ca from classes.dex
{
    public final Object a;
    public final qt4 b;

    public void pt4(Object p0,qt4 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void subscribeActual(Observer p0){
       this.b.subscribe(p0);
    }
}
