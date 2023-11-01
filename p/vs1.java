package p.vs1;
import p.vt1;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.wk4;
import p.j33;
import java.lang.StringBuilder;
import p.hr7;

public final class vs1 extends vt1	// class@002a54 from classes.dex
{
    public final String a;

    public void vs1(String p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(wk4 p0,wk4 p1,wk4 p2,wk4 p3,wk4 p4,j33 p5){
       return p5.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof vs1) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("Error{error=", this.a, '}');
    }
}
