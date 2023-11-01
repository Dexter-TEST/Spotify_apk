package p.z87;
import p.eb3;
import p.u65;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class z87 extends eb3	// class@002eac from classes.dex
{
    public final u65 F;

    public void z87(u65 p0){
       super();
       p0.getClass();
       this.F = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof z87) {
          return false;
       }
       return p0.F.equals(this.F);
    }
    public final int hashCode(){
       return (this.F.hashCode() + 0);
    }
    public final String toString(){
       return "DispatchMessage{messageTriggerPair="+this.F+'}';
    }
}
