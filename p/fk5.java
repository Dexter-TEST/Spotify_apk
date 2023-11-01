package p.fk5;
import p.qg2;
import p.bv;
import java.lang.Object;
import p.yj5;
import java.lang.Class;
import p.zq7;
import p.xt;
import p.ak5;
import p.tc1;
import p.lv1;
import java.lang.String;
import p.bk5;
import p.sc1;
import p.vj5;
import p.w87;
import p.u73;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.co5;
import p.dk5;
import p.te5;
import p.rc1;
import p.m73;
import p.uj5;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import p.xj5;
import p.ck5;
import p.zj5;
import java.util.EnumMap;
import java.util.Map;
import java.lang.Enum;
import p.k73;
import p.dt5;

public final class fk5 implements qg2	// class@0015e5 from classes.dex
{
    public final int a;
    public final bv b;

    public void fk5(bv p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       Object[] objArray;
       zj5 a;
       int i = 0;
       int i1 = 1;
       fk5 tb = this.b;
       switch (this.a){
           case 0:
             return xt.d(tb.a(new tc1()));
           case 1:
             return xt.d(tb.a(new sc1()));
           case 2:
             dk5 b = p0.b;
             if (te5.a(b)) {
                tb.getClass();
                p0 = new zq7(tb);
                p0.t = "Oops! You didn\'t enter a creative Id!";
                p0 = xt.d(p0.i());
             }else {
                objArray = new Object[i1];
                p0 = p0.a;
                objArray[i] = new uj5(p0, tb.c.get(p0), b, tb.a);
                p0 = new xt(tb.a(new rc1()), co5.B(vv7.p(objArray)));
             }
             return p0;
             break;
           case 3:
             objArray = new Object[i1];
             objArray[i] = new vj5(p0.a, p0.b);
             return new xt(tb.a(new sc1()), co5.B(vv7.p(objArray)));
           case 4:
             objArray = new Object[i1];
             objArray[i] = p0.a;
             zq7 ozq7 = new zq7(tb.a(new tc1()));
             ozq7.t = String.format("Error fetching creative id: %s", objArray);
             return xt.d(ozq7.i());
           case 5:
             tb.getClass();
             p0 = new zq7(tb);
             p0.t = null;
             return xt.d(p0.i());
           default:
             a = p0.a;
             bv c = tb.c;
             if (c.isEmpty()) {
                c = new EnumMap(TriggerType.class);
             }
             EnumMap uEnumMap = new EnumMap(c);
             uEnumMap.put(a, p0.b);
             p0 = new zq7(tb);
             k73 ok73 = m73.a();
             ok73.f(uEnumMap.entrySet());
             p0.c = ok73.b(i1);
             return xt.d(p0.i());
       }
    }
}
