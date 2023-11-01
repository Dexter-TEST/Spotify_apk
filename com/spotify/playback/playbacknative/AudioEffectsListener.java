package com.spotify.playback.playbacknative.AudioEffectsListener;
import com.spotify.playback.playbacknative.AudioDriver$AudioDriverListener;
import android.content.Context;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import java.lang.Integer;

public class AudioEffectsListener implements AudioDriver$AudioDriverListener	// class@000ad4 from classes.dex
{
    private final Context mContext;
    private Integer mCurrentAudioEffectsSessionId;

    public void AudioEffectsListener(Context p0){
       super();
       this.mContext = p0.getApplicationContext();
    }
    private void disableEqualizer(int p0){
       Intent intent = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
       intent.putExtra("android.media.extra.PACKAGE_NAME", this.mContext.getPackageName());
       intent.putExtra("android.media.extra.AUDIO_SESSION", p0);
       this.mContext.sendBroadcast(intent);
    }
    private void enableEqualizer(int p0){
       Intent intent = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
       intent.putExtra("android.media.extra.PACKAGE_NAME", this.mContext.getPackageName());
       intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
       intent.putExtra("android.media.extra.AUDIO_SESSION", p0);
       this.mContext.sendBroadcast(intent);
    }
    private void toggleEqualizer(boolean p0,Integer p1){
       AudioEffectsListener tmCurrentAud;
       if (p0) {
          if ((tmCurrentAud = this.mCurrentAudioEffectsSessionId) != null) {
             this.disableEqualizer(tmCurrentAud.intValue());
             this.mCurrentAudioEffectsSessionId = null;
          }
       }else if(p1 != null){
          if ((tmCurrentAud = this.mCurrentAudioEffectsSessionId) != null) {
             if (tmCurrentAud.equals(p1)) {
                return;
             }else {
                this.disableEqualizer(this.mCurrentAudioEffectsSessionId.intValue());
             }
          }
          this.mCurrentAudioEffectsSessionId = p1;
          this.enableEqualizer(p1.intValue());
       }
       return;
    }
    public void onAudioTrackCreated(int p0){
    }
    public void onAudioTrackDestroyed(int p0){
    }
    public void onFlushComplete(int p0){
    }
    public void onFlushStart(int p0){
    }
    public void onPaused(boolean p0,Integer p1){
       this.toggleEqualizer(p0, p1);
    }
}
