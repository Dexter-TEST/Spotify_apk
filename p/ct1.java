package p.ct1;
import p.ut1;
import com.google.common.collect.d;
import java.lang.Class;
import java.lang.Object;
import p.qx6;
import java.util.Collection;
import java.lang.String;

public final class ct1 extends ut1	// class@001270 from classes.dex
{
    public final Collection a;

    public void ct1(d p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(qx6 p0,qx6 p1,qx6 p2,qx6 p3,qx6 p4,qx6 p5,qx6 p6,qx6 p7,qx6 p8,qx6 p9,qx6 p10,qx6 p11,qx6 p12,qx6 p13){
       return p4.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ct1) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "MetadataMissing{uris=***}";
    }
}
