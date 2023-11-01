package p.ig6;
import p.uw5;
import com.spotify.login.signupapi.services.model.FacebookSignupRequest;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class ig6 extends uw5	// class@00198d from classes.dex
{
    public final FacebookSignupRequest A;

    public void ig6(FacebookSignupRequest p0){
       super();
       this.A = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof ig6) {
          return false;
       }
       return p0.A.equals(this.A);
    }
    public final int hashCode(){
       return (this.A.hashCode() + 0);
    }
    public final String toString(){
       return "SignUpWithFacebook{request="+this.A+'}';
    }
}
