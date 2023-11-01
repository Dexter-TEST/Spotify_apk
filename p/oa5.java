package p.oa5;
import p.sa5;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import p.qg2;
import p.xc5;
import java.lang.String;
import java.lang.StringBuilder;

public final class oa5 extends sa5	// class@0020e1 from classes.dex
{
    public final Throwable a;

    public void oa5(Throwable p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(qg2 p0,qg2 p1,xc5 p2,xc5 p3,xc5 p4){
       return p4.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof oa5) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "Error{error="+this.a+'}';
    }
}
