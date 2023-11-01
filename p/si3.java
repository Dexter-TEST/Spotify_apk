package p.si3;
import java.lang.Number;
import java.lang.String;
import java.io.ObjectInputStream;
import java.io.InvalidObjectException;
import java.lang.Object;
import java.math.BigDecimal;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;

public final class si3 extends Number	// class@002634 from classes.dex
{
    public final String a;

    public void si3(String p0){
       super();
       this.a = p0;
    }
    private void readObject(ObjectInputStream p0){
       throw new InvalidObjectException("Deserialization is unsupported");
    }
    private Object writeReplace(){
       return new BigDecimal(this.a);
    }
    public final double doubleValue(){
       return Double.parseDouble(this.a);
    }
    public final boolean equals(Object p0){
       si3 ta;
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof si3) {
          return false;
       }
       p0 = p0.a;
       if ((ta = this.a) != p0 && !ta.equals(p0)) {
          b = false;
       }
       return b;
    }
    public final float floatValue(){
       return Float.parseFloat(this.a);
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final int intValue(){
       si3 ta = this.a;
       try{
          int i = Integer.parseInt(ta);
          return i;
       }catch(java.lang.NumberFormatException e0){
          try{
             long l = Long.parseLong(e0);
             return (int)l;
          }catch(java.lang.NumberFormatException e0){
             return new BigDecimal(e0).intValue();
          }
       }
    }
    public final long longValue(){
       si3 ta = this.a;
       try{
          long l = Long.parseLong(ta);
          return l;
       }catch(java.lang.NumberFormatException e0){
          return new BigDecimal(e0).longValue();
       }
    }
    public final String toString(){
       return this.a;
    }
}
