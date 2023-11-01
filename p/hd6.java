package p.hd6;
import p.cg7;
import java.lang.String;
import p.xq7;
import java.lang.Object;
import p.kg3;
import java.util.ArrayList;
import p.ug3;
import java.util.List;
import p.gd6;
import android.graphics.PointF;
import java.util.Collections;
import p.wa4;
import p.v01;
import java.lang.IllegalArgumentException;

public final class hd6 implements cg7	// class@00182f from classes.dex
{
    public static final hd6 a;
    public static final xq7 b;

    static {
       hd6.a = new hd6();
       String[] stringArray = new String[]{"c","v","i","o"};
       hd6.b = xq7.f(stringArray);
    }
    public void hd6(){
       super();
    }
    public final Object n(kg3 p0,float p1){
       int i1;
       int i2;
       gd6 ogd6;
       int i = 1;
       if (p0.j0() == i) {
          p0.b();
       }
       p0.f();
       boolean b = false;
       List list = null;
       List list1 = list;
       List list2 = list1;
       boolean b1 = false;
       while (true) {
          i1 = 2;
          if (p0.J()) {
             if (i2 = p0.l0(hd6.b)) {
                if (i2 != i) {
                   if (i2 != i1) {
                      if (i2 != 3) {
                         p0.m0();
                         p0.n0();
                      }else {
                         list2 = ug3.c(p0, p1);
                      }
                   }else {
                      list1 = ug3.c(p0, p1);
                   }
                }else {
                   list = ug3.c(p0, p1);
                }
             }else {
                b1 = p0.T();
             }
          }else {
             break ;
          }
       }
       p0.y();
       if (p0.j0() == i1) {
          p0.x();
       }
       if (list != null && (list1 != null && list2 != null)) {
          if (list.isEmpty()) {
             ogd6 = new gd6(new PointF(), b, Collections.emptyList());
          }else {
             int i3 = list.size();
             PointF pointF = list.get(b);
             ArrayList uArrayList = new ArrayList(i3);
             for (i1 = 1; i1 < i3; i1 = i1 + 1) {
                PointF pointF1 = list.get(i1);
                int i4 = i1 - 1;
                PointF pointF2 = list.get(i4);
                PointF pointF3 = wa4.a(pointF2, list2.get(i4));
                uArrayList.add(new v01(pointF3, wa4.a(pointF1, list1.get(i1)), pointF1));
             }
             if (b1) {
                PointF pointF4 = list.get(b);
                i3 = i3 - i;
                PointF pointF5 = list.get(i3);
                PointF pointF6 = wa4.a(pointF5, list2.get(i3));
                uArrayList.add(new v01(pointF6, wa4.a(pointF4, list1.get(b)), pointF4));
             }
             ogd6 = new gd6(pointF, b1, uArrayList);
          }
          return ogd6;
       }else {
          throw new IllegalArgumentException("Shape data was missing information.");
       }
    }
}
