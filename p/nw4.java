package p.nw4;
import p.z1;
import io.reactivex.rxjava3.core.Observable;
import p.bi5;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import p.ra6;
import io.reactivex.rxjava3.disposables.Disposable;
import p.mw4;

public final class nw4 extends z1	// class@002061 from classes.dex
{
    public final bi5 b;
    public final long c;

    public void nw4(Observable p0,long p1,bi5 p2){
       super(p0);
       this.b = p2;
       this.c = p1;
    }
    public final void subscribeActual(Observer p0){
       ra6 ora6 = new ra6();
       p0.onSubscribe(ora6);
       mw4 v7 = new mw4(p0, this.c, this.b, ora6, this.a);
       v7.a();
    }
}
