package p.n9;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.v9;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.l9;
import p.yf2;

public final class n9 implements ObservableTransformer	// class@001f96 from classes.dex
{
    public final int a;
    public final v9 b;

    public void n9(v9 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       n9 tb = this.b;
       switch (this.a){
           case 0:
             return p0.flatMap(new l9(tb, 1));
           case 1:
             return p0.flatMap(new l9(tb, 0));
           case 2:
             return p0.switchMap(new l9(tb, 2));
           default:
             return p0.flatMap(new l9(tb, 3));
       }
    }
}
