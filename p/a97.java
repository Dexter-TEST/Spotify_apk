package p.a97;
import p.eb3;
import com.google.common.collect.c;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class a97 extends eb3	// class@000f3e from classes.dex
{
    public final c F;
    public final c G;

    public void a97(c p0,c p1){
       super();
       p0.getClass();
       this.F = p0;
       p1.getClass();
       this.G = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof a97) {
          return false;
       }
       if (!p0.F.equals(this.F) || !p0.G.equals(this.G)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.G.hashCode() + ((this.F.hashCode() + 0) * 31));
    }
    public final String toString(){
       return "FetchTriggerList{formatTypes="+this.F+", triggerTypes="+this.G+'}';
    }
}
