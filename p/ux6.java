package p.ux6;
import p.vx6;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class ux6 extends vx6	// class@00293f from classes.dex
{
    public final int a;
    public final int b;
    public final int c;

    public void ux6(int p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ux6) {
          return false;
       }
       if (p0.a != this.a || (p0.b != this.b || p0.c != this.c)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (Integer.valueOf(this.c).hashCode() + ((Integer.valueOf(this.b).hashCode() + ((Integer.valueOf(this.a).hashCode() + 0) * 31)) * 31));
    }
    public final String toString(){
       return tp2.n("Running{size="+this.a+", requested="+this.b+", received=", this.c, '}');
    }
}
