package p.ny0;
import p.b52;
import p.u53;
import p.oy0;
import p.i51;
import p.yy6;
import p.zb;
import java.util.concurrent.ExecutorService;
import java.lang.Object;
import p.wx0;
import java.lang.System;
import p.vc6;
import p.a28;
import java.lang.Boolean;
import java.lang.ThreadLocal;
import p.kf6;
import java.lang.String;
import android.util.Log;
import java.lang.Class;
import p.em0;
import p.ly0;
import p.nc4;
import java.util.concurrent.Callable;
import p.vf;
import p.n60;
import p.es;
import java.util.concurrent.atomic.AtomicReference;
import p.uc6;
import p.x12;
import java.lang.RuntimeException;
import java.lang.Exception;
import p.vh4;
import p.m07;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import p.my0;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import p.oe7;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Collections;
import android.content.pm.ApplicationInfo;

public final class ny0	// class@00206f from classes.dex
{
    public final Context a;
    public final b52 b;
    public final i51 c;
    public final long d;
    public kf6 e;
    public kf6 f;
    public boolean g;
    public ly0 h;
    public final u53 i;
    public final n60 j;
    public final zb k;
    public final ExecutorService l;
    public final wx0 m;
    public final oy0 n;

    public void ny0(b52 p0,u53 p1,oy0 p2,i51 p3,yy6 p4,zb p5,ExecutorService p6){
       super();
       this.b = p0;
       this.c = p3;
       p0.a();
       this.a = p0.a;
       this.i = p1;
       this.n = p2;
       this.j = p4;
       this.k = p5;
       this.l = p6;
       this.m = new wx0(p6);
       this.d = System.currentTimeMillis();
    }
    public static a28 a(ny0 p0,vc6 p1){
       a28 uoa28;
       if (!Boolean.TRUE.equals(p0.m.d.get())) {
          throw new IllegalStateException("Not running on background worker thread as intended.");
       }
       p0.e.d();
       int i = 3;
       Log.isLoggable("FirebaseCrashlytics", i);
       ny0 h = p0.h;
       h.getClass();
       em0 uoem0 = new em0(21, h);
       ly0 f = h.f;
       f.getClass();
       nc4 onc4 = new nc4(f, 1, uoem0);
       try{
          f.a(onc4);
          p0.j.g(new vf(20, p0));
          uc6 ouc6 = p1.h.get();
          if (ouc6.c.a == null) {
             Log.isLoggable("FirebaseCrashlytics", i);
             uoa28 = new a28();
             uoa28.j(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
          }else if(!p0.h.f(ouc6.b.a)){
             Log.isLoggable("FirebaseCrashlytics", i);
          }
          uoa28 = p0.h.m(p1.i.get().a);
       }catch(java.lang.Exception e7){
          Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e7);
          uoa28 = new a28();
          uoa28.j(e7);
       }
          p0.b();
          return uoa28;
    }
    public final void b(){
       this.m.a(new my0(this, 0));
    }
    public final void c(Boolean p0){
       Boolean uBoolean;
       ny0 tc = this.c;
       _monitor_enter(tc);
       if (p0 != null) {
          uBoolean = p0;
       }else {
          i51 e = tc.e;
          e.a();
          uBoolean = tc.a(e.a);
       }
       tc.i = uBoolean;
       SharedPreferences$Editor uEditor = tc.d.edit();
       String str = "firebase_crashlytics_collection_enabled";
       if (p0 != null) {
          uEditor.putBoolean(str, p0.booleanValue());
       }else {
          uEditor.remove(str);
       }
       uEditor.commit();
       i51 f = tc.f;
       _monitor_enter(f);
       if (tc.b()) {
          if (tc.b == null) {
             tc.g.b(null);
             tc.b = true;
          }
       }else if(tc.b != null){
          tc.g = new m07();
          tc.b = false;
       }
       _monitor_exit(f);
       _monitor_exit(tc);
       return;
    }
    public final void d(String p0,String p1){
       ly0 b;
       ny0 th = this.h;
       ly0 e = th.e;
       try{
          e.n(p0, p1);
          th.f.a(new nc4(th, 3, Collections.unmodifiableMap(e.b)));
       }catch(java.lang.IllegalArgumentException e3){
          if ((b = th.b) != null) {
             b = ((b.getApplicationInfo().flags & 0x02))? 1: 0;
             if (b) {
                throw e3;
             }
          }
          Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
       }
       return;
    }
}
