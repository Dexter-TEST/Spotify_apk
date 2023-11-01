package p.xg1;
import p.do5;
import p.aq6;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class xg1 extends do5	// class@002c6e from classes.dex
{
    public final aq6 F;

    public void xg1(aq6 p0){
       super();
       p0.getClass();
       this.F = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof xg1) {
          return false;
       }
       return p0.F.equals(this.F);
    }
    public final int hashCode(){
       return (this.F.hashCode() + 0);
    }
    public final String toString(){
       return "LoadEntity{uri="+this.F+'}';
    }
}
