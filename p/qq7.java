package p.qq7;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.tp2;

public final class qq7	// class@0023f8 from classes.dex
{
    public final String a;
    public final int b;

    public void qq7(String p0,int p1){
       co5.o(p0, "workSpecId");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof qq7) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((this.a.hashCode() * 31) + this.b);
    }
    public final String toString(){
       return tp2.n("WorkGenerationalId\(workSpecId="+this.a+", generation=", this.b, ')');
    }
}
