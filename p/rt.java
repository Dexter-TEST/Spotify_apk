package p.rt;
import p.zq7;
import p.r45;
import com.google.common.collect.d;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class rt	// class@002559 from classes.dex
{
    public final r45 a;
    public final r45 b;
    public final d c;
    public final d d;
    public static final rt e;

    static {
       rt.e = new zq7(13).e();
    }
    public void rt(r45 p0,r45 p1,d p2,d p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof rt) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || !this.d.equals(p0.d)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode());
    }
    public final String toString(){
       return "LoggingParams{commandInitiatedTime="+this.a+", commandReceivedTime="+this.b+", pageInstanceIds="+this.c+", interactionIds="+this.d+"}";
    }
}
