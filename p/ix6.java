package p.ix6;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.cm7;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.kx6;
import p.yf2;

public final class ix6 implements ObservableTransformer	// class@001a24 from classes.dex
{
    public final int a;
    public final cm7 b;

    public void ix6(cm7 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       ix6 tb = this.b;
       switch (this.a){
           case 0:
             return p0.flatMap(new kx6(tb, 3));
           case 1:
             return p0.switchMapSingle(new kx6(tb, 2));
           case 2:
             return p0.switchMapSingle(new kx6(tb, 1));
           default:
             return p0.switchMapSingle(new kx6(tb, 0));
       }
    }
}
