package p.vj5;
import p.xe7;
import p.w87;
import p.u73;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class vj5 extends xe7	// class@002a09 from classes.dex
{
    public final w87 F;
    public final u73 G;

    public void vj5(w87 p0,u73 p1){
       super();
       p0.getClass();
       this.F = p0;
       p1.getClass();
       this.G = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof vj5) {
          return false;
       }
       if (!p0.F.equals(this.F) || !p0.G.equals(this.G)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.G.hashCode() + ((this.F.hashCode() + 0) * 31));
    }
    public final String toString(){
       return "PublishMessage{trigger="+this.F+", message="+this.G+'}';
    }
}
