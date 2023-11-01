package p.ub5;
import p.xj0;
import p.na5;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hr7;

public final class ub5 extends xj0	// class@00287c from classes.dex
{
    public final na5 H;
    public final String I;

    public void ub5(na5 p0,String p1){
       super();
       this.H = p0;
       this.I = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ub5) {
          return false;
       }
       if (!p0.H.equals(this.H) || !p0.I.equals(this.I)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (this.I.hashCode() + ((this.H.hashCode() + 0) * 31));
    }
    public final String toString(){
       return hr7.a("ValidateOtp{challenge="+this.H+", otp=", this.I, '}');
    }
}
