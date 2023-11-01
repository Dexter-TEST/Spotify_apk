package p.h60;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import p.q43;
import android.os.Handler;
import p.c60;
import p.ji5;
import android.content.Context;
import android.net.Uri;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import p.en6;
import p.x45;
import p.uy6;
import p.tu6;
import p.w40;
import p.g60;
import java.lang.Runnable;
import p.t50;
import p.hb6;
import p.ob6;

public final class h60	// class@0017ea from classes.dex
{
    public Object a;
    public final Handler b;
    public final boolean c;
    public boolean d;
    public final Class e;
    public final Class f;
    public final Class g;
    public final Class h;
    public static h60 i;

    public void h60(){
       super();
       this.a = null;
       this.c = true;
       boolean b = false;
       try{
          this.d = b;
          this.e = Class.forName("android.support.customtabs.CustomTabsClient");
          this.f = Class.forName("android.support.customtabs.CustomTabsCallback");
          this.g = Class.forName("android.support.customtabs.CustomTabsSession");
          this.h = q43.class;
       }catch(java.lang.Exception e0){
          this.c = e0;
       }
       this.b = new Handler();
       return;
    }
    public static Uri a(String p0,c60 p1,ji5 p2,Context p3){
       x45 b;
       String str1;
       Uri uri;
       if (!TextUtils.isEmpty(p0)) {
          p0 = en6.s(en6.t("https://", p0, "/_strong_match?os=")+x45.l(p1.b), "&hardware_id=")+p1.b();
          String str = (p1.b().b != null)? "vendor_id": "random";
          p0 = p0+"&hardware_id_type="+str;
          if ((b = p1.a.b) != null && !tu6.j(p3)) {
             p0 = p0+"&google_advertising_id="+b;
          }
          if (!p2.k().equals("bnc_no_value")) {
             p0 = en6.s(p0, "&randomized_device_token=")+p2.k();
          }
          if (!p1.a().equals("bnc_no_value")) {
             p0 = en6.s(p0, "&app_version=")+p1.a();
          }
          if ((str1 = p2.e()) != null) {
             String str2 = (tu6.C)? "key_test_": "key_";
             if (str1.startsWith(str2)) {
                str1 = 1;
             label_00c3 :
                if (str1) {
                   p0 = en6.s(p0, "&branch_key=")+p2.e();
                }
                uri = Uri.parse(p0+"&sdk=android5.2.7");
             }
          }
          str1 = 0;
          goto label_00c3 ;
       }else {
          uri = null;
       }
       return uri;
    }
    public final void b(w40 p0,boolean p1){
       if (p0 != null) {
          if (p1) {
             new Handler().postDelayed(new g60(this, p0, 0), (long)750);
          }else {
             p0.a.f.e(hb6.t);
             p0.a.p();
          }
       }
       return;
    }
}
