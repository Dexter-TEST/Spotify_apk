package p.o66;
import p.b76;
import java.lang.String;
import p.mq5;
import java.lang.Class;
import java.lang.Object;
import p.z76;
import p.kl4;
import p.xe7;
import p.tp2;
import java.lang.StringBuilder;

public final class o66 extends b76	// class@0020bd from classes.dex
{
    public final String a;
    public final mq5 b;

    public void o66(String p0,mq5 p1){
       super();
       p0.getClass();
       this.a = p0;
       this.b = p1;
    }
    public final Object a(z76 p0,kl4 p1,z76 p2,kl4 p3,kl4 p4,z76 p5,z76 p6,z76 p7,kl4 p8,kl4 p9,z76 p10){
       return p3.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof o66) {
          return false;
       }
       if (!p0.a.equals(this.a) || !xe7.u(p0.b, this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       o66 tb;
       int i = 0;
       int i1 = tp2.g(this.a, i, 31);
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final String toString(){
       return "EntityClick{uri="+this.a+", recentSearch="+this.b+'}';
    }
}
