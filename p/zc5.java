package p.zc5;
import p.ir0;
import p.hd5;
import java.lang.Object;
import p.mb5;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import p.p17;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import p.o17;
import p.i17;
import p.lb5;
import java.lang.Class;
import java.util.Map;
import java.lang.String;
import android.content.Context;
import p.vf;
import p.xe3;
import java.util.Collection;
import java.lang.Iterable;
import java.lang.CharSequence;
import android.widget.Toast;
import p.fb5;
import android.content.Intent;
import android.app.Activity;

public final class zc5 implements ir0	// class@002ecd from classes.dex
{
    public final int a;
    public final hd5 b;

    public void zc5(hd5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       zc5 tb = this.b;
       switch (this.a){
           case 0:
             p0 = p0.H;
             tb.getClass();
             p0 = (p0.isEmpty())? tb.getString(R.string.phone_number_signup_error): new xe3(new vf(String.valueOf(10)), new vf(String.valueOf(10))).r(p0.values());
             Toast.makeText(tb, p0, 1).show();
             return;
             break;
           case 1:
           default:
             tb.getClass();
             tb.setResult(-1, new Intent().putExtra("RESULT_ACCESS_TOKEN", p0.H).putExtra("RESULT_FROM_SIGNUP", p0.I));
             tb.finish();
             return;
       }
       p0 = p0.H;
       PhoneNumberSignupActivity e0 = tb.e0;
       boolean canImplicitl = p0.getCanImplicitlyAcceptTermsAndCondition();
       boolean canAcceptTer = p0.getCanAcceptTermsAndPrivacyPolicyTogether();
       e0.c(new p17(canImplicitl, canAcceptTer, p0.getRequiresSpecificLicenses()), e0.d);
       return;
    }
}
