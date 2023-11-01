package com.spotify.playback.playbacknative.AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$1;
import android.media.AudioTrack$OnRoutingChangedListener;
import com.spotify.playback.playbacknative.AudioTrackAdapter$OnRoutingChangedListener;
import com.spotify.playback.playbacknative.AudioTrackAdapterImpl;
import java.lang.Object;
import android.media.AudioTrack;
import android.media.AudioDeviceInfo;
import p.eh;
import com.spotify.playback.playbacknative.AudioDeviceInfoFacade;

final class AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$1 implements AudioTrack$OnRoutingChangedListener	// class@000add from classes.dex
{
    final AudioTrackAdapter$OnRoutingChangedListener $listener;
    final AudioTrackAdapterImpl this$0;

    public void AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$1(AudioTrackAdapter$OnRoutingChangedListener p0,AudioTrackAdapterImpl p1){
       this.$listener = p0;
       this.this$0 = p1;
       super();
    }
    public final void onRoutingChanged(AudioTrack p0){
       AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$1 t$listener = this.$listener;
       AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$1 tthis$0 = this.this$0;
       AudioDeviceInfo uAudioDevice = (p0 != null)? eh.h(p0): null;
       t$listener.onRoutingChanged(AudioTrackAdapterImpl.access$toAudioDeviceInfoFacade(tthis$0, uAudioDevice));
       return;
    }
}
