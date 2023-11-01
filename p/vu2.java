package p.vu2;
import p.cv2;
import java.lang.String;
import p.ju2;
import java.lang.Class;
import java.lang.Object;
import p.j33;
import p.qg2;
import p.tp2;
import java.lang.StringBuilder;

public final class vu2 extends cv2	// class@002a67 from classes.dex
{
    public final String a;
    public final ju2 b;

    public void vu2(String p0,ju2 p1){
       super();
       this.a = p0;
       p1.getClass();
       this.b = p1;
    }
    public final Object a(j33 p0,j33 p1,qg2 p2,qg2 p3,j33 p4,j33 p5,qg2 p6){
       return p0.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof vu2) {
          return false;
       }
       if (!p0.a.equals(this.a) || !p0.b.equals(this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.hashCode() + tp2.g(this.a, 0, 31));
    }
    public final String toString(){
       return "Click{uri="+this.a+", data="+this.b+'}';
    }
}
