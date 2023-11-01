package p.qj2;
import p.zf2;
import java.lang.Object;
import p.kg6;
import com.spotify.login.signupapi.services.model.EmailSignupResponse$Status$Error;
import java.util.Map;
import p.vf;
import java.lang.String;
import java.util.Collection;
import java.lang.Iterable;
import p.wg6;
import com.spotify.login.signupapi.services.model.EmailSignupResponse$Status$Ok;
import p.xg6;
import com.spotify.login.signupapi.services.model.FacebookSignupResponse$Status$Error;
import p.fv1;
import com.spotify.login.signupapi.services.model.FacebookSignupResponse$Status$Ok;
import p.d37;
import com.spotify.litesignup.phonesignup.view.PhoneNumberView;
import android.view.KeyEvent;
import java.lang.Boolean;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse$Status$Unknown;
import java.util.Collections;
import p.oc5;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse$Status$Error;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse$Status$Ok;
import p.pc5;
import p.u76;
import p.sm;
import java.lang.Integer;
import com.spotify.login.signupapi.services.model.EmailSignupResponse$Status$Unknown;

public final class qj2 implements zf2	// class@0023b1 from classes.dex
{
    public final int a;

    public void qj2(int p0){
       this.a = p0;
       super();
    }
    public final Object invoke(Object p0){
       d37 c;
       kg6 b = kg6.b;
       boolean b1 = true;
       switch (this.a){
           case 0:
             return Boolean.TRUE;
           case 1:
             c = p0.c;
             if ((p0 = p0.b) != 6 && (p0 != 3 && (c == null && c.getKeyCode() == 66))) {
                b1 = false;
             }
             return Boolean.valueOf(b1);
             break;
           case 2:
             c = p0.c;
             if ((p0 = p0.b) != 6 && (p0 != 3 && (c == null && c.getKeyCode() == 66))) {
                b1 = false;
             }
             return Boolean.valueOf(b1);
             break;
           case 3:
             return new pc5(p0.getUsername(), p0.getOneTimeToken());
           case 4:
             return new oc5(p0.getStatus(), p0.getErrors());
           case 5:
             return new oc5(b, Collections.emptyMap());
           case 6:
             c = p0.c;
             if (p0.b != 5 && (c == null && (!c.getAction() && c.getKeyCode() == 66))) {
                b1 = false;
             }
             return Boolean.valueOf(b1);
             break;
           case 7:
             return new xg6(p0.getUsername());
           case 8:
             return new wg6(fv1.v(p0.getStatusCode()), p0.getMessage());
           case 9:
             return new xg6(p0.getUsername());
           case 10:
             return new wg6(p0.getStatus(), new vf(String.valueOf(' ')).r(p0.getErrors().values()));
           default:
             return new wg6(b, null);
       }
    }
}
