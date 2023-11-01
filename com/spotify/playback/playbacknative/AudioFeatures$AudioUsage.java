package com.spotify.playback.playbacknative.AudioFeatures$AudioUsage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AudioFeatures$AudioUsage extends Enum	// class@000ad7 from classes.dex
{
    private final int attr;
    private static final AudioFeatures$AudioUsage[] $VALUES;
    public static final AudioFeatures$AudioUsage ALARM;
    public static final AudioFeatures$AudioUsage MEDIA;

    private static final AudioFeatures$AudioUsage[] $values(){
       AudioFeatures$AudioUsage[] uAudioUsageA = new AudioFeatures$AudioUsage[]{AudioFeatures$AudioUsage.MEDIA,AudioFeatures$AudioUsage.ALARM};
       return uAudioUsageA;
    }
    static {
       AudioFeatures$AudioUsage.MEDIA = new AudioFeatures$AudioUsage("MEDIA", 0, 1);
       AudioFeatures$AudioUsage.ALARM = new AudioFeatures$AudioUsage("ALARM", 1, 4);
       AudioFeatures$AudioUsage.$VALUES = AudioFeatures$AudioUsage.$values();
    }
    private void AudioFeatures$AudioUsage(String p0,int p1,int p2){
       this.attr = p2;
    }
    public static AudioFeatures$AudioUsage valueOf(String p0){
       return Enum.valueOf(AudioFeatures$AudioUsage.class, p0);
    }
    public static AudioFeatures$AudioUsage[] values(){
       return AudioFeatures$AudioUsage.$VALUES.clone();
    }
    public final int getAttr(){
       return this.attr;
    }
}
