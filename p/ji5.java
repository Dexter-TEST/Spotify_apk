package p.ji5;
import android.content.Context;
import java.lang.Object;
import org.json.JSONObject;
import p.a60;
import java.lang.String;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.lang.Exception;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p.en6;
import java.lang.StringBuilder;
import java.util.Collection;
import java.util.Collections;
import java.lang.Long;
import java.lang.System;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map$Entry;
import p.t50;
import java.lang.Class;
import p.ob6;
import java.util.List;

public final class ji5	// class@001ae2 from classes.dex
{
    public final SharedPreferences a;
    public final SharedPreferences$Editor b;
    public final JSONObject c;
    public final JSONObject d;
    public final a60 e;
    public static ji5 f;

    public void ji5(Context p0){
       super();
       this.c = new JSONObject();
       this.d = new JSONObject();
       JSONObject jSONObject = new JSONObject();
       this.e = new a60();
       SharedPreferences sharedPrefer = p0.getSharedPreferences("branch_referral_shared_pref", 0);
       this.a = sharedPrefer;
       this.b = sharedPrefer.edit();
    }
    public static void a(String p0){
    }
    public static void b(String p0,Exception p1){
       if (!TextUtils.isEmpty(p0)) {
          Log.e("BranchSDK", p0, p1);
       }
       return;
    }
    public static ji5 g(Context p0){
       if (ji5.f == null) {
          ji5.f = new ji5(p0);
       }
       return ji5.f;
    }
    public final void c(){
       Iterator iterator = this.d().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          ArrayList uArrayList = this.d();
          if (!uArrayList.contains(str)) {
             uArrayList.add(str);
             this.r(uArrayList);
          }
          ji5 tb = this.b;
          tb.putInt(en6.n("bnc_total_base_", str), 0).apply();
          tb.putInt("bnc_balance_base_".append(str).toString(), 0).apply();
       }
       this.r(new ArrayList());
       return;
    }
    public final ArrayList d(){
       String str = this.p("bnc_actions");
       if (str.equals("bnc_no_value")) {
          return new ArrayList();
       }
       ArrayList uArrayList = new ArrayList();
       Collections.addAll(uArrayList, str.split(","));
       return uArrayList;
    }
    public final String e(){
       return this.p("bnc_branch_key");
    }
    public final String f(String p0){
       try{
          return this.d.get(p0).toString();
       }catch(org.json.JSONException e0){
          return null;
       }
    }
    public final int h(int p0,String p1){
       return this.a.getInt(p1, p0);
    }
    public final long i(String p0){
       return this.a.getLong(p0, 0);
    }
    public final String j(){
       String str = this.p("bnc_randomized_bundle_token");
       if (!TextUtils.isEmpty(str) && !str.equals("bnc_no_value")) {
          return str;
       }
       return this.p("bnc_identity_id");
    }
    public final String k(){
       String str = this.p("bnc_randomized_device_token");
       if (!TextUtils.isEmpty(str) && !str.equals("bnc_no_value")) {
          return str;
       }
       return this.p("bnc_device_fingerprint_id");
    }
    public final String l(){
       String str2;
       ji5 tb = this.b;
       String str = this.p("bnc_gclid_json_object");
       String str1 = "bnc_no_value";
       if (str.equals(str1)) {
          return str1;
       }
       try{
          JSONObject jSONObject = new JSONObject(str);
          if (((jSONObject.get("bnc_gclid_expiration_date").longValue() - System.currentTimeMillis())) > 0) {
             str2 = jSONObject.getString("bnc_gclid_value");
          label_0048 :
             return str2;
          }else {
             tb.remove("bnc_gclid_json_object").apply();
          }
       }catch(org.json.JSONException e2){
          tb.remove("bnc_gclid_json_object").apply();
          e2.printStackTrace();
       }
       str2 = null;
       goto label_0048 ;
    }
    public final int m(){
       return this.h(3, "bnc_retry_count");
    }
    public final int n(){
       return this.h(1000, "bnc_retry_interval");
    }
    public final String o(){
       return this.p("bnc_session_id");
    }
    public final String p(String p0){
       return this.a.getString(p0, "bnc_no_value");
    }
    public final void q(JSONObject p0){
       JSONObject jSONObject = new JSONObject();
       Iterator iterator = this.e.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          JSONObject jSONObject1 = new JSONObject();
          Iterator iterator1 = uEntry.getValue().entrySet().iterator();
          while (iterator1.hasNext()) {
             Map$Entry uEntry1 = iterator1.next();
             String key = uEntry1.getKey();
             jSONObject1.put(key, uEntry1.getValue());
          }
          jSONObject.put(uEntry.getKey(), jSONObject1);
       }
       p0.put("partner_data", jSONObject);
       return;
    }
    public final void r(ArrayList p0){
       if (!p0.size()) {
          this.w("bnc_actions", "bnc_no_value");
       }else {
          Iterator iterator = p0.iterator();
          String str = "";
          while (iterator.hasNext()) {
             str = "".append(str).append(iterator.next()).append(",").toString();
          }
          this.w("bnc_actions", str.substring(0, (str.length() - 1)));
       }
       return;
    }
    public final void s(String p0){
       String str = "bnc_branch_key";
       if (!this.p(str).equals(p0)) {
          ji5 tb = this.b;
          tb.clear();
          this.w("bnc_link_click_id", this.p("bnc_link_click_id"));
          this.w("bnc_link_click_identifier", this.p("bnc_link_click_identifier"));
          this.w("bnc_app_link", this.p("bnc_app_link"));
          this.w("bnc_push_identifier", this.p("bnc_push_identifier"));
          tb.apply();
          this.w(str, p0);
          if (t50.i() != null) {
             t50.i().h.clear();
             t50 f = t50.i().f;
             f.getClass();
             Object d = ob6.d;
             try{
                _monitor_enter(d);
                f.b.clear();
                f.c();
                _monitor_exit(e0);
             }catch(java.lang.UnsupportedOperationException e0){
             }
          }
       }
       return;
    }
    public final void t(String p0,long p1){
       this.b.putLong(p0, p1).apply();
    }
    public final void u(String p0){
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("bnc_gclid_value", p0);
          jSONObject.put("bnc_gclid_expiration_date", (System.currentTimeMillis() + this.a.getLong("bnc_gclid_expiration_window", 0x9a7ec800)));
          this.w("bnc_gclid_json_object", jSONObject.toString());
       }catch(org.json.JSONException e8){
          e8.printStackTrace();
       }
       return;
    }
    public final void v(String p0){
       this.w("bnc_session_params", p0);
    }
    public final void w(String p0,String p1){
       this.b.putString(p0, p1).apply();
    }
}
