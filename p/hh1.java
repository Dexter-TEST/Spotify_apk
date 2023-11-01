package p.hh1;
import p.do5;
import p.aq6;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class hh1 extends do5	// class@00184e from classes.dex
{
    public final aq6 F;

    public void hh1(aq6 p0){
       super();
       p0.getClass();
       this.F = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof hh1) {
          return false;
       }
       return p0.F.equals(this.F);
    }
    public final int hashCode(){
       return (this.F.hashCode() + 0);
    }
    public final String toString(){
       return "LoadTrackList{uri="+this.F+'}';
    }
}
