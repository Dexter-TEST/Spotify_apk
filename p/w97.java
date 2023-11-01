package p.w97;
import java.io.Serializable;
import java.lang.Integer;
import p.ju1;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;

public final class w97 implements Serializable	// class@002af3 from classes.dex
{
    public final Object a;
    public final Object b;
    public final Object c;

    public void w97(Integer p0,ju1 p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof w97) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       w97 ta;
       w97 tb;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       i1 = i1 * 31;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       i1 = (i1 + i2) * 31;
       if ((tb = this.c) != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final String toString(){
       return "\("+this.a+", "+this.b+", "+this.c+')';
    }
}
