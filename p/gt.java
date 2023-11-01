package p.gt;
import p.r45;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class gt	// class@00177a from classes.dex
{
    public final r45 a;
    public final r45 b;

    public void gt(r45 p0,r45 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof gt) {
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
       return "FacebookGraphResponse{error="+this.a+", data="+this.b+"}";
    }
}
