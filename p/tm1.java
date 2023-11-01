package p.tm1;
import java.lang.Runnable;
import java.lang.String;
import p.es3;
import p.hq7;
import p.vx5;
import java.lang.Object;
import java.lang.Class;
import java.util.HashSet;
import p.uq7;
import p.xy5;
import java.util.Set;
import java.lang.System;
import p.rq7;
import p.lr7;
import androidx.work.impl.WorkDatabase;
import p.jr7;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import p.nx1;
import java.util.Iterator;
import p.ir7;
import p.pb0;
import p.qb0;
import p.n91;
import p.zy5;
import android.database.Cursor;
import p.vv7;
import java.util.List;
import java.util.Collections;
import p.dr7;
import p.co5;
import android.os.Build$VERSION;
import p.ry7;
import java.util.Collection;
import java.lang.Iterable;
import p.k36;
import p.rn1;
import p.j91;
import java.util.UUID;
import p.or7;
import p.mr7;
import p.xq7;
import p.wq7;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import android.content.Context;
import p.n55;
import p.bo0;
import p.t36;
import p.j45;
import p.lv1;
import java.lang.IllegalStateException;
import p.g45;
import java.lang.Throwable;

public final class tm1 implements Runnable	// class@00279a from classes.dex
{
    public final hq7 a;
    public final vx5 b;
    public static final String c;

    static {
       tm1.c = es3.d("EnqueueRunnable");
    }
    public void tm1(hq7 p0){
       super();
       this.a = p0;
       this.b = new vx5(1);
    }
    public final void run(){
       int i2;
       int i3;
       int i4;
       jr7 ojr7;
       tm1 otm11;
       uq7 ouq7;
       hq7 ohq7;
       int b1;
       int i5;
       int i6;
       int i7;
       hq7 o;
       n91 on91;
       int i8;
       Iterator iterator1;
       lr7 obj;
       hq7 ohq71;
       rq7 orq7;
       long l1;
       int i9;
       lr7 olr7;
       Iterator iterator2;
       int i10;
       Iterator iterator4;
       ir7 b3;
       tm1 otm1 = this;
       tm1 b = otm1.b;
       tm1 a = otm1.a;
       String str = "WorkContinuation has cycles \(";
       a.getClass();
       hq7 m = a.m;
       if (hq7.D(a, new HashSet())) {
          throw new IllegalStateException(str+a+"\)");
       }
       uq7 c = m.C;
       c.c();
       int i = 0;
       String[] stringArray = new String[i];
       String[] stringArray1 = hq7.E(a).toArray(stringArray);
       long l = System.currentTimeMillis();
       uq7 c1 = m.C;
       int i1 = (stringArray1 != null && stringArray1.length > 0)? 1: 0;
       rq7 c2 = rq7.c;
       rq7 w = rq7.w;
       rq7 t = rq7.t;
       if (i1) {
          int len = stringArray1.length;
          i2 = 0;
          i3 = 0;
          i4 = 1;
          while (true) {
             if (i < len) {
                object oobject = stringArray1[i];
                if ((ojr7 = c1.y().l(oobject)) == null) {
                   es3.c().a(tm1.c, "Prerequisite "+oobject+" doesn\'t exist; not enqueuing");
                   otm11 = b;
                   ouq7 = c;
                label_00e8 :
                   ohq7 = m;
                   b1 = true;
                   i5 = 0;
                }else if((ojr7 = ojr7.b) == c2){
                   i6 = 1;
                }else {
                   i6 = 0;
                }
                i4 = i4 & i6;
                if (ojr7 == t) {
                   i3 = 1;
                }else if(ojr7 == w){
                   i2 = 1;
                }
                i = i + 1;
                b1 = this;
             }
          }
          return;
       }else {
          i2 = 0;
          i3 = 0;
          i4 = 1;
       }
       hq7 n = a.n;
       i6 = ((i = TextUtils.isEmpty(n) ^ 1) && !i1)? 1: 0;
       rq7 a1 = rq7.a;
       if (i6) {
          ArrayList uArrayList = c1.y().m(n);
          if (!uArrayList.isEmpty()) {
             i7 = i1;
             otm11 = b;
             nx1 t1 = nx1.t;
             ouq7 = c;
             if ((o = a.o) != nx1.c && o != t1) {
                if (o == nx1.b) {
                   iterator4 = uArrayList.iterator();
                   while (true) {
                      if (iterator4.hasNext()) {
                         if ((b3 = iterator4.next().b) != a1 && b3 != rq7.b) {
                            continue ;
                         }else {
                            goto label_00e8 ;
                         }
                      }
                   }
                   a.s = b1;
                   ouq7.r();
                   ouq7.m();
                   if ((0 | i5)) {
                      n55.a(ohq7.A, RescheduleReceiver.class, true);
                      t36.a(ohq7.B, ohq7.C, ohq7.E);
                   }
                   otm11.e(j45.p);
                }
                new pb0(m, n, false).run();
                olr7 = c1.y();
                iterator2 = uArrayList.iterator();
                while (iterator2.hasNext()) {
                   olr7.c(iterator2.next().a);
                }
                ohq71 = m;
                i8 = i;
                l1 = l;
                orq7 = a1;
                i1 = i7;
                iterator4 = 1;
             label_0202 :
                iterator2 = a.p.iterator();
                while (iterator2.hasNext()) {
                   dr7 uodr7 = iterator2.next();
                   dr7 b2 = uodr7.b;
                   if (on91 && !i4) {
                      if (i3) {
                         b2.b = t;
                      }else if(i2){
                         b2.b = w;
                      }else {
                         b2.b = rq7.v;
                      }
                      l = l1;
                   }else {
                      l = l1;
                      b2.n = l;
                   }
                   c2 = orq7;
                   if (b2.b == c2) {
                      olr7 = 1;
                   }
                   obj = c1.y();
                   i7 = olr7;
                   ohq7 = ohq71;
                   uq7 e = ohq7.E;
                   iterator1 = iterator2;
                   co5.o(e, "schedulers");
                   i5 = Build$VERSION.SDK_INT;
                   l1 = l;
                   i9 = (23 <= i5 && i5 < 26)? 1: 0;
                   if (i9) {
                      b2 = ry7.T(b2);
                   }else if(i5 <= 22){
                      str = "androidx.work.impl.background.gcm.GcmScheduler";
                      try{
                         Class uClass = Class.forName(str);
                         if (!e.isEmpty()) {
                            iterator4 = e.iterator();
                            while (true) {
                               if (iterator4.hasNext()) {
                                  if (uClass.isAssignableFrom(iterator4.next().getClass())) {
                                     iterator4 = 1;
                                  }else {
                                     continue ;
                                  }
                               }
                            }
                            if (i10) {
                               b2 = ry7.T(b2);
                            }
                         }
                      }catch(java.lang.ClassNotFoundException e0){
                      }
                      i10 = 0;
                   }
                   olr7 = obj.a;
                   lr7 olr71 = olr7;
                   olr71.b();
                   olr71.c();
                   obj.b.h(b2);
                   olr7.r();
                   olr71.m();
                   String str1 = "id.toString\(\)";
                   dr7 a3 = uodr7.a;
                   if (on91) {
                      i = stringArray1.length;
                      i9 = 0;
                      while (i9 < i) {
                         String str2 = a3.toString();
                         co5.l(str2, str1);
                         j91 oj91 = new j91(str2, stringArray1[i9]);
                         n91 on911 = c1.t();
                         on911.b.b();
                         on911.b.c();
                         on911.c.h(oj91);
                         on911.b.r();
                         on911.b.m();
                         i9 = i9 + 1;
                         stringArray1 = stringArray1;
                      }
                   }
                   String[] stringArray2 = stringArray1;
                   or7 oor7 = c1.z();
                   String str3 = a3.toString();
                   co5.l(str3, str1);
                   oor7.getClass();
                   uodr7 = uodr7.c;
                   co5.o(uodr7, "tags");
                   Iterator iterator3 = uodr7.iterator();
                   while (iterator3.hasNext()) {
                      oor7.a.b();
                      oor7.a.c();
                      oor7.b.h(new mr7(iterator3.next(), str3));
                      oor7.a.r();
                      oor7.a.m();
                   }
                   if (i8) {
                      xq7 oxq7 = c1.w();
                      str = a3.toString();
                      co5.l(str, str1);
                      oxq7.b.b();
                      oxq7.b.c();
                      oxq7.c.h(new wq7(n, str));
                      oxq7.b.r();
                      oxq7.b.m();
                   }
                   orq7 = c2;
                   i10 = i7;
                   iterator2 = iterator1;
                   stringArray1 = stringArray2;
                   ohq71 = ohq7;
                }
                ohq7 = ohq71;
                i5 = olr7;
                b1 = true;
             }else {
                on91 = c1.t();
                i8 = i;
                ArrayList uArrayList1 = new ArrayList();
                Iterator iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   iterator1 = iterator;
                   obj = iterator.next();
                   ohq71 = m;
                   ir7 a2 = obj.a;
                   on91.getClass();
                   orq7 = a1;
                   l1 = l;
                   i9 = 1;
                   zy5 ozy5 = zy5.x(i9, "SELECT COUNT\(*\)>0 FROM dependency WHERE prerequisite_id=?");
                   if (a2 == null) {
                      ozy5.z(i9);
                   }else {
                      ozy5.s(i9, a2);
                   }
                   on91.b.b();
                   i9 = false;
                   Cursor uCursor = vv7.J(on91.b, ozy5, i9);
                   i9 = (uCursor.moveToFirst() && uCursor.getInt(i9))? 1: 0;
                   uCursor.close();
                   ozy5.y();
                   if (!i9) {
                      i9 = ((a2 = obj.b) == c2)? 1: 0;
                      i9 = i4 & i9;
                      if (a2 == t) {
                         i3 = 1;
                      }else if(a2 == w){
                         i2 = 1;
                      }
                      uArrayList1.add(obj.a);
                      i4 = i9;
                   }
                   iterator = iterator1;
                   m = ohq71;
                   a1 = orq7;
                   l = l1;
                }
                ohq71 = m;
                l1 = l;
                orq7 = a1;
                if (o == t1 && (i2 && !i3)) {
                   olr7 = c1.y();
                   iterator2 = olr7.m(n).iterator();
                   while (iterator2.hasNext()) {
                      olr7.c(iterator2.next().a);
                   }
                   uArrayList1 = Collections.emptyList();
                   i2 = 0;
                   i3 = 0;
                }
                stringArray1 = uArrayList1.toArray(stringArray1);
                if (stringArray1.length > 0) {
                   on91 = 1;
                }else {
                   on91 = 0;
                }
             }
          }else {
          label_01f1 :
             otm11 = b;
             ouq7 = c;
             ohq71 = m;
             i8 = i;
             l1 = l;
             orq7 = a1;
             i7 = i1;
          }
       }else {
          goto label_01f1 ;
       }
       olr7 = 0;
       goto label_0202 ;
    }
}
