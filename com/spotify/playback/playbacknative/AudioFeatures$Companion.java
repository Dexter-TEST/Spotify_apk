package com.spotify.playback.playbacknative.AudioFeatures$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.playback.playbacknative.AudioFeatures;
import com.spotify.playback.playbacknative.Logger;
import java.lang.Integer;
import java.lang.String;
import com.spotify.playback.playbacknative.Logger$Companion;
import com.spotify.playback.playbacknative.AudioFeatures$AudioUsage;
import com.spotify.playback.playbacknative.AudioFeatures$AudioType;

public final class AudioFeatures$Companion	// class@000ad8 from classes.dex
{

    private void AudioFeatures$Companion(){
       super();
    }
    public void AudioFeatures$Companion(DefaultConstructorMarker p0){
       super();
    }
    public final AudioFeatures fromCoreAudioFeatures(int p0,int p1){
       AudioFeatures$AudioUsage mEDIA;
       AudioFeatures$AudioType mUSIC;
       int i = 0;
       int i1 = 1;
       if (p0) {
          if (p0 != i1) {
             Object[] objArray = new Object[i1];
             objArray[i] = Integer.valueOf(p0);
             Logger.Companion.w("Unknown core AudioStreamType %d provided. Falling back to default action.", objArray);
             mEDIA = AudioFeatures$AudioUsage.MEDIA;
          }else {
             mEDIA = AudioFeatures$AudioUsage.ALARM;
          }
       }else {
          mEDIA = AudioFeatures$AudioUsage.MEDIA;
       }
       if (p1) {
          if (p1 != i1) {
             Object[] objArray1 = new Object[i1];
             objArray1[i] = Integer.valueOf(p1);
             Logger.Companion.w("Unknown core AudioContentType %d provided. Falling back to default action.", objArray1);
             mUSIC = AudioFeatures$AudioType.MUSIC;
          }else {
             mUSIC = AudioFeatures$AudioType.SPEECH;
          }
       }else {
          mUSIC = AudioFeatures$AudioType.MUSIC;
       }
       return new AudioFeatures(mEDIA, mUSIC);
    }
}
