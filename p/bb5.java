package p.bb5;
import p.xj0;
import p.d35;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class bb5 extends xj0	// class@001091 from classes.dex
{
    public final d35 H;

    public void bb5(d35 p0){
       super();
       p0.getClass();
       this.H = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof bb5) {
          return false;
       }
       return p0.H.equals(this.H);
    }
    public final int hashCode(){
       return (this.H.hashCode() + 0);
    }
    public final String toString(){
       return "OneTimePassEffect{effect="+this.H+'}';
    }
}
