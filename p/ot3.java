package p.ot3;
import p.uw5;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hr7;

public final class ot3 extends uw5	// class@002187 from classes.dex
{
    public final String A;

    public void ot3(String p0){
       super();
       p0.getClass();
       this.A = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ot3) {
          return false;
       }
       return p0.A.equals(this.A);
    }
    public final int hashCode(){
       return (this.A.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("SetUsername{username=", this.A, '}');
    }
}
