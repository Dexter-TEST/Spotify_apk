package p.sh3;
import java.lang.String;
import p.xq7;
import p.kg3;
import p.sv3;
import p.cg7;
import java.util.ArrayList;
import p.ph3;
import p.rh3;
import java.lang.Object;
import java.lang.Float;
import p.t95;

public abstract class sh3	// class@00262b from classes.dex
{
    public static final xq7 a;

    static {
       String[] stringArray = new String[]{"k"};
       sh3.a = xq7.f(stringArray);
    }
    public static ArrayList a(kg3 p0,sv3 p1,float p2,cg7 p3,boolean p4){
       ArrayList uArrayList = new ArrayList();
       if (p0.j0() == 6) {
          p1.a("Lottie doesn\'t support expressions.");
          return uArrayList;
       }else {
          p0.f();
          while (p0.J()) {
             if (p0.l0(sh3.a)) {
                p0.n0();
             }else if(p0.j0() == 1){
                p0.b();
                if (p0.j0() == 7) {
                   uArrayList.add(rh3.b(p0, p1, p2, p3, false, p4));
                }else {
                   while (p0.J()) {
                      uArrayList.add(rh3.b(p0, p1, p2, p3, true, p4));
                   }
                }
                p0.x();
             }else {
                uArrayList.add(rh3.b(p0, p1, p2, p3, false, p4));
             }
          }
          p0.y();
          sh3.b(uArrayList);
          return uArrayList;
       }
    }
    public static void b(ArrayList p0){
       int i2;
       int i = p0.size();
       int i1 = 0;
       while (true) {
          i2 = i - 1;
          if (i1 < i2) {
             ph3 oph3 = p0.get(i1);
             i1 = i1 + 1;
             ph3 oph31 = p0.get(i1);
             oph3.h = Float.valueOf(oph31.g);
             if (oph3.c == null && (oph31 = oph31.b) != null) {
                oph3.c = oph31;
                if (oph3 instanceof t95) {
                   oph3.d();
                }
             }
          }else {
             break ;
          }
       }
       ph3 oph32 = p0.get(i2);
       if (oph32.b == null || (oph32.c == null && p0.size() > 1)) {
          p0.remove(oph32);
       }
       return;
    }
}
