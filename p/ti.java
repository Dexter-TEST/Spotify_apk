package p.ti;
import p.ou0;
import p.mu0;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class ti	// class@00277d from classes.dex
{
    public final ou0 a;
    public final mu0 b;

    public void ti(ou0 p0,mu0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ti) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       ti ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       return (this.b.hashCode() + (i * 31));
    }
    public final String toString(){
       return "SectionCustomEventFieldMapping\(section="+this.a+", field="+this.b+')';
    }
}
