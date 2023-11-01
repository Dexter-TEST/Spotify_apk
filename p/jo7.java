package p.jo7;
import p.no7;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.to7;
import p.j33;
import p.tp2;
import java.lang.Integer;
import java.lang.StringBuilder;

public final class jo7 extends no7	// class@001b19 from classes.dex
{
    public final String a;
    public final int b;

    public void jo7(String p0){
       super();
       p0.getClass();
       this.a = p0;
       this.b = 2;
    }
    public final Object a(to7 p0,to7 p1,to7 p2,to7 p3,to7 p4,to7 p5,to7 p6,to7 p7,to7 p8,to7 p9,j33 p10,to7 p11){
       return p1.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof jo7) {
          return false;
       }
       if (p0.b != this.b || !p0.a.equals(this.a)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (Integer.valueOf(this.b).hashCode() + tp2.g(this.a, 0, 31));
    }
    public final String toString(){
       return tp2.n("LoginFailed{error="+this.a+", method=", this.b, '}');
    }
}
