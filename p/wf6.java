package p.wf6;
import p.uw5;
import p.fi1;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class wf6 extends uw5	// class@002b29 from classes.dex
{
    public final fi1 A;

    public void wf6(fi1 p0){
       super();
       p0.getClass();
       this.A = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof wf6) {
          return false;
       }
       return p0.A.equals(this.A);
    }
    public final int hashCode(){
       return (this.A.hashCode() + 0);
    }
    public final String toString(){
       return "EmailEffect{effect="+this.A+'}';
    }
}
