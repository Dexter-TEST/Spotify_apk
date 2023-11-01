package p.rc6;
import p.lj;
import p.oh5;
import p.xb4;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class rc6	// class@0024bf from classes.dex
{
    public final zb4 a;
    public final lj b;
    public final oh5 c;

    public void rc6(lj p0,oh5 p1){
       co5.o(p0, "appMetadata");
       co5.o(p1, "policyInputs");
       super();
       this.a = xb4.a;
       this.b = p0;
       this.c = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof rc6) {
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
       return (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31));
    }
    public final String toString(){
       return "Settings\(mode="+this.a+", appMetadata="+this.b+", policyInputs="+this.c+')';
    }
}
