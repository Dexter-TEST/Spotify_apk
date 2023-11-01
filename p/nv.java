package p.nv;
import p.r45;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class nv	// class@00205c from classes.dex
{
    public final r45 a;
    public final r45 b;
    public final r45 c;

    public void nv(r45 p0,r45 p1,r45 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof nv) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || !this.c.equals(p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode());
    }
    public final String toString(){
       return "SkipToPrevTrackCommand{track="+this.a+", options="+this.b+", loggingParams="+this.c+"}";
    }
}
