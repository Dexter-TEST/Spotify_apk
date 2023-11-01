package p.ag6;
import p.uw5;
import p.y75;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class ag6 extends uw5	// class@000f7b from classes.dex
{
    public final y75 A;

    public void ag6(y75 p0){
       super();
       p0.getClass();
       this.A = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ag6) {
          return false;
       }
       return p0.A.equals(this.A);
    }
    public final int hashCode(){
       return (this.A.hashCode() + 0);
    }
    public final String toString(){
       return "PasswordEffect{effect="+this.A+'}';
    }
}
