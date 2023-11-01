package p.wu2;
import p.cv2;
import p.cu2;
import p.j33;
import p.qg2;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class wu2 extends cv2	// class@002ba9 from classes.dex
{
    public final cu2 a;

    public void wu2(cu2 p0){
       super();
       this.a = p0;
    }
    public final Object a(j33 p0,j33 p1,qg2 p2,qg2 p3,j33 p4,j33 p5,qg2 p6){
       return p1.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof wu2) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "ClickAccessory{event="+this.a+'}';
    }
}
