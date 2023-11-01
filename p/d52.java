package p.d52;
import java.lang.String;
import java.util.regex.Pattern;
import java.nio.charset.Charset;
import android.content.Context;
import p.q81;
import p.h71;
import java.lang.Object;
import java.net.URL;
import p.h52;
import java.lang.Throwable;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.en6;
import java.util.regex.Matcher;
import p.w51;
import java.lang.Long;
import p.pt;
import java.net.URLConnection;
import android.util.JsonReader;
import p.nq5;
import p.o11;
import p.wv;
import p.qa3;
import p.y57;
import org.json.JSONObject;
import java.lang.IllegalStateException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.IOException;
import java.lang.System;
import p.pp2;
import java.util.Set;
import p.hj2;
import p.a70;
import p.bs7;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.security.MessageDigest;
import android.content.pm.Signature;
import android.util.Log;
import p.tu6;

public final class d52	// class@0012de from classes.dex
{
    public final Context a;
    public final q81 b;
    public final h71 c;
    public static final Pattern d;
    public static final Charset e;

    static {
       d52.d = Pattern.compile("[0-9]+s");
       d52.e = Charset.forName("UTF-8");
    }
    public void d52(Context p0,q81 p1,h71 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static URL a(String p0){
       try{
          Object[] objArray = new Object[]{"firebaseinstallations.googleapis.com","v1",p0};
          return new URL(String.format("https://%s/%s/%s", objArray));
       }catch(java.net.MalformedURLException e5){
          throw new h52(e5.getMessage());
       }
    }
    public static void b(HttpURLConnection p0,String p1,String p2,String p3){
       String str1;
       try{
          InputStream errorStream = p0.getErrorStream();
          CharSequence uCharSequenc = null;
          if (errorStream == null) {
          }else {
             InputStreamReader inputStreamR = new InputStreamReader(errorStream, d52.e);
             BufferedReader uBufferedRea = new BufferedReader(inputStreamR);
             StringBuilder str = "";
             while ((str1 = uBufferedRea.readLine()) != null) {
                str = str.append(str1).append(10);
             }
             Object[] objArray1 = new Object[]{Integer.valueOf(p0.getResponseCode()),p0.getResponseMessage(),str};
             uCharSequenc = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", objArray1);
             try{
                uBufferedRea.close();
             }catch(java.io.IOException e0){
             }
          }
          if (!TextUtils.isEmpty(uCharSequenc)) {
             Object[] objArray = new Object[3];
             objArray[0] = p2;
             objArray[1] = p3;
             p1 = (TextUtils.isEmpty(p1))? "": en6.n(", ", p1);
             objArray[2] = p1;
             String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArray);
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static long d(String p0){
       w51.d("Invalid Expiration Timestamp.", d52.d.matcher(p0).matches());
       long l = (p0 != null && p0.length())? Long.parseLong(p0.substring(0, (p0.length() - 1))): 0;
       return l;
    }
    public static pt e(HttpURLConnection p0){
       InputStream inputStream = p0.getInputStream();
       JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, d52.e));
       nq5 onq5 = new nq5(6);
       onq5.b = Long.valueOf(0);
       o11 oo11 = new o11(11);
       jsonReader.beginObject();
       while (jsonReader.hasNext()) {
          String str = jsonReader.nextName();
          if (str.equals("name")) {
             oo11.b = jsonReader.nextString();
          }else if(str.equals("fid")){
             oo11.c = jsonReader.nextString();
          }else if(str.equals("refreshToken")){
             oo11.t = jsonReader.nextString();
          }else if(str.equals("authToken")){
             jsonReader.beginObject();
             while (jsonReader.hasNext()) {
                str = jsonReader.nextName();
                if (str.equals("token")) {
                   onq5.a = jsonReader.nextString();
                }else if(str.equals("expiresIn")){
                   onq5.b = Long.valueOf(d52.d(jsonReader.nextString()));
                   continue ;
                }else {
                   jsonReader.skipValue();
                   continue ;
                }
             }
             oo11.v = onq5.b();
             jsonReader.endObject();
          }else {
             jsonReader.skipValue();
          }
       }
       jsonReader.endObject();
       jsonReader.close();
       inputStream.close();
       oo11.w = qa3.a;
       return oo11.j();
    }
    public static wv f(HttpURLConnection p0){
       InputStream inputStream = p0.getInputStream();
       JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, d52.e));
       nq5 onq5 = new nq5(6);
       onq5.b = Long.valueOf(0);
       jsonReader.beginObject();
       while (jsonReader.hasNext()) {
          String str = jsonReader.nextName();
          if (str.equals("token")) {
             onq5.a = jsonReader.nextString();
          }else if(str.equals("expiresIn")){
             onq5.b = Long.valueOf(d52.d(jsonReader.nextString()));
          }else {
             jsonReader.skipValue();
          }
       }
       jsonReader.endObject();
       jsonReader.close();
       inputStream.close();
       onq5.c = y57.a;
       return onq5.b();
    }
    public static void g(HttpURLConnection p0,String p1,String p2){
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("fid", p1);
          jSONObject.put("appId", p2);
          jSONObject.put("authVersion", "FIS_v2");
          jSONObject.put("sdkVersion", "a:16.3.3");
          d52.i(p0, jSONObject.toString().getBytes("UTF-8"));
          return;
       }catch(org.json.JSONException e2){
          throw new IllegalStateException(e2);
       }
    }
    public static void h(HttpURLConnection p0){
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("sdkVersion", "a:16.3.3");
          JSONObject jSONObject1 = new JSONObject();
          jSONObject1.put("installation", jSONObject);
          String str = jSONObject1.toString();
          d52.i(p0, str.getBytes("UTF-8"));
          return;
       }catch(org.json.JSONException e3){
          throw new IllegalStateException(e3);
       }
    }
    public static void i(URLConnection p0,byte[] p1){
       OutputStream outputStream;
       if ((outputStream = p0.getOutputStream()) == null) {
          throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
       }
       GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(outputStream);
       try{
          gZIPOutputSt.write(p1);
          gZIPOutputSt.close();
          outputStream.close();
          return;
       }catch(java.io.IOException e0){
       }
    }
    public final HttpURLConnection c(URL p0,String p1){
       int i2;
       d52 tb;
       PackageInfo signatures;
       MessageDigest instance;
       byte[] uobyteArray;
       try{
          HttpURLConnection httpURLConne = p0.openConnection();
          httpURLConne.setConnectTimeout(0x2710);
          boolean b = false;
          httpURLConne.setUseCaches(b);
          httpURLConne.setReadTimeout(0x2710);
          httpURLConne.addRequestProperty("Content-Type", "application/json");
          httpURLConne.addRequestProperty("Accept", "application/json");
          httpURLConne.addRequestProperty("Content-Encoding", "gzip");
          httpURLConne.addRequestProperty("Cache-Control", "no-cache");
          httpURLConne.addRequestProperty("X-Android-Package", this.a.getPackageName());
          d52 tc = this.c;
          int i = 2;
          int i1 = 1;
          if (tc != null && this.b != null) {
             long l = System.currentTimeMillis();
             boolean b1 = tc.a.a("fire-installations-id", l);
             h71 a = tc.a;
             _monitor_enter(a);
             boolean b2 = a.a("fire-global", l);
             _monitor_exit(a);
             if (b1 && b2) {
                i2 = 4;
             }else if(b2){
                i2 = 3;
             }else if(b1){
                i2 = 2;
             }else {
                i2 = 1;
             }
             if (i2 != i1) {
                String str = "x-firebase-client";
                tb = this.b;
                q81 b3 = tb.b;
                q81 a1 = tb.a;
                if (!b3.b().isEmpty()) {
                   a1 = a1+' '+q81.a(b3.b());
                }
                httpURLConne.addRequestProperty(str, a1);
                httpURLConne.addRequestProperty("x-firebase-client-log-type", Integer.toString(en6.A(i2)));
             }
          }
          String str1 = "X-Android-Cert";
          tb = this.a;
          String str2 = null;
          try{
             String str3 = "SHA1";
             PackageInfo packageInfo = bs7.a(tb).a.getPackageManager().getPackageInfo(tb.getPackageName(), 64);
             if ((signatures = packageInfo.signatures) != null && signatures.length == i1) {
                i1 = 0;
                while (true) {
                   if (i1 < i) {
                      try{
                         if ((instance = MessageDigest.getInstance(str3)) != null) {
                         label_00e0 :
                            if (instance != null) {
                               uobyteArray = instance.digest(packageInfo.signatures[b].toByteArray());
                            label_00f0 :
                               if (uobyteArray == null) {
                                  Log.e("ContentValues", "Could not get fingerprint hash for package: "+tb.getPackageName());
                                  break ;
                               }else {
                                  i1 = uobyteArray.length;
                                  StringBuilder str4 = new StringBuilder((i1 << 1));
                                  for (; b < i1; b = b + 1) {
                                     char[] g = tu6.G;
                                     int i3 = uobyteArray[b] & 0x00f0;
                                     i3 = i3 >> 4;
                                     i3 = uobyteArray[b] & 0x0f;
                                     str4 = str4.append(g[i3]).append(g[i3]);
                                  }
                                  str2 = str4;
                               }
                            }else {
                            label_00ef :
                               uobyteArray = str2;
                               goto label_00f0 ;
                            }
                         }else {
                            i1 = i1 + 1;
                         }
                      }catch(java.security.NoSuchAlgorithmException e0){
                      }
                   }else {
                      instance = str2;
                      goto label_00e0 ;
                   }
                }
             }else {
                goto label_00ef ;
             }
          }catch(android.content.pm.PackageManager$NameNotFoundException e1){
             Log.e("ContentValues", "No such package: "+tb.getPackageName(), e1);
          }
          httpURLConne.addRequestProperty(str1, str2);
          httpURLConne.addRequestProperty("x-goog-api-key", p1);
          return httpURLConne;
       }catch(java.io.IOException e0){
          throw new h52("Firebase Installations Service is unavailable. Please try again later.");
       }
    }
}
