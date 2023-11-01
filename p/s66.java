package p.s66;
import p.b76;
import p.z76;
import p.kl4;
import java.lang.Object;
import p.tp2;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class s66 extends b76	// class@0025cc from classes.dex
{
    public final boolean a;

    public void s66(boolean p0){
       super();
       this.a = p0;
    }
    public final Object a(z76 p0,kl4 p1,z76 p2,kl4 p3,kl4 p4,z76 p5,z76 p6,z76 p7,kl4 p8,kl4 p9,z76 p10){
       return p10.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof s66) {
          return false;
       }
       if (p0.a != this.a) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.a, 0);
    }
    public final String toString(){
       return kg4.p("Reload{allowOffline=", this.a, '}');
    }
}
