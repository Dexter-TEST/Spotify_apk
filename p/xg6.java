package p.xg6;
import p.zg6;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.kh6;
import p.lh6;
import java.lang.StringBuilder;
import p.hr7;

public final class xg6 extends zg6	// class@002c73 from classes.dex
{
    public final String a;

    public void xg6(String p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(kh6 p0,kh6 p1,kh6 p2,kh6 p3,lh6 p4,lh6 p5,lh6 p6,lh6 p7,lh6 p8,lh6 p9,lh6 p10,lh6 p11,lh6 p12,lh6 p13){
       return p7.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof xg6) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("SignupSuccess{username=", this.a, '}');
    }
}
