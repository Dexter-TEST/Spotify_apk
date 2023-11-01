package p.um1;
import p.rg2;
import p.wm1;
import java.lang.Object;
import p.b43;
import p.r45;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import p.ry7;
import p.ju2;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import p.tt2;
import p.au2;
import p.aq6;
import p.td7;
import p.yp6;
import p.a43;
import p.w05;
import p.ze5;
import p.z23;

public final class um1 implements rg2	// class@0028d8 from classes.dex
{
    public final wm1 a;

    public void um1(wm1 p0){
       this.a = p0;
    }
    public final Object e(Object p0,Object p1,Object p2,Object p3){
       ju2 oju2;
       tt2 ott2;
       String str1;
       boolean b;
       aq6 t;
       int i = p3.intValue();
       um1 ta = this.a;
       ta.getClass();
       String str = ry7.D(p0);
       if ((oju2 = p0.e()) != null) {
          Iterator iterator = oju2.e("primary_buttons").iterator();
          while (true) {
             if (iterator.hasNext()) {
                str1 = ((ott2 = iterator.next().m().get("click")) != null && "playFromContext".equals(ott2.name()))? ott2.b().q("uid"): null;
                if (str1 != null) {
                label_005c :
                   p1 = p1.f();
                   p2 = p2.f();
                   aq6 uoaq6 = td7.d(str);
                   aq6 uoaq61 = td7.d(p1);
                   if (uoaq6 != null && uoaq61 != null) {
                      if (uoaq6.b == yp6.l0) {
                         if (str1 != null && p2 != null) {
                            b = str1.equalsIgnoreCase(p2);
                         label_00bb :
                            if (b) {
                               if (i != 3 && (i != 6 && (i != 11 && (i != 10 && i != 9)))) {
                                  if (i == 2) {
                                     p0 = p0.a().i(wm1.a(p0.e(), ta.b.get(), ze5.c)).g();
                                     break ;
                                  }
                               }else {
                                  p0 = p0.a().i(wm1.a(p0.e(), ta.a.get(), ze5.b)).g();
                                  break ;
                               }
                            }
                            break ;
                         }
                      }else {
                         p2 = td7.d(str);
                         p1 = td7.d(p1);
                         if (p2 != null && p1 != null) {
                            yp6 a = yp6.A;
                            if (p2.b == a && (uoaq6 = p2.t) != null) {
                               p2 = new aq6(yp6.B, uoaq6, null);
                            }
                            if (p1.b == a && (t = p1.t) != null) {
                               p1 = new aq6(yp6.B, t, null);
                            }
                            if (!p2.a(p1)) {
                               b = true;
                               goto label_00bb ;
                            }
                         }
                      }
                   }
                   b = false;
                   goto label_00bb ;
                }
             }
          }
          return p0;
       }
       str1 = null;
       goto label_005c ;
    }
}
