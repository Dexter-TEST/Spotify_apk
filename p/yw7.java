package p.yw7;
import p.h28;
import android.content.Context;
import p.dx7;
import p.w08;
import p.cy7;
import p.jd;
import java.lang.String;
import java.lang.Object;
import android.app.NotificationManager;
import android.os.Bundle;
import p.j28;
import p.ay7;
import android.os.BaseBundle;
import android.os.Build$VERSION;
import android.os.Parcelable;
import android.app.Notification$Builder;
import android.app.PendingIntent;
import java.lang.CharSequence;
import android.app.Notification;
import android.content.Intent;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.lang.Class;
import android.content.ServiceConnection;
import java.lang.Integer;
import android.app.NotificationChannel;

public final class yw7 extends h28	// class@002e41 from classes.dex
{
    public final jd b;
    public final Context c;
    public final dx7 d;
    public final w08 e;
    public final cy7 f;
    public final NotificationManager g;

    public void yw7(Context p0,dx7 p1,w08 p2,cy7 p3){
       super();
       this.b = new jd("AssetPackExtractionService");
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p0.getSystemService("notification");
    }
    public final void n(Bundle p0,j28 p1){
       int intx1;
       _monitor_enter(this);
       Object[] objArray = new Object[0];
       this.b.a("updateServiceState AIDL call", objArray);
       if (ay7.b(this.c) && ay7.a(this.c)) {
          int intx = p0.getInt("action_type");
          this.f.b(p1);
          boolean b = true;
          if (intx == b) {
             int sDK_INT = Build$VERSION.SDK_INT;
             intx = 26;
             if (sDK_INT >= intx) {
                this.y(p0.getString("notification_channel_name"));
             }
             this.e.a(b);
             yw7 tf = this.f;
             String str = p0.getString("notification_title");
             String str1 = p0.getString("notification_subtext");
             long longx = p0.getLong("notification_timeout", 0x927c0);
             Parcelable parcelable = p0.getParcelable("notification_on_click_intent");
             Notification$Builder uBuilder = (sDK_INT >= intx)? new Notification$Builder(this.c, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(longx): new Notification$Builder(this.c).setPriority(-2);
             if (parcelable instanceof PendingIntent) {
                uBuilder.setContentIntent(parcelable);
             }
             Notification$Builder uBuilder1 = uBuilder.setSmallIcon(0x1080081).setOngoing(0);
             if (str == null) {
                str = "Downloading additional file";
             }
             uBuilder1 = uBuilder1.setContentTitle(str);
             if (str1 == null) {
                str1 = "Transferring";
             }
             uBuilder1.setSubText(str1);
             if (intx1 = p0.getInt("notification_color")) {
                uBuilder.setColor(intx1).setVisibility(-1);
             }
             tf.e = uBuilder.build();
             this.c.bindService(new Intent(this.c, ExtractionForegroundService.class), this.f, b);
             _monitor_exit(this);
          }else if(intx == 2){
             this.e.a(0);
             this.f.a();
             _monitor_exit(this);
          }else {
             Object[] objArray1 = new Object[b];
             objArray1[0] = Integer.valueOf(intx);
             this.b.c("Unknown action type received: %d", objArray1);
             p1.u(new Bundle());
             _monitor_exit(this);
          }
       }else {
          p1.u(new Bundle());
          _monitor_exit(this);
       }
       return;
    }
    public synchronized final void y(String p0){
       if (p0 == null) {
          p0 = "File downloads by Play";
       }
       this.g.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", p0, 2));
       return;
    }
}
