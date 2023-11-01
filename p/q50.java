package p.q50;
import p.v50;
import p.t50;
import p.ib6;
import java.util.concurrent.CountDownLatch;
import p.sb6;
import java.lang.String;
import org.json.JSONObject;
import p.kb6;
import java.lang.Class;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Throwable;
import p.nb6;
import p.ob6;
import java.util.List;
import p.mb6;
import p.lb6;
import p.x12;
import p.ji5;
import android.app.Activity;
import p.m60;
import p.ob2;
import android.content.Context;
import p.l60;
import java.lang.ref.Reference;
import android.os.Handler;
import android.os.Looper;
import p.p50;
import java.lang.Runnable;
import java.lang.Void;
import p.et0;
import java.lang.System;
import android.content.SharedPreferences;
import java.lang.Boolean;
import p.c60;
import p.x45;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Build;
import p.uy6;
import java.util.Iterator;
import java.util.Set;
import p.px3;
import p.xl0;
import java.lang.StringBuilder;
import p.d60;
import p.en6;
import android.os.AsyncTask;
import p.qb6;

public final class q50 extends v50	// class@002331 from classes.dex
{
    public final ib6 a;
    public final CountDownLatch b;
    public final t50 c;

    public void q50(t50 p0,ib6 p1,CountDownLatch p2){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public final void a(sb6 p0){
       q50 tb;
       JSONObject jSONObject;
       JSONObject jSONObject1;
       int i1;
       m60 om60;
       Activity uActivity;
       String d;
       JSONObject jSONObject2;
       String str4;
       if ((tb = this.b) != null) {
          tb.countDown();
       }
       tb = this.a;
       if (p0 == null) {
          tb.f(-116, "Null response.");
          return;
       }else {
          q50 tc = this.c;
          sb6 a = p0.a;
          int i = 1;
          if (a == 200) {
             String str = "randomized_device_token";
             String str1 = "randomized_bundle_token";
             String str2 = "session_id";
             if ((jSONObject = p0.a()) == null) {
                tb.f(500, "Null response json.");
             }
             if (tb instanceof kb6 && jSONObject != null) {
                try{
                   tb.getClass();
                   tc.h.put(null, jSONObject.getString("url"));
                }catch(org.json.JSONException e8){
                   e8.printStackTrace();
                }
             }else if(tb instanceof nb6){
                tc.h.clear();
                t50 f = tc.f;
                f.getClass();
                d = ob6.d;
                _monitor_enter(d);
                f.b.clear();
                f.c();
                _monitor_exit(d);
             }
             if ((v8 = tb instanceof mb6) || tb instanceof lb6) {
                if (tc.v.a == null && jSONObject != null) {
                   try{
                      t50 b = tc.b;
                      if (jSONObject.has(str2)) {
                         b.w("bnc_session_id", jSONObject.getString(str2));
                         om60 = 1;
                      }else {
                         om60 = 0;
                      }
                      if (jSONObject.has(str1)) {
                         str1 = jSONObject.getString(str1);
                         if (!b.j().equals(str1)) {
                            tc.h.clear();
                            b.w("bnc_randomized_bundle_token", str1);
                            om60 = 1;
                         }
                      }
                      if (jSONObject.has(str)) {
                         b.w("bnc_randomized_device_token", jSONObject.getString(str));
                         om60 = 1;
                      }
                      if (om60) {
                         tc.t();
                      }
                   }catch(org.json.JSONException e2){
                      e2.printStackTrace();
                   }
                }
                if (e8) {
                   tc.j = i;
                   q50 oq50 = tb;
                   oq50.getClass();
                   if (p0.a() != null) {
                      str2 = "branch_view_data";
                      if (p0.a().has(str2)) {
                         try{
                            jSONObject1 = p0.a().getJSONObject(str2);
                            str = oq50.q();
                            if (t50.i().h() != null) {
                               om60 = m60.b();
                               om60.getClass();
                               i1 = om60.c(new ob2(om60, jSONObject1, str, 0), t50.i().h(), t50.i());
                            label_0150 :
                               if (!i1) {
                                  tc.c();
                               }
                            }else {
                               om60 = m60.b();
                               om60.getClass();
                               ob2 oob2 = new ob2(om60, jSONObject1, str, 0);
                               if (t50.i().l != null && ((uActivity = t50.i().l.get()) != null && ob2.a(uActivity, oob2))) {
                                  om60.c = new ob2(om60, jSONObject1, str, 0);
                               }else {
                                  i = 0;
                               }
                               i1 = i;
                               goto label_0150 ;
                            }
                         }catch(org.json.JSONException e0){
                         }
                      }
                   }
                   i1 = 0;
                   goto label_0150 ;
                }
             }
             if (jSONObject != null) {
                e0.j(p0, t50.C);
                tc.f.d(e0);
             }else if(e0.m()){
                e0.b();
             }else {
                tc.f.d(e0);
             }
          }else if(tb instanceof mb6 && "bnc_no_value".equals(tc.b.p("bnc_session_params"))){
             tc.j = 3;
          }
          jSONObject1 = 400;
          if (a != jSONObject1 && (a != 409 || !tb instanceof kb6)) {
             tc.g = 0;
             String str3 = "message";
             d = ".";
             try{
                if ((jSONObject2 = p0.a()) != null && (jSONObject2.has("error") && jSONObject2.getJSONObject("error").has(str3))) {
                   if ((str4 = jSONObject2.getJSONObject("error").getString(str3)) != null && str4.trim().length() > 0) {
                      str4 = str4.concat(d);
                   }
                }else {
                   str4 = "";
                }
             }catch(java.lang.Exception e0){
             }
             e0.f(a, str4);
          }else {
             tb.getClass();
          }
          int i2 = (jSONObject1 <= a && (a <= 451 || a == -117))? 1: 0;
          if (!i2 && (tb.m() && tb.h < tc.b.h(3, "bnc_no_connection_retry_max"))) {
             tb.b();
          }else {
             tc.f.d(tb);
          }
          tb.h = tb.h + i;
          tc.g = 0;
          new Handler(Looper.getMainLooper()).post(new p50(0, this));
          return;
       }
    }
    public final Object doInBackground(Object[] p0){
       String str2;
       String str3;
       ib6 a1;
       JSONObject jSONObject;
       sb6 osb6;
       JSONObject str2;
       q50 tb;
       StringBuilder str10;
       String str = "-brtt";
       q50 ta = this.a;
       String str1 = et0.i(ta.b).concat("-qwt");
       long l = 0;
       if ((ta.d - l) > 0) {
          l = System.currentTimeMillis() - ta.d;
       }
       q50 tc = this.c;
       tc.a(str1, String.valueOf(l));
       boolean b = true;
       boolean b1 = false;
       if (ta instanceof mb6) {
          q50 oq50 = ta;
          ib6 c = oq50.c;
          str2 = c.p("bnc_link_click_identifier");
          str3 = "bnc_no_value";
          ji5 a = c.a;
          String str4 = "link_identifier";
          if (!str2.equals(str3)) {
             try{
                oq50.a.put(str4, str2);
                oq50.a.put("facebook_app_link_checked", a.getBoolean("bnc_triggered_by_fb_app_link", b1));
             }catch(org.json.JSONException e0){
             }
          }
          str2 = c.p("bnc_google_search_install_identifier");
          if (!str2.equals(str3)) {
             try{
                oq50.a.put("google_search_install_referrer", str2);
             }catch(org.json.JSONException e0){
             }
          }
          str2 = c.p("bnc_google_play_install_referrer_extras");
          String str5 = "install_referrer_extras";
          if (!str2.equals(str3)) {
             try{
                oq50.a.put(str5, str2);
             }catch(org.json.JSONException e0){
             }
          }
          str2 = c.p("bnc_app_store_source");
          if (!str3.equals(str2)) {
             try{
                oq50.a.put("app_store", str2);
             }catch(org.json.JSONException e0){
             }
          }
          if (a.getBoolean("bnc_is_full_app_conversion", b1)) {
             try{
                oq50.a.put("android_app_link_url", c.p("bnc_app_link"));
                oq50.a.put("is_full_app_conversion", b);
             }catch(org.json.JSONException e0){
             }
          }
          a1 = ta.a;
          a1 = (t50.B && a1.has(str4))? 1: 0;
          if (a1) {
             a1 = ta.a;
             a1.remove("preinstall_partner");
             a1.remove("preinstall_campaign");
             a1.remove(str5);
          }
       }
       str2 = "randomized_device_token";
       ib6 c1 = ta.c;
       String str6 = "user_data";
       if (ta.d() == 4 && (jSONObject = ta.a.optJSONObject(str6)) != null) {
          try{
             jSONObject.put("developer_identity", c1.p("bnc_identity"));
             jSONObject.put(str2, c1.k());
          }catch(org.json.JSONException e0){
          }
       }
       a1 = (ta.d() == b)? ta.a: ta.a.optJSONObject(str6);
       if (a1 != null && (b1 = c1.a.getBoolean("bnc_ad_network_callouts_disabled", b1))) {
          try{
             a1.putOpt("disable_ad_network_callouts", Boolean.valueOf(b1));
          }catch(org.json.JSONException e0){
          }
       }
       int i = ta.d();
       x45 a2 = c60.c().a.a;
       x45 b2 = c60.c().a.b;
       String str7 = "android_id";
       if (!TextUtils.isEmpty(b2)) {
          try{
             if (Build.MANUFACTURER.equalsIgnoreCase("amazon")) {
                str3 = "fire_ad_id";
             }else if(x45.t(t50.i().d)){
                str3 = "oaid";
             }else {
                str3 = "aaid";
             }
             ta.a.put("advertising_ids", new JSONObject().put(str3, b2));
             try{
                uy6 ouy6 = c60.c().b();
                uy6 a3 = ouy6.a;
                ta.a.put("hardware_id", a3);
                ta.a.put("is_hardware_id_real", ouy6.b);
                if (ta.a.has(str6)) {
                   JSONObject jSONObject2 = ta.a.getJSONObject(str6);
                   if (jSONObject2.has(str7)) {
                      jSONObject2.put(str7, a3);
                   }
                }
             }catch(org.json.JSONException e7){
                e7.printStackTrace();
             }
          }catch(org.json.JSONException e0){
          }
       }
       try{
          c1 = ta.e;
          if (i == b) {
             ta.a.put("lat_val", a2);
             if (!TextUtils.isEmpty(b2)) {
                if (!x45.t(c1)) {
                   ta.a.put("google_advertising_id", b2);
                }
                ta.a.remove("unidentified_device");
             }else {
                a1 = ta.a;
                i = (!a1.has(str7) && !a1.has(str2))? 0: 1;
                if (!i && !ta.a.optBoolean("unidentified_device")) {
                   ta.a.put("unidentified_device", b);
                }
             }
          }else if((jSONObject = ta.a.optJSONObject(str6)) != null){
             jSONObject.put("limit_ad_tracking", a2);
             if (!TextUtils.isEmpty(b2)) {
                if (!x45.t(c1)) {
                   jSONObject.put("aaid", b2);
                }
                jSONObject.remove("unidentified_device");
             }else if(!jSONObject.has(str7) && !jSONObject.has(str2)){
                str10 = 0;
             }else {
                str10 = 1;
             }
             if (!str10 && !jSONObject.optBoolean("unidentified_device")) {
                jSONObject.put("unidentified_device", b);
             }
          }
       }catch(org.json.JSONException e0){
       }
       ib6 b3 = ta.b;
       if (tc.v.a != null && !ta.k()) {
          et0.i(b3);
          osb6 = new sb6(-117);
       }else {
          str1 = tc.b.e();
          ta.g();
          t50 m = tc.m;
          try{
             str2 = new JSONObject();
             if (ta.a != null) {
                JSONObject jSONObject1 = new JSONObject(ta.a.toString());
                Iterator iterator = jSONObject1.keys();
                while (iterator.hasNext()) {
                   str6 = iterator.next();
                   str2.put(str6, jSONObject1.get(str6));
                }
                if (m.size() > 0) {
                   jSONObject1 = new JSONObject();
                   iterator = m.keySet().iterator();
                   while (iterator.hasNext()) {
                      str6 = iterator.next();
                      jSONObject1.put(str6, m.get(str6));
                      m.remove(str6);
                   }
                   str2.put("instrumentation", jSONObject1);
                }
             }else {
             }
          }catch(org.json.JSONException e0){
          }catch(java.util.ConcurrentModificationException e0){
             ib6 a5 = ta.a;
          }
          String str8 = ta.e();
          String str9 = et0.i(b3);
          t50 a4 = tc.a;
          a4.getClass();
          long l1 = System.currentTimeMillis();
          if (str2 == null) {
             str2 = new JSONObject();
          }
          if (!px3.a(str1, str2)) {
             osb6 = new sb6(-114);
          }else {
             str2.toString();
             xl0 oxl0 = a4.b(str8, str2, 0);
             osb6 = px3.d(oxl0, str9, oxl0.t);
             if (t50.i() != null) {
                i = (int)(System.currentTimeMillis() - l1);
                a4 = t50.i();
                str10 = "";
                a4.a(en6.p(str10, str9, e0), String.valueOf(i));
             }
          }
          if ((tb = this.b) != null) {
             tb.countDown();
          }
       }
       return osb6;
    }
    public final void onPostExecute(Object p0){
       super.onPostExecute(p0);
       this.a(p0);
    }
    public final void onPreExecute(){
       boolean booleanx;
       JSONObject jSONObject1;
       Iterator iterator1;
       String str2;
       super.onPreExecute();
       q50 ta = this.a;
       ta.i();
       ib6 c = ta.c;
       try{
          String str = "metadata";
          JSONObject jSONObject = new JSONObject();
          Iterator iterator = c.c.keys();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             jSONObject.put(str1, c.c.get(str1));
          }
          if ((jSONObject1 = ta.a.optJSONObject(str)) != null) {
             iterator1 = jSONObject1.keys();
             while (iterator1.hasNext()) {
                str2 = iterator1.next();
                jSONObject.put(str2, jSONObject1.get(str2));
             }
          }
          if (ta instanceof qb6) {
             ji5 d = c.d;
             if (d.length() > 0) {
                iterator1 = d.keys();
                while (iterator1.hasNext()) {
                   str2 = iterator1.next();
                   ta.a.putOpt(str2, d.get(str2));
                }
             }
          }
          ta.a.put(str, jSONObject);
       }catch(org.json.JSONException e0){
       }
       if (e0.n()) {
          ib6 a = e0.a;
          if (e0.d() != 1) {
             a = a.optJSONObject("user_data");
          }
          if (a != null && (booleanx = c.a.getBoolean("bnc_limit_facebook_tracking", false))) {
             a.putOpt("limit_facebook_tracking", Boolean.valueOf(booleanx));
          }
       }
       return;
    }
}
