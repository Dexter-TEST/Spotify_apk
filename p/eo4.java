package p.eo4;
import p.yt0;
import p.is6;
import java.lang.Class;
import p.dg3;
import p.tf3;
import p.he3;
import java.lang.Object;
import p.gb6;
import p.m00;
import p.mg3;
import p.js6;
import p.rf3;
import java.lang.Enum;
import java.math.BigDecimal;
import p.do4;
import p.co4;
import p.s57;

public abstract class eo4 extends is6 implements yt0	// class@0014c8 from classes.dex
{
    public final boolean t;

    public void eo4(Class p0,dg3 p1){
       super(p0);
       boolean b = (p1 != dg3.a && (p1 != dg3.b && p1 != dg3.c))? false: true;
       this.t = b;
       return;
    }
    public final void acceptJsonFormatVisitor(tf3 p0,he3 p1){
       if (this.t != null) {
          p0.getClass();
       }else {
          p0.getClass();
       }
       return;
    }
    public final mg3 b(gb6 p0,m00 p1){
       rf3 orf3;
       js6 ta = this.a;
       if ((orf3 = js6.c(p1, p0, ta)) == null || orf3.b.ordinal() != 8) {
          return this;
       }
       if (ta == BigDecimal.class) {
          return co4.t;
       }
       return s57.t;
    }
}
