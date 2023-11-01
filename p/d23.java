package p.d23;
import java.lang.Object;
import p.j13;
import java.util.Map;
import java.lang.String;
import p.g23;
import p.s23;
import java.lang.Class;
import p.p23;
import p.n26;
import p.m73;
import p.eo5;
import p.hu2;
import p.co5;

public final class d23	// class@0012c4 from classes.dex
{

    public void d23(){
       super();
    }
    public static g23 a(j13 p0,j13 p1,Map p2,String p3){
       s23 os231;
       s23 os23 = null;
       if (p0 != null) {
          s23.c.getClass();
          os231 = p23.b(p0);
       }else {
          os231 = os23;
       }
       if (p1 != null) {
          s23.c.getClass();
          os23 = p23.b(p1);
       }
       return new g23(os231, os23, m73.b(eo5.x(p2, s23.class, n26.L)), p3);
    }
    public static g23 b(hu2 p0){
       co5.o(p0, "other");
       if (p0 instanceof g23) {
       }else {
          g23 og23 = d23.a(p0.e(), p0.c(), p0.b(), p0.d());
       }
       return p0;
    }
}
