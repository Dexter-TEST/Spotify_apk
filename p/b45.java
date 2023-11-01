package p.b45;
import p.ri2;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class b45	// class@001051 from classes.dex
{
    public final ri2 a;
    public final boolean b;

    public void b45(ri2 p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof b45) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       b45 tb;
       int i = this.a.hashCode() * 31;
       if ((tb = this.b) != null) {
          tb = 1;
       }
       return (i + tb);
    }
    public final String toString(){
       return kg4.p("OngoingPoint\(point="+this.a+", isRequired=", this.b, ')');
    }
}
