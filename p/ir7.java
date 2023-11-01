package p.ir7;
import p.rq7;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;

public final class ir7	// class@0019f1 from classes.dex
{
    public final String a;
    public final rq7 b;

    public void ir7(rq7 p0,String p1){
       co5.o(p1, "id");
       super();
       this.a = p1;
       this.b = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ir7) {
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
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return "IdAndState\(id="+this.a+", state="+this.b+')';
    }
}
