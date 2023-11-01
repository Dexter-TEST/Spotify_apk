package p.a65;
import p.q55;
import p.w55;
import p.d65;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class a65 implements q55	// class@000f21 from classes.dex
{
    public final u55 a;
    public final d65 b;
    public final d65 c;

    public void a65(w55 p0,d65 p1){
       co5.o(p0, "pageIdentifier");
       super();
       this.a = p0;
       this.b = p1;
       this.c = null;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof a65) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       a65 tb;
       int i = this.a.hashCode() * 31;
       int i1 = 0;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       i = (i + i2) * 31;
       if ((tb = this.c) != null) {
          i1 = tb.hashCode();
       }
       return (i + i1);
    }
    public final String toString(){
       return "PageView\(pageIdentifier="+this.a+", pageUri="+this.b+", navigationalRoot="+this.c+')';
    }
}
