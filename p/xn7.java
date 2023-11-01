package p.xn7;
import p.ry7;
import p.co7;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class xn7 extends ry7	// class@002cb3 from classes.dex
{
    public final no7 M;

    public void xn7(co7 p0){
       super();
       this.M = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof xn7) {
          return false;
       }
       return p0.M.equals(this.M);
    }
    public final int hashCode(){
       return (this.M.hashCode() + 0);
    }
    public final String toString(){
       return "ShowAutoLoginFailed{retryWith="+this.M+'}';
    }
}
