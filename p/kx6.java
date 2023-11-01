package p.kx6;
import p.yf2;
import p.cm7;
import java.lang.Object;
import java.lang.String;
import io.reactivex.rxjava3.core.Single;
import p.fh1;
import p.aq6;
import io.reactivex.rxjava3.core.Observable;
import p.nx6;
import p.fx6;
import p.e16;
import p.ch1;
import p.uf;
import io.reactivex.rxjava3.core.SingleTransformer;
import p.pp;
import p.eh1;
import java.util.Map;
import java.util.Collections;
import p.yg1;

public final class kx6 implements yf2	// class@001ca1 from classes.dex
{
    public final int a;
    public final cm7 b;

    public void kx6(cm7 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       kx6 tb = this.b;
       switch (this.a){
           case 0:
             return tb.x(p0.D.t).compose(new uf()).map(new fx6(1)).map(new fx6(2)).onErrorReturn(new e16(21, p0));
           case 1:
             return tb.i(p0.D.t, Collections.emptyMap()).compose(new uf()).map(new fx6(3)).onErrorReturn(new e16(22, p0));
           case 2:
             return tb.l(p0.D.t).compose(new uf()).map(new pp(25)).onErrorReturn(new e16(17, p0));
           case 3:
             return nx6.a(tb, p0.D.t, 0).map(new fx6(7)).map(new fx6(8)).onErrorReturn(new e16(27, p0));
           case 4:
             return tb.k(p0);
           case 5:
             return tb.r(p0);
           case 6:
             return tb.f(p0);
           default:
             return tb.x(p0);
       }
    }
}
