package p.ed5;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.mp;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.gd5;
import p.yf2;

public final class ed5 implements ObservableTransformer	// class@001466 from classes.dex
{
    public final int a;
    public final mp b;

    public void ed5(mp p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       ed5 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return p0.flatMapSingle(new gd5(tb, 1));
       }
       return p0.flatMap(new gd5(tb, 0));
    }
}
