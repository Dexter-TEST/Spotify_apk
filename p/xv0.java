package p.xv0;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.cw0;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.ow0;

public final class xv0 implements ObservableTransformer	// class@002cf2 from classes.dex
{
    public final int a;
    public final cw0 b;

    public void xv0(cw0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       xv0 tb = this.b;
       switch (this.a){
           case 0:
             return tb.r(p0);
           case 1:
             return tb.r(p0);
           case 2:
             return tb.r(p0);
           case 3:
             return tb.r(p0);
           case 4:
             return tb.r(p0);
           case 5:
             return tb.r(p0);
           case 6:
             return tb.r(p0);
           default:
             return tb.r(p0);
       }
    }
}
