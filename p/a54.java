package p.a54;
import android.support.v4.media.session.PlaybackStateCompat;
import p.k54;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.app.PendingIntent;
import p.z44;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;

public interface abstract a54	// class@000f18 from classes.dex
{

    PlaybackStateCompat a();
    void b(k54 p0);
    MediaSessionCompat$Token c();
    void d(PendingIntent p0);
    void e(z44 p0,Handler p1);
    void f(PlaybackStateCompat p0);
    void g(int p0);
    z44 h();
    void i(MediaMetadataCompat p0);
    void j(PendingIntent p0);
    k54 k();
    void l(int p0);
    void release();
    void setActive(boolean p0);
}
