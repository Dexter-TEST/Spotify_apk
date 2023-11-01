package p.y9;
import p.x9;
import java.lang.String;
import java.lang.Integer;
import io.reactivex.rxjava3.core.Single;
import com.spotify.allboarding.model.v1.proto.OnboardingRequest;

public interface abstract y9	// class@002d77 from classes.dex
{
    public static final x9 a;
    public static final String b;

    static {
       y9.a = x9.a;
    }
    Single a(String p0,String p1,String p2,Integer p3);
    Single b(String p0,OnboardingRequest p1);
    Single c(String p0,String p1,String p2,String p3,String p4,String p5);
    Single d(String p0);
}
