package p.eb5;
import p.xj0;
import p.h;
import java.lang.String;
import java.lang.Object;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;

public final class eb5 extends xj0	// class@001456 from classes.dex
{
    public final h H;
    public final String I;
    public final String J;
    public final String K;

    public void eb5(h p0,String p1,String p2,String p3){
       super();
       this.H = p0;
       this.I = p1;
       this.J = p2;
       this.K = p3;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof eb5) {
          return false;
       }
       if (!p0.H.equals(this.H) || (!p0.I.equals(this.I) || (!p0.J.equals(this.J) || !p0.K.equals(this.K)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.K.hashCode() + tp2.g(this.J, tp2.g(this.I, ((this.H.hashCode() + 0) * 31), 31), 31));
    }
    public final String toString(){
       return hr7.a("ResendOtp{context="+this.H+", countryIso="+this.I+", callingCode="+this.J+", phoneNumber=", this.K, '}');
    }
}
