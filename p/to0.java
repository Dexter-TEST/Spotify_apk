package p.to0;
import p.pb3;
import java.lang.Object;
import p.ob3;
import p.cx5;
import p.yp5;
import java.lang.Class;
import p.lp5;
import p.co5;
import java.lang.String;
import p.g15;
import p.bv5;
import p.np5;
import p.mw1;
import p.lw1;
import p.l67;
import p.i70;
import java.io.IOException;
import p.nz5;
import java.lang.IllegalStateException;

public final class to0 implements pb3	// class@000352 from classes2.dex
{
    public static final to0 a;

    static {
       to0.a = new to0();
    }
    public void to0(){
       super();
    }
    public final cx5 intercept(ob3 p0){
       yp5 a = p0.a;
       a.getClass();
       _monitor_enter(a);
       if (a.F == null) {
          throw new IllegalStateException("released".toString());
       }
       if (!((a.E ^ 1))) {
          throw new IllegalStateException("Check failed.".toString());
       }
       if (!((a.D ^ 1))) {
          throw new IllegalStateException("Check failed.".toString());
       }
       _monitor_exit(a);
       lp5 z = a.z;
       co5.i(z);
       lp5 a1 = a.a;
       String str = "client";
       try{
          co5.o(a1, str);
          yp5 f = p0.f;
          yp5 g = p0.g;
          yp5 h = p0.h;
          g15 s = a1.S;
          g15 w = a1.w;
          boolean b = (!co5.c(p0.e.b, "GET"))? true: false;
          l67 ol67 = new l67(a, a.v, z, z.a(f, g, h, s, w, b).k(a1, p0));
          a.C = ol67;
          a.H = ol67;
          _monitor_enter(a);
          a.D = true;
          a.E = true;
          _monitor_exit(a);
          if (a.G == null) {
             return yp5.a(p0, 0, ol67, null, 61).b(p0.e);
          }else {
             throw new IOException("Canceled");
          }
       }catch(p.nz5 e13){
          z.c(e13.b);
          throw e13;
       }catch(java.io.IOException e13){
          z.c(e13);
          throw new nz5(e13);
       }
    }
}
