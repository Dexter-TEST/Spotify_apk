package p.u66;
import p.c76;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import p.tm;
import p.kl4;
import p.tp2;
import java.lang.StringBuilder;

public final class u66 extends c76	// class@002852 from classes.dex
{
    public final String a;
    public final Throwable b;

    public void u66(String p0,Throwable p1){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
    }
    public final Object a(tm p0,tm p1,tm p2,tm p3,tm p4,tm p5,tm p6,tm p7,tm p8,kl4 p9){
       return p7.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof u66) {
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
