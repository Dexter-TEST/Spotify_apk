package p.w43;
import android.os.IInterface;
import java.lang.CharSequence;
import android.support.v4.media.MediaMetadataCompat;
import android.os.Bundle;
import java.util.ArrayList;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;

public interface abstract w43 implements IInterface	// class@002ac3 from classes.dex
{

    void b(CharSequence p0);
    void d();
    void e(MediaMetadataCompat p0);
    void f(int p0);
    void l(int p0);
    void m(Bundle p0);
    void o(ArrayList p0);
    void w(PlaybackStateCompat p0);
    void x(ParcelableVolumeInfo p0);
}
