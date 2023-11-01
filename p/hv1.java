package p.hv1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import p.kg4;

public final class hv1	// class@0018ca from classes.dex
{
    public final List a;
    public final Map b;
    public final List c;

    public void hv1(ArrayList p0,LinkedHashMap p1,ArrayList p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof hv1) {
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
       return kg4.o("ESSEvents\(lastStatsEvents="+this.a+", lastRateLimitedEvents="+this.b+", lastDropEvents=", this.c, ')');
    }
}
