package p.iw;
import java.lang.String;
import java.lang.Object;
import p.or7;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import p.en6;

public final class iw	// class@001a1d from classes.dex
{
    public final String a;
    public final String b;
    public final String c;

    public void iw(String p0,String p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static iw a(String p0,String p1,String p2){
       or7 oor7 = new or7();
       if (p0 == null) {
          throw new NullPointerException("Null uri");
       }
       oor7.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null username");
       }
       oor7.b = p1;
       if (p2 == null) {
          throw new NullPointerException("Null displayName");
       }
       oor7.c = p2;
       p0 = "";
       if (p0.isEmpty()) {
          return new iw(oor7.a, oor7.b, oor7.c);
       }
       throw new IllegalStateException("Missing required properties:".concat(p0));
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof iw) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || !this.c.equals(p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode());
    }
    public final String toString(){
       return en6.p("User{uri="+this.a+", username="+this.b+", displayName=", this.c, "}");
    }
}
