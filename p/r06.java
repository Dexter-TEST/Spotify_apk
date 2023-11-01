package p.r06;
import p.xo0;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.lang.Object;
import p.hr0;
import p.ap0;
import p.gn7;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.in7;

public final class r06 implements xo0	// class@002450 from classes.dex
{
    public final Observable a;
    public final ObservableEmitter b;

    public void r06(Observable p0,ObservableEmitter p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final ap0 d(hr0 p0){
       return new in7(this.b, 1, this.a.subscribe(new gn7(p0, 1)));
    }
}
