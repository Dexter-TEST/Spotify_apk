package p.gs5;
import java.util.HashMap;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class gs5	// class@00176e from classes.dex
{
    public final Map a;
    public final Map b;
    public final Map c;

    public void gs5(HashMap p0,HashMap p1,HashMap p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof gs5) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31));
    }
    public final String toString(){
       return "ReducedPoints\(timestamps="+this.a+", durations="+this.b+", featureIds="+this.c+')';
    }
}
