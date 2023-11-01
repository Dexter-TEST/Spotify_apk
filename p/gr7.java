package p.gr7;
import p.dh2;
import p.s12;
import p.pg2;
import p.ci5;
import p.y00;
import p.ug2;
import java.lang.Object;
import p.ux0;
import p.sz1;
import p.me7;
import p.mj7;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Thread;
import p.v12;
import p.t12;
import p.vv7;
import p.ej4;
import java.io.File;
import p.b17;
import p.af7;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.lang.String;
import p.co5;
import p.ya3;
import org.json.JSONObject;
import p.tm2;
import java.util.Arrays;
import p.f3;
import p.a3;
import p.om2;
import p.az5;
import p.wm2;
import java.util.List;
import java.util.Collection;
import p.eo5;
import p.um2;
import java.util.concurrent.Executor;
import java.lang.Void;
import android.os.AsyncTask;
import p.vx0;
import p.u;
import java.util.concurrent.atomic.AtomicBoolean;
import p.s;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import p.so1;
import p.mb2;
import java.util.Comparator;
import java.util.Collections;
import org.json.JSONArray;
import p.t6;
import p.ai0;
import p.ns3;
import p.ri;
import p.fs2;
import android.os.Bundle;
import p.fs3;
import java.lang.Exception;
import p.io2;
import p.w83;
import p.eu1;
import p.h22;
import p.f22;
import java.util.Iterator;
import java.util.HashSet;
import p.du1;
import p.kc4;
import p.bc;
import p.sx5;
import java.util.concurrent.CopyOnWriteArraySet;
import p.rx5;
import java.util.HashMap;
import p.is7;
import p.ej;
import java.util.concurrent.ConcurrentLinkedQueue;
import p.u12;
import p.e22;
import com.spotify.eventsender.gabo.PublishEventsResponse$EventError;
import p.u65;
import p.tv;
import p.eq3;
import java.lang.Boolean;
import com.spotify.connectivity.connectiontype.ConnectionType;
import com.spotify.connectivity.connectiontype.InternetState;
import p.so3;
import com.spotify.connectivity.platformconnectiontype.InternetMonitorImpl;
import android.content.Context;
import java.lang.Integer;
import p.a43;
import p.ty0;
import p.ju2;
import p.p12;
import p.dv0;
import p.gr;
import p.iu2;
import java.lang.StringBuilder;
import p.c03;
import p.fu2;
import p.su2;
import p.ir;
import p.jr;
import p.kr;
import p.sp6;
import p.hu2;
import p.tt2;
import p.au2;
import p.h13;
import p.k23;
import p.z23;
import p.b43;

public final class gr7 implements dh2, s12, pg2, ci5, y00, ug2	// class@001767 from classes.dex
{
    public final int a;

    public void gr7(int p0){
       this.a = p0;
       super();
    }
    private static void b(boolean p0){
       File[] uFileArray;
       if (p0) {
          mj7 b = ux0.b;
          _monitor_enter(b);
          if (me7.a()) {
             mj7.p();
          }
          if (ux0.c != null) {
             _monitor_exit(b);
          }else {
             ux0 oux0 = new ux0(Thread.getDefaultUncaughtExceptionHandler());
             ux0.c = oux0;
             Thread.setDefaultUncaughtExceptionHandler(oux0);
             _monitor_exit(b);
          }
          if (v12.c(t12.K)) {
             b = true;
             vv7.c = b;
             if (me7.a() && !ej4.X()) {
                File uFile = b17.n();
                int i = 0;
                if (uFile == null) {
                   uFileArray = new File[i];
                }else if((uFileArray = uFile.listFiles(new af7(2))) == null){
                   uFileArray = new File[i];
                }
                ArrayList uArrayList = new ArrayList();
                int len = uFileArray.length;
                int i1 = 0;
                while (i1 < len) {
                   object oobject = uFileArray[i1];
                   i1 = i1 + 1;
                   co5.o(oobject, "file");
                   ya3 oya3 = new ya3(oobject);
                   if (oya3.b()) {
                      try{
                         JSONObject oobject1 = new JSONObject();
                         oobject1.put("crash_shield", oya3.toString());
                         Object[] objArray = new Object[b];
                         objArray[i] = sz1.b();
                         String str = String.format("%s/instruments", Arrays.copyOf(objArray, b));
                         co5.l(str, "java.lang.String.format\(format, *args\)");
                         uArrayList.add(az5.N(null, str, oobject1, new f3(3, oya3)));
                      }catch(org.json.JSONException e0){
                      }
                   }
                }
                if (!uArrayList.isEmpty()) {
                   wm2 owm2 = new wm2(uArrayList);
                   eo5.B(owm2);
                   um2 oum2 = new um2(owm2);
                   Void[] voidArray = new Void[i];
                   oum2.executeOnExecutor(sz1.c(), voidArray);
                }
             }
             int a = vx0.a;
          }
          v12.c(t12.L);
       }
       return;
    }
    private static void d(boolean p0){
       if (p0) {
          _monitor_enter(u.class);
          if (u.a.getAndSet(true)) {
             _monitor_exit(u.class);
          }else if(me7.a()){
             u.a();
          }
          s.b.scheduleAtFixedRate(s.d, 0, (long)500, TimeUnit.MILLISECONDS);
          _monitor_exit(u.class);
       }
       return;
    }
    public final void a(boolean p0){
       HashSet a;
       f22 uof22;
       JSONObject jSONObject1;
       rx5 orx5;
       f22 uof221;
       JSONObject jSONObject4;
       File uFile;
       File[] uFileArray;
       int i = 4;
       boolean b = false;
       boolean b1 = true;
       switch (this.a){
           case 2:
             if (p0 && me7.a()) {
                e22.c(new u12(new gr7(15), t12.J));
                e22.c(new u12(new gr7(16), t12.M));
                e22.c(new u12(new gr7(17), t12.N));
             }
             return;
             break;
           case 3:
             if (p0) {
                h22.e.add(new ej());
                h22.c();
             }
             return;
             break;
           case 4:
             if (p0) {
                sz1.k = b1;
             }else {
                a = sz1.a;
             }
             return;
             break;
           case 5:
             if (p0) {
                sz1.l = b1;
             }else {
                a = sz1.a;
             }
             return;
             break;
           case 6:
             if (p0) {
                sz1.m = b1;
             }else {
                a = sz1.a;
             }
             return;
             break;
           case 8:
             if (p0) {
                sz1.c().execute(new bc(i));
             }
             return;
             break;
           case 9:
             if (p0) {
                sx5.a = b1;
                try{
                   if ((uof22 = h22.f(sz1.b(), b)) != null && (uof22 = uof22.l) != null) {
                      if (!uof22.length()) {
                         b = true;
                      }
                      if (!b) {
                         JSONObject jSONObject = new JSONObject(uof22);
                         ArrayList b2 = sx5.b;
                         b2.clear();
                         CopyOnWriteArraySet c = sx5.c;
                         c.clear();
                         Iterator iterator = jSONObject.keys();
                         while (iterator.hasNext()) {
                            String str = iterator.next();
                            if ((jSONObject1 = jSONObject.getJSONObject(str)) != null) {
                               JSONObject jSONObject2 = jSONObject1.optJSONObject("restrictive_param");
                               co5.l(str, "key");
                               orx5 = new rx5(str, new HashMap());
                               if (jSONObject2 != null) {
                                  orx5.b = ej4.s(jSONObject2);
                                  b2.add(orx5);
                               }
                               if (jSONObject1.has("process_event_name")) {
                                  c.add(str);
                               }
                            }
                         }
                      }
                   }
                }catch(java.lang.Exception e0){
                }
             }
             return;
             break;
           case 10:
             try{
                if (p0) {
                   int i1 = 10;
                   bc uobc = new bc(i1);
                   sz1.c().execute(uobc);
                }
                return;
             }catch(java.lang.Exception e0){
             }
             break;
           case 11:
             if (p0) {
                eu1.b = b1;
                eu1 a1 = eu1.a;
                _monitor_enter(a1);
                try{
                   if ((uof221 = h22.f(sz1.b(), b)) == null) {
                      _monitor_exit(a1);
                   }else if((uof221 = uof221.l) != null){
                      if (uof221.length() > 0) {
                         b = true;
                      }
                      if (b) {
                         JSONObject jSONObject3 = new JSONObject(uof221);
                         eu1.c.clear();
                         Iterator iterator1 = jSONObject3.keys();
                         while (iterator1.hasNext()) {
                            String str1 = iterator1.next();
                            if ((jSONObject4 = jSONObject3.getJSONObject(str1)) != null) {
                               if (jSONObject4.optBoolean("is_deprecated_event")) {
                                  co5.l(str1, "key");
                                  eu1.d.add(str1);
                               }else {
                                  JSONArray jSONArray = jSONObject4.optJSONArray("deprecated_param");
                                  co5.l(str1, "key");
                                  du1 uodu1 = new du1(str1, new ArrayList());
                                  if (jSONArray != null) {
                                     uodu1.b = ej4.q(jSONArray);
                                  }
                                  eu1.c.add(uodu1);
                               }
                            }
                         }
                      }
                   }
                   _monitor_exit(a1);
                }catch(java.lang.Exception e0){
                }
             }
             return;
             break;
           case 12:
             if (p0) {
                w83.a.set(b1);
                w83.a();
             }
             return;
             break;
           case 13:
             if (p0) {
                ns3 t = ns3.t;
                try{
                   tm2 v0 = new tm2(null, co5.K("/cloudbridge_settings", sz1.b()), null, fs2.a, new ri(b), 32);
                   sz1.i(t);
                   v0.d();
                }catch(org.json.JSONException e0){
                   io2.v(e0);
                   sz1.i(t);
                }
             }
             return;
             break;
           case 14:
             if (p0) {
                ai0.e.set(b1);
             }else {
                ai0.e.set(b);
             }
             return;
             break;
           case 15:
           case 16:
             if (p0 && (me7.a() && !ej4.X())) {
                if ((uFile = b17.n()) == null) {
                   uFileArray = new File[b];
                }else {
                   uFileArray = uFile.listFiles(new af7(i));
                   co5.l(uFileArray, "reportDir.listFiles { dir, name ->\n      name.matches\(Regex\(String.format\(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX\)\)\)\n    }");
                }
                ArrayList uArrayList = new ArrayList();
                int len = uFileArray.length;
                int i2 = 0;
                while (i2 < len) {
                   i2 = i2 + 1;
                   so1 oso1 = new so1(uFileArray[i2]);
                   orx5 = (oso1.b != null && oso1.c != null)? 1: 0;
                   if (orx5) {
                      uArrayList.add(oso1);
                   }
                }
                mb2 omb2 = new mb2(3);
                if (uArrayList.size() > b1) {
                   Collections.sort(uArrayList, omb2);
                }
                JSONArray jSONArray1 = new JSONArray();
                for (; b < uArrayList.size() && b < 1000; b = b + 1) {
                   jSONArray1.put(uArrayList.get(b));
                }
                b17.z("error_reports", jSONArray1, new f3(i, uArrayList));
             }
             return;
             break;
           default:
             gr7.d(p0);
             return;
       }
       gr7.b(p0);
       return;
    }
    public final Object apply(Object p0){
       return null;
    }
    public final boolean apply(Object p0){
       int i = 1;
       switch (this.a){
           case 19:
             return p0.a.equals("context_device_android");
           case 20:
             return p0.g();
           case 21:
             return (p0.g() ^ i);
           default:
             if (p0 == null || (p0.h == null || (p0.m != null || p0.l == null))) {
                i = false;
             }
             return i;
       }
    }
    public final Object c(Object p0,Object p1,Object p2){
       ArrayList uArrayList;
       boolean b = false;
       int i = 1;
       switch (this.a){
           case 18:
           case 22:
             if (p1.booleanValue() && p2.connectionType().isCellularNetwork()) {
                p0 = Boolean.TRUE;
             }
             return p0;
             break;
           case 25:
             if (p0.booleanValue() || (p1.booleanValue() || !p2.isCellularNetwork())) {
                b = true;
             }
             return Boolean.valueOf(b);
             break;
           default:
             a43 uoa43 = ty0.B().j("lite-favorites");
             int i1 = 0x7f0a05ca;
             if (p1.size() > 0) {
                uArrayList = new ArrayList((p1.size() + i));
                p0 = (p2.intValue() == i1)? p0.getString(R.string.sort_creator): p0.getString(R.string.sort_alphabetical);
                uArrayList.add(p12.f(p2.intValue(), p0));
             }else {
                uArrayList = new ArrayList(p1.size());
             }
             if (p2.intValue() == i1) {
                Collections.sort(p1, new dv0(12));
             }else {
                Collections.sort(p1, new dv0(13));
             }
             for (int i2 = 0; i2 < p1.size(); i2++) {
                p2 = p1.get(i2);
                p2 = p2.a;
                uArrayList.add(ty0.k().o("lite-favorites-albums_row".append(i2).toString()).k(c03.b).s(ty0.z().d(p2.a.c).a(p2.b.get(b).a.c)).q(p12.g(sp6.x, p2.c)).e("click", p12.h(p2.b)).c(h13.b(p2.b)).g());
             }
             return uoa43.a(uArrayList).g();
       }
       return InternetMonitorImpl.a(p0, p1, p2);
    }
    public final boolean test(Object p0,Object p1){
       boolean b = (p0 == p1)? true: false;
       return b;
    }
}
