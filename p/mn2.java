package p.mn2;
import p.pb3;
import java.lang.Object;
import p.ob3;
import p.cx5;
import p.yp5;
import p.bv5;
import p.fv5;
import java.lang.String;
import p.mp2;
import p.zu5;
import p.ln2;

public final class mn2 implements pb3	// class@001eca from classes.dex
{

    public void mn2(){
       super();
    }
    public final cx5 intercept(ob3 p0){
       bv5 d;
       yp5 e = p0.e;
       if ((d = e.d) != null && (!(d.a() - -1) && (d.a() - 500) < 0)) {
          bv5 c = e.c;
          String str = "Content-Encoding";
          if (c.a(str) == null && (c.a("Transfer-Encoding") == null && c.a("X-Transfer-Encoding") == null)) {
             zu5 ozu5 = new zu5(e);
             ozu5.a(str, "gzip");
             ozu5.e(e.b, new ln2(d));
             return p0.b(ozu5.b());
          }
       }
       return p0.b(e);
    }
}
