package p.hl2;
import p.il2;
import java.lang.Object;
import android.content.Context;
import p.au7;
import android.content.DialogInterface$OnCancelListener;
import android.app.AlertDialog;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import java.lang.String;
import android.app.AlertDialog$Builder;
import p.tt7;
import java.lang.CharSequence;
import android.content.DialogInterface$OnClickListener;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import android.app.Activity;
import androidx.fragment.app.k;
import p.ae2;
import p.hw6;
import android.app.Dialog;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.o;
import java.lang.NullPointerException;
import android.app.FragmentManager;
import p.po1;
import android.content.Intent;
import p.ak3;
import p.su7;
import android.app.PendingIntent;
import p.gl2;
import android.os.Handler;
import p.w51;
import android.app.NotificationManager;
import p.sj4;
import p.rj4;
import p.uj4;
import android.content.pm.PackageManager;
import p.ye7;
import java.lang.Boolean;
import android.content.pm.ApplicationInfo;
import android.app.Notification;
import java.lang.System;
import android.os.Build$VERSION;
import android.app.NotificationChannel;
import java.lang.IllegalStateException;
import p.ql2;
import java.util.concurrent.atomic.AtomicBoolean;

public class hl2 extends il2	// class@001873 from classes.dex
{
    public static final Object b;
    public static final hl2 c;

    static {
       hl2.b = new Object();
       hl2.c = new hl2();
    }
    public void hl2(){
       super();
    }
    public static hl2 c(){
       throw null;
    }
    public static AlertDialog f(Context p0,int p1,au7 p2,DialogInterface$OnCancelListener p3){
       String str;
       String str1;
       AlertDialog uAlertDialog = null;
       if (!p1) {
          return uAlertDialog;
       }
       TypedValue typedValue = new TypedValue();
       p0.getTheme().resolveAttribute(0x1010309, typedValue, true);
       if ("Theme.Dialog.Alert".equals(p0.getResources().getResourceEntryName(typedValue.resourceId))) {
          uAlertDialog = new AlertDialog$Builder(p0, 5);
       }
       if (uAlertDialog == null) {
          uAlertDialog = new AlertDialog$Builder(p0);
       }
       uAlertDialog.setMessage(tt7.e(p0, p1));
       if (p3 != null) {
          uAlertDialog.setOnCancelListener(p3);
       }
       Resources resources = p0.getResources();
       if (p1 != 1) {
          if (p1 != 2) {
             str = (p1 != 3)? resources.getString(0x104000a): resources.getString(R.string.common_google_play_services_enable_button);
          }else {
             str = resources.getString(R.string.common_google_play_services_update_button);
          }
       }else {
          str = resources.getString(R.string.common_google_play_services_install_button);
       }
       if (str != null) {
          uAlertDialog.setPositiveButton(str, p2);
       }
       if ((str1 = tt7.a(p0, p1)) != null) {
          uAlertDialog.setTitle(str1);
       }
       Object[] objArray = new Object[true];
       objArray[0] = Integer.valueOf(p1);
       String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", objArray);
       IllegalArgumentException illegalArgum = new IllegalArgumentException();
       return uAlertDialog.create();
    }
    public static void g(Activity p0,AlertDialog p1,String p2,DialogInterface$OnCancelListener p3){
       if (p0 instanceof k) {
          ae2 uoae2 = p0.y();
          hw6 ohw6 = new hw6();
          if (p1 != null) {
             p1.setOnCancelListener(null);
             p1.setOnDismissListener(null);
             ohw6.H = p1;
             if (p3 != null) {
                ohw6.I = p3;
             }
             ohw6.B(uoae2, p2);
             return;
          }else {
             throw new NullPointerException("Cannot display null dialog");
          }
       }else {
          FragmentManager fragmentMana = p0.getFragmentManager();
          po1 opo1 = new po1();
          if (p1 == null) {
             throw new NullPointerException("Cannot display null dialog");
          }
          p1.setOnCancelListener(null);
          p1.setOnDismissListener(null);
          opo1.a = p1;
          if (p3 != null) {
             opo1.b = p3;
          }
          opo1.show(fragmentMana, p2);
          return;
       }
    }
    public final Intent a(int p0,Context p1,String p2){
       return super.a(p0, p1, p2);
    }
    public final int b(Context p0,int p1){
       return super.b(p0, p1);
    }
    public final int d(Context p0){
       return this.b(p0, il2.a);
    }
    public final void e(Activity p0,int p1,DialogInterface$OnCancelListener p2){
       AlertDialog uAlertDialog;
       if ((uAlertDialog = hl2.f(p0, p1, new au7(p0, super.a(p1, p0, "d")), p2)) == null) {
          return;
       }
       hl2.g(p0, uAlertDialog, "GooglePlayServicesErrorDialog", p2);
       return;
    }
    public final void h(Activity p0,ak3 p1,int p2,su7 p3){
       AlertDialog uAlertDialog;
       if ((uAlertDialog = hl2.f(p0, p2, new au7(super.a(p2, p0, "d"), p1), p3)) == null) {
          return;
       }
       hl2.g(p0, uAlertDialog, "GooglePlayServicesErrorDialog", p3);
       return;
    }
    public final void i(Context p0,int p1,PendingIntent p2){
       NotificationChannel notification;
       Object[] objArray = new Object[2];
       objArray[0] = Integer.valueOf(p1);
       object oobject = null;
       objArray[1] = oobject;
       String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", objArray);
       IllegalArgumentException illegalArgum = new IllegalArgumentException();
       if (p1 == 18) {
          new gl2(this, p0).sendEmptyMessageDelayed(1, 0x1d4c0);
          return;
       }else if(p2 == null){
          return;
       }else {
          int i = 6;
          String str = (p1 == i)? tt7.b(p0, "common_google_play_services_resolution_required_title"): tt7.a(p0, p1);
          if (str == null) {
             str = p0.getResources().getString(R.string.common_google_play_services_notification_ticker);
          }
          String str1 = (p1 != i && p1 != 19)? tt7.e(p0, p1): tt7.c(p0, "common_google_play_services_resolution_required_text", tt7.d(p0));
          Resources resources = p0.getResources();
          Object systemServic = p0.getSystemService("notification");
          w51.k(systemServic);
          sj4 osj4 = new sj4(p0, oobject);
          osj4.p = true;
          osj4.f(16, 1);
          osj4.e(str);
          rj4 str2 = new rj4();
          str2.c = sj4.c(str1);
          osj4.g(str2);
          PackageManager packageManag = p0.getPackageManager();
          if (ye7.b == null) {
             ye7.b = Boolean.valueOf(packageManag.hasSystemFeature("android.hardware.type.watch"));
          }
          if (ye7.b.booleanValue()) {
             osj4.w.icon = p0.getApplicationInfo().icon;
             osj4.i = 2;
             if (ye7.H(p0)) {
                osj4.a(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), p2);
             }else {
                osj4.g = p2;
             }
          }else {
             osj4.w.icon = 0x108008a;
             osj4.w.tickerText = sj4.c(resources.getString(R.string.common_google_play_services_notification_ticker));
             osj4.w.when = System.currentTimeMillis();
             osj4.g = p2;
             osj4.d(str1);
          }
          int sDK_INT = Build$VERSION.SDK_INT;
          str1 = 26;
          packageManag = (sDK_INT >= str1)? 1: 0;
          if (packageManag) {
             sDK_INT = (sDK_INT >= str1)? 1: 0;
             if (sDK_INT) {
                sDK_INT = hl2.b;
                _monitor_enter(sDK_INT);
                _monitor_exit(sDK_INT);
                String str3 = "com.google.android.gms.availability";
                notification = systemServic.getNotificationChannel(str3);
                String str4 = p0.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                if (notification == null) {
                   systemServic.createNotificationChannel(new NotificationChannel(str3, str4, 4));
                }else if(!str4.contentEquals(notification.getName())){
                   notification.setName(str4);
                   systemServic.createNotificationChannel(notification);
                }
                osj4.u = str3;
             }else {
                throw new IllegalStateException();
             }
          }
          Notification notification1 = osj4.b();
          if (p1 != 1 && (p1 != 2 && p1 != 3)) {
             p1 = 0x9b6d;
          }else {
             ql2.c.set(0);
             p1 = 0x28c4;
          }
          systemServic.notify(p1, notification1);
          return;
       }
    }
}
