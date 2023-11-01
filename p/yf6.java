package p.yf6;
import p.uw5;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;
import p.en6;

public final class yf6 extends uw5	// class@002dab from classes.dex
{
    public final String A;
    public final String B;

    public void yf6(String p0,String p1){
       super();
       p0.getClass();
       this.A = p0;
       p1.getClass();
       this.B = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof yf6) {
          return false;
       }
       if (!p0.A.equals(this.A) || !p0.B.equals(this.B)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.B.hashCode() + tp2.g(this.A, 0, 31));
    }
    public final String toString(){
       return en6.p("Login{username=", this.A, ", password=***}");
    }
}
