package p.vf7;
import p.kd3;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class vf7 extends kd3	// class@0029e7 from classes.dex
{
    public final Set d;

    public void vf7(Set p0){
       co5.o(p0, "identifiers");
       super(1);
       this.d = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof vf7) {
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
       return "DuplicatedPoints\(identifiers="+this.d+')';
    }
}
