package p.kn7;
import p.ry7;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;
import p.en6;

public final class kn7 extends ry7	// class@001c4c from classes.dex
{
    public final String M;
    public final String N;

    public void kn7(String p0,String p1){
       super();
       p0.getClass();
       this.M = p0;
       p1.getClass();
       this.N = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof kn7) {
          return false;
       }
       if (!p0.M.equals(this.M) || !p0.N.equals(this.N)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.N.hashCode() + tp2.g(this.M, 0, 31));
    }
    public final String toString(){
       return en6.p("AutoLogin{username=", this.M, ", password=***}");
    }
}
