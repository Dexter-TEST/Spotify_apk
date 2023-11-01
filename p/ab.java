package p.ab;
import p.db;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class ab extends db	// class@000f51 from classes.dex
{
    public final int a;

    public void ab(int p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ab) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a;
    }
    public final String toString(){
       return tp2.n("ScrollToTag\(adapterPos=", this.a, ')');
    }
}
