package p.re2;
import p.qe2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ll7;
import java.lang.Class;
import p.pe2;
import java.util.Set;
import p.ij;
import p.nd2;
import android.os.Looper;
import android.os.Handler;
import java.lang.Runnable;
import p.se2;
import java.util.LinkedHashMap;
import java.util.Collection;

public abstract class re2	// class@0024cd from classes.dex
{
    public static final qe2 a;

    static {
       re2.a = qe2.c;
    }
    public static qe2 a(Fragment p0){
       while (p0 != null) {
          if (p0.isAdded()) {
             co5.l(p0.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
          }
          p0 = p0.getParentFragment();
       }
       return re2.a;
    }
    public static void b(qe2 p0,ll7 p1){
       ll7 a = p1.a;
       String name = a.getClass().getName();
       p0 = p0.a;
       p0.contains(pe2.a);
       if (p0.contains(pe2.b)) {
          ij oij = new ij(name, 3, p1);
          if (a.isAdded()) {
             nd2 c = a.getParentFragmentManager().u.c;
             co5.l(c, "fragment.parentFragmentManager.host.handler");
             if (co5.c(c.getLooper(), Looper.myLooper())) {
                oij.run();
             }else {
                c.post(oij);
             }
          }else {
             oij.run();
          }
       }
       return;
    }
    public static void c(ll7 p0){
       if (o.I(3)) {
          p0.a.getClass();
       }
       return;
    }
    public static final void d(Fragment p0,String p1){
       co5.o(p0, "fragment");
       co5.o(p1, "previousFragmentId");
       se2 ose2 = new se2(p0, p1);
       re2.c(ose2);
       qe2 oqe2 = re2.a(p0);
       if (oqe2.a.contains(pe2.c) && re2.e(oqe2, p0.getClass(), se2.class)) {
          re2.b(oqe2, ose2);
       }
       return;
    }
    public static boolean e(qe2 p0,Class p1,Class p2){
       Set set;
       if ((set = p0.b.get(p1.getName())) == null) {
          return true;
       }
       if (!co5.c(p2.getSuperclass(), ll7.class) && set.contains(p2.getSuperclass())) {
          return false;
       }
       return (set.contains(p2) ^ true);
    }
}
