package p.fo4;
import p.eo4;
import java.lang.Class;
import p.dg3;
import java.lang.Object;
import p.vf3;
import p.gb6;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import p.ka7;
import p.is6;
import p.bo4;
import p.qg3;
import p.ds7;

public final class fo4 extends eo4	// class@001608 from classes.dex
{
    public final int v;

    public void fo4(int p0,Class p1){
       this.v = p0;
       if (p0 != 1) {
          if (p0 != 2) {
             super(p1, dg3.v);
             return;
          }else {
             super(p1, dg3.b);
             return;
          }
       }else {
          super(p1, dg3.a);
          return;
       }
    }
    public final void serialize(Object p0,vf3 p1,gb6 p2){
       switch (this.v){
           case 0:
             p1.l0(p0.doubleValue());
             return;
           case 1:
             p1.n0(p0.intValue());
             return;
           default:
             p1.o0(p0.longValue());
             return;
       }
    }
    public final void serializeWithType(Object p0,vf3 p1,gb6 p2,ka7 p3){
       switch (this.v){
           case 0:
             Double uDouble = p0;
             if (bo4.a(uDouble.doubleValue())) {
                p1.l0(uDouble.doubleValue());
                p3.d(p1, p3.c(p1, p3.b(qg3.E, p0)));
             }else {
                p1.l0(uDouble.doubleValue());
             }
             return;
             break;
           case 1:
           default:
             super.serializeWithType(p0, p1, p2, p3);
             return;
       }
       this.serialize(p0, p1, p2);
       return;
    }
}
