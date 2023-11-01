package p.ip;
import com.spotify.connectivity.authapi.AuthTriggerApi;
import com.spotify.connectivity.auth.AuthUserInfo;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class ip	// class@0019e0 from classes.dex
{

    public static void a(AuthTriggerApi p0,AuthUserInfo p1,boolean p2,int p3,Object p4){
       if (p4 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAuthUserInfo");
       }
       if ((p3 & 0x02)) {
          p2 = true;
       }
       p0.setAuthUserInfo(p1, p2);
       return;
    }
}
