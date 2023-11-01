package p.ai1;
import p.do5;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class ai1 extends do5	// class@000f88 from classes.dex
{
    public final long F;

    public void ai1(){
       super();
       this.F = 300;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ai1) {
          return false;
       }
       if (p0.F - this.F) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (Long.valueOf(this.F).hashCode() + 0);
    }
    public final String toString(){
       return tp2.o("StartTimeout{delay=", this.F, '}');
    }
}
