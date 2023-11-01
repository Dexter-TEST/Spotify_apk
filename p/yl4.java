package p.yl4;
import p.lv1;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class yl4 extends lv1	// class@002ddf from classes.dex
{
    public final int P;

    public void yl4(int p0){
       super();
       this.P = p0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof yl4) {
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
       return tp2.n("Seek{positionMs=", this.P, '}');
    }
}
