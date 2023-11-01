package com.spotify.playback.playbacknative.AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$2;
import android.media.AudioRouting$OnRoutingChangedListener;
import com.spotify.playback.playbacknative.AudioTrackAdapter$OnRoutingChangedListener;
import com.spotify.playback.playbacknative.AudioTrackAdapterImpl;
import java.lang.Object;
import android.media.AudioRouting;
import android.media.AudioDeviceInfo;
import p.v3;
import com.spotify.playback.playbacknative.AudioDeviceInfoFacade;

final class AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$2 implements AudioRouting$OnRoutingChangedListener	// class@000ade from classes.dex
{
    final AudioTrackAdapter$OnRoutingChangedListener $listener;
    final AudioTrackAdapterImpl this$0;

    public void AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$2(AudioTrackAdapter$OnRoutingChangedListener p0,AudioTrackAdapterImpl p1){
       this.$listener = p0;
       this.this$0 = p1;
       super();
    }
    public final void onRoutingChanged(AudioRouting p0){
       AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$2 t$listener = this.$listener;
       AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$2 tthis$0 = this.this$0;
       AudioDeviceInfo uAudioDevice = (p0 != null)? p0.e(p0): null;
       t$listener.onRoutingChanged(AudioTrackAdapterImpl.access$toAudioDeviceInfoFacade(tthis$0, uAudioDevice));
       return;
    }
}
