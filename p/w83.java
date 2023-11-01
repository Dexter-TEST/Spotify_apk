package p.w83;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import p.sz1;
import android.content.pm.PackageManager;
import java.lang.String;
import android.content.pm.ApplicationInfo;
import android.os.BaseBundle;
import java.lang.CharSequence;
import java.util.List;
import p.av6;
import java.lang.Object;
import java.lang.Integer;
import p.v12;
import p.t12;
import java.lang.Class;
import p.t83;
import p.b3;
import p.v83;
import java.lang.System;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import p.bc;
import p.ij;
import java.lang.ClassLoader;
import p.s83;
import java.lang.Runnable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import p.co5;
import java.lang.reflect.Method;
import p.tu6;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import java.util.concurrent.ConcurrentHashMap;
import p.q83;
import java.lang.Boolean;
import p.u83;
import android.content.Intent;
import p.o83;
import p.p83;
import p.ow;
import p.f22;
import p.h22;
import p.me7;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import android.content.ServiceConnection;

public abstract class w83	// class@002ae7 from classes.dex
{
    public static final AtomicBoolean a;

    static {
       w83.a = new AtomicBoolean(false);
    }
    public static final void a(){
       ApplicationInfo applicationI;
       Class uClass;
       t83 u;
       long l2;
       SharedPreferences obj;
       p83 e;
       Intent f;
       o83 d;
       Class uClass1;
       String str3;
       Intent intent;
       if (w83.a.get()) {
          boolean i = 2;
          int i1 = 0;
          int i2 = 1;
          try{
             Context uContext = sz1.a();
             PackageManager packageManag = uContext.getPackageManager();
             if ((applicationI = packageManag.getApplicationInfo(uContext.getPackageName(), 128)) != null && (str3 = applicationI.metaData.getString("com.google.android.play.billingclient.version")) != null) {
                String[] stringArray = new String[]{"."};
                if (Integer.parseInt(av6.B0(str3, stringArray, 3, i).get(i1)) >= i) {
                   str3 = 1;
                label_0045 :
                   void ovoid = null;
                   long l = 0;
                   long l1 = 1000;
                   if (applicationI && v12.c(t12.H)) {
                      uContext = sz1.a();
                      try{
                         String str = "com.android.billingclient.api.Purchase";
                         uClass = Class.forName(str);
                      }catch(java.lang.ClassNotFoundException e0){
                         uClass = ovoid;
                      }
                      if (uClass != null) {
                         b3 s = t83.s;
                         _monitor_enter(s);
                         AtomicBoolean t = t83.t;
                         if (t.get()) {
                            u = t83.u;
                            _monitor_exit(s);
                         }else {
                            b3.i(uContext);
                            t.set(i2);
                            u = t83.u;
                            _monitor_exit(s);
                         }
                         if (u != null && t83.v.get()) {
                            v83.a();
                            l2 = System.currentTimeMillis() / l1;
                            SharedPreferences a = v83.a;
                            String str1 = "sharedPreferences";
                            if (a != null) {
                               long longx = a.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", l);
                               if ((longx - l) && ((l2 - longx) - (long)0x15180) < 0) {
                                  l = 0;
                               }else if((obj = v83.a) != null){
                                  obj.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", l2).apply();
                                  obj = 1;
                               }else {
                                  co5.N(str1);
                                  throw ovoid;
                               }
                               if (l) {
                                  t83 i3 = u.i;
                                  ClassLoader classLoader = i3.getClassLoader();
                                  Class[] uClassArray = new Class[i2];
                                  uClassArray[i1] = i3;
                                  obj = Proxy.newProxyInstance(classLoader, uClassArray, new s83(u, new ij(u, 23, new bc(7)), i1));
                                  co5.l(obj, "newProxyInstance\(\n            purchaseHistoryResponseListenerClazz.classLoader,\n            arrayOf\(purchaseHistoryResponseListenerClazz\),\n            PurchaseHistoryResponseListenerWrapper\(runnable\)\)");
                                  Object[] objArray = new Object[e0];
                                  objArray[i1] = "inapp";
                                  objArray[i2] = obj;
                                  tu6.y(u.c, u.b, u.p, objArray);
                               }else {
                                  bc uobc = new bc(8);
                                  Object[] objArray1 = new Object[i2];
                                  objArray1[i1] = "inapp";
                                  Object[] objArray2 = new Object[i1];
                                  Iterator obj1 = tu6.y(u.d, tu6.y(u.c, u.b, u.j, objArray1), u.k, objArray2);
                                  if (obj1 instanceof List) {
                                  }else {
                                     obj1 = ovoid;
                                  }
                                  if (obj1 != null) {
                                     try{
                                        ArrayList uArrayList = new ArrayList();
                                        obj1 = obj1.iterator();
                                        while (obj1.hasNext()) {
                                           Object[] objArray3 = new Object[i1];
                                           String obj2 = tu6.y(u.e, obj1.next(), u.l, objArray3);
                                           if (obj2 instanceof String) {
                                           }else {
                                              obj2 = ovoid;
                                           }
                                           if (obj2 == null) {
                                              continue ;
                                           }else {
                                              JSONObject jSONObject = new JSONObject(obj2);
                                              if (jSONObject.has("productId")) {
                                                 obj2 = jSONObject.getString("productId");
                                                 uArrayList.add(obj2);
                                                 co5.l(obj2, "skuID");
                                                 t83.w.put(obj2, jSONObject);
                                              }
                                           }
                                        }
                                        u.a(uArrayList, uobc);
                                     }catch(org.json.JSONException e0){
                                     }
                                  }
                               }
                            }else {
                               co5.N(str1);
                               throw ovoid;
                            }
                         }
                      }
                   }else if(q83.b != null){
                      String str2 = "com.android.vending.billing.IInAppBillingService$Stub";
                      try{
                         uClass1 = Class.forName(str2);
                      }catch(java.lang.ClassNotFoundException e0){
                         uClass1 = ovoid;
                      }
                      i = (uClass1 != null)? true: false;
                      Boolean uBoolean = Boolean.valueOf(i);
                      q83.b = uBoolean;
                      if (!co5.c(uBoolean, Boolean.FALSE)) {
                         str2 = "com.android.billingclient.api.ProxyBillingActivity";
                         try{
                            uClass1 = Class.forName(str2);
                         }catch(java.lang.ClassNotFoundException e0){
                            uClass1 = ovoid;
                         }
                         i = (uClass1 != null)? true: false;
                         q83.c = Boolean.valueOf(i);
                         l2 = System.currentTimeMillis() / l1;
                         SharedPreferences d1 = u83.d;
                         str3 = "LAST_CLEARED_TIME";
                         l1 = d1.getLong(str3, l);
                         if (!(l1 - l)) {
                            d1.edit().putLong(str3, l2).apply();
                         }else if(((l2 - l1) - (long)0x93a80) > 0){
                            d1.edit().clear().putLong(str3, l2).apply();
                         }
                         intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                         co5.l(intent, "Intent\(\"com.android.vending.billing.InAppBillingService.BIND\"\)\n            .setPackage\(\"com.android.vending\"\)");
                         q83.f = intent;
                         q83.d = new o83();
                         q83.e = new p83(i1);
                      }
                   }
                   if (!co5.c(q83.b, Boolean.FALSE)) {
                      f22 uof22 = ((uof22 = h22.b(sz1.b())) != null && (me7.a() && uof22.f != null))? 1: 0;
                      if (uof22 && q83.a.compareAndSet(i1, i2)) {
                         Context uContext1 = sz1.a();
                         if (uContext1 instanceof Application) {
                            Context uContext2 = uContext1;
                            if ((e = q83.e) != null) {
                               uContext2.registerActivityLifecycleCallbacks(e);
                               if ((f = q83.f) != null) {
                                  if ((d = q83.d) != null) {
                                     uContext1.bindService(f, d, i2);
                                  }else {
                                     co5.N("serviceConnection");
                                     throw ovoid;
                                  }
                               }else {
                                  co5.N("intent");
                                  throw ovoid;
                               }
                            }else {
                               co5.N("callbacks");
                               throw ovoid;
                            }
                         }
                      }
                   }
                }
             }
          }catch(java.lang.Exception e0){
          }
          applicationI = 0;
          goto label_0045 ;
       }
       return;
    }
}
