package com.spotify.playback.playbacknative.AudioTrackAdapterImpl;
import com.spotify.playback.playbacknative.AudioTrackAdapter;
import android.media.AudioTrack;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.HashMap;
import android.media.AudioDeviceInfo;
import com.spotify.playback.playbacknative.AudioDeviceInfoFacade;
import com.spotify.playback.playbacknative.AudioTrackAdapter$OnRoutingChangedListener;
import android.os.Handler;
import android.os.Build$VERSION;
import com.spotify.playback.playbacknative.AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$1;
import android.media.AudioTrack$OnRoutingChangedListener;
import p.eh;
import com.spotify.playback.playbacknative.AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$2;
import android.media.AudioRouting$OnRoutingChangedListener;
import p.v3;

public final class AudioTrackAdapterImpl implements AudioTrackAdapter	// class@000adf from classes.dex
{
    private final HashMap audioRoutingListeners;
    private final AudioTrack audioTrack;
    private final HashMap audioTrackListeners;

    public void AudioTrackAdapterImpl(AudioTrack p0){
       co5.o(p0, "audioTrack");
       super();
       this.audioTrack = p0;
       this.audioTrackListeners = new HashMap();
       this.audioRoutingListeners = new HashMap();
    }
    public static final AudioDeviceInfoFacade access$toAudioDeviceInfoFacade(AudioTrackAdapterImpl p0,AudioDeviceInfo p1){
       return p0.toAudioDeviceInfoFacade(p1);
    }
    private final AudioDeviceInfoFacade toAudioDeviceInfoFacade(AudioDeviceInfo p0){
       AudioDeviceInfoFacade uAudioDevice = (p0 != null)? new AudioDeviceInfoFacade(p0): null;
       return uAudioDevice;
    }
    public void addOnRoutingChangedListener(AudioTrackAdapter$OnRoutingChangedListener p0,Handler p1){
       int sDK_INT;
       co5.o(p0, "listener");
       co5.o(p1, "handler");
       if ((sDK_INT = Build$VERSION.SDK_INT) == 23) {
          AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$1 uoaddOnRouti = new AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$1(p0, this);
          this.audioTrackListeners.put(p0, uoaddOnRouti);
          eh.u(this.audioTrack, uoaddOnRouti, p1);
       }else if(sDK_INT >= 24){
          AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$2 uoaddOnRouti1 = new AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$2(p0, this);
          this.audioRoutingListeners.put(p0, uoaddOnRouti1);
          this.audioTrack.q(this.audioTrack, uoaddOnRouti1, p1);
       }
       return;
    }
    public final AudioTrack getAudioTrack(){
       return this.audioTrack;
    }
    public AudioDeviceInfoFacade getRoutedDevice(){
       AudioDeviceInfoFacade uAudioDevice = (Build$VERSION.SDK_INT >= 23)? this.toAudioDeviceInfoFacade(eh.h(this.audioTrack)): null;
       return uAudioDevice;
    }
    public void removeOnRoutingChangedListener(AudioTrackAdapter$OnRoutingChangedListener p0){
       int sDK_INT;
       AudioTrack$OnRoutingChangedListener onRoutingCha;
       AudioRouting$OnRoutingChangedListener onRoutingCha1;
       co5.o(p0, "listener");
       if ((sDK_INT = Build$VERSION.SDK_INT) == 23) {
          if ((onRoutingCha = this.audioTrackListeners.remove(p0)) != null) {
             eh.t(this.audioTrack, onRoutingCha);
          }
       }else if(sDK_INT >= 24 && (onRoutingCha1 = this.audioRoutingListeners.remove(p0)) != null){
          onRoutingCha1.p(this.audioTrack, onRoutingCha1);
       }
       return;
    }
}
