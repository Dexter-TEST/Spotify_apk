package p.c47;
import java.util.Map;
import java.util.Set;
import java.lang.String;
import p.kg4;
import java.lang.Object;
import p.co5;
import p.en6;
import java.lang.StringBuilder;

public final class c47	// class@001197 from classes.dex
{
    public final int a;
    public final Map b;
    public final Set c;

    public void c47(int p0,Map p1,Set p2){
       kg4.t(p0, "errorCode");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof c47) {
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
       return (this.c.hashCode() + ((this.b.hashCode() + (en6.A(this.a) * 31)) * 31));
    }
    public final String toString(){
       return "TimeMeasurementError\(errorCode="+kg4.G(this.a)+", errorData="+this.b+", ongoingPoints="+this.c+')';
    }
}
