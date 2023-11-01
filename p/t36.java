package p.t36;
import java.lang.String;
import p.es3;
import p.bo0;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import p.lr7;
import p.xy5;
import android.os.Build$VERSION;
import java.util.ArrayList;
import java.lang.System;
import java.util.Iterator;
import java.lang.Object;
import p.jr7;
import p.k36;

public abstract class t36	// class@0026f3 from classes.dex
{
    public static final int a;

    static {
       es3.d("Schedulers");
    }
    public static void a(bo0 p0,WorkDatabase p1,List p2){
       int i;
       jr7[] ojr7Array1;
       Iterator iterator1;
       k36 ok36;
       if (p2 == null || !p2.size()) {
          return;
       }
       lr7 olr7 = p1.y();
       p1.c();
       p0 = p0.h;
       if (Build$VERSION.SDK_INT == 23) {
          i = p0 / 2;
       }
       ArrayList uArrayList = olr7.e(i);
       ArrayList uArrayList1 = olr7.d();
       if (uArrayList.size() > 0) {
          long l = System.currentTimeMillis();
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             olr7.q(iterator.next().a, l);
          }
       }
       p1.r();
       p1.m();
       if (uArrayList.size() > 0) {
          jr7[] ojr7Array = new jr7[uArrayList.size()];
          ojr7Array1 = uArrayList.toArray(ojr7Array);
          iterator1 = p2.iterator();
          while (iterator1.hasNext()) {
             ok36 = iterator1.next();
             if (ok36.e()) {
                ok36.f(ojr7Array1);
             }
          }
       }
       if (uArrayList1.size() > 0) {
          ojr7Array1 = new jr7[uArrayList1.size()];
          ojr7Array1 = uArrayList1.toArray(ojr7Array1);
          iterator1 = p2.iterator();
          while (iterator1.hasNext()) {
             ok36 = iterator1.next();
             if (!ok36.e()) {
                ok36.f(ojr7Array1);
             }
          }
       }
       return;
    }
}
