package p.gs;
import p.fz0;
import java.lang.String;
import p.cz0;
import p.dz0;
import p.ez0;
import java.lang.Object;
import java.lang.StringBuilder;

public final class gs extends fz0	// class@001771 from classes.dex
{
    public final long a;
    public final String b;
    public final cz0 c;
    public final dz0 d;
    public final ez0 e;

    public void gs(long p0,String p1,cz0 p2,dz0 p3,ez0 p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean equals(Object p0){
       gs te;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof fz0) {
          return false;
       }
       if (!(this.a - p0.a) && (this.b.equals(p0.b) && (this.c.equals(p0.c) && this.d.equals(p0.d)))) {
          p0 = p0.e;
          if ((te = this.e) == null) {
             if (p0 == null) {
             label_0044 :
                return b;
             }
          }else if(te.equals(p0)){
             goto label_0044 ;
          }
       }
       b = false;
       goto label_0044 ;
    }
    public final int hashCode(){
       gs ta = this.a;
       int i = ((((((((int)(ta ^ (ta >> 32)) ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243;
       int i1 = ((ta = this.e) == null)? 0: ta.hashCode();
       return (i1 ^ i);
    }
    public final String toString(){
       return "Event{timestamp="+this.a+", type="+this.b+", app="+this.c+", device="+this.d+", log="+this.e+"}";
    }
}
