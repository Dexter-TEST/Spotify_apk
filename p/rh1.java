package p.rh1;
import p.eo5;
import java.util.List;
import java.util.Set;
import java.lang.Class;
import java.lang.Object;
import java.util.Collection;
import java.lang.String;
import java.lang.StringBuilder;

public final class rh1 extends eo5	// class@0024e7 from classes.dex
{
    public final List D;
    public final Collection E;

    public void rh1(List p0,Set p1){
       super();
       p0.getClass();
       this.D = p0;
       p1.getClass();
       this.E = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof rh1) {
          return false;
       }
       if (!p0.D.equals(this.D) || !p0.E.equals(this.E)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.E.hashCode() + ((this.D.hashCode() + 0) * 31));
    }
    public final String toString(){
       return "SaveShowEpisodes{episodes="+this.D+", loaded=***}";
    }
}
