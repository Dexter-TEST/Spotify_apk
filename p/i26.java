package p.i26;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class i26	// class@001910 from classes.dex
{
    public final long a;
    public final long b;
    public final long c;

    public void i26(long p0,long p1,long p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || i26.class != p0.getClass()) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       if (this.c - p0.c) {
          return false;
       }
       if (this.b - p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       i26 ta = this.a;
       i26 tb = this.b;
       tb = this.c;
       return (((((int)(ta ^ (ta >> 32)) * 31) + (int)(tb ^ (tb >> 32))) * 31) + (int)(tb ^ (tb >> 32)));
    }
    public final String toString(){
       return tp2.o("Entry{firstChunk="+this.a+", samplesPerChunk="+this.b+", sampleDescriptionIndex=", this.c, '}');
    }
}
