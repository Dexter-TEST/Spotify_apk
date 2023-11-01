package p.pp2;
import android.content.Context;
import p.sz1;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.Object;
import p.co5;
import p.az5;
import android.content.SharedPreferences$Editor;

public final class pp2	// class@0022a5 from classes.dex
{
    public final SharedPreferences a;
    public static pp2 b;

    public void pp2(){
       SharedPreferences sharedPrefer = sz1.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
       co5.l(sharedPrefer, "FacebookSdk.getApplicationContext\(\)\n              .getSharedPreferences\(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE\)");
       az5 uoaz5 = new az5();
       super();
       this.a = sharedPrefer;
    }
    public void pp2(Context p0){
       super();
       this.a = p0.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }
    public synchronized boolean a(String p0,long p1){
       if (this.a.contains(p0)) {
          if (((p1 - this.a.getLong(p0, -1)) - 0x5265c00) < 0) {
             return false;
          }
          this.a.edit().putLong(p0, p1).apply();
          return true;
       }else {
          this.a.edit().putLong(p0, p1).apply();
          return true;
       }
    }
}
