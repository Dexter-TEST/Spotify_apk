package p.x61;
import p.d01;
import p.xc6;
import p.r2;
import java.lang.String;
import p.yy6;
import p.az5;
import java.lang.Object;
import p.gs2;
import p.wc6;
import p.u53;
import java.util.HashMap;
import java.lang.Integer;
import p.xj0;
import p.t63;
import java.util.Map;
import java.util.Collections;
import p.ru5;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.io.File;
import android.util.Log;
import java.lang.StringBuilder;
import p.xl0;
import p.mp2;
import p.xe7;
import java.lang.Throwable;
import java.lang.RuntimeException;
import org.json.JSONObject;

public final class x61 extends r2 implements d01, xc6	// class@002c16 from classes.dex
{
    public final int v;
    public final Object w;

    public void x61(String p0,String p1,yy6 p2){
       this.v = 2;
       super(p0, p1, p2, 1, az5.x, 2);
    }
    public void x61(String p0,String p1,yy6 p2,int p3){
       this.v = p3;
       if (p3 != 1) {
          super(p0, p1, p2, 2, "17.2.1", 0);
          return;
       }else {
          super(p0, p1, p2, 2);
          this.w = "17.2.1";
          return;
       }
    }
    public void x61(String p0,String p1,yy6 p2,int p3,Object p4,int p5){
       this.v = p5;
       super(p0, p1, p2, p3);
       this.w = p4;
    }
    public static void c(gs2 p0,wc6 p1){
       x61.d(p0, "X-CRASHLYTICS-GOOGLE-APP-ID", p1.a);
       x61.d(p0, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
       x61.d(p0, "X-CRASHLYTICS-API-CLIENT-VERSION", "17.2.1");
       x61.d(p0, "Accept", "application/json");
       x61.d(p0, "X-CRASHLYTICS-DEVICE-MODEL", p1.b);
       x61.d(p0, "X-CRASHLYTICS-OS-BUILD-VERSION", p1.c);
       x61.d(p0, "X-CRASHLYTICS-OS-DISPLAY-VERSION", p1.d);
       x61.d(p0, "X-CRASHLYTICS-INSTALLATION-ID", p1.e.b());
    }
    public static void d(gs2 p0,String p1,String p2){
       if (p2 != null) {
          p0.b(p1, p2);
       }
       return;
    }
    public static HashMap e(wc6 p0){
       HashMap hashMap = new HashMap();
       hashMap.put("build_version", p0.h);
       hashMap.put("display_version", p0.g);
       hashMap.put("source", Integer.toString(p0.i));
       p0 = p0.f;
       if (!xj0.C0(p0)) {
          hashMap.put("instance", p0);
       }
       return hashMap;
    }
    public final boolean b(t63 p0,boolean p1){
       gs2 ogs2;
       int len;
       boolean b = false;
       String str = "X-CRASHLYTICS-API-CLIENT-VERSION";
       x61 tw = this.w;
       String str1 = "android";
       String str2 = "X-CRASHLYTICS-API-CLIENT-TYPE";
       String str3 = "X-CRASHLYTICS-GOOGLE-APP-ID";
       String str4 = "An invalid data collection token was used.";
       switch (this.v){
           case 0:
             if (p1) {
                ogs2 = this.a(Collections.emptyMap());
                ogs2.b(str3, p0.c);
                ogs2.b(str2, str1);
                ogs2.b(str, tw);
                Iterator iterator = p0.t.a().entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   String key = uEntry.getKey();
                   ogs2.b(key, uEntry.getValue());
                }
                p0 = p0.t;
                ogs2.c("report[identifier]", p0.d());
                if (p0.c().length == 1) {
                   p0.getFileName();
                   p0.d();
                   Log.isLoggable("FirebaseCrashlytics", 3);
                   ogs2.d("report[file]", p0.getFileName(), p0.e());
                }else {
                   File[] uFileArray = p0.c();
                   len = uFileArray.length;
                   int i1 = 0;
                   for (int i = 0; i < len; i = i + 1) {
                      object oobject = uFileArray[i];
                      oobject.getName();
                      p0.d();
                      Log.isLoggable("FirebaseCrashlytics", 3);
                      ogs2.d("report[file".append(i1).append("]").toString(), oobject.getName(), oobject);
                      i1 = i1 + 1;
                   }
                }
                try{
                   Log.isLoggable("FirebaseCrashlytics", 3);
                   xl0 oxl0 = ogs2.a();
                   oxl0.t.a("X-REQUEST-ID");
                   Log.isLoggable("FirebaseCrashlytics", 3);
                   Log.isLoggable("FirebaseCrashlytics", 3);
                   if (!xe7.Q(oxl0.b)) {
                      b = true;
                   }
                }catch(java.io.IOException e13){
                   Log.e("FirebaseCrashlytics", "Create report HTTP request failed.", e13);
                   throw new RuntimeException(e13);
                }
             }else {
                throw new RuntimeException(str4);
             }
             break;
           default:
             if (!p1) {
                throw new RuntimeException(str4);
             }
             ogs2 = this.a(Collections.emptyMap());
             ogs2.b("User-Agent", "Crashlytics Android SDK/17.2.1");
             ogs2.b(str2, str1);
             ogs2.b(str, tw);
             ogs2.b(str3, p0.c);
             t63 b1 = p0.b;
             p0 = p0.t;
             if (b1 != null) {
                ogs2.c("org_id", b1);
             }
             ogs2.c("report_id", p0.d());
             File[] uFileArray1 = p0.c();
             int len1 = uFileArray1.length;
             len = 0;
             while (len < len1) {
                object oobject1 = uFileArray1[len];
                if (oobject1.getName().equals("minidump")) {
                   ogs2.d("minidump_file", oobject1.getName(), oobject1);
                }else if(oobject1.getName().equals("metadata")){
                   ogs2.d("crash_meta_file", oobject1.getName(), oobject1);
                }else if(oobject1.getName().equals("binaryImages")){
                   ogs2.d("binary_images_file", oobject1.getName(), oobject1);
                }else if(oobject1.getName().equals("session")){
                   ogs2.d("session_meta_file", oobject1.getName(), oobject1);
                }else if(oobject1.getName().equals("app")){
                   ogs2.d("app_meta_file", oobject1.getName(), oobject1);
                }else if(oobject1.getName().equals("device")){
                   ogs2.d("device_meta_file", oobject1.getName(), oobject1);
                }else if(oobject1.getName().equals("os")){
                   ogs2.d("os_meta_file", oobject1.getName(), oobject1);
                }else if(oobject1.getName().equals("user")){
                   ogs2.d("user_meta_file", oobject1.getName(), oobject1);
                }else if(oobject1.getName().equals("logs")){
                   ogs2.d("logs_file", oobject1.getName(), oobject1);
                }else if(oobject1.getName().equals("keys")){
                   ogs2.d("keys_file", oobject1.getName(), oobject1);
                }
                len = len + 1;
             }
             try{
                Log.isLoggable("FirebaseCrashlytics", 3);
                Log.isLoggable("FirebaseCrashlytics", 3);
                if (!xe7.Q(ogs2.a().b)) {
                   b = true;
                }
                return b;
             }catch(java.io.IOException e13){
                throw new RuntimeException(e13);
             }
       }
       return b;
    }
    public final JSONObject f(xl0 p0){
       xl0 b = p0.b;
       x61 tw = this.w;
       tw.u(3);
       b = (b != 200 && (b != 201 && (b != 202 && b != 203)))? 0: 1;
       Throwable throwable = null;
       if (b) {
          p0 = p0.c;
          try{
             throwable = new JSONObject(p0);
          }catch(java.lang.Exception e0){
             tw.u(3);
             tw.u(3);
          }
       }else {
          String str = "Failed to retrieve settings from "+this.a;
          if (tw.u(6)) {
             Log.e("FirebaseCrashlytics", str, throwable);
          }
       }
       return throwable;
    }
}
