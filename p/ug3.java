package p.ug3;
import java.lang.String;
import p.xq7;
import p.kg3;
import android.graphics.Color;
import android.graphics.PointF;
import p.en6;
import java.lang.IllegalArgumentException;
import p.tp2;
import java.util.ArrayList;
import java.lang.Object;

public abstract class ug3	// class@0028a5 from classes.dex
{
    public static final xq7 a;

    static {
       String[] stringArray = new String[]{"x","y"};
       ug3.a = xq7.f(stringArray);
    }
    public static int a(kg3 p0){
       p0.b();
       int i = (int)(p0.g0() * 0x406fe00000000000);
       int i1 = (int)(p0.g0() * 0x406fe00000000000);
       int i2 = (int)(p0.g0() * 0x406fe00000000000);
       while (p0.J()) {
          p0.n0();
       }
       p0.x();
       return Color.argb(255, i, i1, i2);
    }
    public static PointF b(kg3 p0,float p1){
       float f;
       float f1;
       int i2;
       int i = en6.A(p0.j0());
       int i1 = 2;
       if (i) {
          if (i != i1) {
             if (i != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(tp2.A(p0.j0())));
             }
             f = (float)p0.g0();
             f1 = (float)p0.g0();
             while (p0.J()) {
                p0.n0();
             }
             return new PointF((f * p1), (f1 * p1));
          }else {
             p0.f();
             f = 0;
             f1 = 0;
             while (p0.J()) {
                if (i2 = p0.l0(ug3.a)) {
                   if (i2 != 1) {
                      p0.m0();
                      p0.n0();
                   }else {
                      f1 = ug3.d(p0);
                   }
                }else {
                   f = ug3.d(p0);
                }
             }
             p0.y();
             return new PointF((f * p1), (f1 * p1));
          }
       }else {
          p0.b();
          f = (float)p0.g0();
          float f2 = (float)p0.g0();
          while (p0.j0() != i1) {
             p0.n0();
          }
          p0.x();
          return new PointF((f * p1), (f2 * p1));
       }
    }
    public static ArrayList c(kg3 p0,float p1){
       ArrayList uArrayList = new ArrayList();
       p0.b();
       while (p0.j0() == 1) {
          p0.b();
          uArrayList.add(ug3.b(p0, p1));
          p0.x();
       }
       p0.x();
       return uArrayList;
    }
    public static float d(kg3 p0){
       int i1;
       int i = p0.j0();
       if (i1 = en6.A(i)) {
          if (i1 == 6) {
             return (float)p0.g0();
          }
          throw new IllegalArgumentException("Unknown value for token of type ".concat(tp2.A(i)));
       }else {
          p0.b();
          float f = (float)p0.g0();
          while (p0.J()) {
             p0.n0();
          }
          p0.x();
          return f;
       }
    }
}
