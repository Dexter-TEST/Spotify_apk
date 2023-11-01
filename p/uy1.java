package p.uy1;
import p.oi;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class uy1 extends oi	// class@002943 from classes.dex
{
    public final String H;
    public final boolean I;

    public void uy1(String p0,boolean p1){
       super();
       p0.getClass();
       this.H = p0;
       this.I = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof uy1) {
          return false;
       }
       if (p0.I != this.I || !p0.H.equals(this.H)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return tp2.h(this.I, tp2.g(this.H, 0, 31));
    }
    public final String toString(){
       return kg4.p("ReturnAccessToken{accessToken="+this.H+", fromSignup=", this.I, '}');
    }
}
