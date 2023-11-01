package p.t11;
import java.lang.Comparable;
import java.io.Serializable;
import java.lang.Object;
import p.r11;
import p.p11;
import p.no5;
import p.q11;
import java.lang.StringBuilder;
import p.qb1;

public abstract class t11 implements Comparable, Serializable	// class@0026db from classes.dex
{
    public final Comparable a;

    public void t11(Comparable p0){
       super();
       this.a = p0;
    }
    public int a(t11 p0){
       int i1;
       int i = 1;
       if (p0 == r11.b) {
          return i;
       }
       if (p0 == p11.b) {
          return -1;
       }
       if (i1 = this.a.compareTo(p0.a)) {
          return i1;
       }
       if ((v0 = this instanceof q11) == p0 instanceof q11) {
          i = 0;
       }else if(i1){
          i = -1;
       }
       return i;
    }
    public abstract void b(StringBuilder p0);
    public abstract void c(StringBuilder p0);
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public abstract Comparable d(qb1 p0);
    public abstract boolean e(Comparable p0);
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof t11) {
          try{
             if (!this.a(p0)) {
                b = true;
             }
          }catch(java.lang.ClassCastException e0){
          }
       }
       return b;
    }
    public abstract Comparable f(qb1 p0);
    public abstract t11 g(qb1 p0);
    public abstract t11 h(qb1 p0);
    public abstract int hashCode();
}
