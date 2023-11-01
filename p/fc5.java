package p.fc5;
import p.tc5;
import p.xp;
import java.lang.Class;
import java.lang.Object;
import p.kd5;
import p.ld5;
import p.xc5;
import p.tp2;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class fc5 extends tc5	// class@0015a0 from classes.dex
{
    public final xp a;
    public final boolean b;

    public void fc5(xp p0,boolean p1){
       super();
       p0.getClass();
       this.a = p0;
       this.b = p1;
    }
    public final Object a(kd5 p0,kd5 p1,kd5 p2,kd5 p3,ld5 p4,ld5 p5,ld5 p6,ld5 p7,ld5 p8,ld5 p9,ld5 p10,xc5 p11,xc5 p12,xc5 p13,ld5 p14,ld5 p15,xc5 p16,xc5 p17,ld5 p18,xc5 p19,ld5 p20,ld5 p21,ld5 p22,xc5 p23){
       return p13.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof fc5) {
          return false;
       }
       if (p0.b != this.b || !p0.a.equals(this.a)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.b, ((this.a.hashCode() + 0) * 31));
    }
    public final String toString(){
       return kg4.p("LoginSuccess{token="+this.a+", signedUp=", this.b, '}');
    }
}
