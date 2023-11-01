package p.do4;
import p.yt0;
import p.is6;
import java.lang.Number;
import java.lang.Class;
import java.math.BigInteger;
import p.tf3;
import p.he3;
import java.lang.Object;
import java.math.BigDecimal;
import p.js6;
import p.gb6;
import p.m00;
import p.mg3;
import p.rf3;
import java.lang.Enum;
import p.co4;
import p.s57;
import p.vf3;
import java.lang.Long;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Byte;
import java.lang.Short;
import java.lang.String;

public final class do4 extends is6 implements yt0	// class@001386 from classes.dex
{
    public final boolean t;
    public static final int v;

    static {
       do4 uodo4 = new do4(Number.class);
    }
    public void do4(Class p0){
       super(p0);
       boolean b = (p0 == BigInteger.class)? true: false;
       this.t = b;
       return;
    }
    public final void acceptJsonFormatVisitor(tf3 p0,he3 p1){
       if (this.t != null) {
          p0.getClass();
       }else if(this.a == BigDecimal.class){
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
    public final void serialize(Object p0,vf3 p1,gb6 p2){
       if (p0 instanceof BigDecimal) {
          p1.q0(p0);
       }else if(p0 instanceof BigInteger){
          p1.r0(p0);
       }else if(p0 instanceof Long){
          p1.o0(p0.longValue());
       }else if(p0 instanceof Double){
          p1.l0(p0.doubleValue());
       }else if(p0 instanceof Float){
          p1.m0(p0.floatValue());
       }else if(!p0 instanceof Integer && (!p0 instanceof Byte && !p0 instanceof Short)){
          p1.p0(p0.toString());
       }else {
          p1.n0(p0.intValue());
       }
       return;
    }
}
