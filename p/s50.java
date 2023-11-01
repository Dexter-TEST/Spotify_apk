package p.s50;
import android.app.Activity;
import java.lang.Object;
import p.t50;
import java.lang.String;
import java.lang.ref.WeakReference;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Intent;
import android.net.Uri;
import p.n6;
import android.content.Context;
import p.ji5;
import org.json.JSONObject;
import p.r8;
import p.r50;
import p.rb6;
import p.qb6;
import p.mb6;
import p.hb6;
import p.ib6;
import p.cu6;
import p.fu6;
import p.iu6;
import p.ku6;
import com.android.installreferrer.api.InstallReferrerClient$Builder;
import com.android.installreferrer.api.InstallReferrerClient;
import p.zt6;
import com.android.installreferrer.api.InstallReferrerStateListener;
import java.util.Timer;
import p.au6;
import java.util.TimerTask;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.ClassLoader;
import p.gu6;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.Throwable;
import java.lang.reflect.Constructor;
import java.util.HashSet;
import p.ob6;
import java.util.Iterator;
import java.util.List;

public final class s50	// class@0025bd from classes.dex
{
    public r50 a;
    public boolean b;
    public Uri c;

    public void s50(Activity p0){
       super();
       t50 ot50 = t50.i();
       if (p0 != null && (ot50.h() == null && ot50.h().getLocalClassName().equals(p0.getLocalClassName()))) {
          ot50.l = new WeakReference(p0);
       }
       return;
    }
    public final void a(){
       t50 ot50;
       s50 c;
       s50 a;
       mb6 k;
       Class uClass;
       Class[] uClassArray;
       Object[] obj;
       t50 d1;
       Object obj1;
       s50 os50 = this;
       if ((ot50 = t50.i()) == null) {
          TextUtils.isEmpty("Branch is not setup properly, make sure to call getAutoInstance in your application class or declare BranchApp in your manifest.");
          return;
       }else {
          Activity uActivity = ot50.h();
          r8 or8 = null;
          Intent intent = (uActivity != null)? uActivity.getIntent(): or8;
          if (uActivity != null && (intent != null && n6.d(uActivity) != null)) {
             ji5.g(uActivity).w("bnc_initial_referrer", n6.d(uActivity).toString());
          }
          if ((c = os50.c) != null) {
             ot50.q(c, uActivity);
          }
          boolean b = false;
          if (ot50.t != null) {
             ot50.t = b;
             if ((a = os50.a) != null) {
                a.a(ot50.j(), or8);
             }
             ot50.a("instant_dl_session", "true");
             ot50.c();
             os50.a = or8;
          }
          a = os50.a;
          s50 b1 = os50.b;
          t50 d = ot50.d;
          rb6 orb6 = ((ot50.b.j().equals("bnc_no_value") ^ 1))? new rb6(d, a, b1): new qb6(d, a, b1);
          int i = 3;
          if (ot50.b.e() != null && !ot50.b.e().equalsIgnoreCase("bnc_no_value")) {
             if (ot50.j == i) {
                ot50.b.p("bnc_external_intent_uri").equals("bnc_no_value");
             }
             Intent intent1 = (ot50.h() != null)? ot50.h().getIntent(): or8;
             boolean booleanExtra = (intent1 != null)? intent1.getBooleanExtra("branch_force_new_session", b): false;
             if (!booleanExtra) {
                if (intent1 != null) {
                   booleanExtra = (intent1.getStringExtra("branch") != null)? 1: 0;
                   int i1 = intent1.getBooleanExtra("branch_used", b) ^ 1;
                   if (booleanExtra && i1) {
                      booleanExtra = 1;
                   label_00dd :
                      if (!booleanExtra) {
                         obj1 = 0;
                      label_00e3 :
                         if (ot50.j != i && !booleanExtra) {
                            if ((k = orb6.k) != null) {
                               k.a(or8, new r8("Warning.", -118));
                            }
                         }else if(booleanExtra && intent1 != null){
                            intent1.removeExtra("branch_force_new_session");
                         }
                         int i2 = 2;
                         ot50.j = i2;
                         if (ot50.i != i2 && ((t50.x ^ 1))) {
                            orb6.a(hb6.c);
                         }
                         if (t50.A && orb6 instanceof qb6) {
                            if (!cu6.G) {
                               ot50.p = true;
                               orb6.a(hb6.x);
                            }
                            if (t50.f("com.huawei.hms.ads.installreferrer.api.InstallReferrerClient") && !fu6.G) {
                               ot50.o = true;
                               orb6.a(hb6.w);
                            }
                            if (t50.f("com.sec.android.app.samsungapps.installreferrer.api.InstallReferrerClient") && !iu6.G) {
                               ot50.q = true;
                               orb6.a(hb6.y);
                            }
                            if (t50.f("com.miui.referrer.api.GetAppsReferrerClient") && !ku6.G) {
                               ot50.r = true;
                               orb6.a(hb6.z);
                            }
                            if (ot50.p != null) {
                               d = ot50.d;
                               cu6.F = ot50;
                               cu6.G = true;
                               InstallReferrerClient installRefer = InstallReferrerClient.newBuilder(d).build();
                               installRefer.startConnection(new zt6(installRefer, d));
                               new Timer().schedule(new au6(b), 1500);
                            }
                            if (ot50.o != null) {
                               fu6.V(ot50.d, ot50);
                            }
                            if (ot50.q != null) {
                               d = ot50.d;
                               iu6.G = true;
                               iu6.F = ot50;
                               try{
                                  uClass = Class.forName("com.sec.android.app.samsungapps.installreferrer.api.InstallReferrerClient");
                                  uClassArray = new Class[]{Context.class};
                                  Object[] objArray = new Object[]{d};
                                  Class[] uClassArray1 = new Class[b];
                                  Object[] objArray1 = new Object[b];
                                  obj = Class.forName("com.sec.android.app.samsungapps.installreferrer.api.InstallReferrerClient$Builder").getMethod("build", uClassArray1).invoke(uClass.getMethod("newBuilder", uClassArray).invoke(uClass, objArray), objArray1);
                                  Class uClass1 = Class.forName("com.sec.android.app.samsungapps.installreferrer.api.InstallReferrerStateListener");
                                  uClassArray1 = new Class[]{uClass1};
                                  ClassLoader classLoader = uClass1.getClassLoader();
                                  Class[] uClassArray2 = new Class[]{uClass1};
                                  Object[] objArray2 = new Object[]{Proxy.newProxyInstance(classLoader, uClassArray2, new gu6(uClass, obj, d, b))};
                                  uClass.getMethod("startConnection", uClassArray1).invoke(obj, objArray2);
                                  new Timer().schedule(new au6(i2), 1500);
                               }catch(java.lang.Exception e0){
                                  e0.getMessage();
                                  e0.printStackTrace();
                                  iu6.H = true;
                                  iu6.V();
                               }
                            }
                            if (ot50.r != null) {
                               d1 = ot50.d;
                               ku6.G = true;
                               ku6.F = ot50;
                               try{
                                  Class uClass2 = Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
                                  Class uClass3 = Class.forName("com.miui.referrer.api.GetAppsReferrerClient$Builder");
                                  Class[] uClassArray3 = new Class[]{Context.class};
                                  Constructor constructor = uClass3.getConstructor(uClassArray3);
                                  uClassArray = new Class[b];
                                  obj = new Object[]{d1};
                                  obj = new Object[b];
                                  obj1 = uClass3.getMethod("build", uClassArray).invoke(constructor.newInstance(obj), obj);
                                  uClass = Class.forName("com.miui.referrer.api.GetAppsReferrerStateListener");
                                  uClassArray = new Class[]{uClass};
                                  Method method = uClass2.getMethod("startConnection", uClassArray);
                                  ClassLoader classLoader1 = uClass.getClassLoader();
                                  Class[] uClassArray4 = new Class[]{uClass};
                                  Object[] objArray3 = new Object[]{Proxy.newProxyInstance(classLoader1, uClassArray4, new gu6(uClass2, obj1, d1, 1))};
                                  method.invoke(obj1, objArray3);
                               }catch(java.lang.Exception e0){
                                  e0.getMessage();
                                  e0.printStackTrace();
                                  ku6.H = true;
                                  ku6.V();
                               }
                               new Timer().schedule(new au6(i), 1500);
                            }
                            if (cu6.H) {
                               orb6.f.remove(hb6.x);
                            }
                            if (iu6.H) {
                               orb6.f.remove(hb6.y);
                            }
                            if (ku6.H) {
                               orb6.f.remove(hb6.z);
                            }
                         }
                         if (ot50.n != null) {
                            orb6.a(hb6.b);
                         }
                         d1 = ot50.f;
                         d1.getClass();
                         ib6 d2 = ob6.d;
                         _monitor_enter(d2);
                         Iterator iterator = d1.b.iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               ib6 oib6 = iterator.next();
                               if (oib6 instanceof mb6 && oib6.l != null) {
                                  _monitor_exit(d2);
                                  d2 = oib6;
                               }
                            }else {
                               _monitor_exit(d2);
                               d2 = null;
                            }
                            if (d2 == null) {
                               t50 f = ot50.f;
                               if (ot50.g == null) {
                                  f.b(orb6, b);
                               }else {
                                  f.b(orb6, 1);
                               }
                               ot50.p();
                               break ;
                            }else {
                               d2.k = orb6.k;
                               break ;
                            }
                         }
                      }
                   }
                }
                obj1 = 0;
                goto label_00dd ;
             }
             booleanExtra = 1;
             goto label_00e3 ;
          }else {
             ot50.j = i;
             if ((k = orb6.k) != null) {
                k.a(null, new r8("Trouble initializing Branch.", -114));
             }
          }
          return;
       }
    }
}
