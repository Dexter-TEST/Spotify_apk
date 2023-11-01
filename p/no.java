package p.no;
import com.spotify.playback.playbacknative.AudioDriver$AudioDriverListener;
import p.oo;
import java.lang.Object;
import java.lang.Integer;

public final class no implements AudioDriver$AudioDriverListener	// class@00201e from classes.dex
{
    public final oo a;

    public void no(oo p0){
       this.a = p0;
       super();
    }
    public final void onAudioTrackCreated(int p0){
       this.a.a = p0;
    }
    public final void onAudioTrackDestroyed(int p0){
       p0.a = 0;
    }
    public final void onFlushComplete(int p0){
    }
    public final void onFlushStart(int p0){
    }
    public final void onPaused(boolean p0,Integer p1){
    }
}
