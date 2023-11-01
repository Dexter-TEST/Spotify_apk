package p.wg6;
import p.zg6;
import p.kg6;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.kh6;
import p.lh6;
import p.xe7;
import java.lang.StringBuilder;
import p.hr7;

public final class wg6 extends zg6	// class@002b32 from classes.dex
{
    public final kg6 a;
    public final String b;

    public void wg6(kg6 p0,String p1){
       super();
       p0.getClass();
       this.a = p0;
       this.b = p1;
    }
    public final Object a(kh6 p0,kh6 p1,kh6 p2,kh6 p3,lh6 p4,lh6 p5,lh6 p6,lh6 p7,lh6 p8,lh6 p9,lh6 p10,lh6 p11,lh6 p12,lh6 p13){
       return p8.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof wg6) {
          return false;
       }
       if (p0.a != this.a || !xe7.u(p0.b, this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       wg6 tb;
       int i = 0;
       int i1 = (this.a.hashCode() + i) * 31;
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final String toString(){
       return hr7.a("SignupError{status="+this.a+", message=", this.b, '}');
    }
}
