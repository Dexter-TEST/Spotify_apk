package p.xa5;
import p.xj0;
import p.sa0;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class xa5 extends xj0	// class@002c3c from classes.dex
{
    public final sa0 H;

    public void xa5(sa0 p0){
       super();
       p0.getClass();
       this.H = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof xa5) {
          return false;
       }
       return p0.H.equals(this.H);
    }
    public final int hashCode(){
       return (this.H.hashCode() + 0);
    }
    public final String toString(){
       return "CallingCodePhoneNumberEffect{effect="+this.H+'}';
    }
}
