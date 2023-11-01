package p.bm5;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class bm5	// class@0010f3 from classes.dex
{
    public final long a;
    public final long b;

    public void bm5(long p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || bm5.class != p0.getClass()) {
          return false;
       }
       if (this.b - p0.b) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       bm5 ta = this.a;
       bm5 tb = this.b;
       return (((int)(ta ^ (ta >> 32)) * 31) + (int)(tb ^ (tb >> 32)));
    }
    public final String toString(){
       return tp2.o("Entry{rate="+this.a+", initialDelay=", this.b, '}');
    }
}
