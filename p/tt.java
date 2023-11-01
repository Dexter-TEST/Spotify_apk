package p.tt;
import com.google.common.collect.d;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.StringBuilder;

public final class tt	// class@0027df from classes.dex
{
    public final boolean a;
    public final d b;

    public void tt(boolean p0,d p1){
       super();
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null missing");
       }
       this.b = p1;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof tt) {
          return false;
       }
       if (this.a != p0.a || !this.b.equals(p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = (this.a != null)? 1231: 1237;
       return (((i ^ 0xf4243) * 0xf4243) ^ this.b.hashCode());
    }
    public final String toString(){
       return "Comparison{contextUpdated="+this.a+", missing="+this.b+"}";
    }
}
