package p.ws1;
import p.wt1;
import p.do5;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import p.j94;
import p.xc5;
import java.lang.String;
import java.lang.StringBuilder;

public final class ws1 extends wt1	// class@002b96 from classes.dex
{
    public final do5 a;
    public final Throwable b;

    public void ws1(do5 p0,Throwable p1){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
    }
    public final Object a(j94 p0,j94 p1,j94 p2,j94 p3,j94 p4,j94 p5,j94 p6,j94 p7,j94 p8,xc5 p9){
       return p9.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ws1) {
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
       return "Error{effect="+this.a+", cause="+this.b+'}';
    }
}
