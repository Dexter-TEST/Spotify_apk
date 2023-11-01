package p.wa5;
import p.xj0;
import p.l10;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class wa5 extends xj0	// class@002afb from classes.dex
{
    public final l10 H;

    public void wa5(l10 p0){
       super();
       p0.getClass();
       this.H = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof wa5) {
          return false;
       }
       return p0.H.equals(this.H);
    }
    public final int hashCode(){
       return (this.H.hashCode() + 0);
    }
    public final String toString(){
       return "BirthdayEffect{effect="+this.H+'}';
    }
}
