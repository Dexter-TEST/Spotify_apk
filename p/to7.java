package p.to7;
import p.qg2;
import p.j;
import java.lang.Object;
import p.do7;
import java.lang.Class;
import p.ej5;
import p.lw;
import p.zq6;
import p.xt;
import p.ln7;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.co5;
import p.co7;
import p.kn7;
import java.lang.String;
import p.ao7;
import p.ho7;
import p.lo7;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import java.util.List;
import p.te5;
import java.util.Iterator;
import com.spotify.login.signupapi.services.model.CallingCode;
import p.xo7;
import p.go7;
import com.google.common.collect.d;
import p.dl6;
import p.io7;
import p.un7;
import p.on7;
import p.mo7;
import p.ry7;
import p.vn7;
import p.tn7;
import p.pn7;
import p.br6;
import p.jo7;
import p.zn7;
import p.bo7;
import p.qn7;
import p.tp2;
import p.ko7;
import p.fo7;

public final class to7 implements qg2	// class@0027b1 from classes.dex
{
    public final int a;
    public final j b;

    public void to7(j p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       Object[] objArray;
       xt oxt;
       ej5 uoej5;
       Object[] objArray1;
       int i = 2;
       int i1 = 1;
       to7 tb = this.b;
       switch (this.a){
           case 0:
             p0 = tb.a;
             p0.getClass();
             if (!p0 instanceof br6) {
                p0 = new ej5(tb);
                p0.b = new br6(false);
                objArray = new Object[i1];
                objArray[0] = new qn7();
                oxt = new xt(p0.d(), co5.B(vv7.p(objArray)));
             }else {
                oxt = xt.e();
             }
             return oxt;
             break;
           case 1:
             tp2.v(p0);
             p0 = new ry7[false];
             p0 = vv7.p(p0);
             tb.getClass();
             uoej5 = new ej5(tb);
             if (tb.y == null) {
                p0.add(new pn7());
                uoej5.m(i1);
             }else {
                p0.add(new qn7());
             }
             return new xt(uoej5.d(), co5.B(p0));
             break;
           case 2:
             p0 = new Object[i1];
             p0[0] = new qn7();
             return new xt(tb, co5.B(vv7.p(p0)));
           case 3:
             tb.getClass();
             uoej5 = new ej5(tb);
             uoej5.b = new zq6();
             objArray1 = new Object[i1];
             objArray1[0] = new zn7(p0.a);
             return new xt(uoej5.d(), co5.B(vv7.p(objArray1)));
           case 4:
             p0 = new ry7[]{new vn7(),new tn7(),new pn7()};
             tb.getClass();
             uoej5 = new ej5(tb);
             uoej5.b = new br6(i1);
             return new xt(uoej5.d(), co5.B(vv7.p(p0)));
           case 5:
             p0 = tb.a;
             p0.getClass();
             if (p0 instanceof zq6) {
                p0 = (tb.b != null)? xt.a(new dl6(new un7())): xt.a(new dl6(new on7()));
             }else {
                p0 = xt.e();
             }
             return p0;
             break;
           case 6:
             p0 = tb.a;
             p0.getClass();
             p0 = (p0 instanceof zq6)? xt.a(new dl6(new ln7())): xt.e();
             return p0;
             break;
           case 7:
             p0 = p0.a;
             tb.getClass();
             uoej5 = new ej5(tb);
             String country = p0.getCountry();
             List allowedCalli = p0.getAllowedCallingCodes();
             if (!te5.a(country) && (allowedCalli != null && allowedCalli.size() > 0)) {
                Iterator iterator = allowedCalli.iterator();
                do {
                   if (iterator.hasNext()) {
                   }
                } while (country.equalsIgnoreCase(iterator.next().getCountryCode()));
                uoej5.g(i1);
                uoej5.h(xo7.e(p0.getCountry()));
                uoej5.n(false);
                return xt.d(uoej5.d());
             }
             i1 = false;
             break;
           case 8:
             if (tb.w != null) {
                p0 = new ej5(tb);
                p0.p(false);
                p0 = xt.d(p0.d());
             }else {
                p0 = xt.e();
             }
             return p0;
             break;
           case 9:
             co7 a = p0.a;
             tb.getClass();
             ej5 uoej51 = new ej5(tb);
             uoej51.o(false);
             lw olw = uoej51.d();
             j a1 = olw.a;
             a1.getClass();
             if (!a1 instanceof zq6) {
                p0 = xt.d(olw);
             }else {
                objArray1 = new Object[i];
                objArray1[0] = new kn7(a, p0.b);
                objArray1[i1] = new ao7();
                p0 = new xt(olw, co5.B(vv7.p(objArray1)));
             }
             return p0;
             break;
           case 10:
             tb.getClass();
             p0 = new ej5(tb);
             p0.o(false);
             p0 = p0.d();
             j a2 = p0.a;
             a2.getClass();
             if (!a2 instanceof zq6) {
                p0 = xt.d(p0);
             }else {
                objArray = new Object[i1];
                objArray[0] = new ln7();
                p0 = new xt(p0, co5.B(vv7.p(objArray)));
             }
             return p0;
             break;
           default:
             tb.getClass();
             p0 = new ej5(tb);
             p0.o(false);
             return xt.d(p0.d());
       }
    }
}
