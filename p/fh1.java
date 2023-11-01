package p.fh1;
import p.eo5;
import p.aq6;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class fh1 extends eo5	// class@0015c7 from classes.dex
{
    public final aq6 D;

    public void fh1(aq6 p0){
       super();
       p0.getClass();
       this.D = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof fh1) {
          return false;
       }
       return p0.D.equals(this.D);
    }
    public final int hashCode(){
       return (this.D.hashCode() + 0);
    }
    public final String toString(){
       return "LoadShowEpisodes{uri="+this.D+'}';
    }
}
