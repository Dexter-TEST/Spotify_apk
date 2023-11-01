package p.sn1;
import p.yf2;
import p.ew0;
import java.lang.Object;
import p.aq6;
import java.lang.Class;
import java.lang.Enum;
import p.ow0;
import java.lang.Boolean;
import io.reactivex.rxjava3.core.Observable;
import p.xl6;
import p.xv0;
import p.cw0;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.vg1;
import p.l94;
import p.vc5;

public final class sn1 implements yf2	// class@00265f from classes.dex
{
    public final int a;
    public final ew0 b;

    public void sn1(ew0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       ew0 a;
       sn1 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             a = tb.a;
             a.getClass();
             int i = p0.b.ordinal();
             ow0 a1 = a.A;
             if (i != 3) {
                if (i != 52) {
                   if (i != 64) {
                      if (i != 9 && i != 10) {
                         p0 = Observable.just(Boolean.FALSE);
                      }else {
                      label_005e :
                         p0 = a1.map(new xl6(16)).distinctUntilChanged().compose(new xv0(a, 5));
                      }
                   }else if(p0.c == null){
                      p0 = Observable.just(Boolean.FALSE);
                   }else {
                      p0 = a1.map(new xl6(16)).distinctUntilChanged().compose(new xv0(a, 5));
                   }
                }else {
                   p0 = Observable.just(Boolean.TRUE);
                }
             }else {
                goto label_005e ;
             }
             return p0;
             break;
           default:
             return tb.d(p0.F).map(new l94(0)).distinctUntilChanged().map(new l94(1)).onErrorReturn(new vc5(14, p0));
       }
       a = tb.a;
       return a.z(p0).compose(new xv0(a, 4));
    }
}
