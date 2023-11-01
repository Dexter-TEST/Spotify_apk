package p.ct;
import p.jz0;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Class;
import p.kk5;
import java.lang.StringBuilder;

public final class ct	// class@001277 from classes.dex
{
    public final Object a;

    public void ct(jz0 p0){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null payload");
       }
       this.a = p0;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ct) {
          return false;
       }
       p0.getClass();
       if (!this.a.equals(p0.a) || !kk5.c.equals(kk5.c)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((this.a.hashCode() ^ -721379959) * 0xf4243) ^ kk5.c.hashCode());
    }
    public final String toString(){
       return "Event{code=null, payload="+this.a+", priority="+kk5.c+"}";
    }
}
