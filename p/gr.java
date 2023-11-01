package p.gr;
import p.ir;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import p.aw1;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.lang.StringBuilder;

public final class gr	// class@001768 from classes.dex
{
    public final ir a;
    public final List b;
    public final List c;

    public void gr(ir p0,List p1,List p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static gr a(ir p0,ArrayList p1,ArrayList p2){
       aw1 uoaw1 = new aw1();
       if (p0 == null) {
          throw new NullPointerException("Null entity");
       }
       uoaw1.a = p0;
       uoaw1.b = p1;
       uoaw1.c = p2;
       String str = "";
       if (str.isEmpty()) {
          return new gr(uoaw1.a, uoaw1.b, uoaw1.c);
       }
       throw new IllegalStateException("Missing required properties:".concat(str));
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof gr) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || !this.c.equals(p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode());
    }
    public final String toString(){
       return "Album{entity="+this.a+", artists="+this.b+", images="+this.c+"}";
    }
}
