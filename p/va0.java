package p.va0;
import p.za0;
import java.util.List;
import java.lang.Class;
import java.lang.Object;
import p.cb0;
import p.xc5;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class va0 extends za0	// class@0029b0 from classes.dex
{
    public final List a;

    public void va0(List p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(cb0 p0,cb0 p1,cb0 p2,cb0 p3,xc5 p4,xc5 p5){
       return p2.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof va0) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return kg4.o("CallingCodesChanged{callingCodes=", this.a, '}');
    }
}
