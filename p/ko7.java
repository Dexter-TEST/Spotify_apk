package p.ko7;
import p.no7;
import p.to7;
import p.j33;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class ko7 extends no7	// class@001c55 from classes.dex
{
    public final int a;

    public void ko7(int p0){
       super();
       this.a = p0;
    }
    public final Object a(to7 p0,to7 p1,to7 p2,to7 p3,to7 p4,to7 p5,to7 p6,to7 p7,to7 p8,to7 p9,j33 p10,to7 p11){
       return p0.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ko7) {
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
       return tp2.n("LoginSucceeded{method=", this.a, '}');
    }
}
