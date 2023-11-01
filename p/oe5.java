package p.oe5;
import p.ty0;
import p.sp6;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class oe5 extends ty0	// class@002105 from classes.dex
{
    public final sp6 m;

    public void oe5(){
       super();
       this.m = sp6.z;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof oe5) {
          return false;
       }
       if (this.m != p0.m) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.m.hashCode();
    }
    public final String toString(){
       return "SpotifyIconPlaceholder\(icon="+this.m+')';
    }
}
