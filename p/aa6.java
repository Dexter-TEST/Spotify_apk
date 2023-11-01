package p.aa6;
import p.ir0;
import com.spotify.lite.welcome.SelectLoginActivity;
import java.lang.Object;
import p.jc7;
import android.content.Context;
import java.lang.String;
import android.content.Intent;
import p.xj0;
import p.i7;
import android.app.Activity;

public final class aa6 implements ir0	// class@000f46 from classes.dex
{
    public final int a;
    public final SelectLoginActivity b;

    public void aa6(SelectLoginActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       aa6 tb = this.b;
       switch (this.a){
           case 0:
             tb.U.a(xj0.z0(tb, "spotify.intent.action.LOGIN_OTP"));
             return;
           case 1:
             tb.T.a(xj0.z0(tb, "spotify.intent.action.LOGIN"));
             return;
           default:
             tb.setResult(0);
             tb.finish();
             return;
       }
    }
}
