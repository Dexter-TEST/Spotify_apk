package p.mb6;
import p.ib6;
import org.json.JSONObject;
import android.content.Context;
import java.lang.String;
import p.t50;
import p.is7;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import java.lang.ref.Reference;
import android.app.AlertDialog$Builder;
import p.i61;
import android.content.DialogInterface$OnClickListener;
import p.h61;
import android.app.AlertDialog;
import android.os.Handler;
import p.p50;
import java.lang.Runnable;
import p.c60;
import java.lang.Class;
import p.kc7;
import java.lang.Void;
import android.os.AsyncTask;
import java.util.concurrent.Executor;
import p.ji5;
import p.sb6;
import p.hb6;
import p.ob6;
import android.content.SharedPreferences$Editor;
import p.kb6;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.Exception;
import java.lang.Throwable;

public abstract class mb6 extends ib6	// class@001e63 from classes.dex
{
    public final Context j;
    public r50 k;
    public final boolean l;

    public void mb6(int p0,JSONObject p1,Context p2,boolean p3){
       super(p0, p1, p2);
       this.j = p2;
       this.l = p3 ^ 0x01;
    }
    public void mb6(Context p0,int p1,boolean p2){
       super(p0, p1);
       this.j = p0;
       this.l = p2 ^ 0x01;
    }
    public static boolean r(String p0){
       boolean b = false;
       if (p0 != null && (p0.equalsIgnoreCase("open") && !p0.equalsIgnoreCase("install"))) {
          b = true;
       }
       return b;
    }
    public static void s(t50 p0){
       String str;
       Void[] voidArray;
       t50 l = p0.l;
       is7.x = l;
       if (t50.i() != null) {
          t50.i().j();
          str = t50.i().j().optString("~referring_link");
       }else {
          str = "";
       }
       if (!TextUtils.isEmpty(str) && l != null) {
          JSONObject jSONObject = t50.i().j();
          int i = 1;
          if (jSONObject.optInt("_branch_validate") == 0xec62) {
             int i1 = 0x1030226;
             if (jSONObject.optBoolean("+clicked_branch_link")) {
                if (is7.x.get() != null) {
                   new AlertDialog$Builder(is7.x.get(), i1).setTitle("Branch Deeplinking Routing").setMessage("Good news - we got link data. Now a question for you, astute developer: did the app deep link to the specific piece of content you expected to see?").setPositiveButton("Yes", new i61(jSONObject, i)).setNegativeButton("No", new i61(jSONObject, 0)).setNeutralButton(0x1040000, new h61(0)).setCancelable(0).setIcon(0x1080093).show();
                }
             }else if(is7.x.get() != null){
                new AlertDialog$Builder(is7.x.get(), i1).setTitle("Branch Deeplink Routing Support").setMessage("Bummer. It seems like +clicked_branch_link is false - we didn\'t deep link.  Double check that the link you\'re clicking has the same branch_key that is being used in your Manifest file. Return to Chrome when you\'re ready to test again.").setNeutralButton("Got it", new h61(i)).setCancelable(0).setIcon(0x1080093).show();
             }
          }else if(jSONObject.optBoolean("bnc_validate")){
             new Handler().postDelayed(new p50(i, jSONObject), 500);
          }
       }
       p0 = p0.d;
       if (c60.d == null) {
          c60.d = new c60(p0, 2);
       }
       c60 d = c60.d;
       try{
          d.getClass();
          kc7 okc7 = new kc7(p0);
          try{
             voidArray = new Void[0];
             okc7.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
          }catch(java.lang.Exception e0){
             e0.execute(voidArray);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void i(){
       String str = "bnc_external_intent_extra";
       String str1 = "bnc_external_intent_uri";
       String str2 = "bnc_push_identifier";
       String str3 = "bnc_app_link";
       ib6 tc = this.c;
       ib6 ta = this.a;
       try{
          if (!tc.p(str3).equals("bnc_no_value")) {
             ta.put("android_app_link_url", tc.p(str3));
          }
          if (!tc.p(str2).equals("bnc_no_value")) {
             ta.put("push_identifier", tc.p(str2));
          }
          if (!tc.p(str1).equals("bnc_no_value")) {
             ta.put("external_intent_uri", tc.p(str1));
          }
          if (!tc.p(str).equals("bnc_no_value")) {
             ta.put("external_intent_extra", tc.p(str));
          }
          t50.z = false;
          return;
       }catch(org.json.JSONException e0){
       }
    }
    public void j(sb6 p0,t50 p1){
       t50 ot50 = t50.i();
       if ((p1 = ot50.f) == null) {
       }else {
          p1.e(hb6.a);
          ot50.p();
       }
       ib6 tc = this.c;
       tc.w("bnc_link_click_identifier", "bnc_no_value");
       tc.w("bnc_google_search_install_identifier", "bnc_no_value");
       tc.w("bnc_google_play_install_referrer_extras", "bnc_no_value");
       tc.w("bnc_external_intent_uri", "bnc_no_value");
       tc.w("bnc_external_intent_extra", "bnc_no_value");
       tc.w("bnc_app_link", "bnc_no_value");
       tc.w("bnc_push_identifier", "bnc_no_value");
       ji5 b = tc.b;
       b.putBoolean("bnc_triggered_by_fb_app_link", false).apply();
       tc.w("bnc_install_referrer", "bnc_no_value");
       b.putBoolean("bnc_is_full_app_conversion", false).apply();
       tc.w("bnc_initial_referrer", "bnc_no_value");
       if (!(tc.i("bnc_previous_update_time"))) {
          tc.t("bnc_previous_update_time", tc.i("bnc_last_known_update_time"));
       }
       return;
    }
    public final boolean k(){
       ib6 ta = this.a;
       if (!ta.has("android_app_link_url") && (!ta.has("push_identifier") && !ta.has("link_identifier"))) {
          return this instanceof kb6;
       }
       ta.remove("randomized_device_token");
       ta.remove("randomized_bundle_token");
       ta.remove("facebook_app_link_checked");
       ta.remove("external_intent_extra");
       ta.remove("external_intent_uri");
       ta.remove("latest_install_time");
       ta.remove("latest_update_time");
       ta.remove("first_install_time");
       ta.remove("previous_update_time");
       ta.remove("install_begin_ts");
       ta.remove("clicked_referrer_ts");
       ta.remove("hardware_id");
       ta.remove("is_hardware_id_real");
       ta.remove("local_ip");
       ta.remove("referrer_gclid");
       ta.remove("identity");
       try{
          int i = 1;
          ta.put("tracking_disabled", i);
          return i;
       }catch(org.json.JSONException e0){
       }
    }
    public final void l(JSONObject p0){
       c60 b1;
       PackageInfo firstInstall;
       PackageInfo lastUpdateTi;
       ib6 oib6 = this;
       JSONObject jSONObject = p0;
       super.l(p0);
       ib6 c = oib6.c;
       c.q(jSONObject);
       String str = c60.c().a();
       if (!c60.e(str)) {
          jSONObject.put("app_version", str);
       }
       str = "bnc_initial_referrer";
       if (!TextUtils.isEmpty(c.p(str)) && !c.p(str).equals("bnc_no_value")) {
          jSONObject.put("initial_referrer", c.p(str));
       }
       boolean b = false;
       jSONObject.put("facebook_app_link_checked", c.a.getBoolean("bnc_triggered_by_fb_app_link", b));
       String str1 = c60.c().a();
       if ((b1 = c60.c().b) != null) {
          try{
             firstInstall = b1.getPackageManager().getPackageInfo(b1.getPackageName(), b).firstInstallTime;
          label_0078 :
             if ((b1 = c60.c().b) != null) {
                try{
                   lastUpdateTi = b1.getPackageManager().getPackageInfo(b1.getPackageName(), b).lastUpdateTime;
                label_0098 :
                   str = "bnc_app_version";
                   int i = 2;
                   if ("bnc_no_value".equals(c.p(str))) {
                      if (((lastUpdateTi - firstInstall) - 0x5265c00) < 0) {
                         i = 0;
                      }
                      if ((TextUtils.isEmpty(oib6.j.getApplicationContext().getSharedPreferences("com.mobileapptracking", b).getString("mat_id", null)) ^ 1)) {
                         i = 5;
                      }
                   }else if(!c.p(str).equals(str1)){
                      i = 1;
                   }
                   jSONObject.put("update", i);
                   jSONObject.put("latest_install_time", firstInstall);
                   jSONObject.put("latest_update_time", lastUpdateTi);
                   str = "bnc_original_install_time";
                   long l = c.i(str);
                   if (!(l)) {
                      c.t(str, firstInstall);
                   }else {
                      firstInstall = l;
                   }
                   jSONObject.put("first_install_time", firstInstall);
                   str = "bnc_last_known_update_time";
                   long l1 = c.i(str);
                   if ((l1 - lastUpdateTi) < 0) {
                      c.t("bnc_previous_update_time", l1);
                      c.t(str, lastUpdateTi);
                   }
                   jSONObject.put("previous_update_time", c.i("bnc_previous_update_time"));
                   this.p(p0);
                   str = t50.F;
                   if (!TextUtils.isEmpty(str) && !str.equals("bnc_no_value")) {
                      jSONObject.put("identity", str);
                   }
                   return;
                }catch(java.lang.Exception e0){
                   ji5.b("Error obtaining LastUpdateTime", e0);
                }
                lastUpdateTi = 0;
                goto label_0098 ;
             }else {
             }
          }catch(java.lang.Exception e0){
             ji5.b("Error obtaining FirstInstallTime", e0);
          }
          firstInstall = 0;
          goto label_0078 ;
       }else {
       }
    }
    public final boolean n(){
       return true;
    }
    public final JSONObject o(){
       JSONObject jSONObject = super.o();
       try{
          jSONObject.put("INITIATED_BY_CLIENT", this.l);
       }catch(org.json.JSONException e1){
          e1.printStackTrace();
       }
       return jSONObject;
    }
    public abstract String q();
}
