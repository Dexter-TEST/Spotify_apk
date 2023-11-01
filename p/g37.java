package p.g37;
import java.util.ArrayList;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class g37	// class@001694 from classes.dex
{
    public final List a;
    public final int b;

    public void g37(int p0,ArrayList p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof g37) {
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
       return tp2.n("TextViewLineSpec\(linesCount="+this.a+", lineHeight=", this.b, ')');
    }
}
