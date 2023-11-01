package p.lo;
import p.ob2;
import android.media.AudioManager$OnAudioFocusChangeListener;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest$Builder;
import java.lang.Boolean;
import p.ao;
import android.media.AudioAttributes$Builder;
import java.lang.Number;
import android.media.AudioAttributes;
import android.os.Handler;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.Context;
import android.os.Build$VERSION;
import android.app.NotificationManager;
import android.app.NotificationChannel;
import java.lang.CharSequence;

public abstract class lo	// class@001d95 from classes.dex
{

    public static final AudioFocusRequest a(ob2 p0,AudioManager$OnAudioFocusChangeListener p1){
       ob2 c;
       ao a;
       ao b;
       AudioFocusRequest$Builder uBuilder = new AudioFocusRequest$Builder(p0.b);
       if ((c = p0.c) != null) {
          uBuilder.setAcceptsDelayedFocusGain(c.booleanValue());
       }
       if ((c = p0.t) != null) {
          AudioAttributes$Builder uBuilder1 = new AudioAttributes$Builder();
          if ((a = c.a) != null) {
             uBuilder1.setContentType(a.intValue());
          }
          if ((b = c.b) != null) {
             uBuilder1.setUsage(b.intValue());
          }
          uBuilder.setAudioAttributes(uBuilder1.build());
       }
       c = p0.w;
       if (!c instanceof Handler) {
          c = null;
       }
       if (c != null) {
          uBuilder.setOnAudioFocusChangeListener(p1, c);
       }else {
          uBuilder.setOnAudioFocusChangeListener(p1);
       }
       if ((p0 = p0.x) != null) {
          uBuilder.setWillPauseWhenDucked(p0.booleanValue());
       }
       AudioFocusRequest uAudioFocusR = uBuilder.build();
       co5.l(uAudioFocusR, "builder.build\(\)");
       return uAudioFocusR;
    }
    public static void b(Context p0,String p1,int p2,int p3,int p4,boolean p5){
       NotificationManager systemServic;
       NotificationChannel notification;
       if (Build$VERSION.SDK_INT < 26) {
          return;
       }
       if ((systemServic = p0.getSystemService("notification")) == null) {
          return;
       }
       if (systemServic.getNotificationChannel(p1) == null) {
          notification = new NotificationChannel(p1, p0.getString(p3), p2);
          notification.setDescription(p0.getString(p4));
          notification.setShowBadge(p5);
          systemServic.createNotificationChannel(notification);
       }
       return;
    }
    public static void c(Context p0){
       lo.b(p0, "channel_id_default", 2, R.string.default_channel, 0x7f12010e, true);
    }
}
