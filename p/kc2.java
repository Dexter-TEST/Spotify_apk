package p.kc2;
import p.yf2;
import p.nc2;
import p.ba5;
import java.lang.Object;
import java.lang.Throwable;
import p.pv1;
import p.lf1;
import java.lang.String;
import java.lang.Boolean;
import io.reactivex.rxjava3.core.Single;
import p.jc2;
import java.util.concurrent.Callable;

public final class kc2 implements yf2	// class@001be7 from classes.dex
{
    public final int a;
    public final nc2 b;
    public final ba5 c;

    public void kc2(nc2 p0,ba5 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object apply(Object p0){
       kc2 tc = this.c;
       kc2 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return Single.fromCallable(new jc2(tb, p0, 0)).onErrorResumeNext(new kc2(tb, tc, 0));
       }
       tb.c.d(tc.a, pv1.x);
       return Single.just(Boolean.FALSE);
    }
}
