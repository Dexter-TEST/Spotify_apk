package p.jd1;
import p.cg7;
import java.lang.String;
import p.xq7;
import java.lang.Object;
import p.kg3;
import android.graphics.PointF;
import p.ug3;
import p.en6;
import p.id1;

public final class jd1 implements cg7	// class@001ab2 from classes.dex
{
    public static final jd1 a;
    public static final xq7 b;

    static {
       jd1.a = new jd1();
       String[] stringArray = new String[]{"t","f","s","j","tr","lh","ls","fc","sc","sw","of","ps","sz"};
       jd1.b = xq7.f(stringArray);
    }
    public void jd1(){
       super();
    }
    public final Object n(kg3 p0,float p1){
       int i5;
       float f4;
       float f5;
       p0.f();
       int i = 3;
       String str = null;
       String str1 = str;
       PointF pointF = str1;
       PointF pointF1 = pointF;
       float f = 0;
       int i1 = 3;
       int i2 = 0;
       float f1 = 0;
       float f2 = 0;
       int i3 = 0;
       int i4 = 0;
       float f3 = 0;
       boolean b = true;
       while (p0.J()) {
          switch (p0.l0(jd1.b)){
              case 0:
                str = p0.i0();
                break;
              case 1:
                str1 = p0.i0();
                break;
              case 2:
                f = (float)p0.g0();
                break;
              case 3:
                if ((i5 = p0.h0()) <= 2 && i5 >= 0) {
                   i1 = en6.H(i)[i5];
                }else {
                   i1 = 3;
                }
                break;
              case 4:
                i2 = p0.h0();
                break;
              case 5:
                f1 = (float)p0.g0();
                break;
              case 6:
                f2 = (float)p0.g0();
                break;
              case 7:
                i3 = ug3.a(p0);
                break;
              case 8:
                i4 = ug3.a(p0);
                break;
              case 9:
                f3 = (float)p0.g0();
                break;
              case 10:
                b = p0.T();
                break;
              case 11:
                p0.b();
                f4 = (float)p0.g0() * p1;
                f5 = (float)p0.g0() * p1;
                p0.x();
                pointF = new PointF(f4, f5);
                break;
              case 12:
                p0.b();
                f4 = (float)p0.g0() * p1;
                f5 = (float)p0.g0() * p1;
                p0.x();
                pointF1 = new PointF(f4, f5);
                break;
              default:
                p0.m0();
                p0.n0();
          }
       }
       p0.y();
       id1 i6 = new id1(str, str1, f, i1, i2, f1, f2, i3, i4, f3, b, pointF, pointF1);
       return i;
    }
}
