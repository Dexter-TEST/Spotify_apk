package p.bw1;
import p.pl1;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class bw1	// class@001148 from classes.dex
{
    public final boolean a;
    public final Set b;
    public final Set c;

    public void bw1(){
       super(true, pl1.a, pl1.a);
    }
    public void bw1(boolean p0,Set p1,Set p2){
       co5.o(p1, "successIndices");
       co5.o(p2, "permanentErrorIndices");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof bw1) {
          return false;
       }
       if (this.a != p0.a) {
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
       bw1 ta;
       if ((ta = this.a) != null) {
          ta = 1;
       }
       return (this.c.hashCode() + ((this.b.hashCode() + (ta * 31)) * 31));
    }
    public final String toString(){
       return "EventsResponse\(shouldBackoff="+this.a+", successIndices="+this.b+", permanentErrorIndices="+this.c+')';
    }
}
