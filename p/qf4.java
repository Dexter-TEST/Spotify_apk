package p.qf4;
import p.ek3;
import p.ej7;
import p.bo2;
import p.v26;
import p.gg1;
import android.content.Context;
import p.gg4;
import android.os.Bundle;
import p.uj3;
import p.xg4;
import java.lang.String;
import java.lang.Object;
import p.fk3;
import p.u26;
import p.ir2;
import p.pf4;
import p.ay6;
import p.wf2;
import p.co5;
import p.ry7;
import java.lang.Enum;
import java.util.Set;
import android.os.BaseBundle;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import p.i01;
import p.me4;
import android.app.Application;
import java.util.Map;
import p.vj3;
import p.t26;
import p.dj7;
import p.bg4;
import java.util.LinkedHashMap;
import java.lang.IllegalStateException;

public final class qf4 implements ek3, ej7, bo2, v26	// class@00238f from classes.dex
{
    public boolean A;
    public final ay6 B;
    public uj3 C;
    public final Context a;
    public gg4 b;
    public final Bundle c;
    public uj3 t;
    public final xg4 v;
    public final String w;
    public final Bundle x;
    public final fk3 y;
    public final u26 z;

    static {
       gg1 ogg1 = new gg1(26, 0);
    }
    public void qf4(Context p0,gg4 p1,Bundle p2,uj3 p3,xg4 p4,String p5,Bundle p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = new fk3(this);
       this.z = ir2.p(this);
       this.B = new ay6(new pf4(this, 1));
       this.C = uj3.b;
    }
    public final void b(uj3 p0){
       co5.o(p0, "maxState");
       this.C = p0;
       this.c();
    }
    public final void c(){
       if (this.A == null) {
          qf4 tz = this.z;
          tz.a();
          this.A = true;
          if (this.v != null) {
             ry7.o(this);
          }
          tz.b(this.x);
       }
       qf4 ty = this.y;
       if (this.t.ordinal() < this.C.ordinal()) {
          ty.h(this.t);
       }else {
          ty.h(this.C);
       }
       return;
    }
    public final boolean equals(Object p0){
       Set set;
       int i;
       boolean b = false;
       if (p0 != null && (p0 instanceof qf4 && (co5.c(this.w, p0.w) && (co5.c(this.b, p0.b) && (co5.c(this.y, p0.y) && co5.c(this.z.b, p0.z.b)))))) {
          qf4 tc = this.c;
          p0 = p0.c;
          if (!co5.c(tc, p0)) {
             if (tc != null && (set = tc.keySet()) != null) {
                if (!set.isEmpty()) {
                   Iterator iterator = set.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         String str = iterator.next();
                         Object obj = tc.get(str);
                         Object obj1 = (p0 != null)? p0.get(str): null;
                         if (!co5.c(obj, obj1)) {
                            i = 0;
                            break ;
                         }
                      }
                   }
                   if (i == 1) {
                      i = 1;
                   label_007a :
                      if (!i) {
                      label_007d :
                         return b;
                      }
                   }
                }
                i = 1;
             }
             i = 0;
             goto label_007a ;
          }
          b = true;
          goto label_007d ;
       }else {
          goto label_007d ;
       }
    }
    public final i01 getDefaultViewModelCreationExtras(){
       qf4 ta;
       qf4 tc;
       me4 ome4 = new me4(0);
       Context uContext = null;
       Context applicationC = ((ta = this.a) != null)? ta.getApplicationContext(): uContext;
       if (applicationC instanceof Application) {
          uContext = applicationC;
       }
       i01 a = ome4.a;
       if (uContext != null) {
          a.put(gg1.B, uContext);
       }
       a.put(ry7.I, this);
       a.put(ry7.J, this);
       if ((tc = this.c) != null) {
          a.put(ry7.K, tc);
       }
       return ome4;
    }
    public final vj3 getLifecycle(){
       return this.y;
    }
    public final t26 getSavedStateRegistry(){
       return this.z.b;
    }
    public final dj7 getViewModelStore(){
       int i;
       qf4 tv;
       dj7 uodj7;
       if (this.A == null) {
          throw new IllegalStateException("You cannot access the NavBackStackEntry\'s ViewModels until it is added to the NavController\'s back stack \(i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state\).".toString());
       }
       i = (this.y.c != uj3.a)? 1: 0;
       if (i) {
          if ((tv = this.v) != null) {
             qf4 tw = this.w;
             co5.o(tw, "backStackEntryId");
             bg4 t = tv.t;
             if ((uodj7 = t.get(tw)) == null) {
                uodj7 = new dj7();
                t.put(tw, uodj7);
             }
             return uodj7;
          }else {
             throw new IllegalStateException("You must call setViewModelStore\(\) on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
          }
       }else {
          throw new IllegalStateException("You cannot access the NavBackStackEntry\'s ViewModels after the NavBackStackEntry is destroyed.".toString());
       }
    }
    public final int hashCode(){
       qf4 tc;
       Set set;
       Object obj;
       int i = this.b.hashCode() + (this.w.hashCode() * 31);
       if ((tc = this.c) != null && (set = tc.keySet()) != null) {
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             i = i * 31;
             int i1 = ((obj = tc.get(iterator.next())) != null)? obj.hashCode(): 0;
             i = i + i1;
          }
       }
       return (this.z.b.hashCode() + ((this.y.hashCode() + (i * 31)) * 31));
    }
}
