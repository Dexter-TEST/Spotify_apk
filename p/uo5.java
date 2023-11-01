package p.uo5;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class uo5	// class@0028ee from classes.dex
{
    public final int a;
    public final short b;

    public void uo5(int p0,short p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || uo5.class != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((this.a * 31) + this.b);
    }
    public final String toString(){
       return tp2.n("{availableBitrate="+this.a+", targetRateShare=", this.b, '}');
    }
}
