package p.ch6;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.qf6;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.gh6;
import p.yf2;

public final class ch6 implements ObservableTransformer	// class@00120b from classes.dex
{
    public final int a;
    public final qf6 b;

    public void ch6(qf6 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       ch6 tb = this.b;
       switch (this.a){
           case 0:
             return p0.flatMap(new gh6(tb, 0));
           case 1:
             return p0.flatMap(new gh6(tb, 1));
           default:
             return p0.flatMap(new gh6(tb, 2));
       }
    }
}
