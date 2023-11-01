package p.s05;
import p.ty0;
import p.r05;
import p.ys5;
import java.lang.Class;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class s05 extends ty0	// class@002594 from classes.dex
{
    public final r05 m;
    public final List n;

    public void s05(r05 p0,ys5 p1){
       super();
       this.m = p0;
       p1.getClass();
       this.n = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof s05) {
          return false;
       }
       if (!p0.m.equals(this.m) || !p0.n.equals(this.n)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.n.hashCode() + ((this.m.hashCode() + 0) * 31));
    }
    public final String toString(){
       return kg4.o("Resources{context="+this.m+", resources=", this.n, '}');
    }
}
