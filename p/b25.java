package p.b25;
import java.lang.Runnable;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import p.e22;
import p.co5;
import org.json.JSONObject;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.lang.System;
import java.lang.Long;
import java.util.concurrent.atomic.AtomicBoolean;
import p.ap5;
import p.cu5;
import p.ll1;
import java.util.List;
import p.eu5;
import p.h22;
import p.ej4;
import p.sz1;
import p.f22;
import java.lang.IllegalStateException;
import p.kg4;
import p.ow;
import p.me7;
import android.app.Application;
import p.aj;
import p.b3;
import java.util.concurrent.ConcurrentHashMap;
import p.g22;
import java.util.concurrent.atomic.AtomicReference;

public final class b25 implements Runnable	// class@00103e from classes.dex
{
    public final int a;
    public final String b;
    public final Context c;
    public final String t;

    public void b25(int p0,Context p1,String p2,String p3){
       this.a = p0;
       this.c = p1;
       this.b = p2;
       this.t = p3;
       super();
    }
    public void b25(Context p0,String p1,String p2){
       this.a = 1;
       super();
       this.b = p1;
       this.c = p0;
       this.t = p2;
    }
    public final void run(){
       SharedPreferences sharedPrefer;
       JSONObject jSONObject1;
       f22 uof22;
       String str = "com.facebook.internal.preferences.APP_GATEKEEPERS";
       String str1 = "$applicationId";
       b25 tt = this.t;
       b25 tb = this.b;
       b25 tc = this.c;
       String str2 = "$context";
       switch (this.a){
           case 0:
             co5.o(tc, str2);
             sharedPrefer = tc.getSharedPreferences(tb, 0);
             str = co5.K("pingForOnDevice", tt);
             long l = 0;
             if (!(sharedPrefer.getLong(str, l) - l)) {
                co5.o(tt, "applicationId");
                ap5.B(cu5.b, tt, ll1.a);
                SharedPreferences$Editor uEditor = sharedPrefer.edit();
                uEditor.putLong(str, System.currentTimeMillis());
                uEditor.apply();
             }
             break;
           case 1:
             co5.o(tb, str1);
             co5.o(tc, str2);
             co5.o(tt, "$gateKeepersKey");
             JSONObject jSONObject = e22.a();
             if (jSONObject.length()) {
                e22.d(tb, jSONObject);
                tc.getSharedPreferences(str, 0).edit().putString(tt, jSONObject.toString()).apply();
                e22.d = Long.valueOf(System.currentTimeMillis());
             }
             e22.e();
             e22.a.set(0);
             return;
             break;
           default:
             co5.o(tc, str2);
             co5.o(tb, "$settingsKey");
             co5.o(tt, str1);
             sharedPrefer = tc.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
             str1 = null;
             String str3 = sharedPrefer.getString(tb, str1);
             h22 a = h22.a;
             if (!ej4.Z(str3)) {
                if (str3 != null) {
                   try{
                      jSONObject1 = new JSONObject(str3);
                   }catch(org.json.JSONException e0){
                      jSONObject1 = str1;
                   }
                   if (jSONObject1 != null) {
                      uof22 = h22.d(tt, jSONObject1);
                   }
                }else {
                   throw new IllegalStateException("Required value was null.".toString());
                }
             }
             JSONObject jSONObject2 = h22.a();
             h22.d(tt, jSONObject2);
             e0.edit().putString(tb, jSONObject2.toString()).apply();
             boolean b = true;
             if (uof22 != null && (!h22.f && ((uof22 = uof22.i) != null && uof22.length() > 0))) {
                h22.f = b;
             }
             JSONObject jSONObject3 = e22.a();
             Object[] objArray = new Object[b];
             objArray[0] = tt;
             sz1.a().getSharedPreferences(str, 0).edit().putString(kg4.q(objArray, b, "com.facebook.internal.APP_GATEKEEPERS.%s", "java.lang.String.format\(format, *args\)"), jSONObject3.toString()).apply();
             e22.d(tt, jSONObject3);
             Context uContext = sz1.a();
             str = sz1.b();
             if (me7.a() && uContext instanceof Application) {
                aj.b.f(uContext, str);
             }
             AtomicReference d = h22.d;
             g22 c = (h22.c.containsKey(tt))? g22.c: g22.t;
             d.set(c);
             a.e();
             return;
       }
       return;
    }
}
