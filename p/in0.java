package p.in0;
import p.qb4;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import p.ms3;
import java.lang.Class;
import java.util.Iterator;
import p.jt;
import java.lang.Exception;
import p.xt;

public final class in0 implements qb4	// class@0019c6 from classes.dex
{
    public final List a;
    public final ArrayList b;

    public void in0(ArrayList p0){
       super();
       this.a = p0;
       ArrayList uArrayList = new ArrayList(p0);
       this.b = uArrayList;
       Collections.reverse(uArrayList);
    }
    public static in0 g(ms3 p0,qb4[] p1){
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(p0);
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p1[i];
          oobject.getClass();
          uArrayList.add(oobject);
       }
       return new in0(uArrayList);
    }
    public final void a(Object p0,Object p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public final void b(Object p0,jt p1){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, p1);
       }
       return;
    }
    public final void c(Object p0,Object p1,Exception p2){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0, p1, p2);
       }
       return;
    }
    public final void d(Object p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0);
       }
       return;
    }
    public final void e(Object p0,Exception p1){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p0, p1);
       }
       return;
    }
    public final void f(Object p0,Object p1,xt p2){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().f(p0, p1, p2);
       }
       return;
    }
}
