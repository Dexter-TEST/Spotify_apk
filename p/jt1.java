package p.jt1;
import p.ut1;
import p.aq6;
import p.ks0;
import java.lang.Class;
import java.lang.Object;
import p.qx6;
import java.lang.String;
import java.lang.StringBuilder;

public final class jt1 extends ut1	// class@001b3d from classes.dex
{
    public final aq6 a;
    public final ks0 b;

    public void jt1(aq6 p0,ks0 p1){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
    }
    public final Object a(qx6 p0,qx6 p1,qx6 p2,qx6 p3,qx6 p4,qx6 p5,qx6 p6,qx6 p7,qx6 p8,qx6 p9,qx6 p10,qx6 p11,qx6 p12,qx6 p13){
       return p2.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof jt1) {
          return false;
       }
       if (!p0.a.equals(this.a) || !p0.b.equals(this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.hashCode() + ((this.a.hashCode() + 0) * 31));
    }
    public final String toString(){
       return "PlayerContextChanged{contextUri="+this.a+", playerContext="+this.b+'}';
    }
}
