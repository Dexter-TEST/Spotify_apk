package p.fv;
import p.ah0;
import java.util.Map;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import p.kk5;
import p.od7;
import p.gv;
import java.lang.Math;
import java.lang.StringBuilder;

public final class fv	// class@00164a from classes.dex
{
    public final ah0 a;
    public final Map b;

    public void fv(ah0 p0,Map p1){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null clock");
       }
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null values");
       }
       this.b = p1;
       return;
    }
    public final long a(kk5 p0,long p1,int p2){
       p1 = p1 - this.a.a();
       gv ogv = this.b.get(p0);
       gv a = ogv.a;
       p2--;
       gv ogv1 = ((a - 1) > 0)? a: 2;
       return Math.min(Math.max((long)((Math.pow(3.00f, (double)p2) * (double)a) * Math.max(0x3ff0000000000000, (Math.log(10000.00f) / Math.log((double)(ogv1 * (long)p2))))), p1), ogv.b);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof fv) {
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
       return "SchedulerConfig{clock="+this.a+", values="+this.b+"}";
    }
}
