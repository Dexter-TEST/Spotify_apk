package p.z4;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import p.io2;
import java.lang.String;

public class z4	// class@002e8a from classes.dex
{
    public final boolean a;
    public final Throwable b;

    public void z4(Throwable p0,boolean p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof z4) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       z4 tb = this.b;
       p0 = p0.b;
       if (tb != p0 && (tb == null && (p0 != null && (io2.j(tb.getClass(), p0.getClass()) && io2.j(tb.getMessage(), p0.getMessage()))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       z4 tb;
       int i = this.a * 31;
       int i1 = ((tb = this.b) != null)? tb.hashCode(): 0;
       return (i + i1);
    }
}
