package p.uv;
import p.vw6;
import com.google.common.collect.d;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;

public final class uv extends vw6	// class@00292f from classes.dex
{
    public final d b;

    public void uv(d p0){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null providers");
       }
       this.b = p0;
       return;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof vw6) {
          return this.b.equals(p0.b);
       }
       return false;
    }
    public final int hashCode(){
       return (this.b.hashCode() ^ 0xf4243);
    }
    public final String toString(){
       return "Suppressions{providers="+this.b+"}";
    }
}
