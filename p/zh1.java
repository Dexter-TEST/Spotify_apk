package p.zh1;
import p.do5;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class zh1 extends do5	// class@002ef6 from classes.dex
{
    public final long F;

    public void zh1(){
       super();
       this.F = 0x2710;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof zh1) {
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
       return tp2.o("StartSlowLoadingTimeout{delay=", this.F, '}');
    }
}
