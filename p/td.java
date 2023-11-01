package p.td;
import java.lang.String;
import p.xq7;
import p.tg3;
import p.sv3;
import p.sd;
import java.util.ArrayList;
import p.mf7;
import p.fs1;
import p.kg3;
import p.cg7;
import p.ph3;
import p.rh3;
import p.t95;
import java.lang.Object;
import p.sh3;
import android.graphics.PointF;
import p.ug3;
import p.yd;
import p.rd;
import p.ej4;
import p.ud;

public abstract class td	// class@002750 from classes.dex
{
    public static final xq7 a;

    static {
       String[] stringArray = new String[]{"k","x","y"};
       td.a = xq7.f(stringArray);
    }
    public static sd a(tg3 p0,sv3 p1){
       ArrayList uArrayList = new ArrayList();
       if (p0.j0() == 1) {
          p0.b();
          while (p0.J()) {
             boolean b = (p0.j0() == 3)? true: false;
             uArrayList.add(new t95(p1, rh3.b(p0, p1, mf7.c(), fs1.b, b, false)));
          }
          p0.x();
          sh3.b(uArrayList);
       }else {
          uArrayList.add(new ph3(ug3.b(p0, mf7.c())));
       }
       return new sd(uArrayList);
    }
    public static yd b(tg3 p0,sv3 p1){
       int i1;
       p0.f();
       yd oyd = null;
       rd ord = oyd;
       rd ord1 = ord;
       int i = 0;
       while (p0.j0() != 4) {
          if (i1 = p0.l0(td.a)) {
             boolean b = true;
             if (i1 != b) {
                if (i1 != 2) {
                   p0.m0();
                   p0.n0();
                }else if(p0.j0() == 6){
                   p0.n0();
                }else {
                   ord1 = ej4.y0(p0, p1, b);
                }
             }else if(p0.j0() == 6){
                p0.n0();
             }else {
                ord = ej4.y0(p0, p1, b);
             }
             i = 1;
          }else {
             oyd = td.a(p0, p1);
          }
       }
       p0.y();
       if (i) {
          p1.a("Lottie doesn\'t support expressions.");
       }
       if (oyd != null) {
          return oyd;
       }else {
          return new ud(ord, ord1);
       }
    }
}
