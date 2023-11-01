package p.hg6;
import p.uw5;
import com.spotify.login.signupapi.services.model.EmailSignupRequestBody;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class hg6 extends uw5	// class@00184a from classes.dex
{
    public final EmailSignupRequestBody A;

    public void hg6(EmailSignupRequestBody p0){
       super();
       this.A = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof hg6) {
          return false;
       }
       return p0.A.equals(this.A);
    }
    public final int hashCode(){
       return (this.A.hashCode() + 0);
    }
    public final String toString(){
       return "SignUpWithEmail{request="+this.A+'}';
    }
}
