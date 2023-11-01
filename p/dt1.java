package p.dt1;
import p.ut1;
import p.ut;
import java.lang.Class;
import java.lang.Object;
import p.qx6;
import java.lang.String;
import java.lang.StringBuilder;

public final class dt1 extends ut1	// class@0013af from classes.dex
{
    public final ut a;

    public void dt1(ut p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(qx6 p0,qx6 p1,qx6 p2,qx6 p3,qx6 p4,qx6 p5,qx6 p6,qx6 p7,qx6 p8,qx6 p9,qx6 p10,qx6 p11,qx6 p12,qx6 p13){
       return p10.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof dt1) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "MetadataSaved{result="+this.a+'}';
    }
}
