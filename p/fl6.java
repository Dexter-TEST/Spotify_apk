package p.fl6;
import p.jb1;
import p.oi;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class fl6	// class@0015ef from classes.dex
{
    public final oi a;
    public final oi b;
    public static final fl6 c;

    static {
       fl6.c = new fl6(jb1.H, jb1.H);
    }
    public void fl6(oi p0,oi p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof fl6) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return "Size\(width="+this.a+", height="+this.b+')';
    }
}
