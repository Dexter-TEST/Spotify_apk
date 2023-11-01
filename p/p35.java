package p.p35;
import p.q35;
import p.ra5;
import java.lang.Class;
import java.lang.Object;
import p.u35;
import p.xc5;
import java.lang.String;
import java.lang.StringBuilder;

public final class p35 extends q35	// class@0021e4 from classes.dex
{
    public final ra5 a;

    public void p35(ra5 p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(u35 p0,u35 p1,u35 p2,u35 p3,u35 p4,xc5 p5,xc5 p6,xc5 p7,u35 p8,xc5 p9,xc5 p10,u35 p11){
       return p2.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof p35) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "Verified{verified="+this.a+'}';
    }
}
