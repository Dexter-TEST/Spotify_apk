package p.z33;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.vs3;
import p.ir0;
import p.ha5;
import p.b5;
import java.util.List;
import java.util.Collections;
import p.ew0;
import p.bm;
import p.w00;
import p.gr7;
import p.y00;

public final class z33 implements ObservableTransformer	// class@002e7c from classes.dex
{
    public final int a;
    public final Object b;

    public void z33(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final ObservableSource apply(Observable p0){
       switch (this.a){
           case 0:
           default:
             return Observable.combineLatest(p0, this.b.e().distinctUntilChanged().startWithItem(Collections.emptyList()), new bm(7)).distinctUntilChanged(new gr7(27));
       }
       return p0.doOnNext(new vs3(3, this)).doFinally(new ha5(1, this));
    }
}
