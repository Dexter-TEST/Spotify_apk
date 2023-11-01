package p.ew1;
import p.is7;
import p.cw1;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class ew1 extends is7	// class@00150c from classes.dex
{
    public final List G;
    public final cw1 H;

    public void ew1(cw1 p0,List p1){
       co5.o(p1, "data");
       co5.o(p0, "endpoint");
       super();
       this.G = p1;
       this.H = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ew1) {
          return false;
       }
       if (!co5.c(this.G, p0.G)) {
          return false;
       }
       if (!co5.c(this.H, p0.H)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.H.hashCode() + (this.G.hashCode() * 31));
    }
    public final String toString(){
       return "Some\(data="+this.G+", endpoint="+this.H+')';
    }
}
