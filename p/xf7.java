package p.xf7;
import p.kd3;
import java.util.Set;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class xf7 extends kd3	// class@002c6b from classes.dex
{
    public final Set d;

    public void xf7(Set p0){
       super(4);
       this.d = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof xf7) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.d.hashCode();
    }
    public final String toString(){
       return "InvalidPointIdentifiers\(invalidPointIdentifiers="+this.d+')';
    }
}
