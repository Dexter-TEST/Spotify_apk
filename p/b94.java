package p.b94;
import p.pg2;
import p.g56;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;
import p.dm3;
import p.em3;
import io.reactivex.rxjava3.core.Single;
import java.lang.String;
import p.pp;
import p.yf2;
import p.bm3;

public final class b94 implements pg2	// class@00107d from classes.dex
{
    public final g56 a;
    public final long b;

    public void b94(g56 p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object c(Object p0,Object p1,Object p2){
       if ((p0.longValue() - (long)p1.intValue()) < 0) {
          p0 = Single.just(em3.a());
       }else {
          p0 = this.b;
          String str = String.valueOf(p0);
          p0 = this.a.a(str, (p0 - p2.longValue())).map(new pp(20)).onErrorReturnItem(new bm3());
       }
       return p0;
    }
}
