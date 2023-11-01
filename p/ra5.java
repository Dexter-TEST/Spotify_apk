package p.ra5;
import p.sa5;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.qg2;
import p.xc5;
import java.lang.StringBuilder;
import p.hr7;

public final class ra5 extends sa5	// class@0024ac from classes.dex
{
    public final String a;

    public void ra5(String p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(qg2 p0,qg2 p1,xc5 p2,xc5 p3,xc5 p4){
       return p3.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ra5) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("Verified{identifierToken=", this.a, '}');
    }
}
