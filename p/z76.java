package p.z76;
import p.qg2;
import p.iv;
import java.lang.Object;
import p.t66;
import java.lang.Class;
import p.o11;
import java.lang.Boolean;
import p.xt;
import p.v66;
import p.i66;
import p.s66;
import java.lang.String;
import p.te5;
import p.d66;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.z66;
import p.co5;
import p.q66;

public final class z76 implements qg2	// class@002ea3 from classes.dex
{
    public final int a;
    public final iv b;

    public void z76(iv p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       o11 oo11;
       Object[] objArray;
       boolean b = true;
       Object obj = null;
       z76 tb = this.b;
       switch (this.a){
           case 0:
             if (p0.a.isEmpty()) {
                p0 = xt.d(tb.a(b));
             }else {
                p0 = p0.a;
                if (tb.b != null && p0.equals(tb.c)) {
                   p0 = xt.e();
                }else {
                   oo11 = new o11(tb, 0);
                   oo11.b = Boolean.FALSE;
                   oo11.t = p0;
                   oo11.c = obj;
                   oo11.w = obj;
                   objArray = new Object[b];
                   objArray[0] = new d66(p0, 0);
                   p0 = new xt(oo11.l(), co5.B(vv7.p(objArray)));
                }
             }
             return p0;
             break;
           case 1:
             iv c = tb.c;
             if (te5.a(c)) {
                p0 = xt.e();
             }else {
                objArray = new Object[b];
                objArray[0] = new d66(c, p0.a);
                p0 = xt.a(vv7.p(objArray));
             }
             return p0;
             break;
           case 2:
             return xt.d(tb.a(0));
           case 3:
             tb.getClass();
             oo11 = new o11(tb, 0);
             oo11.b = Boolean.FALSE;
             oo11.t = p0.a;
             oo11.c = p0.b;
             oo11.w = obj;
             return xt.d(oo11.l());
           case 4:
             tb.getClass();
             oo11 = new o11(tb, 0);
             oo11.b = Boolean.FALSE;
             oo11.c = obj;
             oo11.t = p0.a;
             oo11.w = p0.b;
             return xt.d(oo11.l());
           default:
             tb.getClass();
             oo11 = new o11(tb, 0);
             oo11.v = p0.a;
             return xt.d(oo11.l());
       }
    }
}
