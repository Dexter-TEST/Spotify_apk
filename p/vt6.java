package p.vt6;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class vt6	// class@002a62 from classes.dex
{
    public final long a;
    public final long b;
    public final long c;

    public void vt6(long p0,long p1,long p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof vt6) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       if (this.b - p0.b) {
          return false;
       }
       if (this.c - p0.c) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       vt6 ta = this.a;
       vt6 tb = this.b;
       tb = this.c;
       return (((((int)(ta ^ (ta >> 32)) * 31) + (int)(tb ^ (tb >> 32))) * 31) + (int)(tb ^ (tb >> 32)));
    }
    public final String toString(){
       return tp2.o("StorageStructure\(totalBytes="+this.a+", freeBytes="+this.b+", usedBytes=", this.c, ')');
    }
}
