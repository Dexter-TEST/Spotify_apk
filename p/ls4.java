package p.ls4;
import p.rh2;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import p.hs4;
import io.reactivex.rxjava3.core.SingleObserver;
import p.ks4;
import io.reactivex.rxjava3.core.Observer;

public final class ls4 extends Single implements rh2	// class@001db4 from classes.dex
{
    public final ObservableSource a;
    public final long b;
    public final Object c;

    public void ls4(ObservableSource p0,long p1,Object p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Observable a(){
       hs4 v6 = new hs4(this.a, this.b, this.c, true);
       return v6;
    }
    public final void subscribeActual(SingleObserver p0){
       this.a.subscribe(new ks4(p0, this.b, this.c));
    }
}
