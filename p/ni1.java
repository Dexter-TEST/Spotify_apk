package p.ni1;
import p.qg2;
import p.ws;
import java.lang.Object;
import p.sf7;
import p.ri1;
import java.lang.String;
import p.vi1;
import p.xt;
import p.tf7;
import java.lang.Class;
import p.ti1;
import p.ui1;
import p.si1;
import p.ii1;
import p.s97;
import p.uf7;
import p.hi1;
import p.j8;
import java.lang.Boolean;
import p.gi1;
import p.oi1;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p.qi1;
import java.util.Map;
import p.ei1;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.co5;
import p.rf7;

public final class ni1 implements qg2	// class@001fe1 from classes.dex
{
    public final int a;
    public final ws b;

    public void ni1(ws p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       xt oxt;
       int i = 0;
       int i1 = 1;
       ni1 tb = this.b;
       switch (this.a){
           case 0:
             p0 = p0.a;
             int i2 = (!p0.isEmpty() && oi1.a.matcher(p0).matches())? 1: 0;
             qi1 oqi1 = new qi1();
             if (i2 && (oqi1 = tb.t.get(p0)) == null) {
                oqi1 = new ui1(new ti1());
             }
             tb.getClass();
             j8 oj8 = new j8(tb, i);
             oj8.b = p0;
             oj8.h(oqi1);
             ws ows = oj8.f();
             if (i2) {
                Object[] objArray = new Object[i1];
                objArray[i] = new ei1(p0);
                oxt = new xt(ows, co5.B(vv7.p(objArray)));
             }else {
                oxt = xt.d(ows);
             }
             return oxt;
             break;
           case 1:
             tb.getClass();
             j8 oj81 = new j8(tb, i);
             oj81.t = Boolean.valueOf(p0.a);
             return xt.d(oj81.f());
           case 2:
             p0 = (!tb.a.equals(p0.a.a(new s97(i1), new s97(2), new s97(3))))? xt.e(): p0.a.a(new ni1(tb, 3), new ni1(tb, 4), new ni1(tb, 5));
             return p0;
             break;
           case 3:
             p0 = tb.b;
             p0.getClass();
             if (!p0 instanceof ti1) {
                p0 = tb.b;
                p0.getClass();
                if (!p0 instanceof ui1) {
                   p0 = xt.e();
                label_0044 :
                   return p0;
                }
             }
             p0 = xt.d(tb.d(new si1()));
             goto label_0044 ;
             break;
           case 4:
             return xt.d(tb.d(new ri1(p0.b)));
           default:
             p0 = tb.b;
             p0.getClass();
             if (p0 instanceof ui1) {
                p0 = new j8(tb, i);
                ws b = tb.b;
                b.getClass();
                p0.h(b.a);
                p0 = xt.d(p0.f());
             }else {
                p0 = xt.e();
             }
             return p0;
       }
    }
}
