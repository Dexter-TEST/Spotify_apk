package p.dm4;
import p.lv1;
import java.lang.Object;
import p.tp2;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class dm4 extends lv1	// class@001375 from classes.dex
{
    public final boolean P;

    public void dm4(boolean p0){
       super();
       this.P = p0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof dm4) {
          return false;
       }
       if (p0.P != this.P) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.P, 0);
    }
    public final String toString(){
       return kg4.p("Shuffle{enabled=", this.P, '}');
    }
}
