package p.no5;
import p.ci5;
import p.ne;
import p.r11;
import p.p11;
import p.t11;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Comparable;
import p.xe7;

public final class no5 extends ne implements ci5	// class@00201b from classes.dex
{
    public final t11 a;
    public final t11 b;
    public static final no5 c;

    static {
       no5.c = new no5(r11.b, p11.b);
    }
    public void no5(t11 p0,t11 p1){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
       if (p0.a(p1) <= 0 && (p0 != p11.b && p1 != r11.b)) {
          return;
       }
       StringBuilder str = new StringBuilder(16);
       p0.b(str);
       str = str+"..";
       p1.c(str);
       throw new IllegalArgumentException("Invalid range: "+str);
    }
    public final boolean apply(Object p0){
       return this.p(p0);
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof no5 && (this.a.equals(p0.a) && this.b.equals(p0.b))) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final boolean p(Comparable p0){
       p0.getClass();
       boolean b = (this.a.e(p0) && !this.b.e(p0))? true: false;
       return b;
    }
    public final no5 q(no5 p0){
       no5 ta = this.a;
       no5 a = p0.a;
       int i = ta.a(a);
       no5 tb = this.b;
       no5 b = p0.b;
       int i1 = tb.a(b);
       if (i >= 0 && i1 <= 0) {
          return this;
       }
       if (i <= 0 && i1 >= 0) {
          return p0;
       }
       if (i < 0) {
          ta = a;
       }
       if (i1 > 0) {
          tb = b;
       }
       a = (ta.a(tb) <= 0)? 1: 0;
       if (a) {
          return new no5(ta, tb);
       }else {
          Object[] objArray = new Object[]{this,p0};
          throw new IllegalArgumentException(xe7.E("intersection is undefined for disconnected ranges %s and %s", objArray));
       }
    }
    public Object readResolve(){
       no5 c = no5.c;
       if (this.equals(c)) {
          return c;
       }
       return this;
    }
    public final String toString(){
       StringBuilder str = new StringBuilder(16);
       this.a.b(str);
       str = str+"..";
       this.b.c(str);
       return str;
    }
}
