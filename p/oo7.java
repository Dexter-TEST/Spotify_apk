package p.oo7;
import p.b5;
import p.qo7;
import java.lang.Object;
import com.spotify.lite.welcome.WelcomeActivity;
import p.i77;
import p.rv;
import p.ym6;
import p.hm6;
import p.p01;
import p.an5;
import java.lang.String;
import p.j01;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import p.dl2;
import java.lang.Class;
import p.vo;
import p.fl2;
import p.w51;
import p.fv7;
import p.pt7;
import p.o2;
import p.jv7;
import p.k01;
import p.x3;
import p.m07;
import p.mu7;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p.da5;
import p.ca5;
import p.co5;
import p.fm6;
import p.o07;
import java.util.concurrent.Executor;
import p.n25;
import p.a28;
import p.f25;
import com.google.android.gms.auth.api.credentials.Credential;
import p.em6;
import p.sx7;
import p.mt7;
import p.r15;
import p.p18;
import p.l18;
import com.spotify.allboarding.entrypoint.EntryPoint;
import android.content.Context;
import android.content.Intent;
import p.xj0;
import p.i7;
import java.lang.Integer;
import p.p25;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;

public final class oo7 implements b5	// class@002160 from classes.dex
{
    public final int a;
    public final qo7 b;

    public void oo7(qo7 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       WelcomeActivity s;
       hm6 a;
       hm6 g;
       Credential uCredential = null;
       oo7 tb = this.b;
       switch (this.a){
           case 0:
             WelcomeActivity.D(tb.Z.j);
             WelcomeActivity.C(tb.Z.l);
             return;
           case 1:
             tb.c0.a(Integer.valueOf(1));
             return;
           case 2:
             tb.E();
             return;
           case 3:
             tb.getClass();
             tb.b0.a(EntryPoint.putEntryPointToIntent(xj0.z0(tb, "spotify.intent.action.ALLBOARDING"), EntryPoint.SIGNUP));
             return;
           case 4:
             s = tb.S;
             if ((a = s.a) != null && (g = s.g) != null) {
                a28 uoa28 = a.a(g);
                uoa28.b.c(new sx7(o07.a, new em6(s)));
                uoa28.m();
                s.g = uCredential;
             }
             return;
             break;
           case 5:
             s = tb.S;
             if ((a = s.a) == null) {
                s.e.onNext(p01.a);
             }else {
                s.g = uCredential;
                String[] stringArray = new String[]{""};
                fv7 j01 uCredential1 = new j01(4, true, stringArray, null, null, false, null, null, false);
                dl2 a1 = a.a;
                a1.getClass();
                vo.c.getClass();
                fl2 h = a1.h;
                w51.l(h, "client must not be null");
                uCredential1 = new fv7(h, uCredential, 2);
                h.b.d(0, uCredential1);
                m07 uCredential2 = new m07();
                uCredential1.C(new mu7(uCredential1, uCredential2, new x3(new k01())));
                uCredential2 = uCredential2.a;
                co5.l(uCredential2, "client.request\(credentialRequest\)");
                mt7 a2 = o07.a;
                uCredential2.c(a2, new fm6(s));
                uCredential2.b(a2, new fm6(s));
             }
             return;
             break;
           case 6:
             tb.T.c(rv.a(R.string.login_smartlock_invalid_credentials).l());
             return;
           default:
             WelcomeActivity.D(tb.Z.l);
             WelcomeActivity.C(tb.Z.j);
             return;
       }
    }
}
