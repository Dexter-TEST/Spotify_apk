package p.q05;
import p.ty0;
import p.m73;
import java.lang.Class;
import java.lang.Object;
import java.util.Map;
import p.w51;
import java.lang.String;
import java.lang.StringBuilder;

public final class q05 extends ty0	// class@002309 from classes.dex
{
    public final m73 m;

    public void q05(m73 p0){
       super();
       p0.getClass();
       this.m = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof q05) {
          return false;
       }
       p0 = p0.m;
       p0.getClass();
       return w51.q(p0, this.m);
    }
    public final int hashCode(){
       return (this.m.hashCode() + 0);
    }
    public final String toString(){
       return "All{resources="+this.m+'}';
    }
}
