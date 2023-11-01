package p.ib1;
import p.oi;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Object;

public final class ib1 extends oi	// class@00195c from classes.dex
{
    public final int H;

    public void ib1(int p0){
       super();
       this.H = p0;
       p0 = (p0 > 0)? 1: 0;
       if (p0) {
          return;
       }else {
          throw new IllegalArgumentException("px must be > 0.".toString());
       }
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof ib1 || this.H != p0.H) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return this.H;
    }
    public final String toString(){
       return String.valueOf(this.H);
    }
}
