package p.ya3;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.av6;
import p.wa3;
import org.json.JSONObject;
import p.b17;
import java.lang.Long;
import org.json.JSONArray;
import android.content.Context;
import p.sz1;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.System;
import java.lang.StringBuffer;
import java.lang.Throwable;
import java.lang.StackTraceElement;
import p.xa3;
import java.lang.Enum;
import android.os.Build$VERSION;
import android.os.Build;

public final class ya3	// class@002d7c from classes.dex
{
    public final String a;
    public final wa3 b;
    public final JSONArray c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;

    public void ya3(File p0){
       wa3 t;
       JSONObject jSONObject;
       super();
       String name = p0.getName();
       co5.l(name, "file.name");
       this.a = name;
       boolean b = false;
       if (av6.D0(name, "crash_log_", b)) {
          t = wa3.t;
       }else if(av6.D0(name, "shield_log_", b)){
          t = wa3.v;
       }else if(av6.D0(name, "thread_check_log_", b)){
          t = wa3.w;
       }else if(av6.D0(name, "analysis_log_", b)){
          t = wa3.b;
       }else if(av6.D0(name, "anr_log_", b)){
          t = wa3.c;
       }else {
          t = wa3.a;
       }
       this.b = t;
       if ((jSONObject = b17.v(name)) != null) {
          this.g = Long.valueOf(jSONObject.optLong("timestamp", 0));
          this.d = jSONObject.optString("app_version", null);
          this.e = jSONObject.optString("reason", null);
          this.f = jSONObject.optString("callstack", null);
          this.c = jSONObject.optJSONArray("feature_names");
       }
       return;
    }
    public void ya3(String p0,String p1){
       PackageInfo packageInfo;
       super();
       this.b = wa3.c;
       Context uContext = sz1.a();
       String packageName = uContext.getPackageName();
       try{
          int i = 0;
          if ((packageInfo = uContext.getPackageManager().getPackageInfo(packageName, 0)) != null) {
             PackageInfo versionName = packageInfo.versionName;
          }
          this.d = i;
          this.e = p0;
          this.f = p1;
          Long longx = Long.valueOf((System.currentTimeMillis() / (long)1000));
          this.g = longx;
          longx = "anr_log_"+String.valueOf(longx)+".json";
          co5.l(longx, "StringBuffer\(\)\n            .append\(InstrumentUtility.ANR_REPORT_PREFIX\)\n            .append\(timestamp.toString\(\)\)\n            .append\(\".json\"\)\n            .toString\(\)");
          this.a = longx;
          return;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
    }
    public void ya3(Throwable p0){
       int i1;
       PackageInfo packageInfo;
       String str;
       super();
       this.b = wa3.t;
       Context uContext = sz1.a();
       String packageName = uContext.getPackageName();
       int i = 0;
       try{
          i1 = 0;
          str = ((packageInfo = uContext.getPackageManager().getPackageInfo(packageName, i)) == null)? i1: packageInfo.versionName;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
       this.d = str;
       if (p0 == null) {
          str = i1;
       }else if(p0.getCause() == null){
          str = p0.toString();
       }else {
          str = String.valueOf(p0.getCause());
       }
       this.e = str;
       if (p0 != null) {
          JSONArray jSONArray = new JSONArray();
          for (; p0 != null && p0 != i1; p0 = p0.getCause()) {
             StackTraceElement[] stackTrace = p0.getStackTrace();
             co5.l(stackTrace, "t.stackTrace");
             i1 = stackTrace.length;
             int i2 = 0;
             while (i2 < i1) {
                i2 = i2 + 1;
                jSONArray.put(stackTrace[i2].toString());
             }
             Throwable throwable = p0;
          }
          String str2 = jSONArray.toString();
       }
       this.f = i1;
       Long longx = Long.valueOf((System.currentTimeMillis() / (long)1000));
       this.g = longx;
       String str1 = "crash_log_"+String.valueOf(longx)+".json";
       co5.l(str1, "StringBuffer\(\).append\(t.logPrefix\).append\(timestamp.toString\(\)\).append\(\".json\"\).toString\(\)");
       this.a = str1;
       return;
    }
    public void ya3(JSONArray p0){
       super();
       this.b = wa3.b;
       Long longx = Long.valueOf((System.currentTimeMillis() / (long)1000));
       this.g = longx;
       this.c = p0;
       String str = "analysis_log_"+String.valueOf(longx)+".json";
       co5.l(str, "StringBuffer\(\)\n            .append\(InstrumentUtility.ANALYSIS_REPORT_PREFIX\)\n            .append\(timestamp.toString\(\)\)\n            .append\(\".json\"\)\n            .toString\(\)");
       this.a = str;
    }
    public final int a(ya3 p0){
       ya3 tg;
       co5.o(p0, "data");
       int i = -1;
       if ((tg = this.g) == null) {
          return i;
       }
       long l = tg.longValue();
       if ((p0 = p0.g) == null) {
          return 1;
       }
       if ((p0 = p0.longValue() - l) >= 0) {
          i = (!p0)? 0: 1;
       }
       return i;
    }
    public final boolean b(){
       int i;
       ya3 tb = ((tb = this.b) == null)? -1: xa3.a[tb.ordinal()];
       ya3 tg = this.g;
       boolean b = false;
       if (tb != 1) {
          ya3 tf = this.f;
          if (tb != 2) {
             if (tb == 3 || (tb == 4 || (tb == 5 && (tf != null && tg != null)))) {
             label_0037 :
                b = true;
             }
          }else if(tf != null && (this.e != null && tg != null)){
             goto label_0037 ;
          }
       }else if(this.c != null && tg != null){
          goto label_0037 ;
       }
       return b;
    }
    public final void c(){
       if (!this.b()) {
          return;
       }
       b17.E(this.a, this.toString());
       return;
    }
    public final String toString(){
       ya3 tb;
       JSONObject jSONObject;
       String str1;
       ya3 td;
       int i = ((tb = this.b) == null)? -1: xa3.a[tb.ordinal()];
       try{
          String str = "timestamp";
          ya3 tg = this.g;
          if (i != 1) {
             if (i != 2 && (i != 3 && (i != 4 && i != 5))) {
                jSONObject = null;
             }else {
                jSONObject = new JSONObject();
                jSONObject.put("device_os_version", Build$VERSION.RELEASE);
                jSONObject.put("device_model", Build.MODEL);
                if ((td = this.d) != null) {
                   jSONObject.put("app_version", td);
                }
                if (tg != null) {
                   jSONObject.put(str, tg);
                }
                if ((td = this.e) != null) {
                   jSONObject.put("reason", td);
                }
                if ((td = this.f) != null) {
                   jSONObject.put("callstack", td);
                }
                if (tb != null) {
                   jSONObject.put("type", tb);
                }
             }
          }else {
             jSONObject = new JSONObject();
             if ((tb = this.c) != null) {
                jSONObject.put("feature_names", tb);
             }
             if (tg != null) {
                jSONObject.put(str, tg);
             }
          }
       }catch(org.json.JSONException e0){
       }
       if (jSONObject == null) {
          str1 = new JSONObject().toString();
          co5.l(str1, "JSONObject\(\).toString\(\)");
          return str1;
       }else {
          str1 = jSONObject.toString();
          co5.l(str1, "params.toString\(\)");
          return str1;
       }
    }
}
