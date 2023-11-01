package p.ur7;
import java.lang.Runnable;
import java.lang.String;
import p.es3;
import p.tr7;
import java.lang.Object;
import p.bm3;
import p.pc6;
import android.content.Context;
import p.ce7;
import p.ic2;
import p.jr7;
import java.util.List;
import p.fm3;
import p.bo0;
import androidx.work.impl.WorkDatabase;
import p.lr7;
import p.n91;
import p.em3;
import p.dm3;
import java.lang.Class;
import p.xy5;
import p.rq7;
import p.h51;
import java.lang.System;
import java.util.ArrayList;
import java.util.Iterator;
import p.cm3;
import p.zq7;
import p.k36;
import p.t36;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import p.n55;
import p.wk5;
import java.util.HashMap;
import java.lang.Boolean;
import java.util.Objects;
import java.util.LinkedList;
import java.util.AbstractCollection;
import java.util.Collection;
import java.lang.StringBuilder;
import p.x93;
import java.lang.reflect.Constructor;
import p.en6;
import java.lang.Throwable;
import p.zy5;
import android.database.Cursor;
import p.vv7;
import androidx.work.WorkerParameters;
import java.util.UUID;
import p.ar7;
import p.pq7;
import java.util.concurrent.ExecutorService;
import p.sr7;
import p.nq7;
import p.oc2;
import java.util.concurrent.Executor;
import p.ij;
import p.kj;
import p.x0;
import p.t5;
import p.ta6;

public final class ur7 implements Runnable	// class@00290a from classes.dex
{
    public final WorkDatabase A;
    public final lr7 B;
    public final n91 C;
    public final List D;
    public String E;
    public final pc6 F;
    public final pc6 G;
    public boolean H;
    public final Context a;
    public final String b;
    public final List c;
    public final jr7 t;
    public fm3 v;
    public final ce7 w;
    public em3 x;
    public final bo0 y;
    public final ic2 z;
    public static final String I;

    static {
       ur7.I = es3.d("WorkerWrapper");
    }
    public void ur7(tr7 p0){
       super();
       this.x = new bm3();
       this.F = new pc6();
       this.G = new pc6();
       this.a = p0.a;
       this.w = p0.t;
       this.z = p0.c;
       tr7 x = p0.x;
       this.t = x;
       this.b = x.a;
       this.c = p0.y;
       this.v = p0.b;
       this.y = p0.v;
       x = p0.w;
       this.A = x;
       this.B = x.y();
       this.C = x.t();
       this.D = p0.z;
    }
    public final void a(em3 p0){
       ur7 tt = this.t;
       if (p0 instanceof dm3) {
          es3.c().getClass();
          if (tt.c()) {
             this.d();
          }else {
             ur7 tC = this.C;
             ur7 tb = this.b;
             tt = this.B;
             ur7 tA = this.A;
             tA.c();
             tt.u(rq7.c, tb);
             tt.t(tb, this.x.a);
             long l = System.currentTimeMillis();
             Iterator iterator = tC.e(tb).iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                if (tt.j(str) == rq7.v && tC.f(str)) {
                   es3.c().getClass();
                   tt.u(rq7.a, str);
                   tt.s(str, l);
                }
             }
             tA.r();
             tA.m();
             this.e(false);
          }
       }else if(p0 instanceof cm3){
          es3.c().getClass();
          this.c();
       }else {
          es3.c().getClass();
          if (tt.c()) {
             this.d();
          }else {
             this.g();
          }
       }
       return;
    }
    public final void b(){
       ur7 tc;
       ur7 tb = this.b;
       ur7 tA = this.A;
       if (!this.h()) {
          tA.c();
          rq7 orq7 = this.B.j(tb);
          tA.x().j(tb);
          if (orq7 == null) {
             this.e(false);
          }else if(orq7 == rq7.b){
             this.a(this.x);
          }else if(!orq7.a()){
             this.c();
          }
          tA.r();
          tA.m();
       }
       if ((tc = this.c) != null) {
          Iterator iterator = tc.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(tb);
          }
          t36.a(this.y, tA, tc);
       }
       return;
    }
    public final void c(){
       ur7 tb = this.b;
       ur7 tB = this.B;
       ur7 tA = this.A;
       tA.c();
       tB.u(rq7.a, tb);
       tB.s(tb, System.currentTimeMillis());
       tB.q(tb, -1);
       tA.r();
       tA.m();
       this.e(true);
    }
    public final void d(){
       ur7 tb = this.b;
       ur7 tB = this.B;
       ur7 tA = this.A;
       tA.c();
       tB.s(tb, System.currentTimeMillis());
       tB.u(rq7.a, tb);
       tB.r(tb);
       tB.o(tb);
       tB.q(tb, -1);
       tA.r();
       tA.m();
       this.e(false);
    }
    public final void e(boolean p0){
       this.A.c();
       if (!this.A.y().n()) {
          n55.a(this.a, RescheduleReceiver.class, false);
       }
       if (p0) {
          this.B.u(rq7.a, this.b);
          this.B.q(this.b, -1);
       }
       if (this.t != null && this.v != null) {
          ur7 tz = this.z;
          wk5 c = tz.C;
          _monitor_enter(c);
          _monitor_exit(c);
          if (tz.w.containsKey(this.b)) {
             this.z.j(this.b);
          }
       }
       this.A.r();
       this.A.m();
       this.F.i(Boolean.valueOf(p0));
       return;
    }
    public final void f(){
       rq7 orq7;
       if ((orq7 = this.B.j(this.b)) == rq7.b) {
          es3.c().getClass();
          this.e(true);
       }else {
          Objects.toString(orq7);
          es3.c().getClass();
          this.e(false);
       }
       return;
    }
    public final void g(){
       ur7 tB;
       ur7 tb = this.b;
       ur7 tA = this.A;
       tA.c();
       LinkedList linkedList = new LinkedList();
       linkedList.add(tb);
       while (true) {
          tB = this.B;
          if (!linkedList.isEmpty()) {
             String str = linkedList.remove();
             if (tB.j(str) != rq7.w) {
                tB.u(rq7.t, str);
             }
             linkedList.addAll(this.C.e(str));
          }else {
             break ;
          }
       }
       tB.t(tb, this.x.a);
       tA.r();
       tA.m();
       this.e(false);
       return;
    }
    public final boolean h(){
       rq7 orq7;
       if (this.H == null) {
          return false;
       }
       es3.c().getClass();
       if ((orq7 = this.B.j(this.b)) == null) {
          this.e(false);
       }else {
          this.e((orq7.a() ^ true));
       }
       return true;
    }
    public final void run(){
       int i2;
       Object[] objArray;
       jr7 e;
       nq7 a2;
       x93 ox93;
       ur7 our7 = this;
       ur7 b = our7.b;
       String str = "Work [ id="+b+", tags={ ";
       Iterator iterator = our7.D.iterator();
       int i = 1;
       int i1 = 1;
       while (true) {
          i2 = 0;
          if (iterator.hasNext()) {
             String str1 = iterator.next();
             if (i1) {
                i1 = 0;
             }else {
                str = str.append(", ");
             }
             str = str.append(str1);
          }else {
             break ;
          }
       }
       our7.E = str+" } ]";
       ur7 t = our7.t;
       if (!this.h()) {
          ur7 a = our7.A;
          a.c();
          rq7 a1 = rq7.a;
          if (t.b != a1) {
             this.f();
             a.r();
             es3.c().getClass();
          }else {
             jr7 c = t.c;
             if (!t.c()) {
                str = (t.b == a1 && t.k > null)? 1: 0;
                if (!str) {
                label_009f :
                   a.r();
                   a.m();
                   ur7 b1 = our7.B;
                   String i3 = ur7.I;
                   ur7 y = our7.y;
                   if (t.c()) {
                      e = t.e;
                   }else {
                      jr7 d = t.d;
                      y.d.getClass();
                      try{
                         str = x93.a;
                         Class[] uClassArray = new Class[i2];
                         Object[] objArray2 = new Object[i2];
                         ox93 = Class.forName(d).getDeclaredConstructor(uClassArray).newInstance(objArray2);
                      }catch(java.lang.Exception e0){
                         es3.c().b(x93.a, en6.n("Trouble instantiating + ", d), e0);
                         ox93 = null;
                      }
                      if (ox93 == null) {
                         es3.c().a(i3, "Could not create Input Merger "+t.d);
                         this.g();
                      }else {
                         ArrayList uArrayList = new ArrayList();
                         uArrayList.add(t.e);
                         b1.getClass();
                         zy5 ozy5 = zy5.x(i, "SELECT output FROM workspec WHERE id IN\n             \(SELECT prerequisite_id FROM dependency WHERE work_spec_id=?\)");
                         if (b == null) {
                            ozy5.z(i);
                         }else {
                            ozy5.s(i, b);
                         }
                         lr7 a3 = b1.a;
                         a3.b();
                         Cursor uCursor = vv7.J(a3, ozy5, i2);
                         ArrayList uArrayList1 = new ArrayList(uCursor.getCount());
                         while (uCursor.moveToNext()) {
                            byte[] uobyteArray = (uCursor.isNull(i2))? null: uCursor.getBlob(i2);
                            uArrayList1.add(h51.a(uobyteArray));
                         }
                         uCursor.close();
                         ozy5.y();
                         uArrayList.addAll(uArrayList1);
                         e = ox93.a(uArrayList);
                      }
                   }
                   jr7 ojr7 = e;
                   rq7 orq7 = a1;
                   ur7 our71 = b;
                   b = our7.w;
                   WorkerParameters e1 = new WorkerParameters(UUID.fromString(b), ojr7, our7.D, y.a, our7.w, y.c, new pq7(a, our7.z, b));
                   if (our7.v == null) {
                      y.c.getClass();
                      our7.v = sr7.a(our7.a, c, e);
                   }
                   if ((t = our7.v) == null) {
                      es3.c().a(i3, "Could not create Worker "+c);
                      this.g();
                   }else if(t.t != null){
                      es3.c().a(i3, "Received an already-used Worker "+c+"; Worker Factory should return new instances");
                      this.g();
                   }else {
                      t.t = true;
                      a.c();
                      t = our71;
                      if (b1.j(t) == orq7) {
                         b1.u(rq7.b, t);
                         b1.p(t);
                         objArray = 1;
                      }else {
                         a2 = 0;
                      }
                      a.r();
                      a.m();
                      if (objArray) {
                         if (!this.h()) {
                            nq7 objArray1 = new nq7(our7.a, our7.t, our7.v, e.f, our7.w);
                            b.c.execute(objArray);
                            a2 = objArray.a;
                            ur7 g = our7.G;
                            g.a(new ij(our7, 7, a2), new kj(1));
                            a2.a(new t5(our7, 6, a2), b.c);
                            g.a(new t5(our7, 7, our7.E), b.a);
                         }
                      }else {
                         this.f();
                      }
                   }
                }
             }
             if ((System.currentTimeMillis() - t.a()) < 0) {
                objArray = new Object[i];
                objArray[i2] = c;
                String.format("Delaying execution for %s because it is being executed before schedule.", objArray);
                es3.c().getClass();
                our7.e(i);
                a.r();
             }else {
                goto label_009f ;
             }
          }
          a.m();
       }
       return;
    }
}
