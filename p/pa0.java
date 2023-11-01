package p.pa0;
import p.sa0;
import com.spotify.login.signupapi.services.model.CallingCode;
import java.util.List;
import java.lang.Class;
import java.lang.Object;
import p.xe7;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class pa0 extends sa0	// class@00221f from classes.dex
{
    public final CallingCode a;
    public final List b;

    public void pa0(CallingCode p0,List p1){
       super();
       this.a = p0;
       p1.getClass();
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof pa0) {
          return false;
       }
       if (!xe7.u(p0.a, this.a) || !p0.b.equals(this.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       pa0 ta;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       return (this.b.hashCode() + ((i + i1) * 31));
    }
    public final String toString(){
       return kg4.o("OpenCallingCodePicker{callingCode="+this.a+", callingCodes=", this.b, '}');
    }
}
