package p.t65;
import java.io.Serializable;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class t65 implements Serializable	// class@00270d from classes.dex
{
    public final Object a;
    public final Object b;

    public void t65(Object p0,Object p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof t65) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       t65 ta;
       t65 tb;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       i1 = i1 * 31;
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final String toString(){
       return "\("+this.a+", "+this.b+')';
    }
}
