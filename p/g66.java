package p.g66;
import p.c76;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.tm;
import p.kl4;
import java.lang.StringBuilder;
import p.hr7;

public final class g66 extends c76	// class@0016ad from classes.dex
{
    public final String a;

    public void g66(String p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(tm p0,tm p1,tm p2,tm p3,tm p4,tm p5,tm p6,tm p7,tm p8,kl4 p9){
       return p2.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof g66) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("AddToPlaylistClick{trackUri=", this.a, '}');
    }
}
