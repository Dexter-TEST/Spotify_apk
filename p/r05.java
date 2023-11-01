package p.r05;
import p.ty0;
import java.lang.String;
import p.o05;
import java.lang.Class;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;

public final class r05 extends ty0	// class@00244f from classes.dex
{
    public final String m;
    public final o05 n;

    public void r05(String p0,o05 p1){
       super();
       p0.getClass();
       this.m = p0;
       this.n = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof r05) {
          return false;
       }
       if (p0.n != this.n || !p0.m.equals(this.m)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.n.hashCode() + tp2.g(this.m, 0, 31));
    }
    public final String toString(){
       return "Resource{uri="+this.m+", availability="+this.n+'}';
    }
}
