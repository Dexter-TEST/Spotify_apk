package p.lv7;
import android.content.Context;
import java.lang.Object;
import p.qs6;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.ReentrantLock;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;

public final class lv7	// class@001dd2 from classes.dex
{
    public final qs6 a;
    public static lv7 b;

    public void lv7(Context p0){
       super();
       qs6 oqs6 = qs6.a(p0);
       this.a = oqs6;
       oqs6.b();
       oqs6.c();
    }
    public static synchronized lv7 a(Context p0){
       _monitor_enter(lv7.class);
       _monitor_exit(lv7.class);
       return lv7.c(p0.getApplicationContext());
    }
    public static synchronized lv7 c(Context p0){
       lv7 b;
       _monitor_enter(lv7.class);
       if ((b = lv7.b) != null) {
          _monitor_exit(lv7.class);
          return b;
       }else {
          b = new lv7(p0);
          lv7.b = b;
          _monitor_exit(lv7.class);
          return b;
       }
    }
    public synchronized final void b(){
       lv7 ta = this.a;
       qs6 a = ta.a;
       a.lock();
       ta.b.edit().clear().apply();
       a.unlock();
    }
}
