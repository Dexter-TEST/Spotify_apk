package p.ab2;
import java.lang.Iterable;
import java.lang.Object;
import p.c0;
import p.jj5;
import java.lang.Class;
import p.za2;
import p.ci5;
import p.pd3;
import p.r45;
import com.google.common.collect.c;
import p.vr1;
import p.dt5;
import java.util.Iterator;
import p.k73;
import p.m73;
import com.google.common.collect.d;
import java.util.Collection;
import com.google.common.collect.g;
import p.dl6;
import p.d73;
import p.mb2;
import p.ys5;
import p.v45;
import p.ek0;
import java.util.Comparator;
import java.util.ArrayList;
import p.w51;
import java.util.Arrays;
import p.jg2;
import java.lang.String;
import java.lang.StringBuilder;

public abstract class ab2 implements Iterable	// class@000f4b from classes.dex
{
    public final r45 a;

    public void ab2(){
       super();
       this.a = c0.a;
    }
    public void ab2(Iterable p0){
       super();
       p0.getClass();
       this.a = new jj5(p0);
    }
    public static ab2 b(Iterable p0){
       if (p0 instanceof ab2) {
       }else {
          za2 oza2 = new za2(p0, p0);
       }
       return p0;
    }
    public final ab2 a(ci5 p0){
       Iterable iterable = this.c();
       iterable.getClass();
       return ab2.b(new pd3(iterable, p0, 0));
    }
    public final Iterable c(){
       return this.a.e(this);
    }
    public final c d(){
       return c.n(this.c());
    }
    public final dt5 g(vr1 p0){
       Iterator iterator = this.c().iterator();
       k73 ok73 = m73.a();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          ok73.d(obj, p0.apply(obj));
       }
       return ok73.b(false);
    }
    public final d k(){
       d uod;
       Iterable iterable = this.c();
       if (iterable instanceof Collection) {
          uod = d.o(iterable);
       }else {
          Iterator iterator = iterable.iterator();
          if (!iterator.hasNext()) {
             uod = g.A;
          }else {
             Object obj = iterator.next();
             if (!iterator.hasNext()) {
                uod = new dl6(obj);
             }else {
                d73 uod73 = new d73();
                uod73.F0(obj);
                while (iterator.hasNext()) {
                   uod73.F0(iterator.next());
                }
                uod = uod73.H0();
             }
          }
       }
       return uod;
    }
    public final ys5 l(mb2 p0){
       if (p0 instanceof v45) {
       }else {
          ek0 uoek0 = new ek0(p0);
       }
       Iterable iterable = this.c();
       if (iterable instanceof Collection) {
       }else {
          Iterator iterator = iterable.iterator();
          ArrayList uArrayList = new ArrayList();
          iterator.getClass();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next());
          }
          iterable = uArrayList;
       }
       Object[] objArray = iterable.toArray();
       w51.e(objArray.length, objArray);
       Arrays.sort(objArray, p0);
       return c.m(objArray.length, objArray);
    }
    public final ab2 m(jg2 p0){
       Iterable iterable = this.c();
       iterable.getClass();
       return ab2.b(new pd3(iterable, p0, 1));
    }
    public final String toString(){
       Iterator iterator = this.c().iterator();
       String str = "[";
       int i = 1;
       while (iterator.hasNext()) {
          if (!i) {
             str = str.append(", ");
          }
          str = str.append(iterator.next());
          i = 0;
       }
       return str+']';
    }
}
