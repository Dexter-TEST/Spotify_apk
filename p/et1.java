package p.et1;
import p.wt1;
import p.vx6;
import java.lang.Class;
import java.lang.Object;
import p.j94;
import p.xc5;
import java.lang.String;
import java.lang.StringBuilder;

public final class et1 extends wt1	// class@0014f1 from classes.dex
{
    public final vx6 a;

    public void et1(vx6 p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(j94 p0,j94 p1,j94 p2,j94 p3,j94 p4,j94 p5,j94 p6,j94 p7,j94 p8,xc5 p9){
       return p6.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof et1) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "MetadataSyncResult{result="+this.a+'}';
    }
}
