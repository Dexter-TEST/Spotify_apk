package p.zp;
import android.content.Context;
import p.sz1;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.Object;
import p.co5;

public final class zp	// class@002f44 from classes.dex
{
    public final SharedPreferences a;

    public void zp(){
       SharedPreferences sharedPrefer = sz1.a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
       co5.l(sharedPrefer, "FacebookSdk.getApplicationContext\(\)\n              .getSharedPreferences\(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE\)");
       super();
       this.a = sharedPrefer;
    }
}
