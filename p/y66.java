package p.y66;
import p.c76;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.tm;
import p.kl4;
import java.lang.StringBuilder;
import p.hr7;

public final class y66 extends c76	// class@002d5c from classes.dex
{
    public final String a;

    public void y66(String p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(tm p0,tm p1,tm p2,tm p3,tm p4,tm p5,tm p6,tm p7,tm p8,kl4 p9){
       return p4.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof y66) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("SeeMoreClick{uri=", this.a, '}');
    }
}
