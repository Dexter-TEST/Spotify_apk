package p.of5;
import android.content.Context;
import java.lang.Object;
import p.sj4;
import java.lang.String;
import android.app.Notification;
import p.r44;
import p.lo;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.app.PendingIntent;
import android.media.session.MediaController;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.SpannableString;
import java.lang.CharSequence;
import android.text.style.StyleSpan;
import android.os.Build$VERSION;
import android.content.res.Resources;
import android.graphics.Bitmap;
import java.lang.Math;
import java.util.ArrayList;
import p.do5;
import p.ox7;
import com.spotify.lite.notification.CustomActionsReceiver;
import android.content.Intent;
import p.vv7;
import p.b51;
import p.tj4;
import p.uj4;

public final class of5	// class@00210e from classes.dex
{
    public final Context a;
    public final sj4 b;
    public final sj4 c;

    public void of5(Context p0,int p1){
       if (p1 != 1) {
          super();
          this.a = p0;
          this.b = this.b();
          this.c = this.b();
          return;
       }else {
          super();
          this.a = p0;
          sj4 osj4 = new sj4(p0, "channel_id_offline");
          sj4 w = osj4.w;
          w.icon = 0x7f07059d;
          osj4.t = 1;
          w.when = 0;
          osj4.j = false;
          osj4.f(8, 1);
          this.b = osj4;
          osj4 = new sj4(p0, "channel_id_offline");
          sj4 w1 = osj4.w;
          w1.icon = 0x7f07059d;
          osj4.t = 1;
          osj4.i = 0;
          osj4.q = "err";
          w1.when = 0;
          osj4.j = false;
          osj4.f(8, 1);
          osj4.f(16, 1);
          this.c = osj4;
          return;
       }
    }
    public final Notification a(r44 p0){
       MediaDescriptionCompat b1;
       int b2;
       int i1;
       int b6;
       of5 oof5 = this;
       r44 or44 = p0;
       lo.b(oof5.a, "channel_id_playback_v2", 2, R.string.player_notification_channel, 0x7f1202af, false);
       MediaMetadataCompat mediaMetadat = p0.b();
       PlaybackStateCompat playbackStat = p0.c();
       of5 b = oof5.b;
       b.g = or44.a.a.getSessionActivity();
       of5 a = oof5.a;
       int i = 1;
       if (mediaMetadat != null) {
          MediaDescriptionCompat mediaDescrip = mediaMetadat.b();
          if ((b1 = mediaDescrip.b) == null) {
             b1 = a.getString(R.string.player_notification_waiting_to_connect);
          }
          SpannableString spannableStr = new SpannableString(b1);
          spannableStr.setSpan(new StyleSpan(i), 0, b1.length(), 33);
          b.e(spannableStr);
          b.d(mediaDescrip.c);
          b.l = sj4.c(mediaDescrip.t);
       }
       PendingIntent pendingInten = null;
       Bitmap uBitmap = (mediaMetadat == null)? pendingInten: mediaMetadat.b().v;
       if (uBitmap != null && Build$VERSION.SDK_INT < 27) {
          Resources resources = b.a.getResources();
          b2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
          i1 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
          if (uBitmap.getWidth() > b2 || uBitmap.getHeight() > i1) {
             double d = Math.min(((double)b2 / (double)Math.max(i, uBitmap.getWidth())), ((double)i1 / (double)Math.max(i, uBitmap.getHeight())));
             uBitmap = Bitmap.createScaledBitmap(uBitmap, (int)Math.ceil(((double)uBitmap.getWidth() * d)), (int)Math.ceil(((double)uBitmap.getHeight() * d)), i);
          }
       }
       b.h = uBitmap;
       b.b.clear();
       b2 = do5.I(playbackStat, 4);
       boolean b3 = do5.I(playbackStat, 2);
       boolean b4 = do5.I(playbackStat, 16);
       boolean b5 = do5.I(playbackStat, 32);
       i1 = 0x7f1202b1;
       if (do5.I(playbackStat, 128)) {
          int i2 = (b6 = ox7.v(mediaMetadat))? 0x7f0705a1: 0x7f07059f;
          Intent intent = new Intent("com.spotify.liteplayer.player.ACTION_FAVORITE").setPackage(a.getPackageName());
          intent.putExtra("com.spotify.liteplayer.player.extra_favorite", (b6 ^ i));
          b.a(i2, a.getString(i1), PendingIntent.getBroadcast(a, R.id.player_action_request, intent, vv7.d(0x10000000)));
       }else {
          b.a(R.drawable.icn_notification_new_positive_feedback_disabled, a.getString(i1), pendingInten);
       }
       b6 = 0x7f1202b5;
       if (b4) {
          b.a(R.drawable.icn_notification_prev, a.getString(b6), b51.a(a, 16));
       }else {
          b.a(R.drawable.icn_notification_prev_disabled, a.getString(b6), pendingInten);
       }
       if (b3) {
          b.a(R.drawable.icn_notification_pause, a.getString(R.string.player_notification_pause), b51.a(a, 2));
       }else {
          b6 = 0x7f1202b4;
          if (b2) {
             b.a(R.drawable.icn_notification_play, a.getString(b6), b51.a(a, 4));
          }else {
             b.a(R.drawable.icn_notification_play_disabled, a.getString(b6), pendingInten);
          }
       }
       b6 = 0x7f1202b2;
       if (b5) {
          b.a(R.drawable.icn_notification_next, a.getString(b6), b51.a(a, 32));
       }else {
          b.a(R.drawable.icn_notification_next_disabled, a.getString(b6), pendingInten);
       }
       b.a(R.drawable.icn_notification_dismiss, a.getString(R.string.player_notification_dismiss), b51.a(a, 1));
       tj4 otj4 = new tj4();
       otj4.c = new int[3]{0,2,3};
       otj4.d = or44.b;
       b.g(otj4);
       b.f(2, do5.K(playbackStat));
       b.w.deleteIntent = b51.a(a, 1);
       return b.b();
    }
    public final sj4 b(){
       sj4 osj4 = new sj4(this.a, "channel_id_playback_v2");
       sj4 w = osj4.w;
       w.icon = 0x7f07059d;
       osj4.t = 1;
       w.when = 0;
       osj4.j = false;
       osj4.f(2, 1);
       osj4.f(8, 1);
       return osj4;
    }
}
