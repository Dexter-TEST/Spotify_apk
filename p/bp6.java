package p.bp6;
import java.lang.Runnable;
import p.zq7;
import android.content.Context;
import java.lang.Object;
import p.tm5;
import p.y50;
import p.to6;
import p.wm3;
import java.lang.Class;
import p.t50;
import java.lang.String;
import p.co5;
import p.tu6;
import p.ge6;
import org.json.JSONObject;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.util.Log;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.os.BaseBundle;
import android.content.res.Resources;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.ji5;
import android.app.Application;
import java.lang.reflect.Method;
import java.lang.Thread;
import p.ka0;
import android.content.SharedPreferences$Editor;
import p.ap6;
import p.jc7;
import p.an5;

public final class bp6 implements Runnable	// class@00110f from classes.dex
{
    public final zq7 a;
    public final Context b;

    public void bp6(zq7 p0,Context p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void run(){
       int i1;
       t50 c;
       CharSequence uCharSequenc;
       ka0 i1;
       ApplicationInfo metaData;
       to6 oto6 = this.a.b.get();
       wm3 owm3 = this.a.c.get();
       this.a.a.get().getClass();
       boolean b = true;
       t50.B = b;
       bp6 tb = this.b;
       String str = "key_live_pfaVQo61xda7Zq1zC1ca3igayxarnljw";
       co5.o(tb, "context");
       if (t50.C == null) {
          boolean b1 = tu6.j(tb);
          tu6.C = b1;
          String str1 = (b1)? "key_test_": "key_";
          int i = 0;
          str1 = (str.startsWith(str1))? 1: 0;
          Object obj = null;
          if (!str1) {
             if (ge6.b == null) {
                ge6.b = new ge6(tb);
             }
             ge6 b2 = ge6.b;
             str1 = (b2.a != null)? 1: 0;
             if (str1) {
                i1 = 3;
                if (b2.j(b) || (b2.j(i1) || (!b2.j(2) || !b2.j(4)))) {
                   try{
                      if (b2.j(b)) {
                         str = b2.a.getString("branchKey");
                      label_00e4 :
                         if (str == null) {
                            String str2 = "io.branch.sdk.BranchKey";
                            str1 = (tu6.C)? "io.branch.sdk.BranchKey.test": str2;
                            try{
                               ApplicationInfo applicationI = tb.getPackageManager().getApplicationInfo(tb.getPackageName(), 128);
                               if ((metaData = applicationI.metaData) != null && ((str = metaData.getString(str1)) == null && tu6.C)) {
                                  str = applicationI.metaData.getString(str2);
                               }
                            }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                            }
                            if (str == null) {
                               Resources resources = tb.getResources();
                               str = resources.getString(resources.getIdentifier(str1, "string", tb.getPackageName()));
                            }
                         }
                      }else if(b2.h().booleanValue()){
                         str = b2.g();
                         goto label_00e4 ;
                      }else if(!b2.j(i1)){
                         str = b2.a.getString("liveKey");
                         goto label_00e4 ;
                      }
                   }catch(org.json.JSONException e3){
                      Log.e("BranchJsonConfig", "Error parsing branch.json: "+e3.getMessage());
                   }
                }
             }
             str = obj;
             goto label_00e4 ;
          }
          t50 ot50 = t50.class;
          _monitor_enter(ot50);
          if ((c = t50.C) != null) {
             _monitor_exit(ot50);
          }else {
             t50.C = new t50(tb.getApplicationContext());
             if (TextUtils.isEmpty(str)) {
                t50.C.b.s("bnc_no_value");
             }else {
                t50.C.b.s(str);
             }
             if (tb instanceof Application) {
                t50.C.r(tb);
             }
             _monitor_exit(ot50);
             c = t50.C;
          }
          t50.C = c;
          if (c != null) {
             try{
                Class[] uClassArray = new Class[b];
                uClassArray[i] = String.class;
                Object[] objArray = new Object[b];
                objArray[i] = "io.branch.preinstall.apps.path";
                str1 = Class.forName("android.os.SystemProperties").getMethod("get", uClassArray).invoke(obj, objArray);
             }catch(java.lang.Exception e0){
                uCharSequenc = obj;
             }
             if (!TextUtils.isEmpty(uCharSequenc)) {
                i1 = new ka0(uCharSequenc, c, tb, 12, 0);
                new Thread(i1).start();
             }
          }
       }
       t50 c1 = t50.C;
       co5.l(c1, "getAutoInstance\(context, branchKey\)");
       owm3.getClass();
       ji5.g(c1.d).b.putBoolean("bnc_ad_network_callouts_disabled", e0).apply();
       ji5 c2 = c1.b.c;
       c2.has("APP");
       c2.put("APP", "Spotify Lite App");
       oto6.f.onNext(jc7.a);
       return;
    }
}
