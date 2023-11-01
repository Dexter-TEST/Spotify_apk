package p.qj4;
import android.app.Notification$MediaStyle;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.media.session.MediaSession$Token;
import android.app.Notification$Builder;
import android.app.Notification$Style;

public abstract class qj4	// class@0023b3 from classes.dex
{

    public static Notification$MediaStyle a(){
       return new Notification$MediaStyle();
    }
    public static Notification$MediaStyle b(Notification$MediaStyle p0,int[] p1,MediaSessionCompat$Token p2){
       if (p1 != null) {
          qj4.e(p0, p1);
       }
       if (p2 != null) {
          qj4.c(p0, p2.b);
       }
       return p0;
    }
    public static void c(Notification$MediaStyle p0,MediaSession$Token p1){
       p0.setMediaSession(p1);
    }
    public static void d(Notification$Builder p0,Notification$MediaStyle p1){
       p0.setStyle(p1);
    }
    public static void e(Notification$MediaStyle p0,int[] p1){
       p0.setShowActionsInCompactView(p1);
    }
}
