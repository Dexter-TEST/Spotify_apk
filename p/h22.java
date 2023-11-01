package p.h22;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import p.ye7;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p.g22;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import android.os.BaseBundle;
import p.tm2;
import p.a3;
import p.om2;
import p.az5;
import p.xm2;
import p.f22;
import android.content.Context;
import p.sz1;
import p.ej4;
import p.kg4;
import java.util.concurrent.Executor;
import p.b25;
import java.lang.Runnable;
import p.co5;
import org.json.JSONArray;
import p.qz1;
import p.av6;
import java.util.HashMap;
import p.mj7;
import java.lang.Boolean;
import p.io2;
import p.km6;
import java.lang.Class;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.AbstractCollection;
import p.dj0;
import android.net.Uri;
import java.lang.Integer;
import p.h3;
import java.util.Map;
import android.os.Handler;
import android.os.Looper;
import p.ej;
import p.am0;
import p.ij;

public final class h22	// class@0017c7 from classes.dex
{
    public static final h22 a;
    public static final List b;
    public static final ConcurrentHashMap c;
    public static final AtomicReference d;
    public static final ConcurrentLinkedQueue e;
    public static boolean f;

    static {
       h22.a = new h22();
       String[] stringArray = new String[]{"supports_implicit_sdk_logging","gdpv4_nux_content","gdpv4_nux_enabled","android_dialog_configs","android_sdk_error_categories","app_events_session_timeout","app_events_feature_bitmask","auto_event_mapping_android","seamless_login","smart_login_bookmark_icon_url","smart_login_menu_icon_url","restrictive_data_filter_params","aam_rules","suggested_events_setting"};
       h22.b = ye7.K(stringArray);
       h22.c = new ConcurrentHashMap();
       h22.d = new AtomicReference(g22.a);
       h22.e = new ConcurrentLinkedQueue();
    }
    public void h22(){
       super();
    }
    public static JSONObject a(){
       xm2 d;
       Bundle uBundle = new Bundle();
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(h22.b);
       uBundle.putString("fields", TextUtils.join(",", uArrayList));
       tm2 otm2 = az5.M(null, "app", null);
       otm2.i = true;
       otm2.d = uBundle;
       if ((d = otm2.c().d) == null) {
          d = new JSONObject();
       }
       return d;
    }
    public static final f22 b(String p0){
       return h22.c.get(p0);
    }
    public static final void c(){
       Object[] objArray;
       Context uContext = sz1.a();
       String str = sz1.b();
       g22 t = g22.t;
       h22 a = h22.a;
       AtomicReference d = h22.d;
       if (ej4.Z(str)) {
          d.set(t);
          a.e();
          return;
       }else if(h22.c.containsKey(str)){
          d.set(g22.c);
          a.e();
          return;
       }else {
          g22 a1 = g22.a;
          g22 b = g22.b;
          while (true) {
             if (d.compareAndSet(a1, b)) {
                a1 = 1;
             }else {
                if (d.get() != a1) {
                   objArray = 0;
                }
             }
             if (!a1) {
                while (true) {
                   if (d.compareAndSet(t, b)) {
                      a1 = 1;
                   }else {
                      if (d.get() != t) {
                         objArray = 0;
                      }else {
                         continue ;
                      }
                   }
                   if (!a1) {
                      objArray = 0;
                   label_0058 :
                      if (!a1) {
                         break ;
                      }else {
                         objArray = new Object[]{str};
                         sz1.c().execute(new b25(2, uContext, kg4.q(objArray, 1, "com.facebook.internal.APP_SETTINGS.%s", "java.lang.String.format\(format, *args\)"), str));
                         return;
                      }
                   }
                }
                a.e();
                return;
             }
             a1 = 1;
             goto label_0058 ;
          }
       }
    }
    public static f22 d(String p0,JSONObject p1){
       int i;
       JSONArray jSONArray1;
       String str1;
       JSONArray jSONArray2;
       int i2;
       int i4;
       String str2;
       String str3;
       JSONArray jSONArray3;
       h3 oh3;
       String str5;
       Map map;
       int i5;
       List list;
       String str8;
       String str9;
       JSONArray jSONArray5;
       int i6;
       int[] ointArray;
       int i7;
       int i8;
       int i9;
       JSONObject jSONObject3;
       JSONArray jSONArray6;
       HashMap hashMap1;
       HashMap hashMap2;
       HashMap hashMap3;
       String str11;
       String str12;
       String str13;
       JSONObject jSONObject = p1;
       co5.o(p0, "applicationId");
       JSONArray jSONArray = jSONObject.optJSONArray("android_sdk_error_categories");
       int b = true;
       String str = "name";
       if (jSONArray == null) {
          i = 0;
       }else if((i8 = jSONArray.length()) > 0){
          int i10 = 0;
          i2 = 0;
          jSONArray5 = 0;
          i4 = 0;
          list = 0;
          str8 = 0;
          i6 = 0;
          while (true) {
             i5 = i10 + 1;
             if ((jSONObject3 = jSONArray.optJSONObject(i10)) == null || (str13 = jSONObject3.optString(str)) == null) {
                ointArray = 0;
             label_004b :
                jSONArray6 = jSONArray;
                jSONArray = 1;
             label_0075 :
                if (i5 >= i8) {
                   hashMap1 = i2;
                   hashMap2 = jSONArray5;
                   hashMap3 = i4;
                   str11 = list;
                   str12 = str8;
                   str5 = i6;
                }else {
                   i10 = i5;
                   jSONArray = jSONArray6;
                   b = true;
                }
             }else {
                str1 = "recovery_message";
                if (av6.i0(str13, "other", b)) {
                   str2 = jSONObject3.optString(str1, null);
                   HashMap hashMap4 = mj7.l(jSONObject3);
                   goto label_004b ;
                }else {
                   jSONArray6 = jSONArray;
                   boolean b5 = true;
                   if (av6.i0(str13, "transient", b5)) {
                      str8 = jSONObject3.optString(str1, null);
                      HashMap hashMap5 = mj7.l(jSONObject3);
                      goto label_0075 ;
                   }else if(av6.i0(str13, "login_recoverable", b5)){
                      str9 = jSONObject3.optString(str1, null);
                      HashMap hashMap6 = mj7.l(jSONObject3);
                      goto label_0075 ;
                   }else {
                      goto label_0075 ;
                   }
                }
             }
          }
       }else {
          hashMap1 = null;
          hashMap2 = null;
          hashMap3 = null;
          str11 = null;
          str12 = null;
          str5 = null;
       }
       qz1 ointArray1 = new qz1(hashMap1, hashMap2, hashMap3, str11, str12, str5);
       if (i == null) {
          i = qz1.d.e();
       }
       qz1 oqz1 = i;
       b = jSONObject.optInt("app_events_feature_bitmask", 0);
       boolean b1 = ((b & 0x08))? true: false;
       boolean b2 = ((b & 0x10))? true: false;
       boolean b3 = ((b & 0x20))? true: false;
       if ((jSONArray1 = jSONObject.optJSONArray("auto_event_mapping_android")) != null) {
          if (co5.c(null, Boolean.TRUE)) {
             io2.u("OnReceiveMapping", jSONArray1.toString());
          }
       }else {
          ointArray = 0;
       }
       boolean b4 = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
       str1 = jSONObject.optString("gdpv4_nux_content", "");
       co5.l(str1, "settingsJSON.optString\(APP_SETTING_NUX_CONTENT, \"\"\)");
       jSONObject.optBoolean("gdpv4_nux_enabled", false);
       int i1 = jSONObject.optInt("app_events_session_timeout", 60);
       long l = jSONObject.optLong("seamless_login");
       EnumSet uEnumSet = EnumSet.noneOf(km6.class);
       Iterator iterator = km6.b.iterator();
       while (iterator.hasNext()) {
          km6 okm6 = iterator.next();
          long l1 = okm6.a & l;
          if (l1) {
             uEnumSet.add(okm6);
          }else {
             continue ;
          }
       }
       co5.l(uEnumSet, "result");
       JSONObject jSONObject1 = jSONObject.optJSONObject("android_dialog_configs");
       HashMap hashMap = new HashMap();
       if (jSONObject1 != null && ((jSONArray2 = jSONObject1.optJSONArray("data")) != null && (i2 = jSONArray2.length()) > 0)) {
          int i3 = 0;
          while (true) {
             i4 = i3 + 1;
             JSONObject jSONObject2 = jSONArray2.optJSONObject(i3);
             co5.l(jSONObject2, "dialogConfigData.optJSONObject\(i\)");
             str2 = jSONObject2.optString(str);
             if (ej4.Z(str2)) {
             label_016d :
                str3 = str;
                jSONArray3 = jSONArray2;
                oh3 = null;
             label_0201 :
                if (oh3 != null) {
                   h3 a = oh3.a;
                   if ((map = hashMap.get(a)) == null) {
                      map = new HashMap();
                      hashMap.put(a, map);
                   }
                   map.put(oh3.b, oh3);
                }
                if (i4 < i2) {
                   i3 = i4;
                   str = str3;
                   jSONArray2 = jSONArray3;
                }
             }else {
                co5.l(str2, "dialogNameWithFeature");
                String[] stringArray = new String[]{"|"};
                i5 = 0;
                list = av6.B0(str2, stringArray, i5, 6);
                if (list.size() != 2) {
                   goto label_016d ;
                }else {
                   str8 = dj0.k0(list);
                   str2 = dj0.r0(list);
                   if (!ej4.Z(str8) && !ej4.Z(str2)) {
                      str9 = jSONObject2.optString("url");
                      if (!ej4.Z(str9)) {
                         Uri.parse(str9);
                      }
                      if ((jSONArray5 = jSONObject2.optJSONArray("versions")) != null) {
                         i6 = jSONArray5.length();
                         ointArray = new int[i6];
                         if (i6 > 0) {
                            while (true) {
                               str3 = str;
                               i7 = i5 + 1;
                               jSONArray3 = jSONArray2;
                               i8 = -1;
                               if ((i9 = jSONArray5.optInt(i5, i8)) == i8) {
                                  String str10 = jSONArray5.optString(i5);
                                  if (!ej4.Z(str10)) {
                                     try{
                                        co5.l(str10, "versionString");
                                        i8 = Integer.parseInt(str10);
                                     }catch(java.lang.NumberFormatException e0){
                                        str10 = -1;
                                     }
                                     i9 = str10;
                                     break ;
                                  }else {
                                  }
                               }else {
                               }
                            }
                            ointArray[i5] = i9;
                            if (i7 >= i6) {
                            label_01fa :
                               oh3 = new h3(str8, str2);
                               goto label_0201 ;
                            }else {
                               i5 = i7;
                               str = str3;
                               jSONArray2 = jSONArray3;
                            }
                         }
                      }
                      str3 = str;
                      jSONArray3 = jSONArray2;
                      goto label_01fa ;
                   }else {
                      goto label_016d ;
                   }
                }
             }
          }
       }
       String str4 = jSONObject.optString("smart_login_bookmark_icon_url");
       str5 = str4;
       co5.l(str4, "settingsJSON.optString\(SMART_LOGIN_BOOKMARK_ICON_URL\)");
       str4 = jSONObject.optString("smart_login_menu_icon_url");
       String str6 = str4;
       co5.l(str4, "settingsJSON.optString\(SMART_LOGIN_MENU_ICON_URL\)");
       str4 = jSONObject.optString("sdk_update_message");
       String str7 = str4;
       co5.l(str4, "settingsJSON.optString\(SDK_UPDATE_MESSAGE\)");
       f22 jSONArray4 = new f22(b4, str1, i1, uEnumSet, hashMap, b1, oqz1, str5, str6, b2, b3, jSONArray1, str7, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"));
       h22.c.put(p0, jSONArray);
       return jSONArray;
    }
    public static final f22 f(String p0,boolean p1){
       co5.o(p0, "applicationId");
       if (!p1) {
          ConcurrentHashMap c = h22.c;
          if (c.containsKey(p0)) {
             return c.get(p0);
          }
       }
       h22 a = h22.a;
       f22 uof22 = h22.d(p0, h22.a());
       if (co5.c(p0, sz1.b())) {
          h22.d.set(g22.c);
          a.e();
       }
       return uof22;
    }
    public synchronized final void e(){
       ConcurrentLinkedQueue e;
       g22 og22 = h22.d.get();
       if (g22.a == og22 || g22.b == og22) {
          return;
       }
       f22 uof22 = h22.c.get(sz1.b());
       Handler handler = new Handler(Looper.getMainLooper());
       if (g22.t == og22) {
          while (true) {
             e = h22.e;
             if (!e.isEmpty()) {
                handler.post(new am0(15, e.poll()));
             }else {
                break ;
             }
          }
          return;
       }else {
          while (true) {
             e = h22.e;
             if (!e.isEmpty()) {
                handler.post(new ij(e.poll(), 25, uof22));
             }else {
                break ;
             }
          }
          return;
       }
    }
}
