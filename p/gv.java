package p.gv;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class gv	// class@00178c from classes.dex
{
    public final long a;
    public final long b;
    public final Set c;

    public void gv(long p0,long p1,Set p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof gv) {
          return false;
       }
       if ((this.a - p0.a) || ((this.b - p0.b) || !this.c.equals(p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       gv ta = this.a;
       gv tb = this.b;
       return (this.c.hashCode() ^ (((((int)(ta ^ (ta >> 32)) ^ 0xf4243) * 0xf4243) ^ (int)((tb >> 32) ^ tb)) * 0xf4243));
    }
    public final String toString(){
       return "ConfigValue{delta="+this.a+", maxAllowedDelay="+this.b+", flags="+this.c+"}";
    }
}
