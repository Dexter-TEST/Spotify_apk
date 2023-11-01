package p.i94;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.sg2;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.k94;
import p.yf2;

public final class i94 implements ObservableTransformer	// class@00194c from classes.dex
{
    public final int a;
    public final sg2 b;

    public void i94(sg2 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       i94 tb = this.b;
       switch (this.a){
           case 0:
             return p0.switchMap(new k94(tb, 2));
           case 1:
             return p0.switchMap(new k94(tb, 0));
           default:
             return p0.switchMap(new k94(tb, 1));
       }
    }
}
