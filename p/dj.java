package p.dj;
import p.t65;
import p.cj;
import java.lang.Object;
import java.util.HashMap;
import p.q14;
import p.vn;
import java.lang.String;
import android.content.Context;
import org.json.JSONObject;
import p.aj;
import p.cc;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p.v12;
import p.t12;
import p.sz1;
import p.me7;
import p.le7;
import android.os.Build$VERSION;
import p.ej4;
import p.ee7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;
import p.t94;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p.fs3;
import p.ns3;

public abstract class dj	// class@00135e from classes.dex
{
    public static final HashMap a;

    static {
       t65[] ot65Array = new t65[]{new t65(cj.a, "MOBILE_APP_INSTALL"),new t65(cj.b, "CUSTOM_APP_EVENTS")};
       dj.a = q14.n0(ot65Array);
    }
    public static final JSONObject a(cj p0,vn p1,String p2,boolean p3,Context p4){
       HashMap hashMap1;
       vn d;
       JSONObject jSONObject1;
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("event", dj.a.get(p0));
       if (!cc.c) {
          cc.a();
       }
       ReentrantReadWriteLock a = cc.a;
       a.readLock().lock();
       String b = cc.b;
       a.readLock().unlock();
       if (b != null) {
          jSONObject.put("app_user_id", b);
       }
       t12 p = t12.P;
       String str = "anon_id";
       if (!v12.c(p)) {
          jSONObject.put(str, p2);
       }
       int i = 1;
       jSONObject.put("application_tracking_enabled", (p3 ^ i));
       me7.c();
       jSONObject.put("advertiser_id_collection_enabled", me7.e.a());
       if (p1 != null) {
          int i1 = 31;
          if (v12.c(p)) {
             if (Build$VERSION.SDK_INT >= i1 && ej4.Y(p4)) {
                if (p1.e == null) {
                   jSONObject.put(str, p2);
                }
             }else {
                jSONObject.put(str, p2);
             }
          }
          if (p1.c != null) {
             p2 = "attribution";
             if (v12.c(p)) {
                if (Build$VERSION.SDK_INT >= i1 && ej4.Y(p4)) {
                   if (p1.e == null) {
                      jSONObject.put(p2, p1.c);
                   }
                }else {
                   jSONObject.put(p2, p1.c);
                }
             }else {
                jSONObject.put(p2, p1.c);
             }
          }
          if (p1.a() != null) {
             jSONObject.put("advertiser_id", p1.a());
             jSONObject.put("advertiser_tracking_enabled", (p1.e ^ i));
          }
          if (p1.e == null) {
             if (!ee7.c.get()) {
                ee7.a.a();
             }
             HashMap hashMap = new HashMap();
             hashMap.putAll(ee7.d);
             hashMap1 = new HashMap();
             HashSet hashSet = new HashSet();
             Iterator iterator = t94.d.iterator();
             while (iterator.hasNext()) {
                hashSet.add(iterator.next().a);
             }
             ConcurrentHashMap e = ee7.e;
             Iterator iterator1 = e.keySet().iterator();
             while (iterator1.hasNext()) {
                String str1 = iterator1.next();
                if (hashSet.contains(str1)) {
                   hashMap1.put(str1, e.get(str1));
                }
             }
             hashMap.putAll(hashMap1);
             String str2 = ej4.f0(hashMap);
             if (str2.length()) {
                i = 0;
             }
             if (!i) {
                jSONObject.put("ud", str2);
             }
          }
          if ((d = p1.d) != null) {
             jSONObject.put("installer_package", d);
          }
       }
       try{
          ej4.K0(p4, jSONObject);
       }catch(java.lang.Exception e6){
          e6.toString();
          sz1.i(ns3.t);
       }
       if ((jSONObject1 = ej4.A()) != null) {
          Iterator iterator2 = jSONObject1.keys();
          while (iterator2.hasNext()) {
             hashMap1 = iterator2.next();
             jSONObject.put(hashMap1, jSONObject1.get(hashMap1));
          }
       }
       jSONObject.put("application_package_name", p4.getPackageName());
       return jSONObject;
    }
}
