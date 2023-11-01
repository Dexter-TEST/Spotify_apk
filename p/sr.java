package p.sr;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class sr	// class@002689 from classes.dex
{
    public final long a;
    public final long b;

    public void sr(long p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof sr) {
          return false;
       }
       if ((this.a - p0.a) || (this.b - p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       sr ta = this.a;
       sr tb = this.b;
       return ((int)((tb >> 32) ^ tb) ^ (((int)(ta ^ (ta >> 32)) ^ 0xf4243) * 0xf4243));
    }
    public final String toString(){
       return "ContextIndex{page="+this.a+", track="+this.b+"}";
    }
}
