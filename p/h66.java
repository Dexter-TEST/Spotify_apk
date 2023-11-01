package p.h66;
import p.c76;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.tm;
import p.kl4;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class h66 extends c76	// class@0017f0 from classes.dex
{
    public final String a;
    public final boolean b;

    public void h66(String p0,boolean p1){
       super();
       p0.getClass();
       this.a = p0;
       this.b = p1;
    }
    public final Object a(tm p0,tm p1,tm p2,tm p3,tm p4,tm p5,tm p6,tm p7,tm p8,kl4 p9){
       return p3.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof h66) {
          return false;
       }
       if (p0.b != this.b || !p0.a.equals(this.a)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.b, tp2.g(this.a, 0, 31));
    }
    public final String toString(){
       return kg4.p("AddedToPlaylist{trackUri="+this.a+", successful=", this.b, '}');
    }
}
