package p.vn6;
import p.ve6;
import java.util.HashMap;
import p.kf7;
import java.lang.Object;
import android.content.Context;
import p.co6;
import java.lang.String;
import p.co5;
import android.content.SharedPreferences;
import java.util.Map;
import p.un6;
import p.ws6;

public final class vn6 implements ve6	// class@002a2e from classes.dex
{
    public static final HashMap a;
    public static final kf7 b;

    static {
       vn6.a = new HashMap(4);
       vn6.b = new kf7();
    }
    public void vn6(){
       super();
    }
    public final co6 a(Context p0){
       SharedPreferences sharedPrefer;
       co5.o(p0, "context");
       String str = "spotify_preferences";
       HashMap a = vn6.a;
       _monitor_enter(a);
       if ((sharedPrefer = a.get(str)) == null) {
          sharedPrefer = p0.getSharedPreferences(str, 0);
          co5.l(sharedPrefer, "context.getSharedPrefere…me, Context.MODE_PRIVATE\)");
          a.put(str, sharedPrefer);
       }
       _monitor_exit(a);
       return new co6(new un6(sharedPrefer, 0), null, 0, vn6.b);
    }
}
