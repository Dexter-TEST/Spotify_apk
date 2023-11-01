package p.c60;
import android.content.Context;
import java.lang.Object;
import p.b60;
import org.json.JSONObject;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import p.ji5;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import p.t50;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.Exception;
import p.uy6;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Iterator;
import p.ib6;
import p.en6;
import java.lang.System;
import android.os.Build;
import java.lang.StringBuilder;
import java.util.Locale;
import p.x45;
import android.telephony.TelephonyManager;
import android.os.Build$VERSION;

public final class c60	// class@0011a2 from classes.dex
{
    public final Object a;
    public final Object b;
    public static JSONObject c;
    public static c60 d;

    public void c60(Context p0,int p1){
       if (p1 != 1) {
          if (p1 != 2) {
             super();
             this.b = p0;
             this.a = new b60(this);
             return;
          }else {
             super();
             JSONObject jSONObject = new JSONObject();
             try{
                this.b = jSONObject;
                jSONObject.putOpt("version", Integer.valueOf(0));
                JSONArray jSONArray = new JSONArray();
                jSONObject.putOpt("uri_skip_list", jSONArray);
                jSONArray.put("^fb\\d+:");
                jSONArray.put("^li\\d+:");
                jSONArray.put("^pdk\\d+:");
                jSONArray.put("^twitterkit-.*:");
                jSONArray.put("^com\\.googleusercontent\\.apps\\.\\d+-.*:\\/oauth");
                jSONArray.put("^\(?i\)\(?!\(http|https\):\).*\(:|:.*\\b\)\(password|o?auth|o?auth.?token|access|access.?token\)\\b");
                jSONArray.put("^\(?i\)\(\(http|https\):\\/\\/\).*[\\/|?|#].*\\b\(password|o?auth|o?auth.?token|access|access.?token\)\\b");
             }catch(org.json.JSONException e0){
             }
             jSONObject = new JSONObject();
             String str = ji5.g(p0).p("skip_url_format_key");
             c60 uoc60 = (!TextUtils.isEmpty(str) && !"bnc_no_value".equals(str))? new JSONObject(str): this.b;
             c60.c = uoc60;
             this.a = new ArrayList();
             return;
          }
       }else {
          super();
          this.b = p0;
          this.a = new b60(this);
          return;
       }
    }
    public static c60 c(){
       t50 ot50;
       if ((ot50 = t50.i()) == null) {
          return null;
       }
       return ot50.c;
    }
    public static boolean e(String p0){
       boolean b = (!TextUtils.isEmpty(p0) && !p0.equals("bnc_no_value"))? false: true;
       return b;
    }
    public final String a(){
       c60 tb;
       PackageInfo versionName;
       if ((tb = this.b) != null) {
          try{
             versionName = tb.getPackageManager().getPackageInfo(tb.getPackageName(), 0).versionName;
          label_001e :
             if (TextUtils.isEmpty(versionName)) {
                versionName = "bnc_no_value";
             }
             return versionName;
          }catch(java.lang.Exception e0){
             ji5.b("Error obtaining AppVersion", e0);
          }
          versionName = "";
          goto label_001e ;
       }else {
       }
    }
    public final uy6 b(){
       return new uy6(this.b);
    }
    public final String d(String p0){
       JSONArray jSONArray;
       String str;
       c60 ta = this.a;
       try{
          if ((jSONArray = c60.c.optJSONArray("uri_skip_list")) != null) {
             int i = 0;
             while (true) {
                if (i < jSONArray.length()) {
                   try{
                      str = jSONArray.getString(i);
                      if (Pattern.compile(str).matcher(p0).find()) {
                      label_002a :
                         if (str == null) {
                            if (ta.size() > 0) {
                               Iterator iterator = ta.iterator();
                               do {
                                  if (iterator.hasNext()) {
                                  }else {
                                  label_004e :
                                     p0 = str;
                                     break ;
                                  }
                               } while (p0.matches(iterator.next()));
                            }
                         }else {
                            goto label_004e ;
                         }
                         break ;
                      }else {
                         i = i + 1;
                      }
                   }catch(org.json.JSONException e0){
                   }
                }
             }
             return p0;
          }
          str = null;
          goto label_002a ;
       }catch(java.lang.Exception e0){
       }
    }
    public final void f(ib6 p0,JSONObject p1){
       TelephonyManager systemServic;
       String str;
       int[] i = ib6.i;
       int i1 = 0;
       int i2 = 0;
       while (i2 < 6) {
          if (en6.b(i[i2], p0.b)) {
             i1 = 1;
             break ;
          }else {
             i2 = i2 + 1;
          }
       }
       if (i1) {
          p1.put("cpu_type", System.getProperty("os.arch"));
          p1.put("build", Build.DISPLAY);
          p1.put("locale", Locale.getDefault().getLanguage()+"_"+Locale.getDefault().getCountry());
          c60 tb = this.b;
          p1.put("connection_type", x45.d(tb));
          if ((systemServic = tb.getSystemService("phone")) != null) {
             str = systemServic.getNetworkOperatorName();
             if (!TextUtils.isEmpty(str)) {
             label_0076 :
                p1.put("device_carrier", str);
                p1.put("os_version_android", Build$VERSION.RELEASE);
             }
          }
          str = null;
          goto label_0076 ;
       }
       return;
    }
}
