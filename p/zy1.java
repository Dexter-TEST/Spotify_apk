package p.zy1;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.bz1;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Class;
import p.az1;
import p.yf2;

public final class zy1 implements ObservableTransformer	// class@002f8b from classes.dex
{
    public final int a;
    public final bz1 b;

    public void zy1(bz1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       zy1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             return p0.flatMap(new az1(tb, 1));
       }
       tb.getClass();
       return p0.flatMapSingle(new az1(tb, 0));
    }
}
