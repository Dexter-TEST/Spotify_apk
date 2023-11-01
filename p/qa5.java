package p.qa5;
import p.sa5;
import p.mu;
import p.qg2;
import p.xc5;
import java.lang.Object;
import p.h;
import java.lang.String;
import java.lang.StringBuilder;

public final class qa5 extends sa5	// class@002364 from classes.dex
{
    public final h a;

    public void qa5(mu p0){
       super();
       this.a = p0;
    }
    public final Object a(qg2 p0,qg2 p1,xc5 p2,xc5 p3,xc5 p4){
       return p1.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof qa5) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "Mismatch{context="+this.a+'}';
    }
}
