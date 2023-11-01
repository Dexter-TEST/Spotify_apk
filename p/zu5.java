package p.zu5;
import java.lang.Object;
import java.util.LinkedHashMap;
import p.sm2;
import p.bv5;
import java.lang.String;
import p.co5;
import java.util.Map;
import p.q14;
import p.mp2;
import p.we7;
import p.ml1;
import java.util.Collections;
import p.ps2;
import p.fv5;
import java.lang.IllegalStateException;
import p.c90;
import java.lang.Class;
import p.gg1;
import p.is7;
import p.tp2;
import java.lang.IllegalArgumentException;
import p.av6;
import p.os2;

public final class zu5	// class@002f6b from classes.dex
{
    public ps2 a;
    public String b;
    public sm2 c;
    public fv5 d;
    public Map e;

    public void zu5(){
       super();
       this.e = new LinkedHashMap();
       this.b = "GET";
       this.c = new sm2();
    }
    public void zu5(bv5 p0){
       co5.o(p0, "request");
       super();
       this.e = new LinkedHashMap();
       this.a = p0.a;
       this.b = p0.b;
       this.d = p0.d;
       bv5 e = p0.e;
       LinkedHashMap linkedHashMa = (e.isEmpty())? new LinkedHashMap(): q14.t0(e);
       this.e = linkedHashMa;
       this.c = p0.c.d();
       return;
    }
    public final void a(String p0,String p1){
       co5.o(p0, "name");
       co5.o(p1, "value");
       this.c.b(p0, p1);
    }
    public final bv5 b(){
       zu5 ta;
       ml1 a;
       if ((ta = this.a) == null) {
          throw new IllegalStateException("url == null".toString());
       }
       zu5 tb = this.b;
       mp2 omp2 = this.c.e();
       zu5 td = this.d;
       zu5 te = this.e;
       co5.o(te, "<this>");
       if (te.isEmpty()) {
          a = ml1.a;
       }else {
          a = Collections.unmodifiableMap(new LinkedHashMap(te));
          co5.l(a, "{\n    Collections.unmodi…(LinkedHashMap\(this\)\)\n  }");
       }
       bv5 v6 = new bv5(ta, tb, omp2, td, a);
       return v6;
    }
    public final zu5 c(c90 p0){
       co5.o(p0, "cacheControl");
       String str = p0.toString();
       int i = (!str.length())? 1: 0;
       if (i) {
          this.c.g("Cache-Control");
       }else {
          this.d("Cache-Control", str);
       }
       return this;
    }
    public final void d(String p0,String p1){
       co5.o(p0, "name");
       co5.o(p1, "value");
       zu5 tc = this.c;
       tc.getClass();
       gg1.j(p0);
       gg1.l(p1, p0);
       tc.g(p0);
       tc.d(p0, p1);
    }
    public final void e(String p0,fv5 p1){
       co5.o(p0, "method");
       int i = (p0.length() > 0)? 1: 0;
       if (i) {
          if (p1 == null) {
             if (!((is7.y(p0) ^ 0x01))) {
                throw new IllegalArgumentException(tp2.m("method ", p0, " must have a request body.").toString());
             }
          }else if(is7.v(p0)){
             throw new IllegalArgumentException(tp2.m("method ", p0, " must not have a request body.").toString());
          }
          this.b = p0;
          this.d = p1;
          return;
       }else {
          throw new IllegalArgumentException("method.isEmpty\(\) == true".toString());
       }
    }
    public final void f(Class p0,Object p1){
       co5.o(p0, "type");
       if (p1 == null) {
          this.e.remove(p0);
       }else if(this.e.isEmpty()){
          this.e = new LinkedHashMap();
       }
       p1 = p0.cast(p1);
       co5.i(p1);
       this.e.put(p0, p1);
       return;
    }
    public final void g(String p0){
       co5.o(p0, "url");
       boolean b = true;
       if (av6.D0(p0, "ws:", b)) {
          p0 = p0.substring(3);
          co5.l(p0, "this as java.lang.String\).substring\(startIndex\)");
          p0 = co5.K(p0, "http:");
       }else if(av6.D0(p0, "wss:", b)){
          p0 = p0.substring(4);
          co5.l(p0, "this as java.lang.String\).substring\(startIndex\)");
          p0 = co5.K(p0, "https:");
       }
       co5.o(p0, "<this>");
       os2 oos2 = new os2();
       oos2.f(null, p0);
       this.a = oos2.b();
       return;
    }
}
