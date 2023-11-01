package p.ot1;
import p.wt1;
import p.sv;
import java.lang.Class;
import java.lang.Object;
import p.j94;
import p.xc5;
import java.lang.String;
import java.lang.StringBuilder;

public final class ot1 extends wt1	// class@002185 from classes.dex
{
    public final sv a;

    public void ot1(sv p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(j94 p0,j94 p1,j94 p2,j94 p3,j94 p4,j94 p5,j94 p6,j94 p7,j94 p8,xc5 p9){
       return p3.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ot1) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "ProductStateUpdated{state="+this.a+'}';
    }
}
