package p.qv;
import p.rl6;
import p.r45;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class qv extends rl6	// class@002425 from classes.dex
{
    public final r45 b;
    public final r45 c;
    public final r45 d;
    public final r45 e;
    public final r45 f;

    public void qv(r45 p0,r45 p1,r45 p2,r45 p3,r45 p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof rl6) {
          return false;
       }
       if (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || (!this.d.equals(p0.d) || (!this.e.equals(p0.e) || !this.f.equals(p0.f))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((((((this.b.hashCode() ^ 0xf4243) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243) ^ this.e.hashCode()) * 0xf4243) ^ this.f.hashCode());
    }
    public final String toString(){
       return "SkipToTrack{pageUrl="+this.b+", pageIndex="+this.c+", trackUid="+this.d+", trackUri="+this.e+", trackIndex="+this.f+"}";
    }
}
