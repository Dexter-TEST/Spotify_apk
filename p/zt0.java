package p.zt0;
import com.google.common.collect.e;
import p.qb1;
import p.kf4;
import java.util.Comparator;
import p.no5;
import java.lang.Class;
import java.lang.Object;
import p.r11;
import p.p11;
import java.lang.Integer;
import p.s11;
import java.lang.Comparable;
import p.t11;
import p.q11;
import java.util.Objects;
import com.google.common.collect.a;
import com.google.common.collect.f;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import p.ap5;
import java.util.NavigableSet;
import java.util.SortedSet;
import p.r91;
import java.lang.String;

public abstract class zt0 extends e	// class@002f5d from classes.dex
{
    public final qb1 x;

    public void zt0(qb1 p0){
       super(kf4.a);
       this.x = p0;
    }
    public static zt0 G(no5 p0,qb1 p1){
       no5 a;
       try{
          p1.getClass();
          r11 b = r11.b;
          int i = 0;
          int i1 = 1;
          int i2 = ((a = p0.a) != b)? 1: 0;
          p11 b1 = p11.b;
          no5 ono5 = (!i2)? p0.q(new no5(new s11(Integer.valueOf(Integer.MIN_VALUE)), b1)): p0;
          b1 = ((p0 = p0.b) != b1)? 1: 0;
          if (!b1) {
             ono5 = ono5.q(new no5(b, new q11(Integer.valueOf(Integer.MAX_VALUE))));
          }
          if (!ono5.a.equals(ono5.b)) {
             Comparable uComparable = a.f(p1);
             Objects.requireNonNull(uComparable);
             Comparable uComparable1 = p0.d(p1);
             Objects.requireNonNull(uComparable1);
             if (uComparable.compareTo(uComparable1) > 0) {
                i = 1;
             }
             i1 = i;
          }
          a uoa = (i1)? new a(p1): new f(ono5, p1);
          return uoa;
       }catch(java.util.NoSuchElementException e7){
          throw new IllegalArgumentException(e7);
       }
    }
    public final e A(Object p0,Object p1){
       p0.getClass();
       p1.getClass();
       boolean b = (this.t.compare(p0, p1) <= 0)? true: false;
       ap5.e(b);
       return this.J(p0, true, p1, false);
    }
    public final e B(Object p0,boolean p1,Object p2,boolean p3){
       p0.getClass();
       p2.getClass();
       boolean b = (this.t.compare(p0, p2) <= 0)? true: false;
       ap5.e(b);
       return this.J(p0, p1, p2, p3);
    }
    public e C(Object p0,boolean p1,Object p2,boolean p3){
       return this.J(p0, p1, p2, p3);
    }
    public final e D(Object p0){
       p0.getClass();
       return this.K(p0, true);
    }
    public final e E(Object p0,boolean p1){
       p0.getClass();
       return this.K(p0, p1);
    }
    public e F(Object p0,boolean p1){
       return this.K(p0, p1);
    }
    public abstract zt0 H(Comparable p0,boolean p1);
    public abstract no5 I();
    public abstract zt0 J(Comparable p0,boolean p1,Comparable p2,boolean p3);
    public abstract zt0 K(Comparable p0,boolean p1);
    public final NavigableSet headSet(Object p0,boolean p1){
       p0.getClass();
       return this.H(p0, p1);
    }
    public final SortedSet headSet(Object p0){
       p0.getClass();
       return this.H(p0, false);
    }
    public final NavigableSet subSet(Object p0,boolean p1,Object p2,boolean p3){
       p0.getClass();
       p2.getClass();
       boolean b = (this.t.compare(p0, p2) <= 0)? true: false;
       ap5.e(b);
       return this.J(p0, p1, p2, p3);
    }
    public final SortedSet subSet(Object p0,Object p1){
       p0.getClass();
       p1.getClass();
       boolean b = (this.t.compare(p0, p1) <= 0)? true: false;
       ap5.e(b);
       return this.J(p0, true, p1, false);
    }
    public e t(){
       return new r91(this);
    }
    public final NavigableSet tailSet(Object p0,boolean p1){
       p0.getClass();
       return this.K(p0, p1);
    }
    public final SortedSet tailSet(Object p0){
       p0.getClass();
       return this.K(p0, true);
    }
    public String toString(){
       return this.I().toString();
    }
    public final e x(Object p0){
       p0.getClass();
       return this.H(p0, false);
    }
    public final e y(Object p0,boolean p1){
       p0.getClass();
       return this.H(p0, p1);
    }
    public e z(Object p0,boolean p1){
       return this.H(p0, p1);
    }
}
