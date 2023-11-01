package p.tm4;
import p.mn4;
import p.qg2;
import p.kl4;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class tm4 extends mn4	// class@00279d from classes.dex
{
    public final int a;

    public void tm4(int p0){
       super();
       this.a = p0;
    }
    public final Object a(qg2 p0,qg2 p1,qg2 p2,qg2 p3,kl4 p4,qg2 p5,qg2 p6,qg2 p7,qg2 p8,kl4 p9,qg2 p10,qg2 p11,qg2 p12,qg2 p13,qg2 p14,qg2 p15,qg2 p16,qg2 p17,qg2 p18,qg2 p19,qg2 p20,qg2 p21,qg2 p22,qg2 p23,qg2 p24,qg2 p25,qg2 p26,qg2 p27,qg2 p28,qg2 p29,qg2 p30,qg2 p31){
       return p26.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof tm4) {
          return false;
       }
       if (p0.a != this.a) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (Integer.valueOf(this.a).hashCode() + 0);
    }
    public final String toString(){
       return tp2.n("RepeatModeChanged{repeatMode=", this.a, '}');
    }
}
