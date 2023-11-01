package p.q66;
import p.b76;
import p.b43;
import p.z76;
import p.kl4;
import java.lang.Object;
import p.xe7;
import java.lang.String;
import java.lang.StringBuilder;

public final class q66 extends b76	// class@002340 from classes.dex
{
    public final b43 a;

    public void q66(b43 p0){
       super();
       this.a = p0;
    }
    public final Object a(z76 p0,kl4 p1,z76 p2,kl4 p3,kl4 p4,z76 p5,z76 p6,z76 p7,kl4 p8,kl4 p9,z76 p10){
       return p7.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof q66) {
          return false;
       }
       return xe7.u(p0.a, this.a);
    }
    public final int hashCode(){
       q66 ta;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       return "RecentSearchesResponse{model="+this.a+'}';
    }
}
