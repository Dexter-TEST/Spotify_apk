package p.ld5;
import p.qg2;
import p.nd5;
import java.lang.Object;
import p.yb5;
import p.ks6;
import p.i;
import p.xt;
import p.md5;
import p.sc5;
import p.ad6;
import java.lang.Class;
import p.es;
import p.g;
import p.eu;
import java.lang.Integer;
import p.nu;
import p.gc5;
import p.rc5;
import java.lang.Boolean;
import p.nc5;
import p.pv;
import p.e;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import p.kt;
import java.lang.NullPointerException;
import java.lang.String;
import p.qc5;
import p.b35;
import p.na5;
import p.bb5;
import p.d35;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.t25;
import p.ic5;
import p.bc5;
import p.lc5;
import p.jb5;
import p.rb5;
import p.b;
import com.spotify.login.signupapi.services.model.CallingCode;
import java.lang.Long;
import p.db5;
import p.a35;
import p.co5;
import p.eb5;
import p.h;
import p.cc5;
import p.ra0;
import p.xa5;
import p.sa0;
import p.vb5;
import p.ya5;
import p.jl;
import p.xj0;
import p.w25;
import p.zb5;
import p.nb5;
import p.ac5;
import p.ib5;

public final class ld5 implements qg2	// class@001d32 from classes.dex
{
    public final int a;
    public final nd5 b;

    public void ld5(nd5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       Object[] objArray;
       xt oxt;
       ld5 old5;
       boolean b1;
       ad6 i2;
       ad6 uoad6;
       i b2;
       g c;
       xt oxt1;
       nc5 a2;
       int i = 0;
       int i1 = 1;
       ld5 tb = this.b;
       switch (this.a){
           case 0:
             if (p0.a.equals(tb.b.c)) {
                tb.getClass();
                p0 = new ad6(tb);
                p0.f(g.c().b());
                objArray = new Object[i1];
                objArray[i] = new nb5();
                oxt = new xt(p0.a(), co5.B(vv7.p(objArray)));
             }else {
                oxt = xt.e();
             }
             return oxt;
             break;
           case 1:
             if (tb.x == null) {
                p0 = new Object[i1];
                p0[i] = new ya5();
                p0 = xt.a(vv7.p(p0));
             }else {
                old5 = tb;
                i b = old5.b;
                if (tb.a() == old5.c) {
                   b1 = (b.t != null)? true: false;
                   Object[] objArray1 = new Object[i1];
                   objArray1[i] = tb;
                   jl.i(b1, "Unverified one time pass, %s", objArray1);
                   if (md5.d(tb)) {
                      objArray = new Object[i1];
                      objArray[i] = new xa5(new ra0());
                      oxt = new xt(md5.c(tb, old5.a), co5.B(vv7.p(objArray)));
                   label_0313 :
                      b1 = oxt;
                   }
                }
                b1 = new xj0[i];
                b1 = vv7.p(b1);
                if (tb.a() == b) {
                   b1.add(new xa5(new ra0()));
                }
                b1.add(new bb5(new w25()));
                i2 = new ad6(old5);
                i2.g = Integer.valueOf((old5.x - i1));
                oxt = new xt(i2.a(), co5.B(b1));
                goto label_0313 ;
             }
             return p0;
             break;
           case 2:
             uoad6 = new ad6(md5.c(tb, tb.a));
             uoad6.f(g.c().b());
             p0 = uoad6.a();
             objArray = new Object[i1];
             objArray[i] = new xa5(new ra0());
             return new xt(p0, co5.B(vv7.p(objArray)));
           case 3:
             lc5 a = p0.a;
             p0 = tb;
             if (p0.C != null) {
                p0 = new Object[i1];
                p0[i] = new jb5();
                p0 = xt.a(vv7.p(p0));
             }else {
                b2 = p0.b;
                if ((a - b2.y) < 0) {
                   p0 = new Object[i1];
                   p0[i] = new rb5();
                   p0 = xt.a(vv7.p(p0));
                }else if(tb.a() != b2){
                   p0 = xt.e();
                }else {
                   p0 = p0.a;
                   b b3 = p0.b;
                   h oh = null;
                   String str = (b3 == null)? oh: b3.getCountryCode();
                   String str1 = (b3 == null)? oh: b3.getCallingCode();
                   if (str != null && (str1 != null && (p0 = p0.a) != null)) {
                      ad6 uoad61 = new ad6(tb);
                      es tb1 = new es(b2);
                      tb1.g = Long.valueOf((a + 0x7530));
                      uoad61.f(tb1.b());
                      nu onu = uoad61.a();
                      if ((c = b2.c) != null) {
                         oh = c.a;
                      }
                      if (oh == null) {
                         objArray = new Object[]{new db5(str, str1, p0),new bb5(new a35())};
                         oxt1 = new xt(onu, co5.B(vv7.p(objArray)));
                      }else {
                         objArray = new Object[i1];
                         objArray[i] = new eb5(oh, str, str1, p0);
                         oxt1 = new xt(onu, co5.B(vv7.p(objArray)));
                      }
                      p0 = oxt1;
                   }else {
                      p0 = xt.e();
                   }
                }
             }
             return p0;
             break;
           case 4:
             return xt.d(md5.c(tb, tb.c));
           case 5:
             tb.getClass();
             uoad6 = new ad6(tb);
             uoad6.l = Boolean.valueOf(p0.a);
             return xt.d(uoad6.a());
           case 6:
             qc5 a1 = p0.a;
             if (!(tb.b.z)) {
                p0 = xt.e();
             }else {
                b2 = tb.b;
                if (tb.a() == b2) {
                   g z = b2.z;
                   p0 = b2.c;
                   if ((z - a1) >= 0) {
                      objArray = new Object[i1];
                      objArray[i] = new bb5(new b35(p0, (z - a1)));
                      p0 = xt.a(vv7.p(objArray));
                   }else {
                      objArray = new Object[i1];
                      objArray[i] = new bb5(new t25(p0));
                      p0 = xt.a(vv7.p(objArray));
                   }
                }else {
                   p0 = xt.e();
                }
             }
             return p0;
             break;
           case 7:
             old5 = tb;
             old5.getClass();
             i2 = new ad6(old5);
             if ((a2 = p0.a) != null) {
                i2.e = a2;
                b2 = tb.t;
                b2.getClass();
                pv opv = new pv(b2);
                opv.e = Boolean.FALSE;
                p0 = p0.a;
                opv.b = Boolean.valueOf(p0.getCanSignupWithAllGenders());
                opv.c = Boolean.valueOf(p0.getCanSignupWithOtherGender());
                opv.d = Boolean.valueOf(p0.getCanSignupWithPreferNotToSayGender());
                i2.d = opv.b();
                return xt.d(i2.a());
             }else {
                throw new NullPointerException("Null signupConfiguration");
             }
             break;
           case 8:
             tb.getClass();
             p0 = new ad6(tb);
             p0.i = Boolean.TRUE;
             return md5.a(p0.a());
           case 9:
             return md5.a(tb);
           case 10:
             old5 = tb;
             if (tb.a() == old5.a) {
                p0 = xt.e();
             }else {
                p0 = new ad6(old5);
                i b4 = old5.b;
                b4.getClass();
                p0.f(new es(b4).b());
                b2 = old5.x;
                int i3 = (tb.a() == b4)? b2 - 1: b2 - 2;
                p0.g = Integer.valueOf(i3);
                p0 = xt.d(p0.a());
             }
             return p0;
             break;
           case 11:
             p0 = (tb.a() == tb.a)? md5.b(tb): xt.e();
             return p0;
             break;
           default:
             old5 = tb;
             if (tb.a() == old5.b) {
                if (old5.B != null) {
                   p0 = new Object[i1];
                   p0[i] = new ib5();
                   p0 = xt.a(vv7.p(p0));
                }else {
                   p0 = xt.d(md5.c(tb, old5.c));
                }
             }else {
                p0 = xt.e();
             }
             return p0;
       }
    }
}
