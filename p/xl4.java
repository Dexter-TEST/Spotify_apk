package p.xl4;
import p.lv1;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class xl4 extends lv1	// class@002c9e from classes.dex
{
    public final int P;

    public void xl4(int p0){
       super();
       this.P = p0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof xl4) {
          return false;
       }
       if (p0.P != this.P) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (Integer.valueOf(this.P).hashCode() + 0);
    }
    public final String toString(){
       return tp2.n("Repeat{repeatMode=", this.P, '}');
    }
}
