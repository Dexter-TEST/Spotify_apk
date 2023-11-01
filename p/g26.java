package p.g26;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class g26	// class@001689 from classes.dex
{
    public final int a;

    public void g26(int p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || g26.class != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a;
    }
    public final String toString(){
       g26 ta = this.a;
       return tp2.n("Entry{isLeading="+((ta >> 6) & 0x03)+", sampleDependsOn="+((ta >> 4) & 0x03)+", sampleIsDependentOn="+((ta >> 2) & 0x03)+", sampleHasRedundancy=", (ta & 0x03), '}');
    }
}
