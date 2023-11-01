package p.ek0;
import java.io.Serializable;
import p.v45;
import java.util.Comparator;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;

public final class ek0 extends v45 implements Serializable	// class@0014a0 from classes.dex
{
    public final Comparator a;

    public void ek0(Comparator p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final int compare(Object p0,Object p1){
       return this.a.compare(p0, p1);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof ek0) {
          return this.a.equals(p0.a);
       }
       return false;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return this.a.toString();
    }
}
