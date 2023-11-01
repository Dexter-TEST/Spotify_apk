package p.vf6;
import p.uw5;
import p.l10;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class vf6 extends uw5	// class@0029e6 from classes.dex
{
    public final l10 A;

    public void vf6(l10 p0){
       super();
       p0.getClass();
       this.A = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof vf6) {
          return false;
       }
       return p0.A.equals(this.A);
    }
    public final int hashCode(){
       return (this.A.hashCode() + 0);
    }
    public final String toString(){
       return "BirthdayEffect{effect="+this.A+'}';
    }
}
