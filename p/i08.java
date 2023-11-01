package p.i08;
import android.content.ServiceConnection;
import p.b08;
import p.cl2;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import android.os.Bundle;
import android.os.BaseBundle;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.lang.StringBuilder;
import android.os.Parcelable;
import android.content.Intent;
import android.content.ComponentName;
import java.lang.Class;
import p.a70;
import p.bs7;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.os.Message;
import android.os.Handler;
import p.pp0;
import android.os.IBinder;
import java.util.Collection;
import java.util.Iterator;

public final class i08 implements ServiceConnection	// class@0018fe from classes.dex
{
    public final HashMap a;
    public int b;
    public boolean c;
    public IBinder d;
    public final cl2 e;
    public ComponentName f;
    public final b08 g;

    public void i08(b08 p0,cl2 p1){
       this.g = p0;
       super();
       this.e = p1;
       this.a = new HashMap();
       this.b = 2;
    }
    public final void a(String p0){
       String str1;
       this.b = 3;
       i08 tg = this.g;
       b08 d = tg.d;
       i08 te = this.e;
       cl2 a = te.a;
       b08 b = tg.b;
       String str = null;
       if (a != null) {
          if (te.d != null) {
             Bundle uBundle = new Bundle();
             str1 = "serviceActionBundleKey";
             try{
                uBundle.putString(str1, a);
                uBundle = b.getContentResolver().call(cl2.e, "serviceIntentCall", str, uBundle);
             }catch(java.lang.IllegalArgumentException e5){
                str1 = new StringBuilder((String.valueOf(e5).length() + 34));
                uBundle = str;
             }
             if (uBundle != null) {
                str = uBundle.getParcelable("serviceResponseIntentKey");
             }
             if (str == null && a.length()) {
                "Dynamic lookup for intent failed for action: ".concat(a);
             }
          }
          if (str == null) {
             str = new Intent(a).setPackage(te.b);
          }
       }else {
          str = new Intent().setComponent(str);
       }
       d.getClass();
       ComponentName component = str.getComponent();
       int i = 1;
       boolean b1 = false;
       if (component != null) {
          String packageName = component.getPackageName();
          str1 = "com.google.android.gms";
          try{
             str1.equals(packageName);
             if ((bs7.a(b).a.getPackageManager().getApplicationInfo(packageName, b1).flags & 0x200000)) {
                packageName = 1;
             label_0099 :
                if (!component) {
                   b1 = b.bindService(str, this, te.c);
                }
                this.c = b1;
                if (b1) {
                   d = tg.c;
                   d.sendMessageDelayed(d.obtainMessage(i, te), tg.f);
                   return;
                }else {
                   this.b = 2;
                   try{
                      tg.d.a(b, this);
                      return;
                   }catch(java.lang.IllegalArgumentException e0){
                   }
                }
             }
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          }
       }
       component = 0;
       goto label_0099 ;
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       b08 a = this.g.a;
       _monitor_enter(a);
       this.g.c.removeMessages(1, this.e);
       this.d = p1;
       this.f = p0;
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onServiceConnected(p0, p1);
       }
       this.b = 1;
       _monitor_exit(a);
       return;
    }
    public final void onServiceDisconnected(ComponentName p0){
       b08 a = this.g.a;
       _monitor_enter(a);
       this.g.c.removeMessages(1, this.e);
       this.d = null;
       this.f = p0;
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onServiceDisconnected(p0);
       }
       this.b = 2;
       _monitor_exit(a);
       return;
    }
}
