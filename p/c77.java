package p.c77;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class c77	// class@0011b2 from classes.dex
{
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;

    public void c77(){
       super();
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || c77.class != p0.getClass()) {
          return false;
       }
       if (this.b - p0.b) {
          return false;
       }
       if (this.e - p0.e) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       if (this.c - p0.c) {
          return false;
       }
       if (this.d - p0.d) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       c77 ta = this.a;
       c77 tb = this.b;
       tb = this.c;
       tb = this.d;
       tb = this.e;
       return (((((((((int)(ta ^ (ta >> 32)) * 31) + (int)(tb ^ (tb >> 32))) * 31) + (int)(tb ^ (tb >> 32))) * 31) + (int)(tb ^ (tb >> 32))) * 31) + (int)(tb ^ (tb >> 32)));
    }
    public final String toString(){
       return tp2.o("Entry{time="+this.a+", moofOffset="+this.b+", trafNumber="+this.c+", trunNumber="+this.d+", sampleNumber=", this.e, '}');
    }
}
