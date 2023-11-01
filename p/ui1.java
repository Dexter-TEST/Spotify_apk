package p.ui1;
import p.vi1;
import p.ti1;
import p.yi1;
import p.pp;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class ui1 extends vi1	// class@0028b4 from classes.dex
{
    public final vi1 a;

    public void ui1(ti1 p0){
       super();
       this.a = p0;
    }
    public final void a(yi1 p0,yi1 p1,pp p2,yi1 p3,pp p4,yi1 p5){
       p4.accept(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ui1) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "WaitingForRemoteValidation{otherwise="+this.a+'}';
    }
}
