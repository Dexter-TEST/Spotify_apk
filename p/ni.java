package p.ni;
import p.u44;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import p.bc;
import p.bb2;
import p.ka5;
import p.mi;
import java.util.Set;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.Iterator;
import java.util.Map$Entry;
import p.d3;
import p.yb6;
import java.util.List;
import p.ki;
import p.r8;
import android.content.Intent;
import p.cb2;
import java.io.Serializable;
import android.content.Context;
import p.sz1;
import p.wq3;
import java.util.ArrayList;
import p.f22;
import p.h22;
import p.tm2;
import java.util.Arrays;
import p.a3;
import org.json.JSONObject;
import p.om2;
import p.az5;
import android.os.Bundle;
import android.os.BaseBundle;
import p.dc3;
import p.b3;
import p.bj;
import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient$Builder;
import com.android.installreferrer.api.InstallReferrerClient;
import p.oa3;
import com.android.installreferrer.api.InstallReferrerStateListener;
import p.eu1;
import java.util.Collection;
import org.json.JSONArray;
import p.dj;
import p.cj;
import p.vn;
import p.e3;
import p.vv7;
import p.yi;
import p.am0;
import java.util.concurrent.Executor;
import java.lang.Runnable;
import java.lang.IllegalStateException;
import p.fs3;
import p.ns3;
import p.xm2;

public abstract class ni	// class@001fe8 from classes.dex
{
    public static u44 a;
    public static final ScheduledExecutorService b;
    public static ScheduledFuture c;
    public static final bc d;

    static {
       ni.a = new u44(11);
       ni.b = Executors.newSingleThreadScheduledExecutor();
       ni.d = new bc(1);
    }
    public static final void a(bb2 p0){
       yb6 oyb6;
       r8 or8;
       u44 a = ni.a;
       _monitor_enter(a);
       Set set = mi.F().a.entrySet();
       co5.l(set, "events.entries");
       Iterator iterator = set.iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if ((oyb6 = a.z(uEntry.getKey())) != null) {
             Iterator iterator1 = uEntry.getValue().iterator();
             while (iterator1.hasNext()) {
                oyb6.a(iterator1.next());
             }
          }
       }
       _monitor_exit(a);
       try{
          if ((or8 = ni.b(p0, ni.a)) != null) {
             Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
             intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", or8.b);
             intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", or8.c);
             wq3.a(sz1.a()).c(intent);
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static final r8 b(bb2 p0,u44 p1){
       yb6 oyb6;
       tm2 d;
       String str1;
       String str3;
       ki v;
       int b2;
       tm2 otm21;
       e3 b2;
       JSONObject jSONObject;
       u44 ou44 = p1;
       co5.o(ou44, "appEventCollection");
       r8 or8 = new r8(4);
       boolean b = sz1.f(sz1.a());
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p1.A().iterator();
       while (true) {
          int i = 1;
          a3 uoa3 = null;
          if (iterator.hasNext()) {
             Object obj = iterator.next();
             if ((oyb6 = ou44.x(obj)) != null) {
                d3 a = obj.a;
                int b1 = false;
                f22 uof22 = h22.f(a, b1);
                Object[] objArray = new Object[i];
                objArray[b1] = a;
                String str = String.format("%s/activities", Arrays.copyOf(objArray, i));
                co5.l(str, "java.lang.String.format\(format, *args\)");
                tm2 otm2 = az5.N(uoa3, str, uoa3, uoa3);
                otm2.i = i;
                if ((d = otm2.d) == null) {
                   d = new Bundle();
                }
                d.putString("access_token", obj.b);
                if ((str1 = dc3.b.r()) != null) {
                   d.putString("device_token", str1);
                }
                az5 uoaz5 = new az5();
                String str2 = "com.facebook.sdk.appEventPreferences";
                if (!sz1.a().getSharedPreferences(str2, b1).getBoolean("is_referrer_updated", b1)) {
                   InstallReferrerClient installRefer = InstallReferrerClient.newBuilder(sz1.a()).build();
                   try{
                      oa3 ooa3 = new oa3(installRefer, uoaz5);
                      installRefer.startConnection(ooa3);
                   }catch(java.lang.Exception e0){
                   }
                }
                if ((str3 = sz1.a().getSharedPreferences(str2, b1).getString("install_referrer", uoa3)) != null) {
                   d.putString("install_referrer", str3);
                }
                otm2.d = d;
                f22 a1 = (uof22 != null)? uof22.a: null;
                Context uContext = sz1.a();
                _monitor_enter(oyb6);
                yb6 e = oyb6.e;
                eu1.a(oyb6.c);
                oyb6.d.addAll(oyb6.c);
                oyb6.c.clear();
                JSONArray jSONArray = new JSONArray();
                Iterator iterator1 = oyb6.d.iterator();
                while (iterator1.hasNext()) {
                   ki oki = iterator1.next();
                   if ((v = oki.v) == null) {
                      ou44 = 1;
                   }else {
                      String str4 = oki.a.toString();
                      co5.l(str4, "jsonObject.toString\(\)");
                      b2 = co5.c(b3.c(str4), v);
                   }
                   if (ou44) {
                      if (a1 != null || oki.b == null) {
                         jSONArray.put(oki.a);
                      }
                   }else {
                      co5.K(oki, "Event with invalid checksum: ");
                      HashSet a2 = sz1.a;
                   }
                   v = 0;
                }
                if (!jSONArray.length()) {
                   _monitor_exit(oyb6);
                   b1 = 0;
                }else {
                   _monitor_exit(oyb6);
                   try{
                      jSONObject = dj.a(cj.b, oyb6.a, oyb6.b, b, uContext);
                      if (oyb6.e > null) {
                         jSONObject.put("num_skipped_events", e);
                      }
                   }catch(org.json.JSONException e0){
                      jSONObject = new JSONObject();
                   }
                   otm2.c = jSONObject;
                   tm2 d1 = otm2.d;
                   str = jSONArray.toString();
                   co5.l(str, "events.toString\(\)");
                   d1.putString("custom_events", str);
                   otm2.e = str;
                   otm2.d = d1;
                   b1 = jSONArray.length();
                }
                if (!b1) {
                   otm21 = null;
                }else {
                   b2 = or8.b + b1;
                   or8.b = b2;
                   otm21 = otm2;
                   b2 = new e3(obj, otm21, oyb6, or8, 1);
                   otm2.j(b2);
                }
                if (otm21 != null) {
                   uArrayList.add(otm21);
                   if (vv7.b) {
                      int i1 = 9;
                      try{
                         am0 ou441 = new am0(i1, otm21);
                         sz1.c().execute(ou441);
                      }catch(java.lang.Exception e0){
                      }
                   }
                }
                ou44 = p1;
             }else {
                break ;
             }
          }else if((uArrayList.isEmpty() ^ 1)){
             p0.toString();
             sz1.i(ns3.t);
             Iterator iterator2 = uArrayList.iterator();
             while (iterator2.hasNext()) {
                iterator2.next().c();
             }
             return or8;
          }else {
             return null;
          }
       }
       throw new IllegalStateException("Required value was null.".toString());
    }
}
