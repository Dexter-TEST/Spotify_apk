package p.sv7;
import p.ye7;
import android.content.Context;
import android.os.Looper;
import p.yg0;
import p.re;
import p.jl2;
import p.kl2;
import p.bl2;
import p.hr7;
import java.lang.NoSuchMethodError;
import p.mf6;
import p.lf6;
import android.os.Bundle;
import java.lang.String;
import android.os.Parcelable;
import java.lang.Integer;
import android.os.BaseBundle;
import p.gw7;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p.dv7;
import p.uo;
import p.mv7;
import p.j08;
import p.qe;
import p.lu7;
import p.dp0;
import p.t15;
import java.lang.UnsupportedOperationException;

public final class sv7 extends ye7	// class@0026ab from classes.dex
{
    public final int v;

    public void sv7(int p0){
       this.v = p0;
       super();
    }
    public final bl2 h(Context p0,Looper p1,yg0 p2,re p3,jl2 p4,kl2 p5){
       j08 v6;
       mv7 v7;
       sv7 tv = this.v;
       switch (tv){
           case 0:
             v6 = new j08(p0, p1, p2, p4, p5);
             return v6;
           case 1:
             v7 = new mv7(p0, p1, p2, p3, p4, p5);
             return v7;
           case 2:
             dv7 v71 = new dv7(p0, p1, p2, p3, p4, p5);
             return v7;
           case 3:
             hr7.b(p3);
             gw7 v61 = new gw7(p0, p1, p2, p4, p5);
             return v6;
           case 5:
             yg0 g = p2.g;
             yg0 h = p2.h;
             Bundle uBundle = new Bundle();
             uBundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", p2.a);
             if (h != null) {
                uBundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", h.intValue());
             }
             if (g != null) {
                boolean b = false;
                uBundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", b);
                uBundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", b);
                String str = null;
                uBundle.putString("com.google.android.gms.signin.internal.serverClientId", str);
                uBundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                uBundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", b);
                uBundle.putString("com.google.android.gms.signin.internal.hostedDomain", str);
                uBundle.putString("com.google.android.gms.signin.internal.logSessionId", str);
                uBundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", b);
             }
             lf6 v72 = new lf6(p0, p1, p2, uBundle, p4, p5);
             return v7;
             break;
           case 6:
             hr7.b(p3);
             throw new NoSuchMethodError();
           default:
             switch (tv){
                 case 4:
                 default:
                   throw new UnsupportedOperationException("buildClient must be implemented");
             }
             lu7 v62 = new lu7(p0, p1, p2, p4, p5);
             return v6;
       }
    }
}
