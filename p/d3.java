package p.d3;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.ej4;
import p.c3;

public final class d3 implements Serializable	// class@0012d2 from classes.dex
{
    public final String a;
    public final String b;

    public void d3(String p0,String p1){
       co5.o(p1, "applicationId");
       super();
       this.a = p1;
       if (ej4.Z(p0)) {
          p0 = null;
       }
       this.b = p0;
       return;
    }
    private final Object writeReplace(){
       return new c3(this.b, this.a);
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof d3) {
          return b;
       }
       if (ej4.c(p0.b, this.b) && ej4.c(p0.a, this.a)) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       d3 tb;
       int i = ((tb = this.b) == null)? 0: tb.hashCode();
       return (i ^ this.a.hashCode());
    }
}
