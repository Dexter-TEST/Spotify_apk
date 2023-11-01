package com.spotify.playback.playbacknative.AudioFeatures;
import com.spotify.playback.playbacknative.AudioFeatures$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.playback.playbacknative.AudioFeatures$AudioUsage;
import com.spotify.playback.playbacknative.AudioFeatures$AudioType;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.playback.playbacknative.AudioFeatures$WhenMappings;
import java.lang.Enum;
import p.cd2;

public final class AudioFeatures	// class@000ada from classes.dex
{
    private final AudioFeatures$AudioType audioType;
    private final AudioFeatures$AudioUsage audioUsage;
    public static final int CORE_AUDIO_CONTENT_TYPE_MUSIC = 0;
    public static final int CORE_AUDIO_CONTENT_TYPE_SPEECH = 1;
    public static final int CORE_STREAM_TYPE_ALARM = 1;
    public static final int CORE_STREAM_TYPE_MUSIC;
    public static final AudioFeatures$Companion Companion;

    static {
       AudioFeatures.Companion = new AudioFeatures$Companion(null);
    }
    public void AudioFeatures(AudioFeatures$AudioUsage p0,AudioFeatures$AudioType p1){
       co5.o(p0, "audioUsage");
       co5.o(p1, "audioType");
       super();
       this.audioUsage = p0;
       this.audioType = p1;
    }
    public static final AudioFeatures fromCoreAudioFeatures(int p0,int p1){
       return AudioFeatures.Companion.fromCoreAudioFeatures(p0, p1);
    }
    public final AudioFeatures$AudioType getAudioType(){
       return this.audioType;
    }
    public final AudioFeatures$AudioUsage getAudioUsage(){
       return this.audioUsage;
    }
    public final int getAudioUsageDeprecated(){
       int i;
       if ((i = AudioFeatures$WhenMappings.$EnumSwitchMapping$0[this.audioUsage.ordinal()]) != 1) {
          if (i == 2) {
             i = 4;
          }else {
             throw new cd2(10);
          }
       }else {
          i = 3;
       }
       return i;
    }
}
