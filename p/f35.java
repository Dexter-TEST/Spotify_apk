package p.f35;
import p.q35;
import p.na5;
import java.lang.Class;
import java.lang.Object;
import p.u35;
import p.xc5;
import java.lang.String;
import java.lang.StringBuilder;

public final class f35 extends q35	// class@001550 from classes.dex
{
    public final na5 a;

    public void f35(na5 p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(u35 p0,u35 p1,u35 p2,u35 p3,u35 p4,xc5 p5,xc5 p6,xc5 p7,u35 p8,xc5 p9,xc5 p10,u35 p11){
       return p9.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof f35) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "ChallengeTimedOut{challenge="+this.a+'}';
    }
}
