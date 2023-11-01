package p.sz1;
import p.ns3;
import java.lang.Object;
import java.util.HashSet;
import p.co5;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.atomic.AtomicBoolean;
import p.gr7;
import android.content.Context;
import p.eo5;
import java.lang.String;
import p.ny1;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import android.os.AsyncTask;
import java.lang.IllegalStateException;
import java.util.Arrays;
import p.a3;
import p.az5;
import p.av6;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.os.BaseBundle;
import java.util.Locale;
import java.lang.Number;
import android.os.Bundle;
import java.lang.Boolean;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import p.aj;
import p.b3;
import p.me7;
import p.le7;
import android.app.Application;
import p.t6;
import p.h22;
import p.df4;
import p.bc;
import java.lang.Runnable;
import p.g30;
import p.wq3;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import p.zk;
import p.rz1;
import p.v12;
import p.t12;
import p.u12;
import p.s12;
import p.e22;
import java.util.concurrent.FutureTask;
import p.s53;
import java.util.concurrent.Callable;

public abstract class sz1	// class@0026c9 from classes.dex
{
    public static final HashSet a;
    public static Executor b;
    public static String c;
    public static String d;
    public static String e;
    public static Boolean f;
    public static Context g;
    public static int h;
    public static final ReentrantLock i;
    public static final String j;
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static final AtomicBoolean n;
    public static String o;
    public static String p;
    public static final gr7 q;
    public static boolean r;

    static {
       ns3[] ons3Array = new ns3[]{ns3.v};
       sz1.a = co5.A(ons3Array);
       AtomicLong ons3Array1 = new AtomicLong(0x10000);
       sz1.h = 0xface;
       sz1.i = new ReentrantLock();
       sz1.j = "v15.0";
       sz1.n = new AtomicBoolean(0);
       sz1.o = "instagram.com";
       sz1.p = "facebook.com";
       sz1.q = new gr7(7);
    }
    public static final Context a(){
       Context g;
       eo5.Q();
       if ((g = sz1.g) != null) {
          return g;
       }
       co5.N("applicationContext");
       throw null;
    }
    public static final String b(){
       String c;
       eo5.Q();
       if ((c = sz1.c) != null) {
          return c;
       }
       throw new ny1("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }
    public static final Executor c(){
       Executor b;
       ReentrantLock i = sz1.i;
       i.lock();
       if (sz1.b == null) {
          sz1.b = AsyncTask.THREAD_POOL_EXECUTOR;
       }
       i.unlock();
       if ((b = sz1.b) != null) {
          return b;
       }else {
          throw new IllegalStateException("Required value was null.".toString());
       }
    }
    public static final String d(){
       String j;
       Object[] objArray = new Object[]{j};
       j = sz1.j;
       co5.l(String.format("getGraphApiVersion: %s", Arrays.copyOf(objArray, 1)), "java.lang.String.format\(format, *args\)");
       return j;
    }
    public static final String e(){
       a3 uoa3 = ((uoa3 = az5.D()) != null)? uoa3.B: null;
       String p = sz1.p;
       if (uoa3 != null) {
          if (co5.c(uoa3, "gaming")) {
             p = av6.x0(p, "facebook.com", "fb.gg");
          }else if(co5.c(uoa3, "instagram")){
             p = av6.x0(p, "facebook.com", "instagram.com");
          }
       }
       return p;
    }
    public static final boolean f(Context p0){
       eo5.Q();
       return p0.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", 0);
    }
    public static synchronized final boolean g(){
       _monitor_enter(sz1.class);
       _monitor_exit(sz1.class);
       return sz1.r;
    }
    public static final boolean h(){
       return sz1.n.get();
    }
    public static final void i(ns3 p0){
       co5.o(p0, "behavior");
       HashSet a = sz1.a;
       _monitor_enter(a);
       _monitor_exit(a);
    }
    public static final void j(Context p0){
       try{
          ApplicationInfo applicationI = p0.getPackageManager().getApplicationInfo(p0.getPackageName(), 128);
          if (applicationI.metaData == null) {
             return;
          }
          if (sz1.c == null) {
             String obj = applicationI.metaData.get("com.facebook.sdk.ApplicationId");
             if (obj instanceof String) {
                Locale rOOT = Locale.ROOT;
                co5.l(rOOT, "ROOT");
                String str = obj.toLowerCase(rOOT);
                co5.l(str, "\(this as java.lang.String\).toLowerCase\(locale\)");
                if (av6.D0(str, "fb", false)) {
                   obj = obj.substring(2);
                   co5.l(obj, "\(this as java.lang.String\).substring\(startIndex\)");
                   sz1.c = obj;
                }else {
                   sz1.c = obj;
                }
             }else if(!obj instanceof Number){
                throw new ny1("App Ids cannot be directly placed in the manifest.They must be prefixed by \'fb\' or be placed in the string resource file.");
             }
          }
          if (sz1.d == null) {
             sz1.d = applicationI.metaData.getString("com.facebook.sdk.ApplicationName");
          }
          if (sz1.e == null) {
             sz1.e = applicationI.metaData.getString("com.facebook.sdk.ClientToken");
          }
          if (sz1.h == 0xface) {
             sz1.h = applicationI.metaData.getInt("com.facebook.sdk.CallbackOffset", 0xface);
          }
          if (sz1.f == null) {
             sz1.f = Boolean.valueOf(applicationI.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
          }
          return;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
    }
    public static synchronized final void k(Context p0){
       PackageManager packageManag;
       _monitor_enter(sz1.class);
       if (sz1.n.get()) {
          _monitor_exit(sz1.class);
          return;
       }else if((packageManag = p0.getPackageManager()) != null){
          String str = "com.facebook.FacebookActivity";
          ComponentName uComponentNa = new ComponentName(p0, str);
          packageManag.getActivityInfo(uComponentNa, 1);
       }
       p0.checkCallingOrSelfPermission("android.permission.INTERNET");
       Context applicationC = p0.getApplicationContext();
       co5.l(applicationC, "applicationContext.applicationContext");
       sz1.g = applicationC;
       aj.b.n(p0);
       p0 = sz1.g;
       Object obj = null;
       if (p0 != null) {
          sz1.j(p0);
          String c = sz1.c;
          boolean b = false;
          wq3 owq3 = (c != null && c.length())? 0: 1;
          if (!c) {
             owq3 = ((c = sz1.e) != null && c.length())? 0: 1;
             if (!c) {
                sz1.n.set(1);
                me7.c();
                if (me7.c.a()) {
                   sz1.r = true;
                }
                if ((c = sz1.g) != null) {
                   if (c instanceof Application && me7.a()) {
                      if ((c = sz1.g) != null) {
                         t6.b(c, sz1.c);
                      }else {
                         co5.N("applicationContext");
                         throw obj;
                      }
                   }
                   h22.c();
                   if (df4.b.compareAndSet(b, 1)) {
                      sz1.c().execute(new bc(14));
                   }
                   if ((c = sz1.g) != null) {
                      if (g30.b == null) {
                         g30 og30 = new g30(c);
                         owq3 = wq3.a(og30.a);
                         co5.l(owq3, "getInstance\(applicationContext\)");
                         owq3.b(og30, new IntentFilter("com.parse.bolts.measurement_event"));
                         g30.b = og30;
                      }
                      zk ozk = new zk(new rz1(b));
                      e22.c(new u12(new gr7(2), t12.I));
                      e22.c(new u12(new gr7(3), t12.t));
                      e22.c(new u12(new gr7(4), t12.Q));
                      e22.c(new u12(new gr7(5), t12.R));
                      e22.c(new u12(new gr7(6), t12.S));
                      sz1.c().execute(new FutureTask(new s53(1, obj)));
                      _monitor_exit(e0);
                      return;
                   }else {
                      co5.N("applicationContext");
                      throw obj;
                   }
                }else {
                   co5.N("applicationContext");
                   throw obj;
                }
             }else {
                throw new ny1("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
             }
          }else {
             throw new ny1("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
          }
       }else {
          co5.N("applicationContext");
          throw obj;
       }
    }
}
