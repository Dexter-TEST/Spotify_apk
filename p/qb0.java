package p.qb0;
import java.lang.Runnable;
import java.lang.Object;
import p.vx5;
import p.uq7;
import java.lang.String;
import p.lr7;
import androidx.work.impl.WorkDatabase;
import p.n91;
import java.util.LinkedList;
import java.util.AbstractCollection;
import p.rq7;
import java.util.ArrayList;
import java.util.Collection;
import p.wk5;
import p.es3;
import java.lang.Class;
import java.util.HashSet;
import java.util.HashMap;
import p.ur7;
import java.util.Iterator;
import java.util.List;
import p.k36;
import p.j45;
import p.lv1;
import p.g45;
import java.lang.Throwable;

public abstract class qb0 implements Runnable	// class@002368 from classes.dex
{
    public final vx5 a;

    public void qb0(){
       super();
       this.a = new vx5(1);
    }
    public static void a(uq7 p0,String p1){
       String str;
       rq7 orq7;
       ur7 our7;
       uq7 c = p0.C;
       lr7 olr7 = c.y();
       n91 on91 = c.t();
       LinkedList linkedList = new LinkedList();
       linkedList.add(p1);
       while (!linkedList.isEmpty()) {
          str = linkedList.remove();
          if ((orq7 = olr7.j(str)) != rq7.c && orq7 != rq7.t) {
             olr7.u(rq7.w, str);
          }
          linkedList.addAll(on91.e(str));
       }
       c = p0.F;
       wk5 c1 = c.C;
       _monitor_enter(c1);
       es3.c().getClass();
       c.A.add(p1);
       str = ((our7 = c.w.remove(p1)) != null)? 1: 0;
       if (our7 == null) {
          our7 = c.x.remove(p1);
       }
       if (our7 != null) {
          c.y.remove(p1);
       }
       _monitor_exit(c1);
       wk5.d(our7);
       if (str) {
          c.k();
       }
       Iterator iterator = p0.E.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p1);
       }
       return;
    }
    public abstract void b();
    public final void run(){
       this.b();
       this.a.e(j45.p);
       return;
    }
}
