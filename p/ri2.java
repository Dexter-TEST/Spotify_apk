package p.ri2;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import p.co5;
import java.lang.StringBuilder;

public final class ri2	// class@0024f1 from classes.dex
{
    public final String a;
    public final String b;
    public final Object c;
    public final Long d;

    public void ri2(String p0,String p1,Object p2,Long p3){
       co5.o(p0, "identifier");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ri2) {
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
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       ri2 tb;
       int i = this.a.hashCode() * 31;
       int i1 = 0;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       i = (i + i2) * 31;
       i2 = ((tb = this.c) == null)? 0: tb.hashCode();
       i = (i + i2) * 31;
       if ((tb = this.d) != null) {
          i1 = tb.hashCode();
       }
       return (i + i1);
    }
    public final String toString(){
       return "GenericPoint\(identifier="+this.a+", featureId="+this.b+", timestamp="+this.c+", duration="+this.d+')';
    }
}
