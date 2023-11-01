package p.bd5;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.mp;
import p.zg0;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.fd5;
import p.yf2;

public final class bd5 implements ObservableTransformer	// class@0010a3 from classes.dex
{
    public final int a;
    public final mp b;
    public final zg0 c;

    public void bd5(mp p0,zg0 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final ObservableSource apply(Observable p0){
       bd5 tc = this.c;
       bd5 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return p0.flatMap(new fd5(tb, tc, 1));
       }
       return p0.switchMap(new fd5(tb, tc, 0));
    }
}
