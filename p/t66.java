package p.t66;
import p.b76;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import p.z76;
import p.kl4;
import p.tp2;
import java.lang.StringBuilder;

public final class t66 extends b76	// class@00270e from classes.dex
{
    public final String a;
    public final Throwable b;

    public void t66(String p0,Throwable p1){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
    }
    public final Object a(z76 p0,kl4 p1,z76 p2,kl4 p3,kl4 p4,z76 p5,z76 p6,z76 p7,kl4 p8,kl4 p9,z76 p10){
       return p6.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof t66) {
          return false;
       }
       if (!p0.a.equals(this.a) || !p0.b.equals(this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.b.hashCode() + tp2.g(this.a, 0, 31));
    }
    public final String toString(){
       return "SearchError{query="+this.a+", throwable="+this.b+'}';
    }
}
