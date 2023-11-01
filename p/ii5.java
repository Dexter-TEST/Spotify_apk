package p.ii5;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.String;
import java.lang.Object;
import p.co5;
import android.content.Context;
import p.sz1;
import android.content.SharedPreferences;
import java.util.HashMap;
import p.ej4;
import java.util.Map;
import android.content.SharedPreferences$Editor;
import p.q14;
import android.view.View;
import org.json.JSONObject;
import org.json.JSONArray;
import java.lang.Class;
import p.gi7;
import android.view.ViewParent;
import android.view.ViewGroup;

public abstract class ii5	// class@00199e from classes.dex
{
    public static final LinkedHashMap a;
    public static SharedPreferences b;
    public static final AtomicBoolean c;

    static {
       ii5.a = new LinkedHashMap();
       ii5.c = new AtomicBoolean(false);
    }
    public static final void a(String p0,String p1){
       SharedPreferences b;
       String str1;
       co5.o(p1, "predictedEvent");
       AtomicBoolean c = ii5.c;
       LinkedHashMap a = ii5.a;
       if (!c.get() && !c.get()) {
          SharedPreferences sharedPrefer = sz1.a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
          co5.l(sharedPrefer, "FacebookSdk.getApplicationContext\(\)\n            .getSharedPreferences\(CLICKED_PATH_STORE, Context.MODE_PRIVATE\)");
          ii5.b = sharedPrefer;
          String str = "";
          if ((str1 = sharedPrefer.getString("SUGGESTED_EVENTS_HISTORY", str)) != null) {
             str = str1;
          }
          a.putAll(ej4.b0(str));
          c.set(true);
       }
       a.put(p0, p1);
       if ((b = ii5.b) != null) {
          b.edit().putString("SUGGESTED_EVENTS_HISTORY", ej4.f0(q14.r0(a))).apply();
          return;
       }else {
          co5.N("shardPreferences");
          throw null;
       }
    }
    public static final String b(View p0,String p1){
       String str = "text";
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put(str, p1);
          JSONArray jSONArray = new JSONArray();
          while (p0 != null) {
             jSONArray.put(p0.getClass().getSimpleName());
             ViewParent parent = p0.getParent();
             if (parent instanceof ViewGroup) {
             }else {
                parent = null;
             }
          }
          jSONObject.put("classname", jSONArray);
          return ej4.O0(jSONObject.toString());
       }catch(org.json.JSONException e0){
       }
    }
}
