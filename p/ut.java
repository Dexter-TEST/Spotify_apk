package p.ut;
import com.google.common.collect.d;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.StringBuilder;

public final class ut	// class@00291d from classes.dex
{
    public final d a;
    public final d b;

    public void ut(d p0,d p1){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null loaded");
       }
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null required");
       }
       this.b = p1;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ut) {
          return false;
       }
       if (!this.a.equals(p0.a) || !this.b.equals(p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode());
    }
    public final String toString(){
       return "Result{loaded="+this.a+", required="+this.b+"}";
    }
}
