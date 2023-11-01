package p.jx6;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.fa4;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.lx6;
import p.yf2;

public final class jx6 implements ObservableTransformer	// class@001b65 from classes.dex
{
    public final int a;
    public final fa4 b;

    public void jx6(fa4 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       jx6 tb = this.b;
       switch (this.a){
           case 0:
             return p0.flatMapSingle(new lx6(tb, 0));
           case 1:
             return p0.flatMapSingle(new lx6(tb, 1));
           case 2:
             return p0.flatMapSingle(new lx6(tb, 2));
           case 3:
             return p0.flatMapSingle(new lx6(tb, 5));
           case 4:
             return p0.flatMap(new lx6(tb, 4));
           case 5:
             return p0.flatMapSingle(new lx6(tb, 3));
           default:
             return p0.flatMapSingle(new lx6(tb, 6));
       }
    }
}
