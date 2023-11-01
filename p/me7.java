package p.me7;
import java.util.concurrent.atomic.AtomicBoolean;
import p.le7;
import java.lang.String;
import java.lang.System;
import java.util.concurrent.Executor;
import p.sz1;
import p.ke7;
import java.lang.Runnable;
import android.content.Context;
import android.content.SharedPreferences;
import java.lang.Object;
import p.co5;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.os.BaseBundle;
import android.os.Bundle;
import java.lang.Boolean;
import android.content.SharedPreferences$Editor;
import p.dc3;
import p.bj;
import org.json.JSONObject;
import p.hy1;

public abstract class me7	// class@001e7f from classes.dex
{
    public static final AtomicBoolean a;
    public static final AtomicBoolean b;
    public static final le7 c;
    public static final le7 d;
    public static final le7 e;
    public static final le7 f;
    public static final le7 g;
    public static SharedPreferences h;

    static {
       me7.a = new AtomicBoolean(false);
       me7.b = new AtomicBoolean(false);
       me7.c = new le7("com.facebook.sdk.AutoInitEnabled", true);
       me7.d = new le7("com.facebook.sdk.AutoLogAppEventsEnabled", true);
       me7.e = new le7("com.facebook.sdk.AdvertiserIDCollectionEnabled", true);
       me7.f = new le7("auto_event_setup_enabled", false);
       me7.g = new le7("com.facebook.sdk.MonitorEnabled", true);
    }
    public static final boolean a(){
       me7.c();
       return me7.d.a();
    }
    public static void b(){
       le7 f = me7.f;
       me7.e(f);
       long l = System.currentTimeMillis();
       if (f.c != null && ((l - f.d) - 0x240c8400) < 0) {
          return;
       }
       f.c = null;
       if (!(f.d = 0)) {
          return;
       }
       sz1.c().execute(new ke7(l));
       return;
    }
    public static void c(){
       ApplicationInfo applicationI;
       ApplicationInfo metaData;
       ApplicationInfo applicationI1;
       if (!sz1.h()) {
          return;
       }
       boolean b = false;
       boolean b1 = true;
       if (!me7.a.compareAndSet(b, b1)) {
          return;
       }
       SharedPreferences sharedPrefer = sz1.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", b);
       co5.l(sharedPrefer, "FacebookSdk.getApplicationContext\(\)\n            .getSharedPreferences\(USER_SETTINGS, Context.MODE_PRIVATE\)");
       me7.h = sharedPrefer;
       int i = 3;
       le7[] ole7Array = new le7[i];
       ole7Array[b] = me7.d;
       le7 e = me7.e;
       ole7Array[b1] = e;
       ole7Array[2] = me7.c;
       while (true) {
          b1 = 0;
          int i1 = 128;
          if (b < i) {
             object oobject = ole7Array[b];
             b = b + 1;
             if (oobject == me7.f) {
                me7.b();
             }else {
                le7 b2 = oobject.b;
                if (oobject.c == null) {
                   me7.e(oobject);
                   if (oobject.c == null) {
                      try{
                         me7.f();
                         Context uContext = sz1.a();
                         PackageManager packageManag = uContext.getPackageManager();
                         if ((applicationI = packageManag.getApplicationInfo(uContext.getPackageName(), i1)) != null) {
                            metaData = applicationI.metaData;
                         }
                         if (b1 != null && applicationI.metaData.containsKey(b2)) {
                            oobject.c = Boolean.valueOf(applicationI.metaData.getBoolean(b2, oobject.a));
                         }
                      }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                         HashSet a = sz1.a;
                      }
                   }
                }else {
                   me7.g(oobject);
                }
             }
          }else {
             break ;
          }
       }
       try{
          me7.b();
          Context uContext1 = sz1.a();
          PackageManager packageManag1 = uContext1.getPackageManager();
          if ((applicationI1 = packageManag1.getApplicationInfo(uContext1.getPackageName(), i1)) != null) {
             metaData = applicationI1.metaData;
          }
          if (b1 != null) {
             applicationI1.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
             applicationI1.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
             me7.c();
             e.a();
          }
          me7.d();
          return;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
    }
    public static void d(){
       int intx;
       SharedPreferences h1;
       ApplicationInfo applicationI;
       int i3;
       int i4;
       dc3 uodc3;
       if (!me7.a.get()) {
          return;
       }
       if (!sz1.h()) {
          return;
       }
       Context uContext = sz1.a();
       int i = 0;
       int i1 = 3;
       int i2 = ((((me7.c.a() << i) | i) | (me7.d.a() << 1)) | (me7.e.a() << 2)) | (me7.g.a() << i1);
       SharedPreferences h = me7.h;
       void ovoid = null;
       String str = "userSettingPref";
       if (h != null) {
          String str1 = "com.facebook.sdk.USER_SETTINGS_BITMASK";
          if ((intx = h.getInt(str1, i)) != i2) {
             if ((h1 = me7.h) != null) {
                SharedPreferences$Editor uEditor = h1.edit().putInt(str1, i2);
                try{
                   uEditor.apply();
                   if ((applicationI = uContext.getPackageManager().getApplicationInfo(uContext.getPackageName(), 128)) == null) {
                   label_0069 :
                      if (ovoid != null) {
                         String[] stringArray = new String[]{"com.facebook.sdk.AutoInitEnabled","com.facebook.sdk.AutoLogAppEventsEnabled","com.facebook.sdk.AdvertiserIDCollectionEnabled","com.facebook.sdk.MonitorEnabled"};
                         boolean[] uobooleanArr = new boolean[]{1,1,1,1};
                         int i6 = 0;
                         i3 = 0;
                         i4 = 0;
                         while (true) {
                            int i7 = i6 + 1;
                            break ;
                         }
                         try{
                            int i8 = (applicationI.metaData.containsKey(stringArray[i6]))? 1: 0;
                            i8 = i8 << i6;
                            i3 = i3 | i8;
                            i = applicationI.metaData.getBoolean(stringArray[i6], uobooleanArr[i6]) << i6;
                            i4 = i4 | i;
                            if (i7 <= i1) {
                               i6 = i7;
                               uodc3 = 0;
                            }
                         }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                         }
                      }
                   }else {
                      ovoid = applicationI.metaData;
                      goto label_0069 ;
                   }
                   uodc3 = new dc3(e0);
                   Bundle uBundle = new Bundle();
                   uBundle.putInt("usage", i3);
                   uBundle.putInt("initial", i4);
                   uBundle.putInt("previous", intx);
                   uBundle.putInt("current", i2);
                   int i5 = ((uBundle.getInt("previous") & 2))? 1: 0;
                   if (i5 || me7.a()) {
                      uodc3.a.b("fb_sdk_settings_changed", uBundle);
                   }
                }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                }
                i3 = 0;
                i4 = 0;
             }else {
                co5.N(str);
                throw ovoid;
             }
          }
          return;
       }else {
          co5.N(str);
          throw ovoid;
       }
    }
    public static void e(le7 p0){
       SharedPreferences h;
       String str1;
       String str = "";
       try{
          me7.f();
          if ((h = me7.h) != null) {
             if ((str1 = h.getString(p0.b, str)) != null) {
                str = str1;
             }
             str1 = (str.length() > 0)? 1: 0;
             if (str1) {
                JSONObject jSONObject = new JSONObject(str);
                p0.c = Boolean.valueOf(jSONObject.getBoolean("value"));
                p0.d = jSONObject.getLong("last_timestamp");
             }
          }else {
             co5.N("userSettingPref");
             throw null;
          }
       }catch(org.json.JSONException e0){
          HashSet a = sz1.a;
       }
       return;
    }
    public static void f(){
       if (me7.a.get()) {
          return;
       }
       throw new hy1("The UserSettingManager has not been initialized successfully");
    }
    public static void g(le7 p0){
       SharedPreferences h;
       try{
          me7.f();
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("value", p0.c);
          jSONObject.put("last_timestamp", p0.d);
          if ((h = me7.h) != null) {
             h.edit().putString(p0.b, jSONObject.toString()).apply();
             me7.d();
          }else {
             co5.N("userSettingPref");
             throw null;
          }
       }catch(java.lang.Exception e0){
          HashSet a = sz1.a;
       }
       return;
    }
}
