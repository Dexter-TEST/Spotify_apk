package p.my6;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.tp2;

public final class my6	// class@001f2f from classes.dex
{
    public final String a;
    public final int b;
    public final int c;

    public void my6(String p0,int p1,int p2){
       co5.o(p0, "workSpecId");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof my6) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((((this.a.hashCode() * 31) + this.b) * 31) + this.c);
    }
    public final String toString(){
       return tp2.n("SystemIdInfo\(workSpecId="+this.a+", generation="+this.b+", systemId=", this.c, ')');
    }
}
