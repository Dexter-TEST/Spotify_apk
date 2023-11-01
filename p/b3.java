package p.b3;
import java.lang.Object;
import p.qz3;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import p.ki;
import p.d3;
import p.bj;
import p.ni;
import p.co5;
import p.ij;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import p.v12;
import p.t12;
import p.c25;
import java.util.Set;
import p.sz1;
import p.fs3;
import p.ns3;
import p.mj7;
import java.security.MessageDigest;
import java.nio.charset.Charset;
import p.is7;
import java.util.HashMap;
import p.ha4;
import java.lang.CharSequence;
import p.av6;
import p.ts5;
import java.util.List;
import java.util.Collection;
import java.lang.NullPointerException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.HashSet;
import p.ny1;
import p.kg4;
import java.util.Locale;
import java.lang.Integer;
import java.util.Arrays;
import org.json.JSONObject;
import p.jc4;
import p.kc4;
import org.json.JSONArray;
import java.lang.Float;
import java.util.Iterator;
import p.t94;
import java.util.concurrent.CopyOnWriteArraySet;
import android.content.Context;
import p.x83;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Class;
import java.lang.reflect.Method;
import p.tu6;
import java.lang.ClassLoader;
import p.r83;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import p.t83;
import p.d32;
import java.io.File;
import p.e32;
import android.os.AsyncTask;
import android.view.View;
import java.util.ArrayList;
import java.lang.StringBuilder;
import p.bi0;
import p.q95;
import android.view.ViewParent;
import android.view.ViewGroup;
import p.gi7;
import p.ej4;
import p.au1;
import p.zt1;
import p.yt1;
import p.b75;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p.bc;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import android.app.Activity;
import p.gj7;
import java.lang.ref.Reference;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.app.Application;
import p.cc;
import p.dc3;
import p.ee7;
import p.b25;
import p.t6;
import java.lang.IllegalStateException;
import android.content.SharedPreferences;
import java.util.UUID;
import android.content.SharedPreferences$Editor;
import p.zi;
import p.di0;
import p.me7;
import java.util.Map;
import android.view.ViewTreeObserver$OnGlobalFocusChangeListener;

public final class b3	// class@00104b from classes.dex
{
    public final int a;

    public void b3(int p0){
       this.a = p0;
       super();
    }
    public void b3(int p0,int p1){
       this.a = p0;
       switch (p0){
           case 1:
             super(1);
             return;
           case 2:
             super(2);
             return;
           case 3:
             super(3);
             return;
           case 4:
             super(4);
             return;
           case 5:
             super(5);
             return;
           case 6:
             super(6);
             return;
           case 7:
             super(7);
             return;
           case 8:
             super(8);
             return;
           case 9:
             super(9);
             return;
           case 10:
             super(10);
             return;
           case 11:
             super(11);
             return;
           case 12:
             super(12);
             return;
           case 13:
             super(13);
             return;
           case 14:
             super(14);
             return;
           case 15:
             super(15);
             return;
           case 16:
             super(16);
             return;
           case 17:
             super(17);
             return;
           case 18:
             super(18);
             return;
           case 19:
             super(19);
             return;
           case 20:
             super(20);
             return;
           case 21:
             super(21);
             return;
           case 22:
             super(22);
             return;
           case 23:
             super(23);
             return;
           case 24:
             super(24);
             return;
           case 25:
             super(25);
             return;
           case 26:
             super(26);
             return;
           case 27:
             super(27);
             return;
           case 28:
             super(28);
             return;
           case 29:
             super(29);
             return;
           default:
             super(0);
             return;
       }
    }
    public static final int a(int[] p0){
       int i = 0;
       int i1 = 1;
       int i2 = (!p0.length)? 1: 0;
       if (!i2) {
          i2 = p0[i];
          i = p0.length - 1;
          if (i1 <= i) {
             while (true) {
                i2 = i2 * p0[i1];
                if (i1 != i) {
                   i1 = i1 + 1;
                }
             }
          }
          return i2;
       }else {
          throw new UnsupportedOperationException("Empty array can\'t be reduced.");
       }
    }
    public static final void b(ki p0,d3 p1){
       co5.o(p1, "accessTokenAppId");
       ni.b.execute(new ij(p1, 15, p0));
       ki t = p0.t;
       ki b = p0.b;
       if (v12.c(t12.F) && c25.a()) {
          p1 = p1.a;
          co5.o(p1, "applicationId");
          int i = 0;
          int i1 = (b != null && c25.a.contains(t))? 1: 0;
          if (((b ^ 0x01)) || i1) {
             i = 1;
          }
          if (i) {
             sz1.c().execute(new ij(p1, 24, p0));
          }
       }
       if (b == null && !bj.g) {
          if (co5.c(t, "fb_mobile_activate_app")) {
             bj.g = true;
          }else {
             mj7.j(ns3.t, "AppEvents", "Warning: Please call AppEventsLogger.activateApp\(...\)from the long-lived activity\'s onResume\(\) methodbefore logging other app events.");
          }
       }
       return;
    }
    public static final String c(String p0){
       byte[] bytes;
       HashSet w = ki.w;
       try{
          MessageDigest instance = MessageDigest.getInstance("MD5");
          Charset uCharset = Charset.forName("UTF-8");
          co5.l(uCharset, "Charset.forName\(charsetName\)");
          bytes = p0.getBytes(uCharset);
          co5.l(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
          instance.update(bytes, 0, bytes.length);
          bytes = instance.digest();
          co5.l(bytes, "digest.digest\(\)");
          bytes = is7.d(bytes);
       }catch(java.security.NoSuchAlgorithmException e0){
          bytes = "0";
       }catch(java.io.UnsupportedEncodingException e0){
          bytes = "1";
       }
       return bytes;
    }
    public static final void d(HashMap p0,String p1,String p2){
       Object[] objArray;
       boolean b = false;
       switch (p1.hashCode()){
           case 3585:
             if (p1.equals("r3")) {
                if (!av6.D0(p2, "m", b) && (!av6.D0(p2, "b", b) && !av6.D0(p2, "ge", b))) {
                   p2 = "f";
                }else {
                   p2 = "m";
                }
             }
             break;
           case 3586:
             if (p1.equals("r4")) {
             label_004e :
                Pattern pattern = Pattern.compile("[^a-z]+");
                co5.l(pattern, "compile\(pattern\)");
                Matcher matcher = pattern.matcher(p2);
                matcher = matcher.replaceAll("");
                co5.l(matcher, "nativePattern.matcher\(in…).replaceAll\(replacement\)");
             }
             break;
           case 3587:
             if (p1.equals("r5")) {
                goto label_004e ;
             }
             break;
           case 3588:
             if (p1.equals("r6")) {
                String str = "-";
                if (av6.f0(p2, str)) {
                   String[] stringArray = new String[b];
                   if ((objArray = new ts5(str).a(p2).toArray(stringArray)) == null) {
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                   }
                   object oobject = objArray[b];
                }
             }
             break;
           default:
       }
       p0.put(p1, p2);
       return;
    }
    public static final void e(String p0){
       String str = "^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$";
       int i = 0;
       int i1 = 40;
       if (p0 != null) {
          int i2 = (!p0.length())? 1: 0;
          if (!i2 && p0.length() <= i1) {
             HashSet w = ki.w;
             _monitor_enter(w);
             _monitor_exit(w);
             if (!w.contains(p0)) {
                Pattern pattern = Pattern.compile(str);
                co5.l(pattern, "compile\(pattern\)");
                if (pattern.matcher(p0).matches()) {
                   _monitor_enter(w);
                   w.add(p0);
                   _monitor_exit(w);
                }else {
                   Object[] objArray1 = new Object[]{p0};
                   throw new ny1(kg4.q(objArray1, 1, "Skipping event named \'%s\' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", "java.lang.String.format\(format, *args\)"));
                }
             }
             return;
          }
       }
       if (p0 == null) {
          p0 = "<None Provided>";
       }
       Object[] objArray = new Object[]{p0,Integer.valueOf(i1)};
       p0 = String.format(Locale.ROOT, "Identifier \'%s\' must be less than %d characters", Arrays.copyOf(objArray, 2));
       co5.l(p0, "java.lang.String.format\(locale, format, *args\)");
       throw new ny1(p0);
    }
    public static jc4 g(JSONObject p0){
       JSONArray jSONArray;
       jc4 ojc41;
       int i;
       int i2;
       jc4 ojc4 = null;
       if (p0 == null) {
       }else {
          try{
             String str = p0.getString("use_case");
             String str1 = p0.getString("asset_uri");
             String str2 = p0.optString("rules_uri", ojc4);
             int intx = p0.getInt("version_id");
             if ((jSONArray = p0.getJSONArray("thresholds")) == null) {
                ojc41 = ojc4;
             }else {
                float[] uofloatArray = new float[jSONArray.length()];
                if ((i = jSONArray.length()) > 0) {
                   int i1 = 0;
                   while (true) {
                      i2 = i1 + 1;
                      break ;
                   }
                   try{
                      String str3 = jSONArray.getString(i1);
                      co5.l(str3, "jsonArray.getString\(i\)");
                      uofloatArray[i1] = Float.parseFloat(str3);
                   }catch(org.json.JSONException e0){
                   }
                   if (i2 < i) {
                      i1 = i2;
                   }
                }
                ojc41 = uofloatArray;
             }
             co5.l(str, "useCase");
             co5.l(str1, "assetUri");
             jc4 jSONArray1 = new jc4(str, str1, str2, intx, ojc41);
             ojc4 = jSONArray;
          }catch(java.lang.Exception e0){
          }
       }
       return ojc4;
    }
    public static void h(JSONObject p0){
       JSONObject jSONObject;
       String str1;
       String str2;
       Iterator iterator = p0.keys();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if ((jSONObject = p0.optJSONObject(str)) == null) {
             continue ;
          }else {
             str1 = jSONObject.optString("k");
             str2 = jSONObject.optString("v");
             co5.l(str1, "k");
             int i = (!str1.length())? 1: 0;
             if (i) {
                continue ;
             }
          }
          co5.l(str, "key");
          String[] stringArray = new String[]{","};
          co5.l(str2, "v");
          t94.d.add(new t94(str, av6.B0(str1, stringArray, 0, 6), str2));
       }
       return;
    }
    public static void i(Context p0){
       x83 g;
       String str3;
       Class uClass;
       Class uClass1;
       Class uClass2;
       Class uClass3;
       Class uClass4;
       Class uClass5;
       Class uClass6;
       Class uClass7;
       Class uClass8;
       Class uClass9;
       Object[] objArray;
       Object obj2;
       Class uClass10;
       Class uClass11;
       AtomicBoolean h = x83.h;
       Class[] obj = null;
       String str = "build";
       String str1 = "newBuilder";
       String str2 = String.class;
       if (h.get()) {
          g = x83.g;
       }else {
          str3 = "com.android.billingclient.api.SkuDetailsParams";
          try{
             uClass10 = Class.forName(str3);
          }catch(java.lang.ClassNotFoundException e0){
             uClass10 = obj;
          }
          str3 = "com.android.billingclient.api.SkuDetailsParams$Builder";
          try{
             uClass11 = Class.forName(str3);
          }catch(java.lang.ClassNotFoundException e0){
             uClass11 = obj;
          }
          if (uClass10 != null && uClass11 != null) {
             Class[] x83 uClassArray6 = new Class[0];
             Method method11 = tu6.u(uClass10, str1, uClassArray6);
             uClassArray6 = new Class[]{str2};
             Method method12 = tu6.u(uClass11, "setType", uClassArray6);
             uClassArray6 = new Class[]{List.class};
             Method method13 = tu6.u(uClass11, "setSkusList", uClassArray6);
             uClassArray6 = new Class[0];
             Method method14 = tu6.u(uClass11, str, uClassArray6);
             if (method11 != null && (method12 != null && (method13 != null && method14 != null))) {
                uClassArray6 = new x83(uClass10, uClass11, method11, method12, method13, method14);
                x83.g = uClassArray6;
             }
          }
          e0.set(1);
          g = x83.g;
       }
       if (g == null) {
          return;
       }else {
          str3 = "com.android.billingclient.api.BillingClient";
          try{
             uClass = Class.forName(str3);
          }catch(java.lang.ClassNotFoundException e0){
             uClass = obj;
          }
          String str4 = "com.android.billingclient.api.Purchase";
          try{
             uClass1 = Class.forName(str4);
          }catch(java.lang.ClassNotFoundException e0){
             uClass1 = obj;
          }
          str4 = "com.android.billingclient.api.Purchase$PurchasesResult";
          try{
             uClass2 = Class.forName(str4);
          }catch(java.lang.ClassNotFoundException e0){
             uClass2 = obj;
          }
          str4 = "com.android.billingclient.api.SkuDetails";
          try{
             uClass3 = Class.forName(str4);
          }catch(java.lang.ClassNotFoundException e0){
             uClass3 = obj;
          }
          str4 = "com.android.billingclient.api.PurchaseHistoryRecord";
          try{
             uClass4 = Class.forName(str4);
          }catch(java.lang.ClassNotFoundException e0){
             uClass4 = obj;
          }
          str4 = "com.android.billingclient.api.SkuDetailsResponseListener";
          try{
             uClass5 = Class.forName(str4);
          }catch(java.lang.ClassNotFoundException e0){
             uClass5 = obj;
          }
          str4 = "com.android.billingclient.api.PurchaseHistoryResponseListener";
          try{
             uClass6 = Class.forName(str4);
          }catch(java.lang.ClassNotFoundException e0){
             uClass6 = obj;
          }
          if (uClass != null && (uClass2 != null && (uClass1 != null && (uClass3 != null && (uClass5 != null && (uClass4 != null && uClass6 != null)))))) {
             Class[] uClassArray = new Class[]{str2};
             Method method = tu6.u(uClass, "queryPurchases", uClassArray);
             Class[] uClassArray1 = new Class[0];
             Method method1 = tu6.u(uClass2, "getPurchasesList", uClassArray1);
             uClassArray = new Class[0];
             Method method2 = tu6.u(uClass1, "getOriginalJson", uClassArray);
             uClassArray = new Class[0];
             Method method3 = tu6.u(uClass3, "getOriginalJson", uClassArray);
             uClassArray = new Class[0];
             Method method4 = tu6.u(uClass4, "getOriginalJson", uClassArray);
             uClassArray1 = new Class[]{e0.a,uClass5};
             Method method5 = tu6.u(uClass, "querySkuDetailsAsync", uClassArray1);
             uClassArray = new Class[]{str2,uClass6};
             Method method6 = tu6.u(uClass, "queryPurchaseHistoryAsync", uClassArray);
             if (method != null && (method1 != null && (method2 != null && (method3 != null && (method4 != null && (method5 != null && method6 != null)))))) {
                str2 = "com.android.billingclient.api.BillingClient$Builder";
                try{
                   uClass7 = Class.forName(str2);
                }catch(java.lang.ClassNotFoundException e0){
                   uClass7 = obj;
                }
                str4 = "com.android.billingclient.api.PurchasesUpdatedListener";
                try{
                   uClass8 = Class.forName(str4);
                }catch(java.lang.ClassNotFoundException e0){
                   uClass8 = obj;
                }
                if (uClass7 != null && uClass8 != null) {
                   uClassArray1 = new Class[]{Context.class};
                   Method method8 = tu6.u(uClass, str1, uClassArray1);
                   Class[] uClassArray4 = new Class[0];
                   Method method9 = tu6.u(uClass7, "enablePendingPurchases", uClassArray4);
                   uClassArray4 = new Class[]{uClass8};
                   Method method10 = tu6.u(uClass7, "setListener", uClassArray4);
                   Class[] uClassArray5 = new Class[0];
                   Method method7 = tu6.u(uClass7, str, uClassArray5);
                   if (method8 != null && (method9 != null && (method10 != null && method7 != null))) {
                      Object[] objArray1 = new Object[]{p0};
                      if ((obj2 = tu6.y(uClass, obj, method8, objArray1)) == null) {
                      label_0185 :
                         if (obj == null) {
                            return;
                         }else {
                            t83 str5 = new t83(p0, obj, uClass, uClass2, uClass1, uClass3, uClass4, uClass5, uClass6, method, method1, method2, method3, method4, method5, method6, e0);
                            t83.u = str;
                            try{
                               String str6 = "com.android.billingclient.api.BillingClientStateListener";
                               uClass9 = Class.forName(str6);
                            }catch(java.lang.ClassNotFoundException e0){
                               uClass9 = null;
                            }
                            if (uClass9 != null) {
                               Class[] uClassArray2 = new Class[]{uClass9};
                               if ((method7 = tu6.u(uClass, "startConnection", uClassArray2)) != null) {
                                  Class[] uClassArray3 = new Class[]{uClass9};
                                  Object obj1 = Proxy.newProxyInstance(uClass9.getClassLoader(), uClassArray3, new r83(0));
                                  co5.l(obj1, "newProxyInstance\(\n            listenerClazz.classLoader, arrayOf\(listenerClazz\), BillingClientStateListenerWrapper\(\)\)");
                                  objArray = new Object[]{obj1};
                                  tu6.y(uClass, obj, method7, objArray);
                               }
                            }
                         }
                      }else {
                         obj = new Class[]{uClass8};
                         Object obj3 = Proxy.newProxyInstance(uClass8.getClassLoader(), obj, new r83(1));
                         co5.l(obj3, "newProxyInstance\(\n              listenerClazz.classLoader, arrayOf\(listenerClazz\), PurchasesUpdatedListenerWrapper\(\)\)");
                         Object[] objArray2 = new Object[]{obj3};
                         if ((obj3 = tu6.y(uClass7, obj2, method10, objArray2)) != null) {
                            objArray = new Object[0];
                            if ((obj3 = tu6.y(uClass7, obj3, method9, objArray)) != null) {
                               objArray = new Object[0];
                               obj3 = tu6.y(uClass7, obj3, method7, objArray);
                               goto label_0185 ;
                            }
                         }
                      }
                   }
                }
                obj = null;
                goto label_0185 ;
             }
          }
          return;
       }
    }
    public static void j(String p0,String p1,d32 p2){
       File uFile = new File(co5.x(), p1);
       if (p0 != null && !uFile.exists()) {
          String[] stringArray = new String[0];
          new e32(p0, uFile, p2).execute(stringArray);
          return;
       }else {
          p2.b(uFile);
          return;
       }
    }
    public static ArrayList k(View p0,List p1,int p2,int p3,String p4){
       ArrayList uArrayList1;
       int i1;
       int i2;
       q95 b;
       String str1;
       String str2;
       String str3;
       co5.o(p1, "path");
       co5.o(p4, "mapKey");
       p4 = p4+'.'+p3;
       ArrayList uArrayList = new ArrayList();
       if (p0 == null) {
          return uArrayList;
       }
       int i = 0;
       if (p2 >= p1.size()) {
          uArrayList.add(new bi0(p0, p4));
       }else {
          q95 oq95 = p1.get(p2);
          if (co5.c(oq95.a, "..")) {
             ViewParent parent = p0.getParent();
             if (parent instanceof ViewGroup) {
                uArrayList1 = b3.l(parent);
                if ((p3 = uArrayList1.size()) > 0) {
                   while (true) {
                      i1 = i + 1;
                      i2 = p2 + 1;
                      uArrayList.addAll(b3.k(uArrayList1.get(i), p1, i2, i, p4));
                      if (i1 < p3) {
                         i = i1;
                      }
                   }
                }
             }
             return uArrayList;
          }else {
             q95 a = oq95.a;
             String str = ".";
             if (co5.c(a, str)) {
                uArrayList.add(new bi0(p0, p4));
                return uArrayList;
             }else if((b = oq95.b) != -1 && p3 != b){
                if (!co5.c(p0.getClass().getCanonicalName(), a)) {
                   Pattern pattern = Pattern.compile(".*android\\..*");
                   co5.l(pattern, "compile\(pattern\)");
                   co5.o(a, "input");
                   if (pattern.matcher(a).matches()) {
                      String[] stringArray = new String[]{str};
                      List list = av6.B0(a, stringArray, i, 6);
                      if (!((list.isEmpty() ^ 1)) || !co5.c(p0.getClass().getSimpleName(), list.get((list.size() - 1)))) {
                      label_0187 :
                         p3 = 0;
                      label_018a :
                         if (!p3) {
                            return uArrayList;
                         }else if(p2 == (p1.size() - 1)){
                            uArrayList.add(new bi0(p0, p4));
                         }
                      }
                   }else {
                      goto label_0187 ;
                   }
                }
                q95 h = oq95.h;
                if (((h & 0x01)) > 0 && oq95.c != p0.getId()) {
                   goto label_0187 ;
                }else if(((h & 0x02)) > 0){
                   str1 = gi7.h(p0);
                   str = ej4.m(ej4.O0(str1));
                   q95 d = oq95.d;
                   if (!co5.c(d, str1) && !co5.c(d, str)) {
                      goto label_0187 ;
                   }
                }
                str = "";
                if (((h & 0x08)) > 0) {
                   str1 = (p0.getContentDescription() == null)? str: p0.getContentDescription().toString();
                   str2 = ej4.m(ej4.O0(str1));
                   b = oq95.f;
                   if (!co5.c(b, str1) && !co5.c(b, str2)) {
                      goto label_0187 ;
                   }
                }
                if (((h & 0x10)) > 0) {
                   str1 = gi7.g(p0);
                   str2 = ej4.m(ej4.O0(str1));
                   b = oq95.g;
                   if (!co5.c(b, str1) && !co5.c(b, str2)) {
                      goto label_0187 ;
                   }
                }
                if (((h & 0x04)) > 0) {
                   if (p0.getTag() != null) {
                      str = p0.getTag().toString();
                   }
                   str3 = ej4.m(ej4.O0(str));
                   oq95 = oq95.e;
                   if (!co5.c(oq95, str) && !co5.c(oq95, str3)) {
                      goto label_0187 ;
                   }
                }
                str3 = 1;
                goto label_018a ;
             }
          }
       }
       if (p0 instanceof ViewGroup) {
          uArrayList1 = b3.l(p0);
          if ((p3 = uArrayList1.size()) > 0) {
             while (true) {
                i1 = i + 1;
                i2 = p2 + 1;
                uArrayList.addAll(b3.k(uArrayList1.get(i), p1, i2, i, p4));
                if (i1 < p3) {
                   i = i1;
                }
             }
          }
       }
       return uArrayList;
    }
    public static ArrayList l(ViewGroup p0){
       int childCount;
       ArrayList uArrayList = new ArrayList();
       if ((childCount = p0.getChildCount()) > 0) {
          int i = 0;
          while (true) {
             int i1 = i + 1;
             View childAt = p0.getChildAt(i);
             if (!childAt.getVisibility()) {
                uArrayList.add(childAt);
                break ;
             }else if(i1 >= childCount){
                i = i1;
             }
          }
       }
       return uArrayList;
    }
    public static au1 q(JSONObject p0){
       String str = p0.getString("event_name");
       String str1 = p0.getString("method");
       co5.l(str1, "mapping.getString\(\"method\"\)");
       Locale eNGLISH = Locale.ENGLISH;
       co5.l(eNGLISH, "ENGLISH");
       str1 = str1.toUpperCase(eNGLISH);
       co5.l(str1, "\(this as java.lang.String\).toUpperCase\(locale\)");
       zt1 ozt1 = zt1.valueOf(str1);
       String str2 = p0.getString("event_type");
       co5.l(str2, "mapping.getString\(\"event_type\"\)");
       String str3 = str2.toUpperCase(eNGLISH);
       co5.l(str3, "\(this as java.lang.String\).toUpperCase\(locale\)");
       yt1 oyt1 = yt1.valueOf(str3);
       String str4 = p0.getString("app_version");
       JSONArray jSONArray = p0.getJSONArray("path");
       ArrayList uArrayList = new ArrayList();
       int i = jSONArray.length();
       int i1 = 0;
       if (i > 0) {
          int i2 = 0;
          while (true) {
             int i3 = i2 + 1;
             JSONObject jSONObject = jSONArray.getJSONObject(i2);
             co5.l(jSONObject, "jsonPath");
             uArrayList.add(new q95(jSONObject));
             if (i3 < i) {
                i2 = i3;
             }
          }
       }
       String str5 = p0.optString("path_type", "absolute");
       jSONArray = p0.optJSONArray("parameters");
       ArrayList uArrayList1 = new ArrayList();
       if (jSONArray != null && (i = jSONArray.length()) > 0) {
          while (true) {
             int i4 = i1 + 1;
             JSONObject jSONObject1 = jSONArray.getJSONObject(i1);
             co5.l(jSONObject1, "jsonParameter");
             uArrayList1.add(new b75(jSONObject1));
             if (i4 < i) {
                i1 = i4;
             }
          }
       }
       String str6 = p0.optString("component_id");
       String str7 = p0.optString("activity_name");
       co5.l(str, "eventName");
       co5.l(str4, "appVersion");
       co5.l(str6, "componentId");
       co5.l(str5, "pathType");
       co5.l(str7, "activityName");
       String str8 = str6;
       au1 v11 = new au1(str, ozt1, oyt1, str4, uArrayList, uArrayList1, str8, str5, str7);
       return v11;
    }
    public static void t(){
       Object e = bj.e;
       _monitor_enter(e);
       if (bj.d != null) {
          _monitor_exit(e);
          return;
       }else {
          ScheduledThreadPoolExecutor scheduledThr = new ScheduledThreadPoolExecutor(1);
          bj.d = scheduledThr;
          _monitor_exit(e);
          scheduledThr.scheduleAtFixedRate(new bc(3), 0, 0x15180, TimeUnit.SECONDS);
          return;
       }
    }
    public static void w(Activity p0){
       gj7 ogj7;
       View view;
       co5.o(p0, "activity");
       if ((ogj7 = gj7.v.remove(Integer.valueOf(p0.hashCode()))) == null) {
       }else if(!ogj7.c.getAndSet(false) || (view = is7.q(ogj7.a.get())) == null){
          ViewTreeObserver viewTreeObse = view.getViewTreeObserver();
          if (viewTreeObse.isAlive()) {
             viewTreeObse.removeOnGlobalLayoutListener(ogj7);
          }
       }
       return;
    }
    public final void f(Application p0,String p1){
       switch (this.a){
           case 4:
           default:
             if (!sz1.h()) {
                throw new ny1("The Facebook sdk must be initialized before calling activateApp");
             }
             if (!cc.c) {
                dc3.b.m().execute(new bc(0));
             }
             if (!ee7.c.get()) {
                ee7.a.a();
             }
             sz1.c().execute(new ij(p0.getApplicationContext(), 12, p1));
             if (v12.c(t12.E) && c25.a()) {
                sz1.c().execute(new b25(0, sz1.a(), "com.facebook.sdk.attributionTracking", p1));
             }
             t6.b(p0, p1);
             return;
       }
       bj.c.f(p0, p1);
       return;
    }
    public final Executor m(){
       ScheduledThreadPoolExecutor d;
       switch (this.a){
           case 5:
             break;
           default:
             return bj.c.m();
       }
       if (bj.d == null) {
          b3.t();
       }
       if ((d = bj.d) != null) {
          return d;
       }else {
          throw new IllegalStateException("Required value was null.".toString());
       }
    }
    public final String n(Context p0){
       String f;
       switch (this.a){
           case 4:
           default:
             if (bj.f == null) {
                Object e = bj.e;
                _monitor_enter(e);
                if (bj.f == null) {
                   int i = 0;
                   String str = p0.getSharedPreferences("com.facebook.sdk.appEventPreferences", i).getString("anonymousAppDeviceGUID", null);
                   bj.f = str;
                   if (str == null) {
                      UUID uUID = UUID.randomUUID();
                      co5.l(uUID, "randomUUID\(\)");
                      bj.f = co5.K(uUID, "XZ");
                      p0.getSharedPreferences("com.facebook.sdk.appEventPreferences", i).edit().putString("anonymousAppDeviceGUID", bj.f).apply();
                   }
                }
                _monitor_exit(e);
             }
             if ((f = bj.f) != null) {
                return f;
             }else {
                throw new IllegalStateException("Required value was null.".toString());
             }
       }
       return bj.c.n(p0);
    }
    public final zi o(){
       switch (this.a){
           case 4:
             return bj.c.o();
           case 5:
             Object e = bj.e;
             _monitor_enter(e);
             _monitor_exit(e);
             return zi.a;
           default:
             return bj.c.o();
       }
    }
    public synchronized final di0 p(){
       di0 g;
       if (di0.g == null) {
          di0.g = new di0();
       }
       if ((g = di0.g) != null) {
          return g;
       }else {
          throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
       }
    }
    public final String r(){
       switch (this.a){
           case 5:
           default:
             return bj.c.r();
       }
       Object e = bj.e;
       _monitor_enter(e);
       _monitor_exit(e);
       return null;
    }
    public final void s(Context p0,String p1){
       ScheduledThreadPoolExecutor d;
       switch (this.a){
           case 4:
           default:
             if (me7.a()) {
                bj uobj = new bj(p0, p1);
                if ((d = bj.d) != null) {
                   d.execute(new ij(p0, 17, uobj));
                }else {
                   throw new IllegalStateException("Required value was null.".toString());
                }
             }
             return;
       }
       bj.c.s(p0, p1);
       return;
    }
    public final void u(){
       switch (this.a){
           case 4:
           default:
             ni.b.execute(new bc(2));
             return;
       }
       bj.c.u();
       return;
    }
    public final void v(Activity p0){
       HashMap w;
       Integer integer;
       ha4 oha4;
       View view;
       ViewTreeObserver viewTreeObse;
       gj7 ogj7;
       String str = "activity";
       switch (this.a){
           case 11:
             co5.o(p0, str);
             w = ha4.w;
             integer = Integer.valueOf(p0.hashCode());
             if ((oha4 = w.get(integer)) == null) {
                oha4 = new ha4(p0);
                w.put(integer, oha4);
             }
             if (!oha4.t.getAndSet(true) && (view = is7.q(oha4.c.get())) != null) {
                viewTreeObse = view.getViewTreeObserver();
                if (viewTreeObse.isAlive()) {
                   viewTreeObse.addOnGlobalFocusChangeListener(oha4);
                }
             }
             break;
           default:
             co5.o(p0, str);
             w = gj7.v;
             integer = Integer.valueOf(p0.hashCode());
             if ((ogj7 = w.get(integer)) == null) {
                ogj7 = new gj7(p0);
                w.put(integer, ogj7);
             }
             if (!ogj7.c.getAndSet(true) && (view = is7.q(ogj7.a.get())) != null) {
                viewTreeObse = view.getViewTreeObserver();
                if (viewTreeObse.isAlive()) {
                   viewTreeObse.addOnGlobalLayoutListener(ogj7);
                   ogj7.a();
                }
             }
             return;
       }
       return;
    }
}
