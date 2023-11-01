package p.lu3;
import p.dt3;
import java.lang.String;
import java.lang.Object;
import java.util.Set;
import p.co5;
import java.lang.Class;
import p.bv3;
import p.eo5;
import android.content.Context;
import p.sz1;
import android.content.SharedPreferences;
import p.xe7;
import p.g11;
import p.n11;
import p.lq5;
import p.h11;
import android.app.Activity;
import p.ft3;
import java.util.Map;
import p.ny1;
import p.et3;
import p.i70;
import p.hu3;
import java.util.HashMap;
import android.os.Bundle;
import android.os.BaseBundle;
import java.lang.Throwable;
import org.json.JSONObject;
import java.util.Iterator;
import java.util.Map$Entry;
import p.dc3;
import p.ij;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Intent;
import p.g54;
import p.gt3;
import java.lang.ClassLoader;
import android.os.Parcelable;
import p.hy1;
import p.a3;
import p.i3;
import p.az5;
import p.ml5;
import p.yp;
import java.lang.Iterable;
import java.util.ArrayList;
import p.dj0;
import java.util.Collection;
import p.wu3;
import p.qy1;
import p.t00;
import android.content.SharedPreferences$Editor;
import p.jr3;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Single;
import p.jh6;
import p.yf2;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.ft6;
import java.util.Objects;
import p.mg1;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fd1;
import p.py1;

public final class lu3	// class@001dc5 from classes.dex
{
    public final SharedPreferences a;
    public final bv3 b;
    public static final dt3 c;
    public static final Set d;
    public static lu3 e;

    static {
       lu3.c = new dt3(5, 0);
       String[] stringArray = new String[]{"ads_management","create_event","rsvp_event"};
       lu3.d = co5.I(stringArray);
       co5.l(lu3.class.toString(), "LoginManager::class.java.toString\(\)");
    }
    public void lu3(){
       String packageName;
       try{
          super();
          this.b = bv3.b;
          eo5.Q();
          SharedPreferences sharedPrefer = sz1.a().getSharedPreferences("com.facebook.loginManager", 0);
          co5.l(sharedPrefer, "getApplicationContext\(\).getSharedPreferences\(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE\)");
          this.a = sharedPrefer;
          if (sz1.k && xe7.w() != null) {
             lq5.a(sz1.a(), "com.android.chrome", new g11());
             Context uContext = sz1.a();
             if ((packageName = sz1.a().getPackageName()) != null) {
                uContext = uContext.getApplicationContext();
                h11 oh11 = new h11(uContext);
                lq5.a(uContext, packageName, oh11);
             }
          }
          return;
       }catch(java.lang.SecurityException e0){
       }
    }
    public static void a(Activity p0,ft3 p1,Map p2,ny1 p3,boolean p4,et3 p5){
       hu3 ohu3;
       if ((ohu3 = i70.B.p(p0)) == null) {
          return;
       }
       String str = "fb_mobile_login_complete";
       if (p5 == null) {
          ohu3.a(str, "");
       }else {
          HashMap hashMap = new HashMap();
          String str1 = (p4)? "1": "0";
          hashMap.put("try_login_activity", str1);
          if (p5.D != null) {
             str = "foa_mobile_login_complete";
          }
          et3 v = p5.v;
          Bundle uBundle = dt3.f(v);
          if (p1 != null) {
             uBundle.putString("2_result", p1.a);
          }
          JSONObject jSONObject = null;
          int i = (p3 == null)? jSONObject: p3.getMessage();
          if (i != null) {
             uBundle.putString("5_error_message", p3.getMessage());
          }
          if ((hashMap.isEmpty() ^ 0x01)) {
             jSONObject = new JSONObject(hashMap);
          }
          if (p2 != null) {
             if (jSONObject == null) {
                jSONObject = new JSONObject();
             }
             try{
                Iterator iterator = p2.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   String key = uEntry.getKey();
                   String value = uEntry.getValue();
                   if (key != null) {
                      jSONObject.put(key, value);
                   }
                }
             }catch(org.json.JSONException e0){
             }
          }
          if (jSONObject != null) {
             uBundle.putString("6_extras", jSONObject.toString());
          }
          ohu3.b.a(uBundle, e0);
          if (p1 == ft3.b) {
             hu3.d.schedule(new ij(ohu3, 26, dt3.f(v)), 5, TimeUnit.SECONDS);
          }
       }
       return;
    }
    public final void b(int p0,Intent p1,g54 p2){
       gt3 parcelableEx;
       hy1 ohy1;
       gt3 ogt3;
       int i1;
       gt3 x;
       wu3 owu31;
       gt3 ogt31;
       wu3 a2;
       gt3 ogt32;
       wu3 owu32;
       ft3 t = ft3.t;
       int i = 0;
       boolean b = true;
       wu3 owu3 = null;
       if (p1 != null) {
          p1.setExtrasClassLoader(gt3.class.getClassLoader());
          if ((parcelableEx = p1.getParcelableExtra("com.facebook.LoginFragment:Result")) != null) {
             gt3 a = parcelableEx.a;
             if (p0 != -1) {
                if (p0) {
                   p0 = owu3;
                }else {
                   ogt3 = owu3;
                   ohy1 = ogt3;
                   a2 = ohy1;
                   ogt31 = 1;
                label_003f :
                   x = parcelableEx.x;
                   parcelableEx = parcelableEx.w;
                   owu31 = i;
                   i = i1;
                   ogt31 = a;
                }
             }else if(a == ft3.b){
                ogt3 = parcelableEx.b;
                ogt32 = parcelableEx.c;
                ohy1 = owu3;
             label_0032 :
                i1 = 0;
                goto label_003f ;
             }else {
                hy1 ohy11 = new hy1(parcelableEx.t);
             }
             ohy1 = p0;
             ogt3 = owu3;
             i = ogt3;
             goto label_0032 ;
          }else {
          label_0053 :
             ogt31 = t;
             ogt3 = owu3;
             owu32 = ogt3;
             ohy1 = owu32;
             x = ohy1;
             owu31 = x;
          }
       }else if(!p0){
          ogt31 = ft3.c;
          ogt3 = owu3;
          owu32 = ogt3;
          ohy1 = owu32;
          x = ohy1;
          owu31 = x;
          ogt32 = 1;
       }else {
          goto label_0053 ;
       }
       if (ohy1 == null && (ogt3 == null && !i)) {
          ohy1 = new ny1("Unexpected call to LoginManager.onActivityResult");
       }
       lu3.a(null, ogt31, x, ohy1, true, parcelableEx);
       if (ogt3 != null) {
          i3.f.F().c(ogt3, b);
          az5.C();
       }
       if (owu31 != null) {
          az5.U(owu31);
       }
       if (p2 != null) {
          if (ogt3 != null && parcelableEx != null) {
             et3 b1 = parcelableEx.b;
             Set set = dj0.E0(dj0.i0(ogt3.b));
             if (parcelableEx.w != null) {
                set.retainAll(b1);
             }
             Set set1 = dj0.E0(dj0.i0(b1));
             set1.removeAll(set);
             owu3 = new wu3(ogt3, owu31, set, set1);
          }
          if (!i && (owu3 == null && owu3.c.isEmpty())) {
             if (ohy1 != null) {
                p2.a.d.onError(ohy1);
             }else if(ogt3 != null && owu3 != null){
                SharedPreferences$Editor uEditor = this.a.edit();
                uEditor.putBoolean("express_login_allowed", b);
                uEditor.apply();
                g54 a1 = p2.a;
                a1.getClass();
                Bundle uBundle = new Bundle();
                uBundle.putString("fields", "id,first_name,name,email");
                a2 = owu3.a;
                ft6 uoft6 = new ft6(a1, 9, a2);
                qy1 d = a1.d;
                Objects.requireNonNull(d);
                a1.e.a(Single.fromCallable(new jr3(a2, 4, uBundle)).map(new jh6(7)).subscribeOn(s36.c).observeOn(id.a()).subscribe(uoft6, new mg1(24, d)));
             }
          }else {
             p2.a.d.onError(new py1());
          }
       }
       return;
    }
}
