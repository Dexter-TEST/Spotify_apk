package p.j57;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.kg4;

public final class j57	// class@001a70 from classes.dex
{
    public final String a;
    public final boolean b;

    public void j57(String p0,boolean p1){
       co5.o(p0, "title");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof j57) {
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
       j57 tb;
       int i = this.a.hashCode() * 31;
       if ((tb = this.b) != null) {
          tb = 1;
       }
       return (i + tb);
    }
    public final String toString(){
       return kg4.p("Model\(title="+this.a+", checked=", this.b, ')');
    }
}
