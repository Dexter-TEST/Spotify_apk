package p.nl5;
import java.lang.Object;
import android.content.Context;
import p.sz1;
import java.lang.String;
import android.content.SharedPreferences;
import p.co5;

public final class nl5	// class@002000 from classes.dex
{
    public final SharedPreferences a;

    public void nl5(){
       super();
       SharedPreferences sharedPrefer = sz1.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
       co5.l(sharedPrefer, "FacebookSdk.getApplicationContext\(\)\n            .getSharedPreferences\(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE\)");
       this.a = sharedPrefer;
    }
}
