package p.ib6;
import org.json.JSONObject;
import android.content.Context;
import java.lang.Object;
import p.ji5;
import java.util.HashSet;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.jb6;
import p.kb6;
import p.lb6;
import p.nb6;
import p.pb6;
import p.qb6;
import p.rb6;
import p.hb6;
import java.lang.StringBuilder;
import java.lang.Class;
import android.webkit.URLUtil;
import p.et0;
import p.sb6;
import p.t50;
import p.c60;
import p.uy6;
import android.os.Build;
import android.util.DisplayMetrics;
import p.x45;
import android.os.Build$VERSION;
import java.util.Locale;
import android.webkit.WebSettings;
import java.lang.Throwable;
import android.content.pm.PackageManager;
import android.content.Intent;
import java.util.List;
import java.lang.Exception;

public abstract class ib6	// class@001961 from classes.dex
{
    public JSONObject a;
    public final int b;
    public final ji5 c;
    public long d;
    public final Context e;
    public final HashSet f;
    public boolean g;
    public int h;
    public static final int[] i;

    static {
       ib6.i = new int[6]{4,6,9,12,13,14};
    }
    public void ib6(int p0,JSONObject p1,Context p2){
       super();
       this.d = 0;
       this.g = false;
       this.h = 0;
       this.e = p2;
       this.b = p0;
       this.a = p1;
       this.c = ji5.g(p2);
       this.f = new HashSet();
    }
    public void ib6(Context p0,int p1){
       super();
       this.d = 0;
       this.g = false;
       this.h = 0;
       this.e = p0;
       this.b = p1;
       this.c = ji5.g(p0);
       this.a = new JSONObject();
       this.f = new HashSet();
    }
    public static ib6 c(Context p0,JSONObject p1){
       ib6 oib61;
       boolean b;
       String str = "INITIATED_BY_CLIENT";
       String str1 = "REQ_POST_PATH";
       String str2 = "REQ_POST";
       ib6 oib6 = null;
       try{
          oib61 = (p1.has(str2))? p1.getJSONObject(str2): oib6;
       }catch(org.json.JSONException e0){
       }
       try{
          str1 = (p1.has(str1))? p1.getString(str1): "";
       }catch(org.json.JSONException e0){
       }
       try{
          b = (p1.has(e0))? p1.getBoolean(e0): true;
       }catch(org.json.JSONException e0){
       }
       if (!TextUtils.isEmpty(str1)) {
          if (str1.equalsIgnoreCase("v1/event")) {
             oib6 = new jb6(oib61, p0);
          }else if(str1.equalsIgnoreCase("v1/url")){
             oib6 = new kb6(oib61, p0);
          }else if(str1.equalsIgnoreCase("v1/profile")){
             oib6 = new lb6(oib61, p0);
          }else if(str1.equalsIgnoreCase("v1/logout")){
             oib6 = new nb6(oib61, p0);
          }else if(str1.equalsIgnoreCase("v1/close")){
             oib6 = new pb6(oib61, p0);
          }else if(str1.equalsIgnoreCase("v1/install")){
             oib6 = new qb6(oib61, p0, b);
          }else if(str1.equalsIgnoreCase("v1/open")){
             oib6 = new rb6(oib61, p0, b);
          }
       }
       return oib6;
    }
    public final void a(hb6 p0){
       this.f.add(p0);
    }
    public abstract void b();
    public int d(){
       return 1;
    }
    public final String e(){
       StringBuilder str = "";
       this.c.getClass();
       String str1 = null;
       if (URLUtil.isHttpsUrl(str1)) {
       }else {
          str1 = "https://api2.branch.io/";
       }
       return str+str1+et0.i(this.b);
    }
    public abstract void f(int p0,String p1);
    public abstract void g();
    public boolean h(){
       return (this instanceof kb6 ^ 0x01);
    }
    public void i(){
    }
    public abstract void j(sb6 p0,t50 p1);
    public boolean k(){
       return this instanceof kb6;
    }
    public void l(JSONObject p0){
       ib6 oib6;
       String str2;
       c60 uoc60;
       ib6 a;
       String str9;
       ib6 oib61;
       String str10;
       ib6 oib62;
       String str12;
       String str13;
       try{
          oib6 = this;
          oib6.a = p0;
          String str = "bnc_no_value";
          String str1 = "local_ip";
          str2 = "language";
          String str3 = "country";
          String str4 = "os";
          String str5 = "ui_mode";
          String str6 = "screen_dpi";
          String str7 = "model";
          String str8 = "brand";
          ib6 c = oib6.c;
          if (this.d() == 1) {
             uoc60 = c60.c();
             a = oib6.a;
             str9 = str;
             str = "wifi";
             oib61 = c;
             c60 b = uoc60.b;
             str10 = str1;
             uy6 ouy6 = uoc60.b();
             String str11 = str2;
             uy6 a1 = ouy6.a;
             if (!c60.e(a1)) {
                str13 = str3;
                a.put("hardware_id", a1);
                a.put("is_hardware_id_real", ouy6.b);
             }else {
                str13 = str3;
             }
             str1 = Build.MANUFACTURER;
             if (!c60.e(str1)) {
                a.put(str8, str1);
             }
             str1 = Build.MODEL;
             if (!c60.e(str1)) {
                a.put(str7, str1);
             }
             DisplayMetrics uDisplayMetr = x45.m(b);
             a.put(str6, uDisplayMetr.densityDpi);
             a.put("screen_height", uDisplayMetr.heightPixels);
             a.put("screen_width", uDisplayMetr.widthPixels);
             a.put(str, str.equalsIgnoreCase(x45.d(b)));
             a.put(str5, x45.s(b));
             str = x45.l(b);
             if (!c60.e(str)) {
                a.put(str4, str);
             }
             a.put("os_version", Build$VERSION.SDK_INT);
             uoc60.f(oib6, a);
             str12 = Locale.getDefault().getCountry();
             if (!TextUtils.isEmpty(str12)) {
                a.put(str13, str12);
             }
             str12 = Locale.getDefault().getLanguage();
             if (!TextUtils.isEmpty(str12)) {
                a.put(str11, str12);
             }
             str12 = x45.j();
             if (!TextUtils.isEmpty(str12)) {
                a.put(str10, str12);
             }
             str2 = str9;
             oib62 = oib61;
          }else {
             str9 = str;
             str = str3;
             oib61 = c;
             str2 = str1;
             str1 = str2;
             JSONObject jSONObject = new JSONObject();
             oib6.a.put("user_data", jSONObject);
             uoc60 = c60.c();
             c60 b1 = uoc60.b;
             uy6 ouy61 = uoc60.b();
             ouy61 = ouy61.a;
             if (!c60.e(ouy61)) {
                str10 = str2;
                jSONObject.put("android_id", ouy61);
             }else {
                str10 = str2;
             }
             str2 = Build.MANUFACTURER;
             if (!c60.e(str2)) {
                jSONObject.put(str8, str2);
             }
             str2 = Build.MODEL;
             if (!c60.e(str2)) {
                jSONObject.put(str7, str2);
             }
             DisplayMetrics uDisplayMetr1 = x45.m(b1);
             jSONObject.put(str6, uDisplayMetr1.densityDpi);
             jSONObject.put("screen_height", uDisplayMetr1.heightPixels);
             jSONObject.put("screen_width", uDisplayMetr1.widthPixels);
             jSONObject.put(str5, x45.s(b1));
             str3 = x45.l(b1);
             if (!c60.e(str3)) {
                jSONObject.put(str4, str3);
             }
             jSONObject.put("os_version", Build$VERSION.SDK_INT);
             uoc60.f(oib6, jSONObject);
             str2 = Locale.getDefault().getCountry();
             if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(str, str2);
             }
             str = Locale.getDefault().getLanguage();
             if (!TextUtils.isEmpty(str)) {
                jSONObject.put(str1, str);
             }
             str = x45.j();
             if (!TextUtils.isEmpty(str)) {
                jSONObject.put(str10, str);
             }
             if (oib61 != null) {
                if (!c60.e(oib61.k())) {
                   jSONObject.put("randomized_device_token", oib61.k());
                }
                str = "bnc_identity";
                oib62 = oib61;
                str = oib62.p(str);
                if (!c60.e(str)) {
                   jSONObject.put("developer_identity", str);
                }
                str = oib62.p("bnc_app_store_source");
                str2 = str9;
                if (!str2.equals(str)) {
                   jSONObject.put("app_store", str);
                }
             }else {
                str2 = str9;
                oib62 = oib61;
             }
             jSONObject.put("app_version", uoc60.a());
             jSONObject.put("sdk", "android");
             jSONObject.put("sdk_version", "5.2.7");
             str = "user_agent";
             if (!TextUtils.isEmpty(t50.w)) {
                str12 = t50.w;
             }else {
                try{
                   t50.w = WebSettings.getDefaultUserAgent(b1);
                }catch(java.lang.Exception e0){
                   e0.getMessage();
                }
                str12 = t50.w;
             }
             jSONObject.put(str, str12);
          }
       }catch(org.json.JSONException e0){
       }catch(org.json.JSONException e0){
       }catch(org.json.JSONException e0){
          str2 = str9;
       }
       a = oib6.a;
       c60.c().getClass();
       if (!oib6 instanceof qb6 && ((str12 = oib62.l()) != null && !str12.equals(str2))) {
          a.put("referrer_gclid", str12);
       }
       a.put("debug", false);
       return;
    }
    public boolean m(){
       return this instanceof lb6;
    }
    public boolean n(){
       return false;
    }
    public JSONObject o(){
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("REQ_POST", this.a);
          jSONObject.put("REQ_POST_PATH", et0.i(this.b));
          return jSONObject;
       }catch(org.json.JSONException e0){
          return null;
       }
    }
    public final void p(JSONObject p0){
       c60 b;
       Intent launchIntent;
       int i;
       try{
          if ((b = c60.c().b) != null) {
             try{
                PackageManager packageManag = b.getPackageManager();
                if ((launchIntent = b.getPackageManager().getLaunchIntentForPackage(b.getPackageName())) != null) {
                   i = packageManag.queryIntentActivities(launchIntent, 0x10000).isEmpty() ^ 0x01;
                label_0031 :
                   String str = (i)? "FULL_APP": "INSTANT_APP";
                   if (this.d() == 4) {
                      if ((p0 = p0.optJSONObject("user_data")) != null) {
                         p0.put("environment", str);
                      }
                   }else {
                      p0.put("environment", str);
                   }
                   return;
                }
             }catch(java.lang.Exception e0){
                ji5.b("Error obtaining PackageInfo", e0);
             }
          }
          i = 0;
          goto label_0031 ;
       }catch(java.lang.Exception e0){
       }
    }
}
