package p.yf7;
import p.kd3;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class yf7 extends kd3	// class@002dac from classes.dex
{
    public final Set d;
    public final Set e;

    public void yf7(Set p0,Set p1){
       co5.o(p0, "notStartedPointIdentifiers");
       super(3);
       this.d = p0;
       this.e = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof yf7) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       if (!co5.c(this.e, p0.e)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.e.hashCode() + (this.d.hashCode() * 31));
    }
    public final String toString(){
       return "NotCompletedPoints\(notStartedPointIdentifiers="+this.d+", notFinishedPointIdentifiers="+this.e+')';
    }
}
