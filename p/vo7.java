package p.vo7;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.xo7;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Class;
import p.wo7;
import p.yf2;
import io.reactivex.rxjava3.core.Completable;

public final class vo7 implements ObservableTransformer	// class@002a38 from classes.dex
{
    public final int a;
    public final xo7 b;

    public void vo7(xo7 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       vo7 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             return p0.flatMapSingle(new wo7(tb, 1));
           case 1:
             tb.getClass();
             return p0.flatMapSingle(new wo7(tb, 0));
           case 2:
             tb.getClass();
             return p0.flatMapSingle(new wo7(tb, 3));
           default:
             tb.getClass();
             return p0.flatMapCompletable(new wo7(tb, 2)).s();
       }
    }
}
