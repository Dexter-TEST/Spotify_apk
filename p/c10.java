package p.c10;
import android.content.Context;
import p.yy6;
import java.lang.Object;
import java.io.BufferedReader;
import org.json.JSONArray;
import java.lang.String;
import p.pk5;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Long;
import p.ok5;
import android.util.Log;
import java.io.File;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import java.lang.Throwable;
import java.lang.Class;
import org.json.JSONObject;
import java.nio.charset.Charset;

public final class c10	// class@001174 from classes.dex
{
    public final Context a;
    public final yy6 b;

    public void c10(Context p0,yy6 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final byte[] a(BufferedReader p0){
       int i;
       JSONObject jSONObject;
       ok5 ook5;
       File uFile;
       byte[] bytes;
       c10 uoc10 = this;
       JSONArray jSONArray = new JSONArray();
       while (true) {
          String str = p0.readLine();
          i = 0;
          if (str != null) {
             try{
                Matcher matcher = pk5.a.matcher(str);
                int i1 = 1;
                jSONObject = null;
                if (matcher.matches()) {
                   long l = Long.valueOf(matcher.group(i1), 16).longValue();
                   long l1 = Long.valueOf(matcher.group(2), 16).longValue() - l;
                   ok5 matcher1 = new ok5(l, l1, matcher.group(3), matcher.group(4));
                   ook5 = matcher;
                label_0052 :
                   if (ook5 != null) {
                      ok5 d = ook5.d;
                      int i2 = -1;
                      if (ook5.c.indexOf(120) == i2 || d.indexOf(47) == i2) {
                         uFile = 0;
                      }
                      try{
                         if (i1) {
                            uFile = new File(d);
                            if (!uFile.exists()) {
                               c10 a = uoc10.a;
                               if (uFile.getAbsolutePath().startsWith("/data")) {
                                  try{
                                     uFile = new File(a.getPackageManager().getApplicationInfo(a.getPackageName(), i).nativeLibraryDir, uFile.getName());
                                  }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                                     Log.e("FirebaseCrashlytics", "Error getting ApplicationInfo", e0);
                                  }
                               }
                            }
                            uoc10.b.getClass();
                            str = yy6.t(uFile);
                            try{
                               JSONObject jSONObject1 = new JSONObject();
                               jSONObject1.put("base_address", ook5.a);
                               jSONObject1.put("size", ook5.b);
                               jSONObject1.put("name", d);
                               jSONObject1.put("uuid", str);
                               jSONObject = jSONObject1;
                            }catch(org.json.JSONException e0){
                               Log.isLoggable("FirebaseCrashlytics", 3);
                            }
                         }
                      }catch(java.io.IOException e0){
                         Log.isLoggable("FirebaseCrashlytics", 3);
                      }
                   }
                   if (jSONObject != null) {
                      jSONArray.put(jSONObject);
                   }
                }
             }catch(java.lang.Exception e0){
                Log.isLoggable("FirebaseCrashlytics", 3);
             }
             ook5 = jSONObject;
             goto label_0052 ;
          }else {
             break ;
          }
       }
       try{
          JSONObject str1 = new JSONObject();
          str1.put("binary_images", jSONArray);
          bytes = str1.toString().getBytes(Charset.forName("UTF-8"));
       }catch(org.json.JSONException e0){
          bytes = new byte[i];
       }
       return bytes;
    }
}
