package p.qq4;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import p.yf2;
import p.ro1;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.io2;
import p.pq4;
import io.reactivex.rxjava3.core.Observer;

public final class qq4 extends Completable	// class@0023f5 from classes.dex
{
    public final Observable a;
    public final yf2 b;
    public final ro1 c;
    public final int t;

    public void qq4(Observable p0,yf2 p1,ro1 p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final void o(CompletableObserver p0){
       qq4 ta = this.a;
       qq4 tb = this.b;
       if (!io2.y(ta, tb, p0)) {
          ta.subscribe(new pq4(p0, tb, this.c, this.t));
       }
       return;
    }
}
