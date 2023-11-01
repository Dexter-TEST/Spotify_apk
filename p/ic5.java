package p.ic5;
import p.tc5;
import p.kd5;
import p.ld5;
import p.xc5;
import java.lang.Object;
import p.tp2;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class ic5 extends tc5	// class@001969 from classes.dex
{
    public final boolean a;

    public void ic5(boolean p0){
       super();
       this.a = p0;
    }
    public final Object a(kd5 p0,kd5 p1,kd5 p2,kd5 p3,ld5 p4,ld5 p5,ld5 p6,ld5 p7,ld5 p8,ld5 p9,ld5 p10,xc5 p11,xc5 p12,xc5 p13,ld5 p14,ld5 p15,xc5 p16,xc5 p17,ld5 p18,xc5 p19,ld5 p20,ld5 p21,ld5 p22,xc5 p23){
       return p21.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ic5) {
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
       return kg4.p("Offline{offline=", this.a, '}');
    }
}
