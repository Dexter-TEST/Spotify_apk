package p.br6;
import p.ry7;
import p.uo7;
import java.lang.Object;
import p.tp2;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class br6 extends ry7	// class@001120 from classes.dex
{
    public final boolean M;

    public void br6(boolean p0){
       super();
       this.M = p0;
    }
    public final void O(uo7 p0,uo7 p1,uo7 p2,uo7 p3){
       p2.accept(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof br6) {
          return false;
       }
       if (p0.M != this.M) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.M, 0);
    }
    public final String toString(){
       return kg4.p("LoggedIn{signedUp=", this.M, '}');
    }
}
