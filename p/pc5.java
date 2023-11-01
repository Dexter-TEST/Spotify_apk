package p.pc5;
import p.tc5;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.kd5;
import p.ld5;
import p.xc5;
import p.tp2;
import java.lang.StringBuilder;
import p.en6;

public final class pc5 extends tc5	// class@002236 from classes.dex
{
    public final String a;
    public final String b;

    public void pc5(String p0,String p1){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
    }
    public final Object a(kd5 p0,kd5 p1,kd5 p2,kd5 p3,ld5 p4,ld5 p5,ld5 p6,ld5 p7,ld5 p8,ld5 p9,ld5 p10,xc5 p11,xc5 p12,xc5 p13,ld5 p14,ld5 p15,xc5 p16,xc5 p17,ld5 p18,xc5 p19,ld5 p20,ld5 p21,ld5 p22,xc5 p23){
       return p11.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof pc5) {
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
       return en6.p("SignupSuccess{username=", this.a, ", token=***}");
    }
}
