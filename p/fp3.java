package p.fp3;
import p.ti4;
import java.lang.Object;
import p.fn0;
import p.t00;
import android.content.ContextWrapper;
import android.os.Build$VERSION;
import android.content.Context;
import java.lang.String;
import p.n6;
import java.lang.IllegalStateException;
import p.lo;
import android.content.Intent;
import p.xj0;
import p.vv7;
import android.app.PendingIntent;
import p.sj4;
import java.lang.CharSequence;
import android.app.Notification;
import java.lang.Class;
import android.app.NotificationManager;

public final class fp3	// class@001610 from classes.dex
{
    public final fn0 a;
    public final ti4 b;
    public final t00 c;

    public void fp3(ti4 p0){
       super();
       this.a = new fn0();
       this.c = t00.a();
       this.b = p0;
    }
    public static void a(ContextWrapper p0,boolean p1){
       if (p1) {
          if (Build$VERSION.SDK_INT >= 33 && n6.a(p0, "android.permission.POST_NOTIFICATIONS") == -1) {
             throw new IllegalStateException("Trying to show a notification when permission is required but not granted");
          }else {
             lo.b(p0, "channel_id_data_warning", 4, R.string.data_warning_channel, 0x7f12010c, true);
             sj4 osj4 = new sj4(p0, "channel_id_data_warning");
             osj4.e(p0.getText(R.string.notification_network_limit_reached_title));
             osj4.d(p0.getText(R.string.notification_network_limit_reached_message));
             osj4.w.icon = 0x7f07059d;
             osj4.s = n6.b(p0, R.color.green_light);
             osj4.g = PendingIntent.getActivity(p0, 0, xj0.z0(p0, "spotify.intent.action.CELLULAR_SETTINGS"), vv7.d(0));
             osj4.q = "err";
             osj4.i = 1;
             osj4.f(8, 1);
             p0 = p0.getSystemService("notification");
             p0.getClass();
             p0.notify(R.id.notification_network_limit_reached, osj4.b());
          }
       }else {
          p0 = p0.getSystemService("notification");
          p0.getClass();
          p0.cancel(R.id.notification_network_limit_reached);
       }
       return;
    }
}
