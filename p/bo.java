package p.bo;
import android.media.AudioManager$OnAudioFocusChangeListener;
import p.eo;
import p.r44;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import android.os.Build$VERSION;
import p.oe7;
import p.qo5;
import android.support.v4.media.session.d;
import android.media.session.MediaController$TransportControls;
import android.support.v4.media.session.PlaybackStateCompat;

public final class bo implements AudioManager$OnAudioFocusChangeListener	// class@001108 from classes.dex
{
    public final r44 a;
    public final Handler b;
    public final co c;
    public boolean d;

    public void bo(eo p0,r44 p1){
       super();
       Handler handler = new Handler(Looper.getMainLooper());
       this.b = handler;
       this.a = p1;
       this.c = (Build$VERSION.SDK_INT >= 26)? new oe7(p0, this, handler): new qo5(p0, this, handler);
       return;
    }
    public final void onAudioFocusChange(int p0){
       int i = 1;
       bo ta = this.a;
       if (p0 != -3 && (p0 != -2 && p0 != -1)) {
          if (p0 == i && this.d != null) {
             ta.f().a.play();
          }
       }else {
          PlaybackStateCompat playbackStat = ta.c();
          boolean b = false;
          if (playbackStat != null) {
             if ((playbackStat = playbackStat.a) != 6 && playbackStat != 3) {
                i = 0;
             }
             b = i;
          }
          this.d = b;
          if (b) {
             ta.f().a.pause();
          }
       }
       return;
    }
}
