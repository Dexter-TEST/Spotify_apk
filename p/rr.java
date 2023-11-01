package p.rr;
import p.ks0;
import java.lang.String;
import p.m73;
import p.r45;
import java.lang.Object;
import java.lang.Class;
import java.util.Map;
import p.w51;
import java.lang.StringBuilder;

public final class rr extends ks0	// class@002547 from classes.dex
{
    public final String a;
    public final String b;
    public final m73 c;
    public final r45 d;
    public final r45 e;

    public void rr(String p0,String p1,m73 p2,r45 p3,r45 p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ks0) {
          return false;
       }
       if (this.a.equals(p0.a) && this.b.equals(p0.b)) {
          rr tc = this.c;
          tc.getClass();
          if (w51.q(tc, p0.c) && (this.d.equals(p0.d) && this.e.equals(p0.e))) {
          label_0047 :
             return b;
          }
       }
       b = false;
       goto label_0047 ;
    }
    public final int hashCode(){
       return (((((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243) ^ this.e.hashCode());
    }
    public final String toString(){
       return "Context{uri="+this.a+", url="+this.b+", metadata="+this.c+", pages="+this.d+", restrictions="+this.e+"}";
    }
}
