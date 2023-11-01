package p.g35;
import p.q35;
import java.lang.String;
import p.u35;
import p.xc5;
import java.lang.Object;
import p.xe7;
import java.lang.StringBuilder;
import p.hr7;

public final class g35 extends q35	// class@001692 from classes.dex
{
    public final String a;

    public void g35(String p0){
       super();
       this.a = p0;
    }
    public final Object a(u35 p0,u35 p1,u35 p2,u35 p3,u35 p4,xc5 p5,xc5 p6,xc5 p7,u35 p8,xc5 p9,xc5 p10,u35 p11){
       return p0.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof g35) {
          return false;
       }
       return xe7.u(p0.a, this.a);
    }
    public final int hashCode(){
       g35 ta;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       return hr7.a("Changed{code=", this.a, '}');
    }
}
