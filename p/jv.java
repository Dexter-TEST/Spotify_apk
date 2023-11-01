package p.jv;
import p.lv;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import p.xq7;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.StringBuilder;

public final class jv	// class@001b56 from classes.dex
{
    public final lv a;
    public final List b;

    public void jv(lv p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static jv a(lv p0,ArrayList p1){
       xq7 oxq7 = new xq7(11);
       if (p0 == null) {
          throw new NullPointerException("Null entity");
       }
       oxq7.b = p0;
       oxq7.c = p1;
       return new jv(p0, p1);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof jv) {
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
       return "Show{entity="+this.a+", images="+this.b+"}";
    }
}
