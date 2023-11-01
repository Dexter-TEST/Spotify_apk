package p.nb3;
import java.io.Serializable;
import p.mb3;
import p.y55;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class nb3 implements Serializable	// class@001fa4 from classes.dex
{
    public final mb3 a;
    public final y55 b;

    public void nb3(mb3 p0,y55 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof nb3) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       nb3 tb;
       int i = this.a.hashCode() * 31;
       int i1 = ((tb = this.b) == null)? 0: tb.hashCode();
       return (i + i1);
    }
    public final String toString(){
       return "InteractionLoggingResult\(interactionId="+this.a+", pageInstanceId="+this.b+')';
    }
}
