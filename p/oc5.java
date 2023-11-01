package p.oc5;
import p.tc5;
import p.kg6;
import java.util.Map;
import java.lang.Class;
import java.lang.Object;
import p.kd5;
import p.ld5;
import p.xc5;
import java.lang.String;
import java.lang.StringBuilder;

public final class oc5 extends tc5	// class@0020f3 from classes.dex
{
    public final kg6 a;
    public final Map b;

    public void oc5(kg6 p0,Map p1){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
    }
    public final Object a(kd5 p0,kd5 p1,kd5 p2,kd5 p3,ld5 p4,ld5 p5,ld5 p6,ld5 p7,ld5 p8,ld5 p9,ld5 p10,xc5 p11,xc5 p12,xc5 p13,ld5 p14,ld5 p15,xc5 p16,xc5 p17,ld5 p18,xc5 p19,ld5 p20,ld5 p21,ld5 p22,xc5 p23){
       return p12.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof oc5) {
          return false;
       }
       if (p0.a != this.a || !p0.b.equals(this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.hashCode() + ((this.a.hashCode() + 0) * 31));
    }
    public final String toString(){
       return "SignupError{status="+this.a+", messages="+this.b+'}';
    }
}
