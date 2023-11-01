package p.db5;
import p.xj0;
import java.lang.String;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class db5 extends xj0	// class@001317 from classes.dex
{
    public final String H;
    public final String I;
    public final String J;

    public void db5(String p0,String p1,String p2){
       super();
       this.H = p0;
       this.I = p1;
       this.J = p2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof db5) {
          return false;
       }
       if (!p0.H.equals(this.H) || (!p0.I.equals(this.I) || !p0.J.equals(this.J))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.J.hashCode() + tp2.g(this.I, tp2.g(this.H, 0, 31), 31));
    }
    public final String toString(){
       return hr7.a("RequestOtp{countryIso="+this.H+", callingCode="+this.I+", phoneNumber=", this.J, '}');
    }
}
