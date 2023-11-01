package p.bc;
import java.lang.Runnable;
import java.lang.Object;
import p.kc4;
import p.sv6;
import java.util.concurrent.Executor;
import p.sz1;
import p.s;
import android.content.Context;
import java.lang.String;
import android.app.ActivityManager;
import java.lang.NullPointerException;
import p.df4;
import java.util.Iterator;
import java.util.List;
import p.cf4;
import java.util.concurrent.atomic.AtomicBoolean;
import p.h22;
import p.f22;
import java.util.Collection;
import p.ic4;
import java.util.concurrent.ConcurrentHashMap;
import p.jc4;
import java.io.File;
import p.xj0;
import p.t6;
import java.lang.ref.Reference;
import android.app.Activity;
import p.is7;
import p.e22;
import android.content.SharedPreferences;
import org.json.JSONObject;
import p.v12;
import p.t12;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import p.b3;
import android.preference.PreferenceManager;
import p.ac6;
import java.lang.Long;
import p.on6;
import java.util.UUID;
import p.co5;
import p.uw5;
import p.u83;
import p.q83;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Integer;
import android.os.Bundle;
import android.os.BaseBundle;
import p.vn;
import p.mj7;
import p.t94;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.HashSet;
import p.ni;
import java.util.Set;
import p.u44;
import p.d3;
import p.oi;
import p.ka5;
import p.mi;
import p.yb6;
import java.lang.IllegalStateException;
import p.aj;
import p.zi;
import p.bb2;
import p.cc;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;

public final class bc implements Runnable	// class@00109d from classes.dex
{
    public final int a;

    public void bc(int p0){
       this.a = p0;
       super();
    }
    private static void a(){
       _monitor_enter(sv6.class);
       sz1.c().execute(new bc(13));
       _monitor_exit(sv6.class);
    }
    public final void run(){
       yb6 oyb6;
       Iterator iterator2;
       f22 uof22;
       Context uContext;
       ac6 g;
       Class uClass;
       String obj;
       ArrayList stringArrayL;
       ac6 obj1;
       long longx1;
       String str3;
       JSONObject jSONObject;
       jc4 ojc4;
       jc4 ojc41;
       WeakReference k;
       Object systemServic;
       long l = 0;
       String str = null;
       int i = 1;
       int i1 = 0;
       switch (this.a){
           case 0:
             cc.a();
             return;
           case 1:
             ni.c = str;
             if (aj.b.o() != zi.b) {
                ni.a(bb2.b);
             }
             return;
             break;
           case 2:
             u44 a = ni.a;
             oi ooi = oi.class;
             _monitor_enter(ooi);
             co5.o(a, "eventsToPersist");
             ka5 oka5 = mi.F();
             Iterator iterator = a.A().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   d3 uod3 = iterator.next();
                   if ((oyb6 = a.x(uod3)) != null) {
                      oka5.a(uod3, oyb6.c());
                   }else {
                      break ;
                   }
                }else {
                   mi.I(oka5);
                   _monitor_exit(ooi);
                   ni.a = new u44(11);
                   return;
                }
             }
             throw new IllegalStateException("Required value was null.".toString());
             break;
           case 3:
             HashSet hashSet = new HashSet();
             Iterator iterator1 = ni.a.A().iterator();
             while (iterator1.hasNext()) {
                hashSet.add(iterator1.next().a);
             }
             iterator2 = hashSet.iterator();
             while (iterator2.hasNext()) {
                h22.f(iterator2.next(), true);
             }
             return;
             break;
           case 4:
             vn ovn = ((ovn = mj7.d(sz1.a())) != null && ovn.e != null)? 1: 0;
             if (!ovn) {
                if ((uof22 = h22.f(sz1.b(), false)) != null && (uof22 = uof22.j) != null) {
                   t94.d.clear();
                   b3.h(new JSONObject(uof22));
                }
                is7.A = true;
             }
             return;
             break;
           case 5:
             uContext = sz1.a();
             q83.a(uContext, u83.a(u83.d(uContext, q83.g, "inapp")), false);
             q83.a(uContext, u83.a(u83.d(uContext, q83.g, "subs")), true);
             return;
           case 6:
             uContext = sz1.a();
             ArrayList uArrayList = u83.a(u83.d(uContext, q83.g, "inapp"));
             if (uArrayList.isEmpty()) {
                g = q83.g;
                ArrayList uArrayList1 = new ArrayList();
                if (g == null || ((uClass = u83.b(uContext, "com.android.vending.billing.IInAppBillingService")) == null || u83.c(uClass, "getPurchaseHistory") == null)) {
                   uArrayList = uArrayList1;
                }else {
                   uArrayList1 = new ArrayList();
                   if (u83.f(uContext, g, "inapp")) {
                      object oobject = str;
                      int i2 = 0;
                      int i3 = 0;
                      while (true) {
                         Object[] objArray = new Object[5];
                         objArray[i1] = Integer.valueOf(6);
                         objArray[i] = u83.c;
                         objArray[2] = "inapp";
                         objArray[3] = oobject;
                         objArray[4] = new Bundle();
                         if ((obj = u83.e(uContext, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", g, objArray)) != null) {
                            long l1 = System.currentTimeMillis() / 1000;
                            if (!obj.getInt("RESPONSE_CODE") && (stringArrayL = obj.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                               Iterator iterator3 = stringArrayL.iterator();
                               while (iterator3.hasNext()) {
                                  obj1 = iterator3.next();
                                  try{
                                     long l2 = new JSONObject(obj1).getLong("purchaseTime") / 1000;
                                     l2 = l1 - l2;
                                     if ((l2 - 1200) > 0) {
                                        i2 = 1;
                                        break ;
                                     }else {
                                        uArrayList1.add(obj1);
                                        i3 = i3 + 1;
                                     }
                                  }catch(org.json.JSONException e0){
                                  }
                                  oyb6 = 0;
                               }
                               obj = obj.getString("INAPP_CONTINUATION_TOKEN");
                            }else {
                            label_02a0 :
                               obj = null;
                               break ;
                            }
                         }else {
                            goto label_02a0 ;
                         }
                      }
                      if (i3 < 30 && (obj != null && !i2)) {
                         i = 1;
                         i1 = 0;
                      }
                   }
                   uArrayList = u83.a(uArrayList1);
                }
             }
             q83.a(uContext, uArrayList, false);
             return;
             break;
           case 7:
             uw5.o();
             return;
           case 8:
             uw5.o();
             return;
           case 9:
             if (t6.f == null) {
                SharedPreferences defaultShare = PreferenceManager.getDefaultSharedPreferences(sz1.a());
                long longx = defaultShare.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", l);
                longx1 = defaultShare.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", l);
                String str1 = defaultShare.getString("com.facebook.appevents.SessionInfo.sessionId", str);
                if ((longx - l) && ((longx1 - l) && str1 != null)) {
                   g = new ac6(Long.valueOf(longx), Long.valueOf(longx1));
                   g.d = defaultShare.getInt("com.facebook.appevents.SessionInfo.interruptionCount", i1);
                   defaultShare = PreferenceManager.getDefaultSharedPreferences(sz1.a());
                   String str2 = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage";
                   if (defaultShare.contains(str2)) {
                      str = new on6(defaultShare.getString(str2, str), defaultShare.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", i1));
                   }
                   g.f = str;
                   g.e = Long.valueOf(System.currentTimeMillis());
                   UUID uUID = UUID.fromString(str1);
                   co5.l(uUID, "fromString\(sessionIDStr\)");
                   g.c = uUID;
                   obj1 = g;
                }
                t6.f = str;
             }
             return;
             break;
           case 10:
             str3 = "model_request_timestamp";
             String str4 = "models";
             try{
                SharedPreferences sharedPrefer = sz1.a().getSharedPreferences("com.facebook.internal.MODEL_STORE", i1);
                if ((str = sharedPrefer.getString(str4, str)) != null) {
                   longx1 = (!str.length())? 1: 0;
                   if (!longx1) {
                      jSONObject = new JSONObject(str);
                      try{
                      label_00f0 :
                         long longx2 = sharedPrefer.getLong(str3, l);
                         if (v12.c(t12.C) && jSONObject.length()) {
                            if (!(longx2 - l) || ((System.currentTimeMillis() - longx2) - 0xf731400) >= 0) {
                               i = 0;
                            }
                            if (i) {
                            label_0137 :
                               iterator2 = jSONObject.keys();
                               while (iterator2.hasNext()) {
                                  if ((ojc4 = b3.g(jSONObject.getJSONObject(iterator2.next()))) == null) {
                                     continue ;
                                  }
                                  kc4.a.put(ojc4.a, ojc4);
                               }
                               kc4.a();
                            }
                         }
                         if ((jSONObject = kc4.b()) == null) {
                         }else {
                            sharedPrefer.edit().putString(str4, jSONObject.toString()).putLong(str3, System.currentTimeMillis()).apply();
                            goto label_0137 ;
                         }
                      }catch(org.json.JSONException e0){
                      }
                      return;
                   }
                }
                jSONObject = new JSONObject();
                goto label_00f0 ;
             }catch(java.lang.Exception e0){
             }
             break;
           case 11:
             bc.a();
             return;
           case 12:
             is7.y = i;
             is7.z = e22.b("FBSDKFeatureIntegritySample", sz1.b(), i1);
             return;
           case 13:
             try{
                AtomicBoolean a1 = sv6.a;
                if (!a1.get()) {
                   a1.set(i);
                   if ((uof22 = h22.f(sz1.b(), i1)) != null && (uof22 = uof22.k) != null) {
                      sv6.a(uof22);
                      if (((sv6.b.isEmpty() ^ i)) || ((sv6.c.isEmpty() ^ i))) {
                         str3 = ((ojc41 = kc4.a.get(ic4.b.b())) == null)? str: ojc41.f;
                         if (str3 != null) {
                            xj0.y0(str3);
                            if ((k = t6.k) != null) {
                               str = k.get();
                            }
                            if (str != null) {
                               sv6.b(str);
                            }
                         }
                      }
                   }
                }
                return;
             }catch(java.lang.Exception e0){
             }
             break;
           case 14:
             AtomicBoolean b = df4.b;
             iterator2 = df4.a.iterator();
             while (iterator2.hasNext()) {
                iterator2.next().a(i);
             }
             b.set(i1);
             return;
             break;
           case 15:
             int a2 = s.a;
             try{
                if ((systemServic = sz1.a().getSystemService("activity")) == null) {
                   throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                }
                s.a(systemServic);
                return;
             }catch(java.lang.Exception e0){
             }
             break;
           default:
             return;
       }
    }
}
