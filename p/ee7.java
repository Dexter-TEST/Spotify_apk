package p.ee7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import android.content.Context;
import p.sz1;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.lang.String;
import p.co5;
import java.util.HashMap;
import p.ej4;
import java.util.Map;

public final class ee7	// class@001471 from classes.dex
{
    public static final ee7 a;
    public static SharedPreferences b;
    public static final AtomicBoolean c;
    public static final ConcurrentHashMap d;
    public static final ConcurrentHashMap e;

    static {
       ee7.a = new ee7();
       ee7.c = new AtomicBoolean(false);
       ee7.d = new ConcurrentHashMap();
       ee7.e = new ConcurrentHashMap();
    }
    public void ee7(){
       super();
    }
    public synchronized final void a(){
       String str;
       SharedPreferences b;
       String str1;
       AtomicBoolean c = ee7.c;
       if (c.get()) {
          return;
       }
       SharedPreferences defaultShare = PreferenceManager.getDefaultSharedPreferences(sz1.a());
       co5.l(defaultShare, "getDefaultSharedPreferences\(FacebookSdk.getApplicationContext\(\)\)");
       ee7.b = defaultShare;
       if ((str = defaultShare.getString("com.facebook.appevents.UserDataStore.userData", "")) == null) {
          str = "";
       }
       if ((b = ee7.b) != null) {
          if ((str1 = b.getString("com.facebook.appevents.UserDataStore.internalUserData", "")) == null) {
             str1 = "";
          }
          ee7.d.putAll(ej4.b0(str));
          ee7.e.putAll(ej4.b0(str1));
          c.set(true);
          return;
       }else {
          co5.N("sharedPreferences");
          throw null;
       }
    }
}
