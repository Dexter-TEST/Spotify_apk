package p.t50;
import p.l60;
import p.ty6;
import p.bu6;
import p.eu6;
import p.hu6;
import p.ju6;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ConcurrentHashMap;
import p.ji5;
import p.x12;
import p.px3;
import p.c60;
import p.qo5;
import p.ob6;
import p.x45;
import java.util.concurrent.CountDownLatch;
import p.q50;
import java.util.concurrent.TimeUnit;
import android.os.AsyncTask;
import p.sb6;
import p.ib6;
import p.et0;
import org.json.JSONObject;
import android.content.pm.ActivityInfo;
import android.os.BaseBundle;
import java.lang.CharSequence;
import java.lang.Class;
import p.qx;
import java.lang.System;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.content.pm.PackageInfo;
import java.util.Iterator;
import java.lang.ref.Reference;
import p.mb6;
import p.nb6;
import p.pb6;
import p.kb6;
import p.hb6;
import java.util.List;
import p.h60;
import p.w40;
import p.uy6;
import android.net.Uri;
import p.g60;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.Long;
import java.lang.reflect.Method;
import p.f60;
import android.content.ServiceConnection;
import java.util.HashSet;
import p.qb6;
import java.lang.Void;
import java.util.concurrent.Executor;
import android.os.Looper;
import java.lang.Thread;
import p.qh;
import java.util.Set;
import android.text.TextUtils;
import android.app.Application;
import p.u50;
import android.app.Application$ActivityLifecycleCallbacks;
import p.cu6;
import p.iu6;
import p.ku6;
import p.ox7;

public final class t50 implements l60, ty6, bu6, eu6, hu6, ju6	// class@0026ff from classes.dex
{
    public final px3 a;
    public final ji5 b;
    public final c60 c;
    public final Context d;
    public final Semaphore e;
    public final ob6 f;
    public int g;
    public final ConcurrentHashMap h;
    public int i;
    public int j;
    public boolean k;
    public WeakReference l;
    public final ConcurrentHashMap m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public u50 u;
    public final x12 v;
    public static final boolean A = true;
    public static boolean B;
    public static t50 C;
    public static final String D = "app.link";
    public static final String[] E;
    public static String F;
    public static String w;
    public static boolean x;
    public static boolean y;
    public static boolean z;

    static {
       String[] stringArray = new String[]{"extra_launch_uri","branch_intent"};
       t50.E = stringArray;
       t50.F = null;
    }
    public void t50(Context p0){
       qo5 oqo5;
       super();
       this.e = new Semaphore(1);
       this.g = 0;
       this.h = new ConcurrentHashMap();
       this.i = 1;
       this.j = 3;
       this.k = false;
       this.m = new ConcurrentHashMap();
       this.n = false;
       this.o = false;
       this.p = false;
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = false;
       this.d = p0;
       this.b = ji5.g(p0);
       x12 ox12 = new x12(p0);
       this.v = ox12;
       this.a = new px3(this);
       c60 uoc60 = new c60(p0, 1);
       this.c = uoc60;
       c60 uoc601 = new c60(p0, 0);
       if ((oqo5 = new qo5(p0)) == null) {
          ob6 oob6 = ob6.class;
          _monitor_enter(oob6);
          if (ob6.c == null) {
             ob6.c = new ob6(p0);
          }
          _monitor_exit(oob6);
       }
       this.f = ob6.c;
       if (ox12.a == null) {
          this.n = uoc60.a.v(p0, this);
       }
       return;
    }
    public static void b(CountDownLatch p0,int p1,q50 p2){
       long l = (long)p1;
       boolean b = true;
       try{
          if (!p0.await(l, TimeUnit.MILLISECONDS)) {
             p2.cancel(b);
             et0.i(p2.a.b);
             p2.a(new sb6(-120));
          }
       }catch(java.lang.InterruptedException e0){
          p2.cancel(b);
          et0.i(p2.a.b);
          p2.a(new sb6(-120));
       }
       return;
    }
    public static boolean d(JSONObject p0,ActivityInfo p1){
       String str = "io.branch.sdk.auto_link_keys";
       if (p1.metaData.getString(str) != null) {
          String[] stringArray = p1.metaData.getString(str).split(",");
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             if (p0.has(stringArray[i])) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public static boolean e(JSONObject p0,ActivityInfo p1){
       String str2;
       String str = "$deeplink_path";
       String str1 = "$android_deeplink_path";
       try{
          if (p0.has(str1)) {
             str2 = p0.getString(str1);
          }else if(p0.has(str)){
             str2 = p0.getString(str);
          }else {
             str2 = null;
          }
       }catch(org.json.JSONException e0){
       }
       str1 = "io.branch.sdk.auto_link_path";
       if (p1.metaData.getString(str1) != null && str2 != null) {
          String[] stringArray = p1.metaData.getString(str1).split(",");
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             String[] stringArray1 = stringArray[i].trim().split("\\?")[0].split("/");
             String[] stringArray2 = str2.split("\\?")[0].split("/");
             if (stringArray1.length == stringArray2.length) {
                int i1 = 0;
                while (true) {
                   if (i1 < stringArray1.length && i1 < stringArray2.length) {
                      object oobject = stringArray1[i1];
                      if (oobject.equals(stringArray2[i1]) || oobject.contains("*")) {
                         i1 = i1 + 1;
                      }
                   }else {
                      stringArray1 = 1;
                   label_007b :
                      if (stringArray1) {
                         return true;
                      }else {
                         i = i + 1;
                      }
                   }
                }
             }
             stringArray1 = 0;
             goto label_007b ;
          }
       }
       return 0;
    }
    public static boolean f(String p0){
       try{
          Class.forName(p0);
          return true;
       }catch(java.lang.ClassNotFoundException e0){
          return false;
       }
    }
    public static JSONObject g(String p0){
       int i7;
       int i8;
       if (p0.equals("bnc_no_value")) {
          return new JSONObject();
       }
       try{
          return new JSONObject(p0);
       }catch(org.json.JSONException e0){
          byte[] bytes = p0.getBytes();
          int len = bytes.length;
          int i = (len * 3) / 4;
          byte[] uobyteArray = new byte[i];
          int[] c = qx.c;
          len = len + 0;
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
       label_0027 :
          int i5 = 2;
          int i6 = 1;
          if (i1 < len) {
             if (i2) {
             label_0074 :
                i7 = i1 + 1;
                i1 = bytes[i1] & 0x00ff;
                i1 = c[i1];
                i8 = -1;
                if (i2) {
                   if (i2 != i6) {
                      i6 = -2;
                      if (i2 != i5) {
                         i5 = 5;
                         if (i2 != 3) {
                            if (i2 != 4) {
                               if (i2 == i5 && i1 != i8) {
                               label_0113 :
                                  i4 = 0;
                                  i6 = 0;
                               label_0115 :
                                  if (i6) {
                                     if (i4 != i) {
                                        bytes = new byte[i4];
                                        System.arraycopy(uobyteArray, 0, bytes, 0, i4);
                                        uobyteArray = bytes;
                                     }
                                     try{
                                        return new JSONObject(new String(uobyteArray));
                                     }catch(org.json.JSONException e15){
                                        e15.printStackTrace();
                                        return new JSONObject();
                                     }
                                  }else {
                                     throw new IllegalArgumentException("bad base-64");
                                  }
                               }
                            }else if(i1 == i6){
                               i2 = i2 + 1;
                            }else if(i1 != i8){
                               goto label_0113 ;
                            }
                         }else if(i1 >= 0){
                            i2 = i3 << 6;
                            i1 = i1 | i2;
                            i2 = i4 + 2;
                            uobyteArray[i2] = (byte)i1;
                            i2 = i4 + 1;
                            i3 = i1 >> 8;
                            uobyteArray[i2] = (byte)i3;
                            i2 = i1 >> 16;
                            uobyteArray[i4] = (byte)i2;
                            i4 = i4 + 3;
                            i3 = i1;
                            i2 = 0;
                         }else if(i1 == i6){
                            i1 = i4 + 1;
                            i2 = i3 >> 2;
                            uobyteArray[i1] = (byte)i2;
                            i1 = i3 >> 10;
                            uobyteArray[i4] = (byte)i1;
                            i4 = i4 + 2;
                            i2 = 5;
                         }else if(i1 != i8){
                            goto label_0113 ;
                         }
                      }else if(i1 >= 0){
                         if (i1 == i6) {
                            i1 = i4 + 1;
                            i2 = i3 >> 4;
                            uobyteArray[i4] = (byte)i2;
                            i4 = i1;
                            i2 = 4;
                         }else if(i1 != i8){
                            goto label_0113 ;
                         }
                      }
                   }else if(i1 >= 0){
                      if (i1 != i8) {
                         goto label_0113 ;
                      }
                   }
                   i3 = i3 << 6;
                   i1 = i1 | i3;
                label_00e8 :
                   i2 = i2 + 1;
                   i3 = i1;
                }else if(i1 >= 0){
                   goto label_00e8 ;
                }else if(i1 != i8){
                   goto label_0113 ;
                }
                i1 = i7;
                goto label_0027 ;
             }
             if ((i7 = i1 + 4) <= len) {
                i3 = bytes[i1] & 0x00ff;
                i3 = c[i3] << 18;
                i8 = i1 + 1;
                i8 = bytes[i8] & 0x00ff;
                i8 = c[i8] << 12;
                i3 = i3 | i8;
                i8 = i1 + 2;
                i8 = bytes[i8] & 0x00ff;
                i8 = c[i8] << 6;
                i3 = i3 | i8;
                i8 = i1 + 3;
                i8 = bytes[i8] & 0x00ff;
                if ((i3 = i3 | c[i8]) >= 0) {
                   i1 = i4 + 2;
                   uobyteArray[i1] = (byte)i3;
                   i1 = i4 + 1;
                   i8 = i3 >> 8;
                   uobyteArray[i1] = (byte)i8;
                   i1 = i3 >> 16;
                   uobyteArray[i4] = (byte)i1;
                   i4 = i4 + 3;
                   i1 = i7;
                }
             }
             if (i1 >= len) {
             label_00f2 :
                if (i2 != i6) {
                   if (i2 != i5) {
                      if (i2 != 3) {
                         if (i2 != 4) {
                            goto label_0115 ;
                         }else {
                            goto label_0113 ;
                         }
                      }else {
                         int i9 = i4 + 1;
                         uobyteArray[i4] = (byte)(i3 >> 10);
                         i4 = i9 + 1;
                         uobyteArray[i9] = (byte)(i3 >> 2);
                         goto label_0115 ;
                      }
                   }else {
                      uobyteArray[i4] = (byte)(i3 >> 4);
                      i4 = i4 + 1;
                      goto label_0115 ;
                   }
                }else {
                   goto label_0113 ;
                }
             }else {
                goto label_0074 ;
             }
          }else {
             goto label_00f2 ;
          }
       }
    }
    public static synchronized t50 i(){
       _monitor_enter(t50.class);
       if (t50.C == null) {
          ji5.a("Branch instance is not created yet. Make sure you call getAutoInstance\(Context\).");
       }
       _monitor_exit(t50.class);
       return t50.C;
    }
    public static boolean l(Activity p0){
       boolean b = false;
       if (p0 != null && (p0.getIntent() != null && p0.getIntent().getBooleanExtra("branch_used", b))) {
          b = true;
       }
       return b;
    }
    public final void a(String p0,String p1){
       this.m.put(p0, p1);
    }
    public final void c(){
       object oobject;
       ActivityInfo metaData1;
       ActivityInfo name;
       String str = "+clicked_branch_link";
       t50 td = this.d;
       JSONObject jSONObject = this.j();
       try{
          if (jSONObject.has(str) && (jSONObject.getBoolean(str) && jSONObject.length() > 0)) {
             ApplicationInfo metaData = td.getPackageManager().getApplicationInfo(td.getPackageName(), 128).metaData;
             boolean b = false;
             if (metaData != null && metaData.getBoolean("io.branch.sdk.auto_link_disable", b)) {
                return;
             }else {
                PackageInfo activities = td.getPackageManager().getPackageInfo(td.getPackageName(), 129).activities;
                int i = 1501;
                if (activities != null) {
                   int len = activities.length;
                   while (true) {
                      if (b < len) {
                         if ((oobject = activities[b]) != null && ((metaData1 = oobject.metaData) != null && (metaData1.getString("io.branch.sdk.auto_link_keys") != null && (oobject.metaData.getString("io.branch.sdk.auto_link_path") == null && (t50.d(jSONObject, oobject) && !t50.e(jSONObject, oobject)))))) {
                            name = oobject.name;
                            i = oobject.metaData.getInt("io.branch.sdk.auto_link_request_code", i);
                         label_0084 :
                            if (name != null && this.h() != null) {
                               Activity uActivity = this.h();
                               Intent intent = new Intent(uActivity, Class.forName(name));
                               intent.putExtra("io.branch.sdk.auto_linked", "true");
                               intent.putExtra("referring_data", jSONObject.toString());
                               Iterator iterator = jSONObject.keys();
                               while (iterator.hasNext()) {
                                  String str1 = iterator.next();
                                  intent.putExtra(str1, jSONObject.getString(str1));
                               }
                               uActivity.startActivityForResult(intent, i);
                            }
                         }else {
                            b = b + 1;
                         }
                      }
                   }
                }
                name = null;
                goto label_0084 ;
             }
          }
          return;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }catch(java.lang.ClassNotFoundException e0){
       }catch(java.lang.Exception e0){
       }
    }
    public final Activity h(){
       t50 tl;
       if ((tl = this.l) == null) {
          return null;
       }
       return tl.get();
    }
    public final JSONObject j(){
       return t50.g(this.b.p("bnc_session_params"));
    }
    public final void k(ib6 p0){
       Object d;
       if (this.v.a != null && !p0.k()) {
          et0.i(p0.b);
          p0.f(-117, "");
          return;
       }else {
          int i = 1;
          if (this.j != i && !(v0 = p0 instanceof mb6)) {
             if (p0 instanceof nb6) {
                p0.f(-101, "");
                return;
             }else if(p0 instanceof pb6){
                return;
             }else {
                int i1 = 0;
                if (!v0 && !p0 instanceof kb6) {
                   d = 1;
                }
                if (i1) {
                   p0.a(hb6.a);
                }
             }
          }
          t50 tf = this.f;
          tf.getClass();
          d = ob6.d;
          _monitor_enter(d);
          tf.b.add(p0);
          if (tf.a() >= 25) {
             tf.b.remove(i);
          }
          tf.c();
          _monitor_exit(d);
          p0.d = System.currentTimeMillis();
          this.p();
          return;
       }
    }
    public final void m(){
       this.n = false;
       this.f.e(hb6.b);
       if (this.s != null) {
          this.o();
          this.s = false;
       }else {
          this.p();
       }
       return;
    }
    public final void n(String p0){
       if (mb6.r(p0)) {
          this.c();
       }
       return;
    }
    public final void o(){
       ib6 oib6;
       Uri uri;
       if (this.v.a == null && this.d != null) {
          t50 tf = this.f;
          tf.getClass();
          String d = ob6.d;
          _monitor_enter(d);
          Iterator iterator = tf.b.iterator();
          while (iterator.hasNext()) {
             if ((oib6 = iterator.next()) != null && oib6 instanceof mb6) {
                oib6.a(hb6.t);
             }
          }
          _monitor_exit(d);
          if (h60.i == null) {
             h60.i = new h60();
          }
          h60 i = h60.i;
          t50 td = this.d;
          d = t50.D;
          t50 tc = this.c;
          t50 tb = this.b;
          w40 ow40 = new w40(this);
          h60 e = i.e;
          boolean b = false;
          i.d = b;
          if (((System.currentTimeMillis() - tb.i("bnc_branch_strong_match_time")) - 0x9a7ec800) < 0) {
             i.b(ow40, i.d);
          }else if(i.c == null){
             i.b(ow40, i.d);
          }else {
             try{
                tc.b();
                if ((uri = h60.a(d, tc, tb, td)) != null) {
                   i.b.postDelayed(new g60(i, ow40, 1), 500);
                   Class[] uClassArray = new Class[]{Long.TYPE};
                   uClassArray = new Class[]{i.f};
                   Class[] uClassArray1 = new Class[]{Uri.class,Bundle.class,List.class};
                   Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                   intent.setPackage("com.android.chrome");
                   f60 v13 = new f60(i, e.getMethod("warmup", uClassArray), e.getMethod("newSession", uClassArray), uri, i.g.getMethod("mayLaunchUrl", uClassArray1), tb, ow40);
                   td.bindService(intent, v13, 33);
                }else {
                   i.b(ow40, i.d);
                }
             }catch(java.lang.Exception e0){
                e0.b(ow40, e0.d);
             }
          }
       }
       return;
    }
    public final void p(){
       int i2;
       ib6 oib6;
       t50 tb;
       int i4;
       Void[] voidArray;
       String str = "processNextQueueItem, req ";
       try{
          this.e.acquire();
          if (this.g == null && this.f.a() > 0) {
             int i = 1;
             this.g = i;
             t50 tf = this.f;
             tf.getClass();
             CountDownLatch d = ob6.d;
             _monitor_enter(d);
             int i1 = 0;
             try{
                i2 = 0;
                oib6 = tf.b.get(i1);
             }catch(java.lang.IndexOutOfBoundsException e0){
                oib6 = i2;
             }catch(java.util.NoSuchElementException e0){
             }
             _monitor_exit(d);
             this.e.release();
             if (oib6 != null) {
                e0.concat(oib6.getClass().getSimpleName());
                str = (oib6.f.size() > 0)? 1: 0;
                if (!str) {
                   int i3 = -101;
                   if (!oib6 instanceof qb6 && !((this.b.j().equals("bnc_no_value") ^ i))) {
                      this.g = i1;
                      oib6.f(i3, "");
                   }else if(oib6 instanceof mb6 || oib6 instanceof kb6){
                      str = 0;
                   }else {
                      i4 = 1;
                   }
                   if (str) {
                      tb = this.b;
                      String str1 = "bnc_no_value";
                      tb = (((tb.o().equals(str1) ^ i)) && ((tb.k().equals(str1) ^ i)))? 1: 0;
                      if (!tb) {
                         this.g = i1;
                         oib6.f(i3, "");
                      }
                   }
                   tb = this.b;
                   i3 = tb.h(5500, "bnc_timeout");
                   i4 = tb.h(0x2710, "bnc_connect_timeout") + i3;
                   d = new CountDownLatch(i);
                   q50 oq50 = new q50(this, oib6, d);
                   try{
                      voidArray = new Void[i1];
                      oq50.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
                   }catch(java.lang.Exception e0){
                      oq50.execute(voidArray);
                   }
                   if (Looper.myLooper() == Looper.getMainLooper()) {
                      new Thread(new qh(this, d, e0, oq50)).start();
                   }else {
                      t50.b(d, e0, oq50);
                   }
                }else {
                   this.g = i1;
                }
             }else {
                this.f.d(i2);
             }
          }else {
             this.e.release();
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public final void q(Uri p0,Activity p1){
       int i1;
       String scheme;
       Intent intent;
       String queryParamet;
       t50 td = this.d;
       t50 tb = this.b;
       if (t50.y) {
          this.i = 2;
       }
       if (this.i == 2) {
          int i = 0;
          try{
             if (!t50.l(p1)) {
                if (c60.d == null) {
                   c60.d = new c60(td, 2);
                }
                String str2 = c60.d.d(p0.toString());
                tb.w("bnc_external_intent_uri", str2);
                if (str2.equals(p0.toString())) {
                   Bundle extras = p1.getIntent().getExtras();
                   Set set = extras.keySet();
                   if (!set.isEmpty()) {
                      JSONObject jSONObject = new JSONObject();
                      String[] e = t50.E;
                      int len = e.length;
                      int i2 = 0;
                      while (i2 < len) {
                         object oobject = e[i2];
                         if (set.contains(oobject)) {
                            jSONObject.put(oobject, extras.get(oobject));
                         }
                         i2 = i2 + 1;
                      }
                      if (jSONObject.length() > 0) {
                         tb.w("bnc_external_intent_extra", jSONObject.toString());
                      }
                   }
                }
             }
          }catch(java.lang.Exception e0){
          }
          try{
             if (p1 != null && (p1.getIntent() != null && (p1.getIntent().getExtras() != null && !t50.l(p1)))) {
                String str = p1.getIntent().getExtras().get("branch");
                if (str instanceof String) {
                }else if(str instanceof Uri){
                   str = str.toString();
                }else {
                   CharSequence uCharSequenc = null;
                }
                if (!TextUtils.isEmpty(str)) {
                   tb.w("bnc_push_identifier", str);
                   intent = p1.getIntent();
                   intent.putExtra("branch_used", true);
                   p1.setIntent(intent);
                   intent = 1;
                   if (i1) {
                      return;
                   }else if(p1 != null && (p1.getIntent() != null && ((p1.getIntent().getFlags() & 0x100000)))){
                      i1 = 1;
                   }else {
                      intent = 0;
                   }
                   if (!i1) {
                      str = "\\?";
                      String str1 = "link_click_id=";
                      if (p0 != null && (p0.isHierarchical() && (queryParamet = p0.getQueryParameter("link_click_id")) != null)) {
                         tb.w("bnc_link_click_identifier", queryParamet);
                         str1 = str1.concat(queryParamet);
                         queryParamet = p0.toString();
                         if (str1.equals(p0.getQuery())) {
                            str = str.concat(str1);
                         }else if(((queryParamet.length() - str1.length())) == queryParamet.indexOf(str1)){
                            str = "&".concat(str1);
                         }else {
                            str = str1.concat("&");
                         }
                         p1.getIntent().setData(Uri.parse(queryParamet.replaceFirst(str, "")));
                         p1.getIntent().putExtra("branch_used", true);
                         scheme = 1;
                      }
                   }
                }
             }
          }catch(java.lang.Exception e0){
          }catch(java.lang.Exception e0){
          }
          if (i) {
             return;
          }else if(p0 != null && p1 != null){
             scheme = p0.getScheme();
             intent = p1.getIntent();
             if (scheme != null && (intent != null && (scheme.equalsIgnoreCase("http") && (!scheme.equalsIgnoreCase("https") || (TextUtils.isEmpty(p0.getHost()) || t50.l(p1)))))) {
                if (c60.d == null) {
                   c60.d = new c60(e0, 2);
                }
                if (p0.toString().equalsIgnoreCase(c60.d.d(p0.toString()))) {
                   tb.w("bnc_app_link", p0.toString());
                }
                intent.putExtra("branch_used", true);
                p1.setIntent(intent);
             }
          }
       }
       return;
    }
    public final void r(Application p0){
       try{
          u50 ou50 = new u50();
          this.u = ou50;
          p0.unregisterActivityLifecycleCallbacks(ou50);
          p0.registerActivityLifecycleCallbacks(this.u);
          return;
       }catch(java.lang.NoSuchMethodError e0){
       }catch(java.lang.NoClassDefFoundError e0){
       }
    }
    public final void s(){
       String str;
       t50 ot50 = this;
       if (ot50.p == null && (ot50.o == null && (ot50.q == null && ot50.r == null))) {
          Long longx = Long.valueOf(0);
          if ((cu6.J.longValue() - longx.longValue()) > 0) {
             longx = cu6.J;
             str = "PlayStore";
          }else {
             str = "";
          }
          long l = Long.MIN_VALUE;
          if ((l - longx.longValue()) > 0) {
             longx = Long.valueOf(l);
             str = "AppGallery";
          }
          if ((iu6.J.longValue() - longx.longValue()) > 0) {
             longx = iu6.J;
             str = "GalaxyStore";
          }
          String str1 = "GetApps";
          if ((ku6.J.longValue() - longx.longValue()) > 0) {
             str = str1;
          }
          if (str.isEmpty()) {
             if (!TextUtils.isEmpty(cu6.K)) {
                str = "PlayStore";
             }
             if (!TextUtils.isEmpty(null)) {
                str = "AppGallery";
             }
             if (!TextUtils.isEmpty(iu6.K)) {
                str = "GalaxyStore";
             }
             if (!TextUtils.isEmpty(ku6.K)) {
                str = str1;
             }
          }
          t50 d = ot50.d;
          if (str.equals("PlayStore")) {
             ox7.E(d, cu6.K, cu6.I.longValue(), cu6.J.longValue(), str);
          }
          if (str.equals("AppGallery")) {
             ox7.E(d, null, Long.MIN_VALUE, Long.MIN_VALUE, str);
          }
          if (str.equals("GalaxyStore")) {
             ox7.E(d, iu6.K, iu6.I.longValue(), iu6.J.longValue(), str);
          }
          if (str.equals(str1)) {
             ox7.E(d, ku6.K, ku6.I.longValue(), ku6.J.longValue(), str);
          }
          this.p();
       }
       return;
    }
    public final void t(){
       ib6 oib6;
       int i = 0;
       try{
          while (i < this.f.a()) {
             t50 tf = this.f;
             tf.getClass();
             ib6 d = ob6.d;
             try{
                _monitor_enter(d);
                oib6 = tf.b.get(i);
             }catch(java.lang.IndexOutOfBoundsException e0){
                oib6 = null;
             }catch(java.util.NoSuchElementException e0){
             }
             _monitor_exit(d);
             if (oib6 != null && (d = oib6.a) != null) {
                if (d.has("session_id")) {
                   oib6.a.put("session_id", this.b.o());
                }
                if (d.has("randomized_bundle_token")) {
                   oib6.a.put("randomized_bundle_token", this.b.j());
                }
                if (d.has("randomized_device_token")) {
                   oib6.a.put("randomized_device_token", this.b.k());
                }
             }
             i = e0 + 1;
          }
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
       }
       return;
    }
}
