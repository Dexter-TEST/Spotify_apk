package p.rh6;
import com.spotify.login.signupapi.services.model.FacebookSignupRequest;
import io.reactivex.rxjava3.core.Single;
import com.spotify.login.signupapi.services.model.EmailSignupRequestBody;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupRequestBody;
import java.lang.String;

public interface abstract rh6	// class@0024ec from classes.dex
{

    Single a(FacebookSignupRequest p0);
    Single b(EmailSignupRequestBody p0);
    Single c(IdentifierTokenSignupRequestBody p0);
    Single d(String p0,String p1);
    Single e(String p0);
    Single f(String p0,String p1);
    Single g(int p0,int p1,int p2);
}
