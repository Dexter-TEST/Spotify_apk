package p.eh6;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.mp;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ih6;
import p.yf2;

public final class eh6 implements ObservableTransformer	// class@00148b from classes.dex
{
    public final int a;
    public final mp b;

    public void eh6(mp p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       eh6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return p0.flatMap(new ih6(tb, 0));
       }
       return p0.flatMap(new ih6(tb, 1));
    }
}
