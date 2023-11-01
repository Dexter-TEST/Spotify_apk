package p.ev3;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.gv3;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.fv3;
import p.yf2;

public final class ev3 implements ObservableTransformer	// class@001505 from classes.dex
{
    public final int a;
    public final gv3 b;

    public void ev3(gv3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       ev3 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return p0.switchMapMaybe(new fv3(tb, 0));
       }
       return p0.flatMap(new fv3(tb, 1));
    }
}
