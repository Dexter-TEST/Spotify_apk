package p.v66;
import p.b76;
import p.b43;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.z76;
import p.kl4;
import p.tp2;
import java.lang.StringBuilder;

public final class v66 extends b76	// class@002991 from classes.dex
{
    public final String a;
    public final b43 b;

    public void v66(b43 p0,String p1){
       super();
       p1.getClass();
       this.a = p1;
       p0.getClass();
       this.b = p0;
    }
    public final Object a(z76 p0,kl4 p1,z76 p2,kl4 p3,kl4 p4,z76 p5,z76 p6,z76 p7,kl4 p8,kl4 p9,z76 p10){
       return p5.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof v66) {
          return false;
       }
       if (!p0.a.equals(this.a) || !p0.b.equals(this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.hashCode() + tp2.g(this.a, 0, 31));
    }
    public final String toString(){
       return "SearchResponse{query="+this.a+", model="+this.b+'}';
    }
}
