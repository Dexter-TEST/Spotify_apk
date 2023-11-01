package p.gg3;
import p.jf3;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Object;
import java.lang.Number;
import java.lang.String;
import java.math.BigInteger;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Short;
import java.lang.Byte;
import p.si3;
import java.lang.Double;

public final class gg3 extends jf3	// class@001701 from classes.dex
{
    public final Serializable a;

    public void gg3(Boolean p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public void gg3(Number p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public void gg3(String p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public static boolean c(gg3 p0){
       p0 = p0.a;
       boolean b = (p0 instanceof Number && (p0 instanceof BigInteger && (!p0 instanceof Long && (!p0 instanceof Integer && (!p0 instanceof Short && !p0 instanceof Byte)))))? true: false;
       return b;
    }
    public final Number a(){
       gg3 ta = this.a;
       si3 osi3 = (ta instanceof String)? new si3(ta): ta;
       return osi3;
    }
    public final String b(){
       gg3 ta = this.a;
       if (ta instanceof Number) {
          return this.a().toString();
       }
       if (ta instanceof Boolean) {
          return ta.toString();
       }
       return ta;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || gg3.class != p0.getClass()) {
          return false;
       }
       gg3 ta = this.a;
       gg3 a = p0.a;
       if (ta == null) {
          if (a != null) {
             b = false;
          }
          return b;
       }else if(gg3.c(this) && gg3.c(p0)){
          if (this.a().longValue() - p0.a().longValue()) {
             b = false;
          }
          return b;
       }else if(ta instanceof Number && a instanceof Number){
          double d = this.a().doubleValue();
          double d1 = p0.a().doubleValue();
          if ((d1 - d) && (!Double.isNaN(d) && Double.isNaN(d1))) {
             b = false;
          }
          return b;
       }else {
          return ta.equals(a);
       }
    }
    public final int hashCode(){
       gg3 ta;
       long l;
       if ((ta = this.a) == null) {
          return 31;
       }
       if (gg3.c(this)) {
          l = this.a().longValue();
       }else if(ta instanceof Number){
          l = Double.doubleToLongBits(this.a().doubleValue());
       }else {
          return ta.hashCode();
       }
       return (int)(l ^ (l >> 32));
    }
}
