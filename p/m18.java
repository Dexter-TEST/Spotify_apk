package p.m18;
import p.jd;
import java.lang.String;
import android.content.Intent;
import android.content.Context;
import p.t18;
import java.lang.Object;
import p.ay7;
import p.ow7;
import p.gg1;
import p.kw7;
import android.os.Bundle;
import p.af5;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;
import android.os.BaseBundle;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;

public final class m18	// class@001e0a from classes.dex
{
    public final ow7 a;
    public final String b;
    public final Context c;
    public final t18 d;
    public static final jd e;
    public static final Intent f;

    static {
       m18.e = new jd("AppUpdateService");
       m18.f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    }
    public void m18(Context p0,t18 p1){
       Context applicationC;
       ow7 ay7.b(p0);
       super();
       this.b = p0.getPackageName();
       this.c = p0;
       this.d = p1;
       if (ay7.b(p0)) {
          Context uContext = ((applicationC = p0.getApplicationContext()) != null)? applicationC: p0;
          ay7.b(p0) = new ow7(uContext, m18.e, "AppUpdateService", m18.f, gg1.D);
          this.a = ay7.b(p0);
       }
       return;
    }
    public static Bundle a(m18 p0,String p1){
       int i;
       Integer integer;
       Bundle uBundle = new Bundle();
       Bundle uBundle1 = new Bundle();
       String str = "app_update";
       Bundle uBundle2 = new Bundle();
       af5 uoaf5 = af5.class;
       _monitor_enter(uoaf5);
       HashMap a = af5.a;
       if (!a.containsKey(str)) {
          HashMap hashMap = new HashMap();
          hashMap.put("java", Integer.valueOf(0x2afb));
          a.put(str, hashMap);
       }
       Map map = a.get(str);
       _monitor_exit(uoaf5);
       uBundle2.putInt("playcore_version_code", map.get("java").intValue());
       if (map.containsKey("native")) {
          uBundle2.putInt("playcore_native_version", map.get("native").intValue());
       }
       if (map.containsKey("unity")) {
          uBundle2.putInt("playcore_unity_version", map.get("unity").intValue());
       }
       uBundle1.putAll(uBundle2);
       uBundle1.putInt("playcore.version.code", 0x2afb);
       uBundle.putAll(uBundle1);
       uBundle.putString("package.name", p1);
       try{
          i = 0;
          integer = Integer.valueOf(p0.c.getPackageManager().getPackageInfo(p0.c.getPackageName(), i).versionCode);
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          Object[] objArray = new Object[i];
          m18.e.c("The current version of the app could not be retrieved", objArray);
          integer = null;
       }
       if (integer != null) {
          e0.putInt("app.version.code", integer.intValue());
       }
       return e0;
    }
}
