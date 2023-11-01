package p.az5;
import p.ny;
import p.su0;
import p.cg7;
import p.vu0;
import p.mz0;
import p.u46;
import p.w00;
import p.yf2;
import p.qw6;
import p.rg2;
import p.tr3;
import p.xr3;
import p.cx7;
import java.lang.Object;
import p.wq0;
import p.vk3;
import java.lang.ref.WeakReference;
import java.lang.Class;
import p.cq0;
import java.io.InputStream;
import java.net.HttpURLConnection;
import p.wm2;
import java.util.ArrayList;
import java.lang.String;
import p.ej4;
import p.fs3;
import p.ns3;
import p.sz1;
import org.json.JSONTokener;
import p.co5;
import p.tm2;
import org.json.JSONObject;
import org.json.JSONArray;
import p.xm2;
import p.oz1;
import java.lang.Exception;
import p.ny1;
import java.util.Collection;
import p.eo5;
import java.net.URLConnection;
import android.util.Log;
import java.lang.Throwable;
import java.util.List;
import java.io.Closeable;
import p.i3;
import java.util.Date;
import p.a3;
import p.j3;
import android.os.Looper;
import android.os.Handler;
import p.ij;
import java.lang.Runnable;
import java.util.Locale;
import java.lang.Integer;
import java.util.Arrays;
import p.vl5;
import p.ml5;
import p.i70;
import p.bf7;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import p.qm2;
import java.lang.Boolean;
import java.lang.Number;
import p.om2;
import android.os.Bundle;
import p.fs2;
import p.z91;
import p.pm2;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p.av6;
import java.util.Iterator;
import p.kg4;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import android.util.Pair;
import java.util.HashMap;
import p.rm2;
import java.util.Set;
import java.util.Map$Entry;
import p.nm2;
import java.util.AbstractCollection;
import android.os.BaseBundle;
import java.lang.Enum;
import java.net.URL;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import p.vm2;
import java.io.FilterOutputStream;
import java.util.AbstractList;
import p.mj7;
import java.lang.Iterable;
import android.text.TextUtils;
import p.sm2;
import p.yp;
import p.cq;
import android.content.Context;
import p.wq3;
import p.zp;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.Intent;
import com.facebook.AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;
import android.os.Parcelable;
import java.lang.StringBuilder;
import com.spotify.base.java.logging.Logger;
import com.spotify.clientfoundations.cosmos.cosmos.Response;
import p.yt5;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import p.aj0;
import java.lang.NullPointerException;
import p.vh4;
import p.qz1;
import p.h22;
import p.f22;
import p.pp2;
import p.nl5;
import p.xq7;
import android.graphics.drawable.Drawable;
import p.cz5;
import androidx.cardview.widget.CardView;
import android.graphics.Rect;
import p.dz5;
import java.lang.Math;
import p.fv5;
import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import p.uj0;
import p.vv7;
import java.lang.Long;
import p.jc7;
import java.lang.Thread;
import p.pw6;
import p.rw6;
import p.sf2;
import p.kd3;
import p.ph3;
import android.util.JsonReader;
import p.nz0;
import p.li5;
import android.util.Base64;
import p.zr;
import p.kg3;
import android.graphics.Color;
import android.widget.ScrollView;
import android.animation.ObjectAnimator;
import p.dg1;
import android.animation.TimeInterpolator;
import android.animation.Animator;

public final class az5 implements ny, su0, cg7, vu0, mz0, u46, w00, yf2, qw6, rg2, tr3, xr3, cx7	// class@001022 from classes.dex
{
    public static rp5 A;
    public static final az5 B;
    public static az5 a;
    public static final az5 b;
    public static final az5 c;
    public static final az5 t;
    public static final az5 v;
    public static final az5 w;
    public static final az5 x;
    public static final az5 y;
    public static final az5 z;

    static {
       az5.b = new az5();
       az5.c = new az5();
       az5.t = new az5();
       az5.v = new az5();
       az5.w = new az5();
       az5.x = new az5();
       az5.y = new az5();
       az5.z = new az5();
       az5.B = new az5();
    }
    public void az5(){
       super();
    }
    public void az5(int p0){
       super();
    }
    public void az5(wq0 p0,vk3 p1){
       super();
       WeakReference weakReferenc = new WeakReference(p0);
       p1.getClass();
       vk3.n(p0.I);
       vk3.n(p0.J);
       vk3.n(p0.K);
       vk3.n(p0.L);
       vk3.n(p0.M);
    }
    public static ArrayList A(InputStream p0,HttpURLConnection p1,wm2 p2){
       JSONArray jSONArray;
       int i2;
       tm2 otm21;
       sz1.i(ns3.c);
       p0 = new JSONTokener(ej4.J0(p0)).nextValue();
       co5.l(p0, "resultObject");
       int i = p2.size();
       ArrayList uArrayList = new ArrayList(i);
       int i1 = 0;
       if (i == 1) {
          tm2 otm2 = p2.get(i1);
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("body", p0);
             jSONObject.put("code", p1.getResponseCode());
             jSONArray = new JSONArray();
             jSONArray.put(jSONObject);
          label_0066 :
             if (jSONArray instanceof JSONArray) {
                JSONArray jSONArray1 = jSONArray;
                if (jSONArray1.length() == i) {
                   if ((i = jSONArray1.length()) > 0) {
                      while (true) {
                         i2 = i1 + 1;
                         otm21 = p2.get(i1);
                         break ;
                      }
                      try{
                         Object obj = jSONArray.get(i1);
                         co5.l(obj, "obj");
                         uArrayList.add(az5.z(otm21, p1, obj, p0));
                      }catch(org.json.JSONException e2){
                         uArrayList.add(new xm2(otm21, p1, new oz1(e2)));
                      }catch(p.ny1 e2){
                         uArrayList.add(new xm2(otm21, p1, new oz1(e2)));
                      }
                      if (i2 < i) {
                         i1 = i2;
                      }
                   }
                   sz1.i(ns3.a);
                   return uArrayList;
                }
             }
             throw new ny1("Unexpected number of results");
          }catch(org.json.JSONException e4){
             uArrayList.add(new xm2(otm2, p1, new oz1(e4)));
          }catch(java.io.IOException e4){
             uArrayList.add(new xm2(otm2, p1, new oz1(e4)));
          }
       }
       jSONArray = p0;
       goto label_0066 ;
    }
    public static ArrayList B(wm2 p0){
       int i;
       HttpURLConnection httpURLConne;
       Throwable throwable;
       Closeable uCloseable;
       ArrayList uArrayList;
       i3 c;
       Throwable throwable1;
       eo5.B(p0);
       try{
          i = 0;
          httpURLConne = az5.W(p0);
          throwable = i;
       }catch(java.lang.Exception e1){
          throwable = e1;
          httpURLConne = i;
       }
       if (httpURLConne != null) {
          ns3 a = ns3.a;
          try{
             if (sz1.g()) {
                uCloseable = (httpURLConne.getResponseCode() >= 400)? httpURLConne.getErrorStream(): httpURLConne.getInputStream();
                try{
                   uArrayList = az5.A(uCloseable, httpURLConne, p0);
                label_0064 :
                   ej4.l(uCloseable);
                   ej4.u(httpURLConne);
                   int i1 = p0.size();
                   int i2 = 0;
                   if (i1 == uArrayList.size()) {
                      az5.R(p0, uArrayList);
                      i3 oi3 = i3.f.F();
                      if ((c = oi3.c) != null) {
                         long time = new Date().getTime();
                         if (c.w.a != null && (((time - oi3.e.getTime()) - 0x36ee80) > 0 && ((time - c.x.getTime()) - 0x5265c00) > 0)) {
                            i2 = 1;
                         }
                      }
                      if (i2) {
                         if (co5.c(Looper.getMainLooper(), Looper.myLooper())) {
                            oi3.a();
                         }else {
                            new Handler(Looper.getMainLooper()).post(new ij(oi3, 11, i));
                         }
                      }
                   }else {
                      Object[] objArray = new Object[]{Integer.valueOf(uArrayList.size()),Integer.valueOf(i1)};
                      String str = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(objArray, 2));
                      co5.l(str, "java.lang.String.format\(locale, format, *args\)");
                      throw new ny1(str);
                   }
                }catch(p.ny1 e4){
                }catch(java.lang.Exception e4){
                }
                sz1.i(a);
                uArrayList = az5.w(p0, httpURLConne, new ny1(throwable1));
                goto label_0064 ;
             }else {
                Log.e("p.xm2", "GraphRequest can\'t be used when Facebook SDK isn\'t fully initialized");
                throw new ny1("GraphRequest can\'t be used when Facebook SDK isn\'t fully initialized");
             }
          }catch(p.ny1 e3){
             ny1 ony1 = e3;
             uCloseable = i;
          }catch(java.lang.Exception e3){
             throwable1 = e3;
             uCloseable = i;
          }
       }else {
          uArrayList = az5.w(p0.c, i, new ny1(throwable));
          az5.R(p0, uArrayList);
       }
       ej4.u(httpURLConne);
       return uArrayList;
    }
    public static void C(){
       a3 uoa3;
       if ((uoa3 = az5.D()) == null) {
          return;
       }
       if (!az5.J()) {
          vl5.d.G().a(null, true);
          return;
       }else {
          ej4.C(new i70(), uoa3.v);
          return;
       }
    }
    public static a3 D(){
       return i3.f.F().c;
    }
    public static synchronized az5 H(){
       _monitor_enter(az5.class);
       if (az5.a == null) {
          az5.a = new az5();
       }
       _monitor_exit(az5.class);
       return az5.a;
    }
    public static String I(String p0,JSONObject p1){
       if (p1.has(p0)) {
          return p1.getString(p0);
       }
       return null;
    }
    public static boolean J(){
       i3 c;
       boolean b = ((c = i3.f.F().c) != null && !new Date().after(c.a))? true: false;
       return b;
    }
    public static boolean K(Object p0){
       boolean b = (!p0 instanceof Bitmap && (!p0 instanceof byte[] && (!p0 instanceof Uri && (!p0 instanceof ParcelFileDescriptor && !p0 instanceof qm2))))? false: true;
       return b;
    }
    public static boolean L(Object p0){
       boolean b = (!p0 instanceof String && (!p0 instanceof Boolean && (!p0 instanceof Number && !p0 instanceof Date)))? false: true;
       return b;
    }
    public static tm2 M(a3 p0,String p1,om2 p2){
       tm2 v7 = new tm2(p0, p1, null, null, p2, 32);
       return v7;
    }
    public static tm2 N(a3 p0,String p1,JSONObject p2,om2 p3){
       tm2 v7 = new tm2(p0, p1, null, fs2.b, p3, 32);
       v7.c = p2;
       return v7;
    }
    public static tm2 O(String p0,Bundle p1,z91 p2){
       tm2 v7 = new tm2(null, p0, p1, fs2.b, p2, 32);
       return v7;
    }
    public static void P(JSONObject p0,String p1,pm2 p2){
       String str;
       int i1;
       Matcher matcher = tm2.k.matcher(p1);
       if (matcher.matches()) {
          str = matcher.group(1);
          co5.l(str, "matcher.group\(1\)");
       }else {
          str = p1;
       }
       Iterator iterator = (!av6.D0(str, "me/", false) && !av6.D0(str, "/me/", false))? 0: 1;
       if (str) {
          int i = av6.n0(p1, ":", false, false, 6);
          i1 = av6.n0(p1, "?", false, false, 6);
          if (i > 3 && (i1 == -1 && i >= i1)) {
             i1 = 1;
          label_0047 :
             iterator = p0.keys();
             while (iterator.hasNext()) {
                String str1 = iterator.next();
                Object obj = p0.opt(str1);
                boolean b = (i1 && av6.i0(str1, "image", 1))? true: false;
                co5.l(str1, "key");
                co5.l(obj, "value");
                az5.Q(str1, obj, p2, b);
             }
             return;
          }
       }
       i1 = 0;
       goto label_0047 ;
    }
    public static void Q(String p0,Object p1,pm2 p2,boolean p3){
       Object obj;
       int i;
       Class class = p1.getClass();
       if (JSONObject.class.isAssignableFrom(class)) {
          if (p3) {
             Iterator iterator = p1.keys();
             while (iterator.hasNext()) {
                String str = iterator.next();
                Object[] objArray = new Object[]{p0,str};
                obj = p1.opt(str);
                co5.l(obj, "jsonObject.opt\(propertyName\)");
                az5.Q(kg4.q(objArray, 2, "%s[%s]", "java.lang.String.format\(format, *args\)"), obj, p2, p3);
             }
          }else {
             String str1 = "id";
             if (p1.has(str1)) {
                p1 = p1.optString(str1);
                co5.l(p1, "jsonObject.optString\(\"id\"\)");
                az5.Q(p0, p1, p2, p3);
             }else {
                str1 = "url";
                if (p1.has(str1)) {
                   p1 = p1.optString(str1);
                   co5.l(p1, "jsonObject.optString\(\"url\"\)");
                   az5.Q(p0, p1, p2, p3);
                }else if(p1.has("fbsdk:create_object")){
                   p1 = p1.toString();
                   co5.l(p1, "jsonObject.toString\(\)");
                   az5.Q(p0, p1, p2, p3);
                }
             }
          }
       }else if(JSONArray.class.isAssignableFrom(class)){
          if ((i = p1.length()) > 0) {
             int i1 = 0;
             while (true) {
                int i2 = i1 + 1;
                Object[] objArray1 = new Object[]{p0,Integer.valueOf(i1)};
                String str2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(objArray1, 2));
                co5.l(str2, "java.lang.String.format\(locale, format, *args\)");
                obj = p1.opt(i1);
                co5.l(obj, "jsonArray.opt\(i\)");
                az5.Q(str2, obj, p2, p3);
                if (i2 < i) {
                   i1 = i2;
                }
             }
          }
       }else if(!String.class.isAssignableFrom(class) && (!Number.class.isAssignableFrom(class) && !Boolean.class.isAssignableFrom(class))){
          if (Date.class.isAssignableFrom(class)) {
             p1 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ssZ", Locale.US).format(p1);
             co5.l(p1, "iso8601DateFormat.format\(date\)");
             p2.a(p0, p1);
          }else {
             HashSet a = sz1.a;
          }
       }else {
          p2.a(p0, p1.toString());
       }
       return;
    }
    public static void R(wm2 p0,ArrayList p1){
       int i = p0.size();
       ArrayList uArrayList = new ArrayList();
       if (i > 0) {
          int i1 = 0;
          while (true) {
             int i2 = i1 + 1;
             tm2 otm2 = p0.c.get(i1);
             if (otm2.g != null) {
                uArrayList.add(new Pair(otm2.g, p1.get(i1)));
                break ;
             }else if(i2 >= i){
                i1 = i2;
             }
          }
       }
       if (uArrayList.size() > 0) {
          ij oij = new ij(uArrayList, 13, p0);
          int i3 = ((p0 = p0.a) == null)? 0: Boolean.valueOf(p0.post(oij));
          if (i3 == null) {
             oij.run();
          }
       }
       return;
    }
    public static void S(HashMap p0,rm2 p1){
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (az5.K(uEntry.getValue().b)) {
             p1.g(uEntry.getKey(), uEntry.getValue().b, uEntry.getValue().a);
          }
       }
       return;
    }
    public static void T(wm2 p0,HttpURLConnection p1){
       tm2 otm2;
       boolean b1;
       HashMap hashMap;
       String str1;
       String str2;
       String obj;
       tm2 d;
       JSONObject obj1;
       a3 y;
       tm2 a;
       tm2 c;
       wm2 owm2 = p0;
       HttpURLConnection httpURLConne = p1;
       fs3 uofs3 = new fs3();
       int i = p0.size();
       Iterator iterator = p0.iterator();
       while (true) {
          boolean b = true;
          ArrayList int i1 = 0;
          if (iterator.hasNext()) {
             otm2 = iterator.next();
             Iterator iterator1 = otm2.d.keySet().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   if (az5.K(otm2.d.get(iterator1.next()))) {
                      b1 = false;
                      break ;
                   }
                }else {
                   continue ;
                }
             }
          }else {
             b1 = true;
          }
          otm2 = 0;
          tm2 h = (i == b)? owm2.c.get(i1).h: otm2;
          fs2 b2 = fs2.b;
          if (h == null) {
             h = b2;
          }
          httpURLConne.setRequestMethod(h.name());
          String str = "Content-Type";
          if (b1) {
             httpURLConne.setRequestProperty(str, "application/x-www-form-urlencoded");
             httpURLConne.setRequestProperty("Content-Encoding", "gzip");
          }else {
             Object[] objArray3 = new Object[b];
             objArray3[i1] = tm2.j;
             String str4 = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(objArray3, b));
             co5.l(str4, "java.lang.String.format\(format, *args\)");
             httpURLConne.setRequestProperty(str, str4);
          }
          URL uRL = p1.getURL();
          uofs3.c();
          uofs3.a(owm2.b, "Id");
          co5.l(uRL, "url");
          uofs3.a(uRL, "URL");
          String requestMetho = p1.getRequestMethod();
          co5.l(requestMetho, "connection.requestMethod");
          uofs3.a(requestMetho, "Method");
          String requestPrope = httpURLConne.getRequestProperty("User-Agent");
          co5.l(requestPrope, "connection.getRequestProperty\(\"User-Agent\"\)");
          uofs3.a(requestPrope, "User-Agent");
          requestMetho = httpURLConne.getRequestProperty(str);
          co5.l(requestMetho, "connection.getRequestProperty\(\"Content-Type\"\)");
          uofs3.a(requestMetho, str);
          httpURLConne.setConnectTimeout(i1);
          httpURLConne.setReadTimeout(i1);
          h = (h == b2)? 1: 0;
          if (!h) {
             uofs3.b();
             return;
          }else {
             httpURLConne.setDoOutput(b);
             BufferedOutputStream uBufferedOut = new BufferedOutputStream(p1.getOutputStream());
             GZIPOutputStream gZIPOutputSt = (b1)? new GZIPOutputStream(uBufferedOut): uBufferedOut;
             Iterator iterator2 = owm2.t.iterator();
             while (iterator2.hasNext()) {
                vm2 ovm2 = iterator2.next();
             }
             iterator2 = p0.iterator();
             while (iterator2.hasNext()) {
                h = iterator2.next().g;
             }
             rm2 orm2 = new rm2(gZIPOutputSt, uofs3, b1);
             if (i == b) {
                tm2 otm21 = owm2.c.get(i1);
                hashMap = new HashMap();
                iterator = otm21.d.keySet().iterator();
                while (true) {
                   str1 = "key";
                   if (iterator.hasNext()) {
                      str2 = iterator.next();
                      obj = otm21.d.get(str2);
                      if (az5.K(obj)) {
                         co5.l(str2, str1);
                         hashMap.put(str2, new nm2(otm21, obj));
                      }
                   }else {
                      break ;
                   }
                }
                uofs3.c();
                d = otm21.d;
                Iterator iterator3 = d.keySet().iterator();
                while (iterator3.hasNext()) {
                   obj = iterator3.next();
                   obj1 = d.get(obj);
                   if (az5.L(obj1)) {
                      co5.l(obj, str1);
                      orm2.g(obj, obj1, otm21);
                   }
                }
                uofs3.c();
                az5.S(hashMap, orm2);
                if ((otm21 = otm21.c) != null) {
                   String path = uRL.getPath();
                   co5.l(path, "url.path");
                   az5.P(otm21, path, orm2);
                }
             }else {
                Iterator iterator4 = p0.iterator();
                while (true) {
                   if (iterator4.hasNext()) {
                      if ((d = iterator4.next().a) != null) {
                         y = d.y;
                      }
                   }else {
                      y = sz1.b();
                   }
                   d = (!y.length())? 1: 0;
                   if (!d) {
                      orm2.a("batch_app_id", y);
                      hashMap = new HashMap();
                      JSONArray jSONArray = new JSONArray();
                      Iterator iterator5 = p0.iterator();
                      while (iterator5.hasNext()) {
                         h = iterator5.next();
                         h.getClass();
                         obj1 = new JSONObject();
                         Object[] objArray = new Object[b];
                         objArray[i1] = sz1.e();
                         str = String.format("https://graph.%s", Arrays.copyOf(objArray, b));
                         co5.l(str, "java.lang.String.format\(format, *args\)");
                         h.a();
                         Uri uri = Uri.parse(h.b(h.h(str), b));
                         Object[] objArray1 = new Object[2];
                         objArray1[i1] = uri.getPath();
                         objArray1[b] = uri.getQuery();
                         str = String.format("%s?%s", Arrays.copyOf(objArray1, 2));
                         co5.l(str, "java.lang.String.format\(format, *args\)");
                         obj1.put("relative_url", str);
                         obj1.put("method", h.h);
                         if ((a = h.a) != null) {
                            mj7 d1 = fs3.d;
                            a3 v = a.v;
                            _monitor_enter(d1);
                            co5.o(v, "accessToken");
                            sz1.i(ns3.b);
                            d1.o(v);
                            _monitor_exit(d1);
                         }
                         ArrayList uArrayList = new ArrayList();
                         Iterator iterator6 = h.d.keySet().iterator();
                         while (iterator6.hasNext()) {
                            Object obj2 = h.d.get(iterator6.next());
                            if (az5.K(obj2)) {
                               Object[] objArray2 = new Object[2];
                               objArray2[i1] = "file";
                               objArray2[1] = Integer.valueOf(hashMap.size());
                               str2 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(objArray2, 2));
                               co5.l(str2, "java.lang.String.format\(locale, format, *args\)");
                               uArrayList.add(str2);
                               hashMap.put(str2, new nm2(h, obj2));
                               str1 = 0;
                            }else {
                               continue ;
                            }
                         }
                         if (!uArrayList.isEmpty()) {
                            obj1.put("attached_files", TextUtils.join(",", uArrayList));
                         }
                         if ((c = h.c) != null) {
                            i1 = new ArrayList();
                            az5.P(c, str, new sm2(i1));
                            str2 = TextUtils.join("&", i1);
                            obj1.put("body", str2);
                         }
                         jSONArray.put(obj1);
                         b = 1;
                         i1 = 0;
                      }
                      String str3 = jSONArray.toString();
                      co5.l(str3, "requestJsonArray.toString\(\)");
                      orm2.a("batch", str3);
                      uofs3.c();
                      az5.S(hashMap, orm2);
                   }else {
                      throw new ny1("App ID was not specified at the request or Settings.");
                   }
                }
             }
             gZIPOutputSt.close();
             uofs3.b();
             return;
          }
       }
    }
    public static void U(yp p0){
       cq e;
       cq uocq;
       az5 d = cq.d;
       if ((e = cq.e) == null) {
          _monitor_enter(d);
          if ((e = cq.e) == null) {
             wq3 owq3 = wq3.a(sz1.a());
             co5.l(owq3, "getInstance\(applicationContext\)");
             uocq = new cq(owq3, new zp());
             cq.e = uocq;
             e = uocq;
          }
          _monitor_exit(d);
       }
       cq c = e.c;
       e.c = p0;
       String str = "com.facebook.AuthenticationManager.CachedAuthenticationToken";
       uocq = e.b;
       if (p0 != null) {
          try{
             uocq.getClass();
             uocq.a.edit().putString(str, p0.a().toString()).apply();
          }catch(org.json.JSONException e0){
          }
       }else {
          uocq.a.edit().remove(str).apply();
          ej4.k(sz1.a());
       }
       if (!ej4.c(e0, p0)) {
          Intent intent = new Intent(sz1.a(), AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver.class);
          intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
          intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", e0);
          intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", p0);
          e.a.c(intent);
       }
       return;
    }
    public static HttpURLConnection W(wm2 p0){
       String str1;
       URL uRL;
       HttpURLConnection httpURLConne;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          tm2 otm2 = iterator.next();
          if (fs2.a == otm2.h && ej4.Z(otm2.d.getString("fields"))) {
             ns3 v = ns3.v;
             String str = "GET requests for /";
             if ((otm2 = otm2.b) == null) {
                str1 = "";
             }
             mj7.j(v, "Request", str.append(str1).append(" should contain an explicit \"fields\" parameter.").toString());
          }
       }
       try{
          int i = 0;
          int i1 = 1;
          if (p0.size() == i1) {
             uRL = new URL(p0.c.get(i).g());
          }else {
             Object[] objArray = new Object[i1];
             objArray[i] = sz1.e();
             str1 = String.format("https://graph.%s", Arrays.copyOf(objArray, i1));
             co5.l(str1, "java.lang.String.format\(format, *args\)");
             uRL = new URL(str1);
          }
          iterator = 0;
          try{
             httpURLConne = az5.x(uRL);
             az5.T(p0, httpURLConne);
             return httpURLConne;
          }catch(java.io.IOException e6){
             ej4.u(httpURLConne);
             throw new ny1(v0, e6);
          }catch(org.json.JSONException e6){
             ej4.u(httpURLConne);
             throw new ny1(v0, e6);
          }
       }catch(java.net.MalformedURLException e6){
          throw new ny1("could not construct URL for request", e6);
       }
    }
    public static final Bundle o(JSONObject p0,Intent p1){
       String str;
       Bundle uBundle = null;
       try{
          str = p0.getString("~referring_link");
       }catch(org.json.JSONException e0){
          str = e0;
       }
       Bundle uBundle1 = new Bundle();
       if (str != null) {
          uBundle1.putString("short_link", str);
          uBundle1.putString("shortlink_source", "BranchIO");
       }
       str = "forwarded_by_login_flow";
       if (p1.hasExtra(str)) {
          uBundle1.putBoolean(str, true);
       }
       if (!uBundle1.isEmpty()) {
          uBundle = uBundle1;
       }
       return uBundle;
    }
    public static final String p(char p0,String p1,String p2,Throwable p3){
       StringBuilder str = new StringBuilder((Logger.h(p2) + (Logger.h(p1) + 5)))+p0+" ["+p1+"] "+p2;
       if (p3 != null) {
          str = str+' '+Log.getStackTraceString(p3);
       }
       String str1 = str;
       co5.l(str1, "stringBuilder.toString\(\)");
       return str1;
    }
    public static final void q(Response p0,String p1){
       Object[] objArray1;
       byte[] body;
       if (p0 == null) {
          Object[] objArray = new Object[]{p1};
          Logger.b("Null response for %s: ", objArray);
       }else if(p0.getBody() == null){
          objArray1 = new Object[]{Integer.valueOf(p0.getStatus()),p1};
          Logger.b("Response code: %d, Null response body for %s: ", objArray1);
       }else if((body = p0.getBody()) != null){
          if (!body.length && (p0.getStatus() < 200 && p0.getStatus() <= 202)) {
             objArray1 = new Object[]{Integer.valueOf(p0.getStatus()),p1};
             Logger.b("Response code: %d, Empty response body for %s: ", objArray1);
          }
       }else {
          throw new IllegalStateException("Required value was null.".toString());
       }
       return;
    }
    public static final String r(Object p0){
       if (p0 instanceof String) {
       }else if(!p0 instanceof Boolean && !p0 instanceof Number){
          if (p0 instanceof Date) {
             p0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ssZ", Locale.US).format(p0);
             co5.l(p0, "iso8601DateFormat.format\(value\)");
          }else {
             throw new IllegalArgumentException("Unsupported parameter type.");
          }
       }else {
          p0 = p0.toString();
       }
       return p0;
    }
    public static final void s(){
       sz1.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
    public static String v(String p0){
       Matcher matcher;
       if (av6.f0(p0, "open.spotify.com")) {
          return p0;
       }
       boolean b = false;
       if (!av6.D0(p0, "spotify", b)) {
          p0 = "spotify:".concat(p0);
       }
       String str = "://";
       if (av6.f0(p0, str)) {
          String str1 = p0.substring(b, av6.n0(p0, str, b, b, 6));
          co5.l(str1, "this as java.lang.String…ing\(startIndex, endIndex\)");
          StringBuilder str2 = str1;
          p0 = p0.substring((av6.n0(p0, str, b, b, 6) + 3));
          co5.l(p0, "this as java.lang.String\).substring\(startIndex\)");
          p0 = str2+'/'+p0;
       }
       str = "/";
       if (av6.f0(p0, str)) {
          Pattern pattern = Pattern.compile(str);
          co5.l(pattern, "compile\(pattern\)");
          matcher = pattern.matcher(p0);
          matcher = matcher.replaceAll(":");
          co5.l(matcher, "nativePattern.matcher\(in…).replaceAll\(replacement\)");
       }
       return matcher;
    }
    public static ArrayList w(List p0,HttpURLConnection p1,ny1 p2){
       co5.o(p0, "requests");
       ArrayList uArrayList = new ArrayList(aj0.b0(p0));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(new xm2(iterator.next(), p1, new oz1(p2)));
       }
       return uArrayList;
    }
    public static HttpURLConnection x(URL p0){
       URLConnection uRLConnectio;
       if ((uRLConnectio = p0.openConnection()) == null) {
          throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
       }
       if (tm2.l == null) {
          int i = 2;
          Object[] objArray = new Object[i];
          objArray[0] = "FBAndroidSDK";
          objArray[1] = "15.0.1";
          tm2.l = kg4.q(objArray, i, "%s.%s", "java.lang.String.format\(format, *args\)");
          String str = null;
          if (!ej4.Z(str)) {
             Object[] objArray1 = new Object[i];
             objArray1[0] = tm2.l;
             objArray1[1] = str;
             String str1 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(objArray1, i));
             co5.l(str1, "java.lang.String.format\(locale, format, *args\)");
             tm2.l = str1;
          }
       }
       uRLConnectio.setRequestProperty("User-Agent", tm2.l);
       uRLConnectio.setRequestProperty("Accept-Language", Locale.getDefault().toString());
       uRLConnectio.setChunkedStreamingMode(0);
       return uRLConnectio;
    }
    public static a3 y(JSONObject p0){
       a3 p0;
       if (p0.getInt("version") > 1) {
          throw new ny1("Unknown AccessToken serialization format.");
       }
       String str = p0.getString("token");
       Date uDate = new Date(p0.getLong("expires_at"));
       JSONArray jSONArray = p0.getJSONArray("permissions");
       JSONArray jSONArray1 = p0.getJSONArray("declined_permissions");
       JSONArray jSONArray2 = p0.optJSONArray("expired_permissions");
       Date uDate1 = new Date(p0.getLong("last_refresh"));
       String str1 = p0.getString("source");
       co5.l(str1, "jsonObject.getString\(SOURCE_KEY\)");
       j3 oj3 = j3.valueOf(str1);
       str1 = p0.getString("application_id");
       String str2 = p0.getString("user_id");
       Date uDate2 = new Date(p0.optLong("data_access_expiration_time", 0));
       String str3 = p0.optString("graph_domain", null);
       co5.l(str, "token");
       co5.l(str1, "applicationId");
       co5.l(str2, "userId");
       co5.l(jSONArray, "permissionsArray");
       ArrayList uArrayList = ej4.a0(jSONArray);
       co5.l(jSONArray1, "declinedPermissionsArray");
       ArrayList uArrayList1 = ej4.a0(jSONArray1);
       ArrayList uArrayList2 = (jSONArray2 == null)? new ArrayList(): ej4.a0(jSONArray2);
       p0 = new a3(str, str1, str2, uArrayList, uArrayList1, uArrayList2, oj3, uDate, uDate1, uDate2, str3);
       return p0;
    }
    public static xm2 z(tm2 p0,HttpURLConnection p1,Object p2,Object p3){
       oz1 ooz1;
       tm2 a;
       a3 uoa3;
       Boolean uBoolean;
       i3 c;
       Object obj2;
       int i;
       JSONObject jSONObject1;
       String str8;
       String str9;
       boolean b1;
       String str10;
       String str11;
       String str12;
       String str13;
       int i1;
       oz1 jSONObject1;
       boolean b3;
       tm2 otm2 = p0;
       HttpURLConnection httpURLConne = p1;
       JSONObject jSONObject = p2;
       String str = "body";
       String str1 = "FACEBOOK_NON_JSON_RESULT";
       String str2 = null;
       if (jSONObject instanceof JSONObject) {
          String str3 = "error_code";
          String str4 = "error";
          String str5 = "code";
          boolean b = false;
          try{
             if (jSONObject.has(str5)) {
                int intx = jSONObject.getInt(str5);
                if ((obj2 = ej4.Q(str, str1, jSONObject)) != null && obj2 instanceof JSONObject) {
                   i = -1;
                   String str7 = "error_subcode";
                   if (obj2.has(str4)) {
                      str4 = ((jSONObject1 = ej4.Q(str4, str2, obj2)) == null)? str2: jSONObject1.optString("type", str2);
                      str8 = (jSONObject1 == null)? str2: jSONObject1.optString("message", str2);
                      str5 = (jSONObject1 == null)? -1: jSONObject1.optInt(str5, i);
                      if (jSONObject1 != null) {
                         i = jSONObject1.optInt(str7, i);
                      }
                      str7 = (jSONObject1 == null)? str2: jSONObject1.optString("error_user_msg", str2);
                      str9 = (jSONObject1 == null)? str2: jSONObject1.optString("error_user_title", str2);
                      if (jSONObject1 == null) {
                         jSONObject1 = 0;
                      }else {
                         b3 = jSONObject1.optBoolean("is_transient", b);
                      }
                   }else {
                      str4 = "error_msg";
                      str5 = "error_reason";
                      if (!obj2.has(str3) && (!obj2.has(str4) && !obj2.has(str5))) {
                         b3 = 0;
                         i1 = -1;
                         str10 = null;
                         str12 = null;
                         str11 = null;
                         str13 = null;
                         b1 = false;
                      label_00de :
                         if (jSONObject1) {
                            jSONObject1 = new oz1(intx, i, i1, str10, str12, str11, str13, p3, null, b1);
                         label_011e :
                            ooz1 = jSONObject1;
                         label_0122 :
                            if (ooz1 != null) {
                               Log.e("p.xm2", ooz1.toString());
                               if (ooz1.b == 190) {
                                  if ((a = otm2.a) != null && co5.c(a, az5.D())) {
                                     b = 1;
                                  }
                                  if (b) {
                                     az5 f = i3.f;
                                     if (ooz1.c != 493) {
                                        f.F().c(null, true);
                                     }else if((uoa3 = az5.D()) == null){
                                        uBoolean = null;
                                     }else {
                                        uBoolean = Boolean.valueOf(new Date().after(uoa3.a));
                                     }
                                     if (co5.c(uBoolean, Boolean.FALSE) && (c = f.F().c) != null) {
                                        a3 str6 = new a3(c.v, c.y, c.z, c.b, c.c, c.t, c.w, new Date(), new Date(), c.A);
                                        f.F().c(str, true);
                                     }
                                  }
                               }
                               return new xm2(otm2, httpURLConne, ooz1);
                            }else {
                               xm2 obj = ej4.Q(str, str1, e0);
                               if (obj instanceof JSONObject) {
                                  return new xm2(otm2, httpURLConne, obj.toString(), obj);
                               }else if(obj instanceof JSONArray){
                                  Object obj1 = obj;
                                  co5.o(otm2, "request");
                                  co5.o(obj1.toString(), "rawResponse");
                                  obj = new xm2(p0, p1, null, obj1, null);
                                  return str2;
                               }else {
                                  jSONObject = JSONObject.NULL;
                                  co5.l(jSONObject, "NULL");
                               }
                            }
                         }
                      }else {
                         str8 = obj2.optString(str4, null);
                         int i2 = obj2.optInt(str3, i);
                         i = obj2.optInt(str7, i);
                         str4 = obj2.optString(str5, null);
                         b3 = 0;
                         str9 = 0;
                         i1 = 0;
                      }
                   }
                   b1 = jSONObject1;
                   str10 = str4;
                   str11 = str9;
                   str12 = str8;
                   str13 = str7;
                   jSONObject1 = 1;
                   i1 = i;
                   i = str5;
                   goto label_00de ;
                }
                vh4 b2 = oz1.B;
                vh4 a1 = b2.a;
                b2 = (intx <= b2.b && a1 <= intx)? 1: 0;
                if (!b2) {
                   i = -1;
                   i1 = -1;
                   str10 = null;
                   str12 = null;
                   str11 = null;
                   str13 = null;
                   if (jSONObject.has(str)) {
                      JSONObject jSONObject2 = ej4.Q(str, str1, jSONObject);
                   }
                   jSONObject1 = new oz1(intx, i, i1, str10, str12, str11, str13, p3, null, false);
                   goto label_011e ;
                }
             }
          }catch(org.json.JSONException e0){
          }
          ooz1 = null;
          goto label_0122 ;
       }
       if (jSONObject == JSONObject.NULL) {
          return new xm2(otm2, httpURLConne, jSONObject.toString(), null);
       }else {
          throw new ny1(co5.K(jSONObject.getClass().getSimpleName(), "Got unexpected object type in response, class: "));
       }
    }
    public synchronized qz1 E(){
       f22 uof22;
       if ((uof22 = h22.b(sz1.b())) == null) {
          return qz1.d.e();
       }
       return uof22.e;
    }
    public i3 F(){
       i3 g;
       if ((g = i3.g) != null) {
          return g;
       }
       _monitor_enter(this);
       if ((g = i3.g) == null) {
          wq3 owq3 = wq3.a(sz1.a());
          co5.l(owq3, "getInstance\(applicationContext\)");
          i3 oi3 = new i3(owq3, new pp2());
          i3.g = oi3;
          g = oi3;
       }
       _monitor_exit(this);
       return g;
    }
    public synchronized vl5 G(){
       vl5 e;
       if (vl5.e == null) {
          wq3 owq3 = wq3.a(sz1.a());
          co5.l(owq3, "getInstance\(applicationContext\)");
          vl5.e = new vl5(owq3, new nl5());
       }
       if ((e = vl5.e) != null) {
          return e;
       }else {
          co5.N("instance");
          throw null;
       }
    }
    public void V(xq7 p0,float p1){
       xq7 b = p0.b;
       boolean useCompatPad = p0.c.getUseCompatPadding();
       boolean preventCorne = p0.c.getPreventCornerOverlap();
       if ((b.e - p1) || (b.f != useCompatPad || b.g != preventCorne)) {
          b.e = p1;
          b.f = useCompatPad;
          b.g = preventCorne;
          b.c(null);
          b.invalidateSelf();
       }
       if (!p0.c.getUseCompatPadding()) {
          p0.g(0, 0, 0, 0);
       }else {
          xq7 b1 = p0.b;
          cz5 e = b1.e;
          cz5 a = b1.a;
          float f = (p0.c.getPreventCornerOverlap())? (float)(((0x3ff0000000000000 - dz5.a) * (double)a) + (double)e): e;
          p0.g((int)Math.ceil((double)f), (int)Math.ceil((double)dz5.a(e, a, p0.c.getPreventCornerOverlap())), (int)Math.ceil((double)f), (int)Math.ceil((double)dz5.a(e, a, p0.c.getPreventCornerOverlap())));
       }
       return;
    }
    public Object a(Object p0){
       return p0;
    }
    public Object apply(Object p0){
       co5.o(p0, "p0");
       return vv7.g(p0);
    }
    public Object apply(Object p0,Object p1){
       return jc7.a;
    }
    public String b(){
       return Thread.currentThread().getName();
    }
    public String c(String p0,Object[] p1){
       return String.format(Locale.US, p0, p1);
    }
    public int d(int p0){
       return p0;
    }
    public Object e(Object p0,Object p1,Object p2,Object p3){
       boolean b;
       co5.l(p0, "visible");
       if (p0.booleanValue()) {
          co5.l(p1, "scrolled");
          if (p1.booleanValue()) {
             co5.l(p2, "minCharacters");
             if (p2.booleanValue() && !p3.booleanValue()) {
                b = true;
             label_0032 :
                return Boolean.valueOf(b);
             }
          }
       }
       b = false;
       goto label_0032 ;
    }
    public rw6 f(pw6 p0){
       sf2 v6 = new sf2(p0.a, p0.b, p0.c, p0.d, p0.e);
       return v6;
    }
    public float g(){
       return 0x3f800000;
    }
    public boolean h(float p0){
       throw new IllegalStateException("not implemented");
    }
    public float i(){
       return 0;
    }
    public boolean isEmpty(){
       return true;
    }
    public ph3 j(){
       throw new IllegalStateException("not implemented");
    }
    public Object k(JsonReader p0){
       byte[] uobyteArray;
       li5 oli5 = new li5(7);
       p0.beginObject();
       while (true) {
          if (p0.hasNext()) {
             String str = p0.nextName();
             str.getClass();
             if (!str.equals("filename")) {
                if (!str.equals("contents")) {
                   p0.skipValue();
                }else if((uobyteArray = Base64.decode(p0.nextString(), 2)) != null){
                   oli5.c = uobyteArray;
                }else {
                   break ;
                }
             }else if((str = p0.nextString()) != null){
                oli5.b = str;
             }else {
                throw new NullPointerException("Null filename");
             }
          }else {
             p0.endObject();
             return oli5.a();
          }
       }
       throw new NullPointerException("Null contents");
    }
    public String l(String p0){
       return p0;
    }
    public boolean m(float p0){
       return false;
    }
    public Object n(kg3 p0,float p1){
       int i = 1;
       if (p0.j0() == i) {
       }else {
          i = 0;
       }
       if (i) {
          p0.b();
       }
       double d = p0.g0();
       double d1 = p0.g0();
       double d2 = p0.g0();
       double d3 = (p0.j0() == 7)? p0.g0(): 0x3ff0000000000000;
       if (i) {
          p0.x();
       }
       if ((d - 0x3ff0000000000000) <= 0 && ((d1 - 0x3ff0000000000000) <= 0 && (d2 - 0x3ff0000000000000) <= 0)) {
          double d4 = 0x406fe00000000000;
          d = d * d4;
          d1 = d1 * d4;
          d2 = d2 * d4;
          if ((d3 - 0x3ff0000000000000) <= 0) {
             d3 = d3 * d4;
          }
       }
       return Integer.valueOf(Color.argb((int)d3, (int)d, (int)d1, (int)d2));
    }
    public void t(ScrollView p0,int p1){
       co5.o(p0, "scrollView");
       int[] ointArray = new int[]{p1};
       ObjectAnimator objectAnimat = ObjectAnimator.ofInt(p0, "scrollY", ointArray);
       objectAnimat.setDuration(500);
       objectAnimat.setInterpolator(dg1.d);
       objectAnimat.start();
    }
    public boolean u(int p0){
       boolean b = (4 > p0 && !Log.isLoggable("FirebaseCrashlytics", p0))? false: true;
       return b;
    }
}
