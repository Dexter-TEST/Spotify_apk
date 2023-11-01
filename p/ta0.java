package p.ta0;
import p.za0;
import com.spotify.login.signupapi.services.model.CallingCode;
import p.cb0;
import p.xc5;
import java.lang.Object;
import p.xe7;
import java.lang.String;
import java.lang.StringBuilder;

public final class ta0 extends za0	// class@00272d from classes.dex
{
    public final CallingCode a;

    public void ta0(CallingCode p0){
       super();
       this.a = p0;
    }
    public final Object a(cb0 p0,cb0 p1,cb0 p2,cb0 p3,xc5 p4,xc5 p5){
       return p0.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ta0) {
          return false;
       }
       return xe7.u(p0.a, this.a);
    }
    public final int hashCode(){
       ta0 ta;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       return "CallingCodeChanged{callingCode="+this.a+'}';
    }
}
