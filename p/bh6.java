package p.bh6;
import p.ir0;
import java.lang.Object;
import p.px3;
import p.gg6;
import com.spotify.signup.signup.SignupActivity;
import p.p17;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import p.o17;
import p.i17;
import p.bg6;
import android.content.Intent;
import java.lang.String;
import android.app.Activity;
import p.fg6;
import android.content.res.Resources;
import androidx.appcompat.app.a;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;
import p.hr0;
import p.l10;

public final class bh6 implements ir0	// class@0010c7 from classes.dex
{
    public final int a;
    public final Object b;

    public void bh6(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void accept(Object p0){
       px3 a;
       bh6 tb = this.b;
       switch (this.a){
           case 0:
             p0 = p0.A;
             a = tb.a;
             if (p0 == null) {
                p0 = a.getResources().getString(R.string.signup_error);
             }
             Toast.makeText(a, p0, 1).show();
             return;
             break;
           case 1:
             a = tb.a;
             a.setResult(-1, new Intent().putExtra("RESULT_ACCESS_TOKEN", p0.A));
             a.finish();
             return;
           case 2:
             p0 = p0.A;
             SignupActivity v = tb.a.V;
             boolean canImplicitl = p0.getCanImplicitlyAcceptTermsAndCondition();
             boolean canAcceptTer = p0.getCanAcceptTermsAndPrivacyPolicyTogether();
             v.c(new p17(canImplicitl, canAcceptTer, p0.getRequiresSpecificLicenses()), v.d);
             return;
           default:
             tb.accept(p0.a);
             return;
       }
    }
}
