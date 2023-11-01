package p.jr;
import p.kr;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import p.li5;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.StringBuilder;

public final class jr	// class@001b32 from classes.dex
{
    public final kr a;
    public final List b;

    public void jr(kr p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static jr a(kr p0,ArrayList p1){
       li5 oli5 = new li5(11, 0);
       if (p0 == null) {
          throw new NullPointerException("Null entity");
       }
       oli5.b = p0;
       oli5.c = p1;
       return new jr(p0, p1);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof jr) {
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
       return "Artist{entity="+this.a+", images="+this.b+"}";
    }
}
