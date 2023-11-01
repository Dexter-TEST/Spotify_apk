package p.lb5;
import p.xj0;
import java.util.Map;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class lb5 extends xj0	// class@001d20 from classes.dex
{
    public final Map H;

    public void lb5(Map p0){
       super();
       p0.getClass();
       this.H = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof lb5) {
          return false;
       }
       return p0.H.equals(this.H);
    }
    public final int hashCode(){
       return (this.H.hashCode() + 0);
    }
    public final String toString(){
       return "ShowSignupError{messages="+this.H+'}';
    }
}
