package p.b97;
import p.eb3;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hr7;

public final class b97 extends eb3	// class@001080 from classes.dex
{
    public final String F;

    public void b97(String p0){
       super();
       p0.getClass();
       this.F = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof b97) {
          return false;
       }
       return p0.F.equals(this.F);
    }
    public final int hashCode(){
       return (this.F.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("LogRequestMessage{pattern=", this.F, '}');
    }
}
