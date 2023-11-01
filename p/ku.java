package p.ku;
import p.fw;
import p.dt;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.StringBuilder;

public final class ku	// class@001c8a from classes.dex
{
    public final long a;
    public final fw b;
    public final dt c;

    public void ku(long p0,fw p1,dt p2){
       super();
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null transportContext");
       }
       this.b = p1;
       this.c = p2;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ku) {
          return false;
       }
       if ((this.a - p0.a) || (!this.b.equals(p0.b) || !this.c.equals(p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       ku ta = this.a;
       return (this.c.hashCode() ^ (((((int)(ta ^ (ta >> 32)) ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243));
    }
    public final String toString(){
       return "PersistedEvent{id="+this.a+", transportContext="+this.b+", event="+this.c+"}";
    }
}
