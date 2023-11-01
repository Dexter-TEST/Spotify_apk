package p.r66;
import p.c76;
import p.b43;
import p.tm;
import p.kl4;
import java.lang.Object;
import p.xe7;
import java.lang.String;
import java.lang.StringBuilder;

public final class r66 extends c76	// class@002488 from classes.dex
{
    public final b43 a;

    public void r66(b43 p0){
       super();
       this.a = p0;
    }
    public final Object a(tm p0,tm p1,tm p2,tm p3,tm p4,tm p5,tm p6,tm p7,tm p8,kl4 p9){
       return p8.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof r66) {
          return false;
       }
       return xe7.u(p0.a, this.a);
    }
    public final int hashCode(){
       r66 ta;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       return "RecentSearchesResponse{model="+this.a+'}';
    }
}
