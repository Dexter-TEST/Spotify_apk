package p.e35;
import p.q35;
import java.lang.String;
import p.na5;
import java.lang.Class;
import java.lang.Object;
import p.u35;
import p.xc5;
import p.tp2;
import java.lang.Long;
import java.lang.StringBuilder;

public final class e35 extends q35	// class@001410 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final na5 d;
    public final long e;

    public void e35(String p0,String p1,String p2,na5 p3,long p4){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
       p2.getClass();
       this.c = p2;
       p3.getClass();
       this.d = p3;
       this.e = p4;
    }
    public final Object a(u35 p0,u35 p1,u35 p2,u35 p3,u35 p4,xc5 p5,xc5 p6,xc5 p7,u35 p8,xc5 p9,xc5 p10,u35 p11){
       return p1.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof e35) {
          return false;
       }
       if ((p0.e - this.e) || (!p0.a.equals(this.a) || (!p0.b.equals(this.b) || (!p0.c.equals(this.c) || !p0.d.equals(this.d))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (Long.valueOf(this.e).hashCode() + ((this.d.hashCode() + tp2.g(this.c, tp2.g(this.b, tp2.g(this.a, 0, 31), 31), 31)) * 31));
    }
    public final String toString(){
       return tp2.o("Challenge{countryIso="+this.a+", callingCode="+this.b+", phoneNumber="+this.c+", challenge="+this.d+", currentTimeMs=", this.e, '}');
    }
}
