package p.xd;
import java.lang.String;
import p.xq7;
import p.tg3;
import p.sv3;
import p.wd;
import p.kg3;
import p.rd;
import p.ej4;
import p.qd;
import p.a27;
import java.util.List;
import p.ph3;
import java.lang.Float;
import java.lang.Object;
import android.view.animation.Interpolator;
import p.ks1;
import p.cg7;
import java.util.ArrayList;
import p.sh3;
import p.yd;
import p.td;
import p.sd;
import android.graphics.PointF;
import p.ud;
import p.f36;

public abstract class xd	// class@002c5a from classes.dex
{
    public static final xq7 a;
    public static final xq7 b;

    static {
       String[] stringArray = new String[]{"a","p","s","rz","r","o","so","eo","sk","sa"};
       xd.a = xq7.f(stringArray);
       stringArray = new String[]{"k"};
       xd.b = xq7.f(stringArray);
    }
    public static wd a(tg3 p0,sv3 p1){
       float f;
       float f1;
       qd oqd1;
       yd oyd;
       ph3 oph3;
       ph3 oph31;
       rd ord3;
       yd oyd1;
       sd osd1;
       tg3 otg3 = p0;
       sv3 osv3 = p1;
       int i = (p0.j0() == 3)? 1: 0;
       if (i) {
          p0.f();
       }
       a27 uoa27 = null;
       int i1 = 0;
       int i2 = 0;
       a27 uoa271 = null;
       a27 uoa272 = null;
       sd osd = null;
       qd oqd = null;
       rd ord = null;
       rd ord1 = null;
       while (true) {
          f = 0x3f800000;
          f1 = 0;
          if (p0.J()) {
             switch (otg3.l0(xd.a)){
                 case 0:
                   oqd1 = i1;
                   oyd = i2;
                   p0.f();
                   while (p0.J()) {
                      if (otg3.l0(xd.b)) {
                         p0.m0();
                         p0.n0();
                      }else {
                         osd = td.a(p0, p1);
                         continue ;
                      }
                   }
                   p0.y();
                label_00c6 :
                   i1 = oqd1;
                label_0105 :
                   i2 = oyd;
                   break;
                 case 1:
                   i2 = td.b(p0, p1);
                   break;
                 case 2:
                   oyd = i2;
                   i1 = new qd(4, sh3.a(otg3, osv3, f, ks1.c, false));
                   goto label_0105 ;
                   break;
                 case 3:
                   osv3.a("Lottie doesn\'t support 3D layers.");
                 case 4:
                   rd ord2 = ej4.y0(otg3, osv3, false);
                   a27 uoa273 = ord2.b;
                   if (uoa273.isEmpty()) {
                      oph3 = v2;
                      oph31 = v2;
                      ord3 = ord2;
                      oqd1 = i1;
                      oyd = i2;
                      oph3 = new ph3(p1, Float.valueOf(f1), Float.valueOf(f1), 0, 0, Float.valueOf(osv3.k));
                      uoa273.add(oph31);
                   }else {
                      a27 uoa274 = uoa273;
                      ord3 = ord2;
                      oqd1 = i1;
                      oyd = i2;
                      if (uoa274.get(false).b == null) {
                         oph31 = new ph3(p1, Float.valueOf(f1), Float.valueOf(f1), null, 0, Float.valueOf(osv3.k));
                         uoa274.set(false, v9);
                      }
                   }
                   uoa27 = ord3;
                   goto label_00c6 ;
                   break;
                 case 5:
                   oqd = ej4.z0(p0, p1);
                   break;
                 case 6:
                   ord = ej4.y0(otg3, osv3, false);
                   break;
                 case 7:
                   ord1 = ej4.y0(otg3, osv3, false);
                   break;
                 case 8:
                   uoa272 = ej4.y0(otg3, osv3, false);
                   break;
                 case 9:
                   uoa271 = ej4.y0(otg3, osv3, false);
                   break;
                 default:
                   p0.m0();
                   p0.n0();
             }
          }else {
             break ;
          }
       }
       oqd1 = i1;
       oyd = i2;
       if (i) {
          p0.y();
       }
       ph3 b = (osd != null && (!osd.c() && osd.a.get(false).b.equals(f1, f1)))? 0: 1;
       if (otg3) {
          oyd1 = oyd;
          osd1 = null;
       }else {
          osd1 = osd;
          oyd1 = oyd;
       }
       b = (oyd1 != null && (oyd1 instanceof ud && (oyd1.c() && oyd1.b().get(false).b.equals(f1, f1))))? 0: 1;
       yd oyd2 = (otg3)? null: oyd1;
       b = (uoa27 != null && (!uoa27.c() && !(f1 - uoa27.b.get(false).b.floatValue())))? 0: 1;
       qd oqd2 = oqd1;
       if (otg3) {
          oph3 = 0;
       }
       if (oqd2 != null) {
          if (oqd2.c()) {
             b = oqd2.b.get(false).b;
             b = (!(f - b.a) && !(f - b.b))? 1: 0;
             if (!b) {
             label_01b5 :
                b = 0;
             label_01b8 :
                qd oqd3 = (b)? null: oqd2;
                b = (uoa272 != null && (!uoa272.c() && !(f1 - uoa272.b.get(false).b.floatValue())))? 0: 1;
                if (b) {
                   uoa272 = 0;
                }
                oph31 = (uoa271 != null && (!uoa271.c() && !(f1 - uoa271.b.get(false).b.floatValue())))? 0: 1;
                rd ord4 = (oph31)? null: uoa271;
                wd b1 = new wd(osd1, oyd2, oqd3, oph3, oqd, ord, ord1, uoa272, ord4);
                return b;
             }
          }else {
             goto label_01b5 ;
          }
       }
       b = 1;
       goto label_01b8 ;
    }
}
