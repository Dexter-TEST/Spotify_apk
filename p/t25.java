package p.t25;
import p.d35;
import p.na5;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class t25 extends d35	// class@0026e9 from classes.dex
{
    public final na5 a;

    public void t25(na5 p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof t25) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "ChallengeTimedOut{challenge="+this.a+'}';
    }
}
