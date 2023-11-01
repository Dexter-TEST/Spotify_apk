package p.e22;
import java.lang.Class;
import p.uf0;
import p.ns5;
import java.lang.String;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import android.os.Bundle;
import android.os.BaseBundle;
import p.sz1;
import p.tm2;
import java.lang.Object;
import java.util.Arrays;
import p.co5;
import p.a3;
import p.om2;
import p.az5;
import p.xm2;
import p.u12;
import java.util.HashMap;
import p.g54;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.ci2;
import java.lang.Iterable;
import java.lang.Boolean;
import java.lang.System;
import java.lang.Long;
import android.content.Context;
import android.content.SharedPreferences;
import p.ej4;
import java.util.concurrent.Executor;
import p.b25;
import java.lang.Runnable;
import org.json.JSONArray;
import android.os.Handler;
import android.os.Looper;
import p.am0;

public abstract class e22	// class@001403 from classes.dex
{
    public static final AtomicBoolean a;
    public static final ConcurrentLinkedQueue b;
    public static final ConcurrentHashMap c;
    public static Long d;
    public static g54 e;

    static {
       ns5.a(e22.class).b();
       e22.a = new AtomicBoolean(false);
       e22.b = new ConcurrentLinkedQueue();
       e22.c = new ConcurrentHashMap();
    }
    public static JSONObject a(){
       xm2 d;
       Bundle uBundle = new Bundle();
       uBundle.putString("platform", "android");
       uBundle.putString("sdk_version", "15.0.1");
       uBundle.putString("fields", "gatekeepers");
       Object[] objArray = new Object[]{"mobile_sdk_gk"};
       String str = String.format("app/%s", Arrays.copyOf(objArray, 1));
       co5.l(str, "java.lang.String.format\(format, *args\)");
       tm2 otm2 = az5.M(null, str, null);
       otm2.d = uBundle;
       if ((d = otm2.c().d) == null) {
          d = new JSONObject();
       }
       return d;
    }
    public static final boolean b(String p0,String p1,boolean p2){
       HashMap hashMap;
       Boolean uBoolean;
       g54 e;
       JSONObject jSONObject;
       Iterator iterator1;
       g54 e1;
       String key;
       ConcurrentHashMap uConcurrentH1;
       co5.o(p0, "name");
       u12 ou12 = null;
       e22.c(ou12);
       ConcurrentHashMap c = e22.c;
       if (!c.containsKey(p1)) {
          hashMap = new HashMap();
       }else if((e = e22.e) == null || (uConcurrentH1 = e.a.get(p1)) == null){
          ou12 = new ArrayList(uConcurrentH1.size());
          iterator1 = uConcurrentH1.entrySet().iterator();
          while (iterator1.hasNext()) {
             ou12.add(iterator1.next().getValue());
          }
       }
       if (ou12 != null) {
          hashMap = new HashMap();
          Iterator iterator = ou12.iterator();
          while (iterator.hasNext()) {
             ci2 uoci2 = iterator.next();
             hashMap.put(uoci2.a, Boolean.valueOf(uoci2.b));
          }
       }else {
          HashMap hashMap1 = new HashMap();
          if ((jSONObject = c.get(p1)) == null) {
             jSONObject = new JSONObject();
          }
          iterator1 = jSONObject.keys();
          while (iterator1.hasNext()) {
             String str = iterator1.next();
             co5.l(str, "key");
             hashMap1.put(str, Boolean.valueOf(jSONObject.optBoolean(str)));
          }
          if ((e1 = e22.e) == null) {
             e1 = new g54(8);
          }
          ArrayList uArrayList = new ArrayList(hashMap1.size());
          Iterator iterator2 = hashMap1.entrySet().iterator();
          while (iterator2.hasNext()) {
             Map$Entry uEntry = iterator2.next();
             key = uEntry.getKey();
             uArrayList.add(new ci2(key, uEntry.getValue().booleanValue()));
          }
          ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
          iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             ci2 uoci21 = iterator1.next();
             uConcurrentH.put(uoci21.a, uoci21);
          }
          e1.a.put(p1, uConcurrentH);
          e22.e = e1;
          hashMap = hashMap1;
       }
       if (hashMap.containsKey(p0)) {
          if ((uBoolean = hashMap.get(p0)) == null) {
             return p2;
          }else {
             p2 = uBoolean.booleanValue();
          }
       }
       return p2;
    }
    public static synchronized final void c(u12 p0){
       JSONObject jSONObject;
       _monitor_enter(e22.class);
       if (p0 != null) {
          e22.b.add(p0);
       }
       String str = sz1.b();
       Long d = e22.d;
       int i = 0;
       d = (d == null || ((System.currentTimeMillis() - d.longValue()) - 0x36ee80) >= 0)? 0: 1;
       if (d && e22.c.containsKey(str)) {
          e22.e();
          _monitor_exit(e22.class);
          return;
       }else {
          Context uContext = sz1.a();
          Object[] objArray = new Object[]{str};
          String str1 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(objArray, 1));
          co5.l(str1, "java.lang.String.format\(format, *args\)");
          String str2 = uContext.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", i).getString(str1, null);
          if (!ej4.Z(str2)) {
             try{
                jSONObject = new JSONObject(str2);
             }catch(org.json.JSONException e0){
                HashSet a = sz1.a;
             }
             if (jSONObject != null) {
                e22.d(str, jSONObject);
             }
          }
          Executor uExecutor = sz1.c();
          if (!e22.a.compareAndSet(i, 1)) {
             _monitor_exit(e0);
             return;
          }else {
             uExecutor.execute(new b25(uContext, str, str1));
             _monitor_exit(e0);
             return;
          }
       }
    }
    public static synchronized final JSONObject d(String p0,JSONObject p1){
       JSONObject jSONObject;
       int i1;
       int i2;
       _monitor_enter(e22.class);
       co5.o(p0, "applicationId");
       if ((jSONObject = e22.c.get(p0)) == null) {
          jSONObject = new JSONObject();
       }
       JSONArray jSONArray = p1.optJSONArray("data");
       int i = 0;
       jSONArray = (jSONArray == null)? null: jSONArray.optJSONObject(i);
       if (jSONArray == null) {
          jSONArray = new JSONObject();
       }
       if ((jSONArray = jSONArray.optJSONArray("gatekeepers")) == null) {
          jSONArray = new JSONArray();
       }
       if ((i1 = jSONArray.length()) > 0) {
          while (true) {
             i2 = i + 1;
             break ;
          }
          try{
             JSONObject jSONObject1 = jSONArray.getJSONObject(i);
             String str = jSONObject1.getString("key");
             jSONObject.put(str, jSONObject1.getBoolean("value"));
          }catch(org.json.JSONException e0){
             HashSet a = sz1.a;
          }
          if (i2 < i1) {
             i = i2;
          }
       }
       e22.c.put(p0, jSONObject);
       _monitor_exit(e0);
       return jSONObject;
    }
    public static void e(){
       u12 ou12;
       Handler handler = new Handler(Looper.getMainLooper());
       while (true) {
          ConcurrentLinkedQueue b = e22.b;
          if (!b.isEmpty()) {
             if ((ou12 = b.poll()) != null) {
                handler.post(new am0(14, ou12));
             }
          }else {
             break ;
          }
       }
       return;
    }
}
