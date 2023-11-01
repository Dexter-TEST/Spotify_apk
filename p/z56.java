package p.z56;
import p.xj0;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hr7;

public final class z56 extends xj0	// class@002e91 from classes.dex
{
    public final String H;

    public void z56(String p0){
       super();
       p0.getClass();
       this.H = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof z56) {
          return false;
       }
       return p0.H.equals(this.H);
    }
    public final int hashCode(){
       return (this.H.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("OpenSeeMore{uri=", this.H, '}');
    }
}
