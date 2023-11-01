package p.za3;
import p.ku1;
import p.ru1;
import p.lj;
import p.oh5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.yo5;
import p.co0;
import com.spotify.messages.ConfigurationApplied;
import java.util.TreeMap;
import java.lang.Class;
import java.util.Set;
import com.google.protobuf.c;
import com.google.protobuf.b;
import com.google.protobuf.a;
import p.zu1;
import p.nc2;
import p.eo0;
import com.spotify.messages.ConfigurationAppliedNonAuth;
import p.t61;
import com.spotify.messages.DefaultConfigurationApplied;
import p.v61;
import com.spotify.messages.DefaultConfigurationAppliedNonAuth;
import p.iu1;
import p.io0;
import p.ju1;
import java.lang.Number;
import com.spotify.messages.ConfigurationFetched;
import p.lo0;
import com.spotify.messages.ConfigurationFetchedNonAuth;
import java.lang.Long;
import java.lang.Integer;

public final class za3 implements ku1	// class@002eba from classes.dex
{
    public final int a;
    public final ru1 b;
    public final lj c;
    public final oh5 d;

    public void za3(ru1 p0,lj p1,oh5 p2,int p3){
       this.a = p3;
       if (p3 != 1) {
          co5.o(p1, "appMetadata");
          co5.o(p2, "policyInputs");
          super();
          this.b = p0;
          this.c = p1;
          this.d = p2;
          return;
       }else {
          co5.o(p1, "appMetadata");
          co5.o(p2, "policyInputs");
          super();
          this.b = p0;
          this.c = p1;
          this.d = p2;
          return;
       }
    }
    public final void a(yo5 p0){
       byte[] uobyteArray;
       yo5 d = p0.d;
       yo5 c = p0.c;
       p0 = p0.b;
       za3 tb = this.b;
       za3 tc = this.c;
       za3 td = this.d;
       switch (this.a){
           case 0:
           default:
             eo0 uoeo0 = ConfigurationAppliedNonAuth.m();
             uoeo0.d(td.b());
             tc.getClass();
             uoeo0.h();
             uoeo0.i();
             uoeo0.g();
             uoeo0.c(p0);
             uoeo0.f(c);
             uoeo0.e(d);
             uobyteArray = uoeo0.build().toByteArray();
             co5.l(uobyteArray, "toByteArray\(\)");
             tb.a.c("ConfigurationAppliedNonAuth", uobyteArray);
             return;
       }
       co0 uoco0 = ConfigurationApplied.m();
       uoco0.d(td.b());
       tc.getClass();
       uoco0.h();
       uoco0.i();
       uoco0.g();
       uoco0.c(p0);
       uoco0.f(c);
       uoco0.e(d);
       uobyteArray = uoco0.build().toByteArray();
       co5.l(uobyteArray, "toByteArray\(\)");
       tb.a.c("ConfigurationApplied", uobyteArray);
       return;
    }
    public final void b(yo5 p0){
       byte[] uobyteArray;
       p0 = p0.d;
       za3 tb = this.b;
       za3 tc = this.c;
       za3 td = this.d;
       switch (this.a){
           case 0:
           default:
             v61 ov61 = DefaultConfigurationAppliedNonAuth.k();
             ov61.c(td.b());
             tc.getClass();
             ov61.f();
             ov61.g();
             ov61.e();
             ov61.d(p0);
             uobyteArray = ov61.build().toByteArray();
             co5.l(uobyteArray, "toByteArray\(\)");
             tb.a.c("DefaultConfigurationAppliedNonAuth", uobyteArray);
             return;
       }
       t61 ot61 = DefaultConfigurationApplied.k();
       ot61.c(td.b());
       tc.getClass();
       ot61.f();
       ot61.g();
       ot61.e();
       ot61.d(p0);
       uobyteArray = ot61.build().toByteArray();
       co5.l(uobyteArray, "toByteArray\(\)");
       tb.a.c("DefaultConfigurationApplied", uobyteArray);
       return;
    }
    public final void c(String p0,long p1,iu1 p2,int p3){
       byte[] uobyteArray;
       za3 oza3 = this;
       io0 obj = p0;
       iu1 oiu1 = p2;
       int i = p3;
       iu1 h = oiu1.h;
       iu1 g = oiu1.g;
       iu1 f = oiu1.f;
       iu1 e = oiu1.e;
       iu1 d = oiu1.d;
       iu1 c = oiu1.c;
       iu1 b = oiu1.b;
       oiu1 = oiu1.a;
       za3 b1 = oza3.b;
       switch (oza3.a){
           case 0:
             co5.o(obj, "fetchType");
             obj = this.e(p0, p1);
             obj.w(i);
             if (oiu1 != null) {
                obj.j(oiu1.a);
             }
             if (b != null) {
                obj.g(b);
             }
             if (c != null) {
                obj.l(c.a);
             }
             if (d != null) {
                obj.f(d.intValue());
             }
             if (e != null) {
                obj.i(e);
             }
             if (f != null) {
                obj.k(f.a);
             }
             if (g != null) {
                obj.e(g.intValue());
             }
             if (h != null) {
                obj.h(h);
             }
             break;
           default:
             co5.o(obj, "fetchType");
             lo0 olo0 = this.f(p0, p1);
             olo0.v(i);
             if (oiu1 != null) {
                olo0.j(oiu1.a);
             }
             if (b != null) {
                olo0.g(b);
             }
             if (c != null) {
                olo0.l(c.a);
             }
             if (d != null) {
                olo0.f(d.intValue());
             }
             if (e != null) {
                olo0.i(e);
             }
             if (f != null) {
                olo0.k(f.a);
             }
             if (g != null) {
                olo0.e(g.intValue());
             }
             if (h != null) {
                olo0.h(h);
             }
             uobyteArray = olo0.build().toByteArray();
             co5.l(uobyteArray, "toByteArray\(\)");
             b1.a.c("ConfigurationFetchedNonAuth", uobyteArray);
             return;
       }
       uobyteArray = obj.build().toByteArray();
       co5.l(uobyteArray, "toByteArray\(\)");
       b1.a.c("ConfigurationFetched", uobyteArray);
       return;
    }
    public final void d(String p0,long p1,int p2,String p3,Long p4,Integer p5,String p6){
       io0 oio0;
       byte[] uobyteArray;
       za3 oza3 = this;
       int i = p2;
       String str = p3;
       String str1 = p6;
       za3 b = oza3.b;
       long l = -1;
       String str2 = "fetchType";
       switch (oza3.a){
           case 0:
             co5.o(p0, str2);
             if (p4 != null && (p4.longValue())) {
                l = p4.longValue();
             }
             oio0 = this.e(p0, p1);
             oio0.d(str);
             oio0.p((long)i);
             oio0.n(l);
             if (p5 != null) {
                oio0.r(p5.intValue());
             }
             if (str1) {
                oio0.v(str1);
             }
             break;
           default:
             co5.o(p0, str2);
             if (p4 != null && (p4.longValue())) {
                l = p4.longValue();
             }
             lo0 olo0 = this.f(p0, p1);
             olo0.d(str);
             olo0.p((long)i);
             olo0.n(l);
             if (str1 != null) {
                olo0.u(str1);
             }
             uobyteArray = olo0.build().toByteArray();
             co5.l(uobyteArray, "toByteArray\(\)");
             b.a.c("ConfigurationFetchedNonAuth", uobyteArray);
             return;
       }
       uobyteArray = oio0.build().toByteArray();
       co5.l(uobyteArray, "toByteArray\(\)");
       b.a.c("ConfigurationFetched", uobyteArray);
       return;
    }
    public final io0 e(String p0,long p1){
       io0 oio0 = ConfigurationFetched.A();
       oio0.m(p0);
       oio0.c(this.d.b());
       oio0.o(p1);
       this.c.getClass();
       oio0.q();
       oio0.t();
       oio0.u();
       oio0.s();
       oio0.v("N/A");
       return oio0;
    }
    public final lo0 f(String p0,long p1){
       lo0 olo0 = ConfigurationFetchedNonAuth.z();
       olo0.m(p0);
       olo0.c(this.d.b());
       olo0.o(p1);
       this.c.getClass();
       olo0.q();
       olo0.s();
       olo0.t();
       olo0.r();
       olo0.u("N/A");
       return olo0;
    }
}
