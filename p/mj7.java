package p.mj7;
import java.lang.Object;
import org.json.JSONObject;
import p.qo5;
import p.ea1;
import java.lang.String;
import org.json.JSONArray;
import java.util.ArrayList;
import p.co5;
import android.view.View;
import p.nj7;
import java.lang.Integer;
import java.util.HashSet;
import p.gi7;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import android.view.View$OnClickListener;
import p.t12;
import android.content.Context;
import p.vn;
import java.lang.reflect.Method;
import p.ej4;
import java.lang.Boolean;
import p.sz1;
import p.un;
import android.content.Intent;
import android.content.ServiceConnection;
import p.tn;
import android.os.IBinder;
import android.os.Looper;
import java.lang.System;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import p.uz1;
import android.net.Uri;
import android.content.ContentResolver;
import android.database.Cursor;
import p.ny1;
import p.qz1;
import p.t65;
import java.util.HashMap;
import p.q14;
import p.ns3;
import p.g11;
import java.util.concurrent.locks.ReentrantLock;
import android.os.Bundle;
import p.o11;
import android.app.PendingIntent;
import android.os.Parcelable;
import p.q43;
import p.n43;
import p.o43;
import p.j11;
import p.lq5;
import android.content.ComponentName;
import p.sv6;
import java.util.Set;
import p.dc3;
import android.os.BaseBundle;
import java.util.UUID;
import p.t6;
import java.lang.Double;
import p.bj;
import java.lang.StringBuilder;
import p.tm2;
import java.util.Locale;
import java.util.Arrays;
import p.a3;
import p.om2;
import p.az5;
import p.xm2;
import java.io.File;
import p.b17;
import p.af7;
import java.io.FilenameFilter;
import p.ya3;
import java.util.Iterator;
import p.mb2;
import java.util.List;
import java.util.Comparator;
import p.dj0;
import java.lang.Math;
import p.ib3;
import p.eb3;
import p.gb3;
import p.hb3;
import p.t;
import java.lang.NullPointerException;
import p.fs3;

public final class mj7	// class@001eac from classes.dex
{
    public final int a;

    public void mj7(int p0){
       this.a = p0;
       super();
    }
    public void mj7(int p0,int p1){
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
    public static final qo5 a(JSONObject p0){
       int i;
       int i3;
       String str1;
       JSONArray jSONArray = p0.getJSONObject("permissions").getJSONArray("data");
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       ArrayList uArrayList2 = new ArrayList();
       if ((i = jSONArray.length()) > 0) {
          int i1 = 0;
          while (true) {
             int i2 = i1 + 1;
             JSONObject jSONObject = jSONArray.optJSONObject(i1);
             String str = jSONObject.optString("permission");
             co5.l(str, "permission");
             if (!str.length()) {
                i3 = 1;
             label_003d :
                if (!i3 && (!co5.c(str, "installed") && (str1 = jSONObject.optString("status")) != null)) {
                   if ((i3 = str1.hashCode()) != -1309235419) {
                      if (i3 != 0x10b4f6bb) {
                         if (i3 == 0x21ddfc2e && str1.equals("declined")) {
                            uArrayList1.add(str);
                         }
                      }else if(!str1.equals("granted")){
                         uArrayList.add(str);
                      }
                   }else if(!str1.equals("expired")){
                      uArrayList2.add(str);
                   }
                }
                if (i2 < i) {
                   i1 = i2;
                }
             }else {
                i3 = 0;
                goto label_003d ;
             }
          }
       }
       return new qo5(uArrayList, uArrayList1, uArrayList2);
    }
    public static void b(View p0,View p1,String p2){
       int i1;
       Field declaredFiel;
       Field uField;
       int i = p0.hashCode();
       if (!nj7.v.contains(Integer.valueOf(i))) {
          nj7 onj7 = new nj7(p0, p1, p2);
          try{
             i1 = 0;
             declaredFiel = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
             try{
                uField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                try{
                label_0036 :
                   if (declaredFiel != null && uField != null) {
                      declaredFiel.setAccessible(true);
                      uField.setAccessible(true);
                      declaredFiel.setAccessible(true);
                      i1 = declaredFiel.get(p0);
                   }else {
                      p0.setOnClickListener(onj7);
                   }
                   nj7.v.add(Integer.valueOf(e0));
                }catch(java.lang.IllegalAccessException e0){
                }catch(java.lang.Exception e0){
                }
             }catch(java.lang.ClassNotFoundException e0){
             }catch(java.lang.NoSuchFieldException e0){
             }
             uField = i1;
             goto label_0036 ;
          }catch(java.lang.ClassNotFoundException e0){
             declaredFiel = i1;
          }catch(java.lang.NoSuchFieldException e0){
          }catch(java.lang.Exception e0){
          }
       }
       return;
    }
    public static t12 c(int p0){
       object oobject;
       t12[] ot12Array = t12.values();
       int len = ot12Array.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return t12.b;
          }
          oobject = ot12Array[i];
          i = i + 1;
          if (oobject.a == p0) {
             break ;
          }
       }
       return oobject;
    }
    public static vn d(Context p0){
       Method method;
       boolean b;
       Cursor uCursor;
       vn f;
       Uri uri;
       Uri uri1;
       PackageManager packageManag;
       Method method1;
       Boolean obj1;
       Context uContext = p0;
       String str = "limit_tracking";
       String str1 = "androidid";
       String str2 = "aid";
       Context uContext1 = Context.class;
       int i = 1;
       int i1 = 0;
       Object obj = null;
       try{
          Class[] uClassArray = new Class[i];
          uClassArray[i1] = uContext1;
          if ((method = ej4.H("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", uClassArray)) == null) {
          label_0034 :
             vn ovn = 0;
          label_0035 :
             if (ovn) {
                Class[] uClassArray1 = new Class[i];
                uClassArray1[i1] = uContext1;
                if ((method1 = ej4.H("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", uClassArray1)) != null) {
                   Object[] objArray = new Object[i];
                   objArray[i1] = uContext;
                   if ((obj1 = ej4.U(obj, method1, objArray)) != null) {
                      uClassArray1 = new Class[i1];
                      method = ej4.G(obj1.getClass(), "getId", uClassArray1);
                      Class[] uClassArray2 = new Class[i1];
                      Method method2 = ej4.G(obj1.getClass(), "isLimitAdTrackingEnabled", uClassArray2);
                      if (method != null && method2 != null) {
                         b = new vn();
                         Object[] objArray1 = new Object[i1];
                         b.a = ej4.U(obj1, method, objArray1);
                         objArray = new Object[i1];
                         boolean b1 = ((obj1 = ej4.U(obj1, method2, objArray)) == null)? false: obj1.booleanValue();
                         b.e = b1;
                      label_0094 :
                         if (!b) {
                            un oun = new un();
                            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                            String str3 = "com.google.android.gms";
                            try{
                               intent.setPackage(str3);
                               if (uContext.bindService(intent, oun, i)) {
                                  try{
                                     tn i2 = new tn(oun.a());
                                     ovn = new vn();
                                     ovn.a = i2.g();
                                     ovn.e = i2.k();
                                     uContext.unbindService(oun);
                                     b = ovn;
                                  }catch(java.lang.Exception e0){
                                     uContext.unbindService(oun);
                                  }
                               }else {
                               label_00d9 :
                                  b = obj;
                               }
                            }catch(java.lang.SecurityException e0){
                               goto label_00d9 ;
                            }
                            if (b == null) {
                               b = new vn();
                            }
                         }
                         try{
                            if (!co5.c(Looper.myLooper(), Looper.getMainLooper())) {
                               if ((f = vn.f) != null && ((System.currentTimeMillis() - f.b) - 0x36ee80) < 0) {
                                  return f;
                               }else {
                                  String[] stringArray = new String[]{str2,str1,e0};
                                  ProviderInfo providerInfo = p0.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", i1);
                                  ProviderInfo providerInfo1 = p0.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", i1);
                                  if (providerInfo != null) {
                                     providerInfo = providerInfo.packageName;
                                     co5.l(providerInfo, "contentProviderInfo.packageName");
                                     if (uz1.a(uContext, providerInfo)) {
                                        uri = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                                     label_0149 :
                                        uri1 = uri;
                                     label_014c :
                                        String str4 = ((packageManag = p0.getPackageManager()) == null)? obj: packageManag.getInstallerPackageName(p0.getPackageName());
                                        if (str4 != null) {
                                           b.d = str4;
                                        }
                                        if (uri1 == null) {
                                           b.b = System.currentTimeMillis();
                                           vn.f = b;
                                           return b;
                                        }else if((uCursor = p0.getContentResolver().query(uri1, stringArray, null, null, null)) != null && uCursor.moveToFirst()){
                                           int columnIndex = uCursor.getColumnIndex(str1);
                                           int columnIndex1 = uCursor.getColumnIndex(e0);
                                           b.c = uCursor.getString(uCursor.getColumnIndex(str2));
                                           if (columnIndex > 0 && (columnIndex1 > 0 && b.a() == null)) {
                                              b.a = uCursor.getString(columnIndex);
                                              b.e = Boolean.parseBoolean(uCursor.getString(columnIndex1));
                                           }
                                           uCursor.close();
                                           b.b = System.currentTimeMillis();
                                           vn.f = b;
                                           return b;
                                        }else {
                                           b.b = System.currentTimeMillis();
                                           vn.f = b;
                                           if (uCursor != null) {
                                              uCursor.close();
                                           }
                                           return b;
                                        }
                                     }
                                  }
                                  if (providerInfo1 != null) {
                                     providerInfo = providerInfo1.packageName;
                                     co5.l(providerInfo, "wakizashiProviderInfo.packageName");
                                     if (uz1.a(uContext, providerInfo)) {
                                        uri = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                        goto label_0149 ;
                                     }
                                  }
                                  uri1 = obj;
                                  goto label_014c ;
                               }
                            }else {
                               throw new ny1("getAttributionIdentifiers cannot be called on the main thread.");
                            }
                         }catch(java.lang.Exception e0){
                            uCursor = obj;
                         }catch(java.lang.Exception e0){
                         }
                         co5.K(e0, "Caught unexpected exception in getAttributionId\(\): ");
                         if (uCursor) {
                            uCursor.close();
                         }
                         return obj;
                      }
                   }
                }
             }
          }else {
             Object[] objArray2 = new Object[i];
             objArray2[i1] = uContext;
             Object obj2 = ej4.U(obj, method, objArray2);
             if (obj2 instanceof Integer && co5.c(obj2, Integer.valueOf(i1))) {
                obj2 = 1;
                goto label_0035 ;
             }else {
                goto label_0034 ;
             }
          }
       }catch(java.lang.Exception e0){
          HashSet a = sz1.a;
       }
       b = obj;
       goto label_0094 ;
    }
    public static qz1 f(){
       t65[] ot65Array = new t65[]{new t65(Integer.valueOf(2), null),new t65(Integer.valueOf(4), null),new t65(Integer.valueOf(9), null),new t65(Integer.valueOf(17), null),new t65(Integer.valueOf(341), null)};
       ot65Array = new t65[]{new t65(Integer.valueOf(102), null),new t65(Integer.valueOf(190), null),new t65(Integer.valueOf(412), null)};
       qz1 ot65Array1 = new qz1(null, q14.n0(ot65Array), q14.n0(ot65Array), null, null, null);
       return ot65Array;
    }
    public static String g(){
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("init", System.currentTimeMillis());
          String str = e0.toString();
          co5.l(str, "e2e.toString\(\)");
          return str;
       }catch(org.json.JSONException e0){
       }
    }
    public static void i(ns3 p0,String p1,String p2,Object[] p3){
       sz1.i(p0);
    }
    public static void j(ns3 p0,String p1,String p2){
       co5.o(p0, "behavior");
       co5.o(p1, "tag");
       co5.o(p2, "string");
       sz1.i(p0);
    }
    public static void k(Uri p0){
       o11 c;
       o11 w;
       try{
          mj7.m();
          g11.d.lock();
          if ((c = g11.c) == null) {
          }else {
             Bundle uBundle = new Bundle();
             if ((w = c.w) != null) {
                uBundle.putParcelable("android.support.customtabs.extra.SESSION_ID", w);
             }
             c.c.g(c.t, p0, uBundle);
          }
          g11.d.unlock();
          return;
       }catch(android.os.RemoteException e0){
       }
    }
    public static HashMap l(JSONObject p0){
       int i;
       JSONObject jSONObject;
       int i3;
       JSONArray jSONArray1;
       HashSet hashSet;
       int i4;
       JSONArray jSONArray = p0.optJSONArray("items");
       if (!jSONArray.length()) {
          return null;
       }
       HashMap hashMap = new HashMap();
       if ((i = jSONArray.length()) > 0) {
          int i1 = 0;
          while (true) {
             int i2 = i1 + 1;
             if ((jSONObject = jSONArray.optJSONObject(i1)) == null || !(i3 = jSONObject.optInt("code"))) {
             label_0063 :
                if (i2 < i) {
                   i1 = i2;
                }
             }else if((jSONArray1 = jSONObject.optJSONArray("subcodes")) != null && jSONArray1.length() > 0){
                hashSet = new HashSet();
                if ((i4 = jSONArray1.length()) > 0) {
                   int i5 = 0;
                   while (true) {
                      int i6 = i5 + 1;
                      if (i5 = jSONArray1.optInt(i5)) {
                         hashSet.add(Integer.valueOf(i5));
                         break ;
                      }else if(i6 >= i4){
                         i5 = i6;
                      }
                   }
                }
             }else {
                hashSet = null;
             }
             hashMap.put(Integer.valueOf(i3), hashSet);
             goto label_0063 ;
          }
       }
       return hashMap;
    }
    public static void m(){
       lq5 b;
       o11 oo11;
       g11.d.lock();
       if (g11.c == null && (b = g11.b) != null) {
          try{
             j11 oj11 = new j11();
             oo11 = (!b.b.k(oj11))? null: new o11(b.b, oj11, b.c);
          }catch(android.os.RemoteException e0){
          }
          g11.c = oo11;
       }
       g11.d.unlock();
       return;
    }
    public static void n(String p0,String p1,float[] p2){
       try{
          if (sv6.b.contains(p0)) {
             dc3 a = new dc3(sz1.a()).a;
             a.getClass();
             Bundle uBundle = new Bundle();
             uBundle.putString("_is_suggested_event", "1");
             uBundle.putString("_button_text", p1);
             a.a(p0, null, uBundle, false, t6.a());
          }else if(sv6.c.contains(p0)){
             Bundle uBundle1 = new Bundle();
             uBundle1.putString("event_name", p0);
             JSONObject jSONObject = new JSONObject();
             StringBuilder str = "";
             int len = p2.length;
             int i = 0;
             while (i < len) {
                i = i + 1;
                str = str.append(p2[i]).append(",");
             }
             jSONObject.put("dense", str);
             jSONObject.put("button_text", p1);
             uBundle1.putString("metadata", jSONObject.toString());
             Object[] objArray = new Object[]{sz1.b()};
             jSONObject = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(objArray, 1));
             co5.l(jSONObject, "java.lang.String.format\(locale, format, *args\)");
             tm2 otm2 = az5.N(null, jSONObject, null, null);
             otm2.d = uBundle1;
             otm2.c();
          }
          return;
       }catch(org.json.JSONException e0){
       }
    }
    public static void p(){
       File[] uFileArray;
       if (ej4.X()) {
          return;
       }
       File uFile = b17.n();
       int i = 0;
       if (uFile == null) {
          uFileArray = new File[i];
       }else if((uFileArray = uFile.listFiles(new af7(1))) == null){
          uFileArray = new File[i];
       }
       ArrayList uArrayList = new ArrayList(uFileArray.length);
       int len = uFileArray.length;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          object oobject = uFileArray[i1];
          co5.o(oobject, "file");
          uArrayList.add(new ya3(oobject));
       }
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj.b()) {
             uArrayList1.add(obj);
          }
       }
       List list = dj0.x0(uArrayList1, new mb2(2));
       JSONArray jSONArray = new JSONArray();
       Iterator iterator1 = eb3.J(i, Math.min(list.size(), 5)).iterator();
       while (iterator1.c != null) {
          jSONArray.put(list.get(iterator1.nextInt()));
       }
       b17.z("crash_reports", jSONArray, new t(1, list));
       return;
    }
    public synchronized final qz1 e(){
       qz1 e;
       if (qz1.e == null) {
          qz1.e = mj7.f();
       }
       if ((e = qz1.e) != null) {
          return e;
       }else {
          throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
       }
    }
    public final Uri h(Bundle p0,String p1){
       switch (this.a){
           case 5:
           default:
             Uri uri = (co5.c(p1, "oauth"))? ej4.e(p0, eb3.n(), "oauth/authorize"): ej4.e(p0, eb3.n(), sz1.d()+"/dialog/"+p1);
             return uri;
       }
       return ej4.e(p0, eb3.l(), sz1.d()+"/dialog/"+p1);
    }
    public synchronized final void o(String p0){
       co5.o(p0, "original");
       fs3.e.put(p0, "ACCESS_TOKEN_REMOVED");
    }
}
