package p.lh6;
import p.qg2;
import p.nh6;
import java.lang.Object;
import p.wg6;
import p.uw5;
import p.fg6;
import java.lang.String;
import java.util.HashSet;
import p.vv7;
import java.lang.Class;
import p.mv;
import p.tr7;
import java.lang.Boolean;
import java.lang.Enum;
import p.f85;
import p.k85;
import p.hu;
import p.ys5;
import com.google.common.collect.c;
import java.lang.Integer;
import p.ri1;
import p.vi1;
import p.ws;
import p.xt;
import java.util.Set;
import p.co5;
import p.xg6;
import p.zf6;
import p.c;
import p.yf6;
import p.rg6;
import p.mh6;
import p.yg6;
import p.vg6;
import p.pv;
import p.e;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import p.kt;
import java.lang.NullPointerException;
import p.lg6;
import p.xf6;
import p.ug6;
import p.bg6;
import p.qg6;
import p.cg6;
import p.og6;
import p.dg6;
import p.sg6;
import p.eg6;

public final class lh6 implements qg2	// class@001d56 from classes.dex
{
    public final int a;
    public final nh6 b;

    public void lh6(nh6 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       lh6 olh6;
       tr7 otr7;
       Object[] objArray;
       tr7 otr72;
       mv b;
       tr7 otr73;
       mv j;
       xt oxt;
       int i = 1;
       int i1 = 0;
       lh6 tb = this.b;
       switch (this.a){
           case 0:
             olh6 = tb;
             olh6.getClass();
             otr7 = new tr7(olh6);
             otr7.w = Boolean.FALSE;
             otr7.z = p0.a;
             objArray = new Object[i];
             objArray[i1] = new dg6(tb.c.a);
             return new xt(otr7.a(), co5.B(vv7.p(objArray)));
           case 1:
             olh6 = tb;
             olh6.getClass();
             otr7 = new tr7(olh6);
             otr7.w = Boolean.FALSE;
             otr7.z = p0.a;
             objArray = new Object[i];
             objArray[i1] = new cg6(tb.c.a, tb.d.a);
             return new xt(otr7.a(), co5.B(vv7.p(objArray)));
           case 2:
             p0 = new Object[i];
             mv i2 = tb.i;
             i2.getClass();
             p0[i1] = new bg6(i2);
             return xt.a(vv7.p(p0));
           case 3:
             if ((p0 = tb.e) == null) {
                p0 = new Object[i];
                p0[i1] = new xf6();
                p0 = xt.a(vv7.p(p0));
             }else {
                tb.getClass();
                tr7 otr71 = new tr7(tb);
                otr71.v = Integer.valueOf((p0 - i));
                p0 = xt.d(otr71.a());
             }
             return p0;
             break;
           case 4:
             vg6 a = p0.a;
             lh6 olh61 = tb;
             olh61.getClass();
             otr72 = new tr7(olh61);
             if (a != null) {
                otr72.y = a;
                b = tb.b;
                b.getClass();
                pv opv = new pv(b);
                opv.e = Boolean.FALSE;
                p0 = p0.a;
                opv.b = Boolean.valueOf(p0.getCanSignupWithAllGenders());
                opv.c = Boolean.valueOf(p0.getCanSignupWithOtherGender());
                opv.d = Boolean.valueOf(p0.getCanSignupWithPreferNotToSayGender());
                otr73 = new tr7(otr72.a());
                otr73.b = opv.b();
                return xt.d(otr73.a());
             }else {
                throw new NullPointerException("Null signupConfiguration");
             }
             break;
           case 5:
             tb.getClass();
             p0 = new tr7(tb);
             p0.x = Boolean.TRUE;
             return mh6.a(p0.a());
           case 6:
             return mh6.a(tb);
           case 7:
             olh6 = tb;
             if ((j = olh6.j) != null) {
                p0 = new Object[i];
                p0[i1] = new zf6(j);
                oxt = new xt(tb, co5.B(vv7.p(p0)));
             }else {
                Object[] objArray1 = new Object[i];
                objArray1[i1] = new yf6(p0.a, olh6.d.a);
                oxt = new xt(tb, co5.B(vv7.p(objArray1)));
             }
             return oxt;
             break;
           case 8:
             uw5[] ouw5Array = new uw5[i];
             ouw5Array[i1] = new fg6(p0.b);
             HashSet hashSet = vv7.p(ouw5Array);
             tb.getClass();
             otr73 = new tr7(tb);
             otr73.w = Boolean.FALSE;
             b = otr73.a();
             i1 = p0.a.ordinal();
             p0 = p0.b;
             if (i1 != 2 && i1 != 3) {
                if (i1 == 4) {
                   otr72 = new tr7(b);
                   otr72.t = b.d.c(new f85(p0));
                   p0 = otr72.a();
                   otr72 = new tr7(p0);
                   otr72.v = Integer.valueOf(p0.b().indexOf(p0.d));
                   b = otr72.a();
                }
             }else {
                otr72 = new tr7(b);
                otr72.c = b.c.d(new ri1(p0));
                p0 = otr72.a();
                otr72 = new tr7(p0);
                otr72.v = Integer.valueOf(p0.b().indexOf(p0.c));
                b = otr72.a();
             }
             return new xt(b, co5.B(hashSet));
             break;
           default:
             tb.getClass();
             p0 = new tr7(tb);
             p0.w = Boolean.FALSE;
             objArray = new Object[i];
             objArray[i1] = new eg6();
             return new xt(p0.a(), co5.B(vv7.p(objArray)));
       }
    }
}
