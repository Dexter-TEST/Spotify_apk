package p.n66;
import p.c76;
import java.lang.String;
import p.mq5;
import java.lang.Class;
import java.lang.Object;
import p.tm;
import p.kl4;
import p.xe7;
import p.tp2;
import java.lang.StringBuilder;

public final class n66 extends c76	// class@001f79 from classes.dex
{
    public final String a;
    public final mq5 b;

    public void n66(String p0,mq5 p1){
       super();
       p0.getClass();
       this.a = p0;
       this.b = p1;
    }
    public final Object a(tm p0,tm p1,tm p2,tm p3,tm p4,tm p5,tm p6,tm p7,tm p8,kl4 p9){
       return p5.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof n66) {
          return false;
       }
       if (!p0.a.equals(this.a) || !xe7.u(p0.b, this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       n66 tb;
       int i = 0;
       int i1 = tp2.g(this.a, i, 31);
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final String toString(){
       return "DrillDownClick{uri="+this.a+", recentSearch="+this.b+'}';
    }
}
