package p.ou;
import p.ks0;
import p.kf5;
import p.r45;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class ou	// class@002195 from classes.dex
{
    public final ks0 a;
    public final kf5 b;
    public final r45 c;
    public final r45 d;
    public final r45 e;

    public void ou(ks0 p0,kf5 p1,r45 p2,r45 p3,r45 p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ou) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || (!this.d.equals(p0.d) || !this.e.equals(p0.e))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243) ^ this.e.hashCode());
    }
    public final String toString(){
       return "PlayCommand{context="+this.a+", playOrigin="+this.b+", options="+this.c+", playOptions="+this.d+", loggingParams="+this.e+"}";
    }
}
