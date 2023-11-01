package p.j26;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class j26	// class@001a53 from classes.dex
{
    public final long a;
    public final int b;

    public void j26(int p0,long p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || j26.class != p0.getClass()) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       j26 ta = this.a;
       return (((int)(ta ^ (ta >> 32)) * 31) + this.b);
    }
    public final String toString(){
       return tp2.n("Entry{sampleCount="+this.a+", groupDescriptionIndex=", this.b, '}');
    }
}
