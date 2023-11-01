package p.oh1;
import p.eo5;
import p.aq6;
import p.ks0;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class oh1 extends eo5	// class@00211c from classes.dex
{
    public final aq6 D;
    public final ks0 E;

    public void oh1(aq6 p0,ks0 p1){
       super();
       p0.getClass();
       this.D = p0;
       p1.getClass();
       this.E = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof oh1) {
          return false;
       }
       if (!p0.D.equals(this.D) || !p0.E.equals(this.E)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.E.hashCode() + ((this.D.hashCode() + 0) * 31));
    }
    public final String toString(){
       return "SavePlayerContext{contextUri="+this.D+", playerContext="+this.E+'}';
    }
}
