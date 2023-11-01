package p.jt;
import java.lang.Object;
import java.util.Set;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.StringBuilder;

public final class jt	// class@001b44 from classes.dex
{
    public final Object a;
    public final Set b;

    public void jt(Object p0,Set p1){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null model");
       }
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null effects");
       }
       this.b = p1;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof jt) {
          return false;
       }
       if (!this.a.equals(p0.a) || !this.b.equals(p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode());
    }
    public final String toString(){
       return "First{model="+this.a+", effects="+this.b+"}";
    }
}
