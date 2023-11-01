package p.ab5;
import p.xj0;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class ab5 extends xj0	// class@000f4e from classes.dex
{
    public final String H;
    public final String I;
    public final boolean J;

    public void ab5(String p0,String p1){
       super();
       p0.getClass();
       this.H = p0;
       p1.getClass();
       this.I = p1;
       this.J = true;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ab5) {
          return false;
       }
       if (p0.J != this.J || (!p0.H.equals(this.H) || !p0.I.equals(this.I))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.J, tp2.g(this.I, tp2.g(this.H, 0, 31), 31));
    }
    public final String toString(){
       return kg4.p("LoginOtp{username="+this.H+", token=***, signedUp=", this.J, '}');
    }
}
