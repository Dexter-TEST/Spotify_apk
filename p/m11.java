package p.m11;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import p.zq7;
import p.o11;
import android.content.ComponentName;
import p.n43;
import p.m43;
import java.lang.Class;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import p.n70;
import android.os.Parcelable;
import p.li5;
import p.j8;
import java.lang.Integer;
import android.os.BaseBundle;
import android.os.Build$VERSION;
import p.l11;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class m11	// class@001e03 from classes.dex
{
    public final Intent a;
    public final zq7 b;
    public final boolean c;

    public void m11(){
       super();
       this.a = new Intent("android.intent.action.VIEW");
       this.b = new zq7();
       this.c = true;
    }
    public void m11(o11 p0){
       super();
       Intent intent = new Intent("android.intent.action.VIEW");
       this.a = intent;
       this.b = new zq7();
       this.c = true;
       if (p0 != null) {
          intent.setPackage(p0.v.getPackageName());
          o11 t = p0.t;
          t.getClass();
          p0 = p0.w;
          Bundle uBundle = new Bundle();
          n70.b(uBundle, "android.support.customtabs.extra.SESSION", t);
          if (p0 != null) {
             uBundle.putParcelable("android.support.customtabs.extra.SESSION_ID", p0);
          }
          intent.putExtras(uBundle);
       }
       return;
    }
    public final li5 a(){
       Bundle uBundle;
       j8 v;
       m11 ta = this.a;
       String str = "android.support.customtabs.extra.SESSION";
       if (!ta.hasExtra(str)) {
          uBundle = new Bundle();
          n70.b(uBundle, str, null);
          ta.putExtras(uBundle);
       }
       ta.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.c);
       m11 tb = this.b;
       j8 str1 = new j8(tb.a, tb.b, tb.c, tb.t, 1);
       uBundle = new Bundle();
       if ((str1 = str.b) != null) {
          uBundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", str1.intValue());
       }
       if ((str1 = str.c) != null) {
          uBundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", str1.intValue());
       }
       if ((str1 = str.t) != null) {
          uBundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", str1.intValue());
       }
       if ((v = str.v) != null) {
          uBundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", v.intValue());
       }
       ta.putExtras(uBundle);
       ta.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
       if (Build$VERSION.SDK_INT >= 24) {
          str = l11.a();
          if (!TextUtils.isEmpty(str)) {
             String str2 = "com.android.browser.headers";
             Bundle bundleExtra = (ta.hasExtra(str2))? ta.getBundleExtra(str2): new Bundle();
             if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", str);
                ta.putExtra(str2, bundleExtra);
             }
          }
       }
       return new li5(ta, 1, null);
    }
}
