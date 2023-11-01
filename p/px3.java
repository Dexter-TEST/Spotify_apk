package p.px3;
import p.v90;
import java.lang.Object;
import p.xg0;
import p.r00;
import java.util.concurrent.atomic.AtomicReference;
import p.t50;
import p.wd0;
import java.lang.String;
import p.co5;
import org.json.JSONObject;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.StringBuilder;
import p.xl0;
import p.sb6;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Locale;
import java.lang.Integer;
import org.json.JSONArray;
import java.lang.Throwable;
import android.content.Context;
import p.ji5;
import android.os.Build$VERSION;
import android.net.TrafficStats;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import java.net.HttpURLConnection;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.Boolean;
import java.lang.Thread;
import java.io.Serializable;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap$CompressFormat;
import android.util.Base64;
import android.os.NetworkOnMainThreadException;
import p.d60;
import java.lang.reflect.Type;
import p.e15;
import p.xk0;
import p.wk0;
import p.ca0;

public final class px3 implements v90	// class@0022ec from classes.dex
{
    public final Object a;

    public void px3(){
       super();
       r00 or00 = new r00();
       or00.a.lazySet(xg0.a);
       this.a = or00;
    }
    public void px3(Object p0){
       this.a = p0;
       super();
    }
    public void px3(t50 p0){
       super();
       this.a = p0;
    }
    public void px3(wd0 p0){
       co5.o(p0, "androidLibsLyricsProperties");
       super();
       this.a = p0;
    }
    public static boolean a(String p0,JSONObject p1){
       boolean b;
       try{
          if (!p1.has("user_data")) {
             p1.put("sdk", "android5.2.7");
          }
          if (!p0.equals("bnc_no_value")) {
             p1.put("branch_key", p0);
             b = true;
          }else {
             b = false;
          }
       }catch(org.json.JSONException e0){
       }
       return b;
    }
    public static String c(InputStream p0){
       String str;
       String str1;
       if (p0 != null) {
          InputStreamReader inputStreamR = new InputStreamReader(p0);
          try{
             BufferedReader uBufferedRea = new BufferedReader(inputStreamR);
             str = "";
             while ((str1 = uBufferedRea.readLine()) != null) {
                str = str.append(str1);
             }
             uBufferedRea.close();
             str = str;
          }catch(java.io.IOException e0){
             str = null;
          }
       }else {
       }
       return str;
    }
    public static sb6 d(xl0 p0,String p1,String p2){
       xl0 c = p0.c;
       p0 = p0.b;
       sb6 osb6 = new sb6(p0);
       if (!TextUtils.isEmpty(p2)) {
          Object[] objArray = new Object[]{p2,Integer.valueOf(p0),c};
          String.format(Locale.getDefault(), "Server returned: [%s] Status: [%d]; Data: %s", objArray);
       }else {
          Object[] objArray1 = new Object[]{c};
          String.format("returned %s", objArray1);
       }
       if (c != null) {
          try{
             osb6.b = new JSONObject(c);
          }catch(org.json.JSONException e0){
             try{
                osb6.b = new JSONArray(e0);
             }catch(org.json.JSONException e6){
                if (p1.contains("qr-code")) {
                   try{
                      JSONObject jSONObject = new JSONObject();
                      jSONObject.put("QRCodeString", e0);
                      osb6.b = jSONObject;
                   }catch(org.json.JSONException e6){
                      e6.getMessage();
                   }
                }else {
                   e6.getMessage();
                }
             }
          }
       }
       return osb6;
    }
    public final xl0 b(String p0,JSONObject p1,int p2){
       HttpURLConnection httpURLConne;
       xl0 oxl0;
       String headerField;
       int responseCode;
       xl0 oxl01;
       px3 opx3 = this;
       String str = p0;
       JSONObject jSONObject = p1;
       int i = p2;
       OutputStreamWriter String str1 = "application/json";
       String str2 = "qr-code";
       px3 a = opx3.a;
       ji5 oji5 = ji5.g(a.d);
       int i1 = oji5.h(5500, "bnc_timeout");
       int i2 = oji5.h(0x2710, "bnc_connect_timeout");
       try{
          jSONObject.put("retryNumber", i);
          int i3 = 8;
          try{
             if (Build$VERSION.SDK_INT >= 26) {
                int i4 = 102;
                TrafficStats.setThreadStatsTag(i4);
             }
             HttpsURLConnection httpsURLConn = new URL(str).openConnection();
             try{
                httpsURLConn.setConnectTimeout(i2);
                httpsURLConn.setReadTimeout(i1);
                httpsURLConn.setDoInput(true);
                httpsURLConn.setDoOutput(true);
                String str3 = "Accept";
                String str4 = "Content-Type";
                if (str.contains(str2)) {
                   httpsURLConn.setRequestProperty(str4, "application/x-www-form-urlencoded");
                   httpsURLConn.setRequestProperty(str3, "image/*");
                }else {
                   httpsURLConn.setRequestProperty(str4, e0);
                   httpsURLConn.setRequestProperty(str3, e0);
                }
                httpsURLConn.setRequestMethod("POST");
                str1 = new OutputStreamWriter(httpsURLConn.getOutputStream());
                str1.write(p1.toString());
                str1.flush();
                str1.close();
                str1 = httpsURLConn.getHeaderField("X-Branch-Request-Id");
                if ((headerField = httpsURLConn.getHeaderField("X-Branch-Send-Close-Request")) != null && a.k == null) {
                   a.k = Boolean.parseBoolean(headerField);
                }
                try{
                   if ((responseCode = httpsURLConn.getResponseCode()) >= 500 && i < oji5.m()) {
                      try{
                         Thread.sleep((long)oji5.n());
                      }catch(java.lang.InterruptedException e0){
                         e0.printStackTrace();
                      }catch(java.io.InterruptedIOException e0){
                      }catch(java.io.IOException e0){
                      }catch(java.io.IOException e0){
                      }
                      int i5 = i + 1;
                      try{
                         httpsURLConn.disconnect();
                         return opx3.b(str, jSONObject, i5);
                      }catch(java.net.SocketTimeoutException e0){
                         i = e0;
                      }catch(java.io.InterruptedIOException e0){
                         i = e0;
                      }catch(java.io.IOException e0){
                         i = e0;
                      }catch(java.lang.Exception e0){
                      }
                      e0.getMessage();
                      oxl0 = new xl0(500, i3, null);
                      if (httpURLConne) {
                         httpURLConne.disconnect();
                      }
                      return oxl0;
                   }else if(responseCode != 200 && httpsURLConn.getErrorStream() != null){
                      oxl01 = new xl0(responseCode, i3, px3.c(httpsURLConn.getErrorStream()));
                   }else if(str.contains(str2)){
                      ByteArrayOutputStream headerField1 = new ByteArrayOutputStream();
                      BitmapFactory.decodeStream(httpsURLConn.getInputStream()).compress(Bitmap$CompressFormat.PNG, 100, headerField1);
                      byte[] uobyteArray = headerField1.toByteArray();
                      oxl01 = new xl0(responseCode, i3, Base64.encodeToString(uobyteArray, 0));
                   }else {
                      oxl01 = new xl0(responseCode, i3, px3.c(httpsURLConn.getInputStream()));
                   }
                }catch(java.io.IOException e0){
                }catch(java.io.IOException e0){
                }
             }catch(java.net.SocketTimeoutException e0){
             }catch(java.io.InterruptedIOException e0){
             }catch(java.io.IOException e0){
             }catch(java.lang.Exception e0){
             }
          }catch(java.net.SocketTimeoutException e0){
             httpURLConne = null;
          }catch(java.io.InterruptedIOException e0){
             httpURLConne = null;
          }catch(java.io.IOException e0){
             httpURLConne = null;
          }catch(java.lang.Exception e0){
             httpURLConne = null;
          }catch(java.net.SocketTimeoutException e0){
             httpURLConne = null;
          }catch(java.io.InterruptedIOException e0){
             httpURLConne = null;
          }catch(java.io.IOException e0){
             httpURLConne = null;
          }
          if (i < oji5.m()) {
             try{
                Thread.sleep((long)oji5.n());
             }catch(java.lang.InterruptedException e0){
                e0.printStackTrace();
             }
             oxl0 = opx3.b(str, jSONObject, (i + true));
             if (httpURLConne) {
                httpURLConne.disconnect();
             }
             return oxl0;
          }else {
             throw new d60(-113);
          }
       }catch(org.json.JSONException e0){
       }
    }
    public final Type g(){
       return this.a;
    }
    public final Object m(e15 p0){
       xk0 oxk0 = new xk0(p0);
       p0.x(new wk0(this, 0, oxk0));
       return oxk0;
    }
}
