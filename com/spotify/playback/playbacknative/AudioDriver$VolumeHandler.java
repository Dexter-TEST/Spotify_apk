package com.spotify.playback.playbacknative.AudioDriver$VolumeHandler;
import android.os.Handler;
import android.os.Looper;
import com.spotify.playback.playbacknative.AudioDriver;
import com.spotify.playback.playbacknative.AudioDriver$1;
import android.os.Message;
import java.lang.Object;
import java.lang.String;
import p.sn0;
import java.lang.Float;
import com.spotify.playback.playbacknative.AudioTrackAdapterImpl;
import android.media.AudioTrack;

class AudioDriver$VolumeHandler extends Handler	// class@000ad2 from classes.dex
{
    private final AudioDriver mAudioDriver;

    private void AudioDriver$VolumeHandler(Looper p0,AudioDriver p1){
       super(p0);
       this.mAudioDriver = p1;
    }
    public void AudioDriver$VolumeHandler(Looper p0,AudioDriver p1,AudioDriver$1 p2){
       super(p0, p1);
    }
    public void handleMessage(Message p0){
       Object obj = AudioDriver.access$600(this.mAudioDriver);
       _monitor_enter(obj);
       if (p0.what == 1) {
          sn0.a("setvolume");
          Message obj1 = p0.obj;
          if (AudioDriver.access$700(this.mAudioDriver) != null) {
             AudioDriver.access$800(obj1.floatValue(), AudioDriver.access$700(this.mAudioDriver).getAudioTrack());
          }
          AudioDriver.access$902(this.mAudioDriver, obj1.floatValue());
       }
       _monitor_exit(obj);
       super.handleMessage(p0);
       return;
    }
}
