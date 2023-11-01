package p.n54;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.p54;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

public final class n54 implements ObservableTransformer	// class@001f6e from classes.dex
{
    public final int a;
    public final p54 b;

    public void n54(p54 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       n54 tb = this.b;
       switch (this.a){
           case 0:
             return p54.a(tb, p0);
           case 1:
             return tb.r(p0);
           case 2:
             return p54.a(tb, p0);
           case 3:
             return p54.a(tb, p0);
           default:
             return p54.a(tb, p0);
       }
    }
}
