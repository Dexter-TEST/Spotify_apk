package p.av2;
import p.cv2;
import p.j33;
import p.qg2;
import java.lang.Object;
import p.tp2;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class av2 extends cv2	// class@000ffb from classes.dex
{
    public final boolean a;

    public void av2(boolean p0){
       super();
       this.a = p0;
    }
    public final Object a(j33 p0,j33 p1,qg2 p2,qg2 p3,j33 p4,j33 p5,qg2 p6){
       return p5.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof av2) {
          return false;
       }
       if (p0.a != this.a) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.a, 0);
    }
    public final String toString(){
       return kg4.p("Reload{allowOffline=", this.a, '}');
    }
}
