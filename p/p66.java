package p.p66;
import p.b76;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.z76;
import p.kl4;
import java.lang.StringBuilder;
import p.hr7;

public final class p66 extends b76	// class@002200 from classes.dex
{
    public final String a;

    public void p66(String p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(z76 p0,kl4 p1,z76 p2,kl4 p3,kl4 p4,z76 p5,z76 p6,z76 p7,kl4 p8,kl4 p9,z76 p10){
       return p1.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof p66) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("ImeSearchClick{query=", this.a, '}');
    }
}
