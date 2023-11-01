package p.d85;
import p.qg2;
import p.hu;
import java.lang.Object;
import p.sf7;
import p.f85;
import java.lang.String;
import p.k85;
import p.xt;
import p.tf7;
import java.lang.Class;
import p.i85;
import p.j85;
import p.h85;
import p.b85;
import p.s97;
import p.uf7;
import p.a85;
import p.lq5;
import java.lang.Boolean;
import p.z75;
import p.g85;
import java.util.Map;
import p.x75;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.co5;
import p.rf7;

public final class d85 implements qg2	// class@0012fb from classes.dex
{
    public final int a;
    public final hu b;

    public void d85(hu p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       xt oxt;
       int i = 0;
       d85 tb = this.b;
       switch (this.a){
           case 0:
             p0 = p0.a;
             int i1 = (p0.length() >= 8)? 1: 0;
             g85 og85 = new g85();
             if (i1 && (og85 = tb.t.get(p0)) == null) {
                og85 = new j85(new i85());
             }
             tb.getClass();
             lq5 olq5 = new lq5(tb, i);
             olq5.j(og85);
             olq5.b = p0;
             hu ohu = olq5.g();
             if (i1) {
                Object[] objArray = new Object[]{new x75(p0)};
                oxt = new xt(ohu, co5.B(vv7.p(objArray)));
             }else {
                oxt = xt.d(ohu);
             }
             return oxt;
             break;
           case 1:
             tb.getClass();
             lq5 olq51 = new lq5(tb, i);
             olq51.t = Boolean.valueOf(p0.a);
             return xt.d(olq51.g());
           case 2:
             int i2 = 4;
             p0 = (!tb.a.equals(p0.a.a(new s97(i2), new s97(5), new s97(6))))? xt.e(): p0.a.a(new d85(tb, 3), new d85(tb, i2), new d85(tb, 5));
             return p0;
             break;
           case 3:
             p0 = tb.b;
             p0.getClass();
             if (!p0 instanceof i85) {
                p0 = tb.b;
                p0.getClass();
                if (!p0 instanceof j85) {
                   p0 = xt.e();
                label_0043 :
                   return p0;
                }
             }
             p0 = xt.d(tb.c(new h85()));
             goto label_0043 ;
             break;
           case 4:
             return xt.d(tb.c(new f85(p0.b)));
           default:
             p0 = tb.b;
             p0.getClass();
             if (p0 instanceof j85) {
                p0 = new lq5(tb, i);
                hu b = tb.b;
                b.getClass();
                p0.j(b.a);
                p0 = xt.d(p0.g());
             }else {
                p0 = xt.e();
             }
             return p0;
       }
    }
}
