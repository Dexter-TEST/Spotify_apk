package p.tm;
import p.qg2;
import p.lr;
import java.lang.Object;
import p.u66;
import java.lang.Class;
import p.i77;
import java.lang.Boolean;
import p.xt;
import p.w66;
import p.n66;
import p.x56;
import java.lang.String;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.c66;
import p.mq5;
import p.y66;
import p.a66;
import p.h66;
import p.w56;
import p.f66;
import p.g66;
import p.q56;
import p.j66;
import p.a76;
import p.e66;
import p.co5;
import p.r66;

public final class tm implements qg2	// class@0027a1 from classes.dex
{
    public final int a;
    public final lr b;

    public void tm(lr p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       i77 oi77;
       Object[] objArray;
       Object[] objArray1;
       int i = 2;
       Object obj = null;
       tm tb = this.b;
       switch (this.a){
           case 0:
             if (p0.a.isEmpty()) {
                p0 = xt.d(tb.a(true));
             }else {
                p0 = p0.a;
                if (tb.b != null && p0.equals(tb.d)) {
                   p0 = xt.e();
                }else {
                   oi77 = new i77(tb);
                   oi77.a = Boolean.FALSE;
                   oi77.d = p0;
                   oi77.b = obj;
                   oi77.f = obj;
                   objArray = new Object[true];
                   objArray[0] = new e66(p0);
                   p0 = new xt(oi77.g(), co5.B(vv7.p(objArray)));
                }
             }
             return p0;
             break;
           case 1:
             return xt.d(tb.a(0));
           case 2:
             objArray1 = new Object[true];
             objArray1[0] = new q56(tb.c, p0.a);
             return xt.a(vv7.p(objArray1));
           case 3:
             objArray1 = new Object[i];
             objArray1[0] = new w56(tb.c, p0.a);
             objArray1[1] = new f66(p0.b);
             return xt.a(vv7.p(objArray1));
           case 4:
             objArray1 = new Object[true];
             objArray1[0] = new a66(tb.c, p0.a);
             return xt.a(vv7.p(objArray1));
           case 5:
             n66 b = p0.b;
             p0 = p0.a;
             if (b == null) {
                objArray1 = new Object[true];
                objArray1[0] = new x56(tb.c, p0);
                p0 = xt.a(vv7.p(objArray1));
             }else {
                objArray = new Object[i];
                objArray[0] = new x56(tb.c, p0);
                objArray[1] = new c66(b);
                p0 = xt.a(vv7.p(objArray));
             }
             return p0;
             break;
           case 6:
             tb.getClass();
             oi77 = new i77(tb);
             oi77.a = Boolean.FALSE;
             oi77.d = p0.a;
             oi77.b = p0.b;
             oi77.f = obj;
             return xt.d(oi77.g());
           case 7:
             tb.getClass();
             oi77 = new i77(tb);
             oi77.a = Boolean.FALSE;
             oi77.b = obj;
             oi77.d = p0.a;
             oi77.f = p0.b;
             return xt.d(oi77.g());
           default:
             tb.getClass();
             oi77 = new i77(tb);
             oi77.e = p0.a;
             return xt.d(oi77.g());
       }
    }
}
