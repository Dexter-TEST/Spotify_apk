package p.si5;
import p.ti5;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class si5 implements ti5	// class@002636 from classes.dex
{
    public final String a;
    public final String b;
    public final boolean c;

    public void si5(String p0,String p1,boolean p2){
       co5.o(p0, "partner");
       co5.o(p1, "referrer");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof si5) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       si5 tc;
       int i = tp2.g(this.b, (this.a.hashCode() * 31), 31);
       if ((tc = this.c) != null) {
          tc = 1;
       }
       return (i + tc);
    }
    public final String toString(){
       return kg4.p("Preloaded\(partner="+this.a+", referrer="+this.b+", allowGetPremium=", this.c, ')');
    }
}
