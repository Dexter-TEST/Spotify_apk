package p.ab0;
import p.yf2;
import p.bi5;
import java.lang.Object;
import p.jc7;
import com.spotify.litesignup.phonesignup.view.PhoneNumberView;
import p.ua0;
import p.r45;
import com.spotify.litesignup.phonesignup.view.OneTimePassView;
import java.lang.String;
import p.g35;
import p.l35;
import p.i35;
import p.m35;
import com.spotify.litesignup.phonesignup.view.BirthdayGenderContainerView;
import p.gc5;
import android.content.Intent;
import p.pd5;
import p.la0;
import com.spotify.login.signupapi.services.model.CallingCode;
import p.ta0;
import p.xb5;
import p.za0;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import java.util.List;
import java.util.Iterator;
import p.io2;
import p.m10;
import p.wb5;
import p.p10;
import p.va0;
import p.nc5;
import p.ys5;
import com.google.common.collect.c;
import java.lang.Iterable;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Throwable;
import p.oa5;
import p.kg6;
import java.util.Map;
import java.util.Collections;
import p.oc5;
import p.xp;
import p.fc5;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse$Status;
import p.qj2;
import p.zf2;
import p.tc5;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse;
import p.xa5;
import p.o35;
import p.jc5;
import p.q35;
import p.wa5;
import p.bb5;
import java.lang.Boolean;
import p.ic5;
import p.b35;
import p.f35;
import p.na5;
import java.util.concurrent.TimeUnit;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.t25;
import p.zb5;
import p.x25;
import p.cc5;
import p.y25;
import p.na0;
import p.ya0;
import p.ir6;
import java.lang.Class;
import p.cr6;
import p.d37;
import com.spotify.liteui.login.LoginActivity;
import android.view.KeyEvent;
import p.vt;
import p.cv2;
import p.vu2;
import p.av2;
import java.io.IOException;
import p.qn1;
import p.jn1;
import p.en1;
import p.fn1;
import p.gn1;
import p.in1;
import p.hn1;
import p.cn1;
import p.dn1;
import p.wu2;
import p.xu2;
import android.support.v4.media.MediaMetadataCompat;
import p.tj;
import p.ox7;
import p.z4;
import com.spotify.litesettings.settings.SettingsActivity;
import p.o97;
import p.k97;

public final class ab0 implements yf2, bi5	// class@000f49 from classes.dex
{
    public final int a;

    public void ab0(int p0){
       this.a = p0;
       super();
    }
    public Object apply(Object p0){
       CallingCode uCallingCode;
       switch (this.a){
           case 0:
             return new xb5(new ya0(p0.a));
           case 1:
             return new gc5();
           case 2:
             return new cc5();
           case 3:
             return new zb5(p0.a);
           case 4:
             return Observable.just(new jc5(new f35(p0.a))).delay(p0.b, TimeUnit.MILLISECONDS, s36.b);
           case 5:
             return new jc5(p0);
           case 6:
             return new ic5(p0.booleanValue());
           case 7:
             return p0.H;
           case 8:
             return p0.H;
           case 9:
             return new wb5(p0);
           case 10:
             return new jc5(new o35(p0));
           case 11:
             return p0.H;
           case 12:
             return new oa5(p0);
           case 13:
             return p0.getStatus();
           case 14:
             return p0.map(new qj2(3), new qj2(4), new qj2(5));
           case 15:
             return new fc5(p0, true);
           case 16:
             return new oc5(kg6.b, Collections.emptyMap());
           case 17:
             return new oa5(p0);
           case 18:
             return new oa5(p0);
           case 19:
             Iterator iterator = p0.getAllowedCallingCodes().iterator();
             do {
                if (iterator.hasNext()) {
                }else {
                   uCallingCode = null;
                   break ;
                }
                uCallingCode = iterator.next();
             } while (io2.j(p0.getCountry(), uCallingCode.getCountryCode()));
             return Observable.fromIterable(c.s(new wb5(new m10(p0.getMinimumAge())), new xb5(new va0(p0.getAllowedCallingCodes())), new xb5(new ta0(uCallingCode)), new nc5(p0)));
             break;
           case 20:
             return new xb5(new ta0(p0));
           case 21:
             return new CallingCode(p0.a, p0.b);
           case 22:
             return p0.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
           case 23:
             return new gc5();
           case 24:
             return new m35();
           case 25:
             return new i35();
           case 26:
             return new l35();
           case 27:
             return new g35(p0.f());
           case 28:
             return new ua0();
           default:
             return new ua0();
       }
    }
    public boolean test(Object p0){
       boolean b = false;
       switch (this.a){
           case 0:
             p0.getClass();
             return p0 instanceof av2;
           case 1:
             p0.getClass();
             return p0 instanceof vu2;
           case 2:
             return p0.c();
           case 3:
             return (p0.a ^ 1);
           case 4:
             return p0.booleanValue();
           case 5:
             return p0.hasExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
           case 6:
             if (ox7.s(p0) != null) {
                b = true;
             }
             return b;
             break;
           case 7:
             p0.getClass();
             return p0 instanceof av2;
           case 8:
             p0.getClass();
             return p0 instanceof xu2;
           case 9:
             p0.getClass();
             return p0 instanceof wu2;
           case 10:
             p0.getClass();
             return p0 instanceof dn1;
           case 11:
             p0.getClass();
             return p0 instanceof cn1;
           case 12:
             p0.getClass();
             return p0 instanceof hn1;
           case 13:
             p0.getClass();
             return p0 instanceof in1;
           case 14:
             p0.getClass();
             return p0 instanceof gn1;
           case 15:
             p0.getClass();
             return p0 instanceof fn1;
           case 16:
             p0.getClass();
             return p0 instanceof en1;
           case 17:
             p0.getClass();
             return p0 instanceof vu2;
           case 18:
             return (p0.booleanValue() ^ 1);
           case 19:
             return p0.c();
           case 20:
             return p0 instanceof IOException;
           case 21:
             p0.getClass();
             return p0 instanceof av2;
           case 22:
             p0.getClass();
             return p0 instanceof vu2;
           case 23:
             if (p0.b.c() && (p0.g.c() && p0.e.c())) {
                b = true;
             }
             return b;
             break;
           case 24:
             d37 c = p0.c;
             if (p0.b == 6 || (c != null || c.getKeyCode() != 66)) {
                b = true;
             }
             return b;
             break;
           case 25:
             return p0.c();
           case 26:
             return p0.c();
           case 27:
             return p0.c();
           case 28:
             p0.getClass();
             return p0 instanceof cr6;
           default:
             p0.getClass();
             return p0 instanceof k97;
       }
    }
}
