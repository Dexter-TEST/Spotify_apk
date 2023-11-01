package p.tb5;
import p.xj0;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupRequestBody;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class tb5 extends xj0	// class@00273b from classes.dex
{
    public final IdentifierTokenSignupRequestBody H;

    public void tb5(IdentifierTokenSignupRequestBody p0){
       super();
       this.H = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof tb5) {
          return false;
       }
       return p0.H.equals(this.H);
    }
    public final int hashCode(){
       return (this.H.hashCode() + 0);
    }
    public final String toString(){
       return "SignupOtp{request="+this.H+'}';
    }
}
