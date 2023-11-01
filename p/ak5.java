package p.ak5;
import p.ek5;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.fk5;
import java.lang.StringBuilder;
import p.hr7;

public final class ak5 extends ek5	// class@000f9e from classes.dex
{
    public final String a;

    public void ak5(String p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(fk5 p0,fk5 p1,fk5 p2,fk5 p3,fk5 p4,fk5 p5,fk5 p6){
       return p4.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ak5) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("MessageLoadingFailed{message=", this.a, '}');
    }
}
