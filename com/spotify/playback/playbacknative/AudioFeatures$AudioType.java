package com.spotify.playback.playbacknative.AudioFeatures$AudioType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AudioFeatures$AudioType extends Enum	// class@000ad6 from classes.dex
{
    private final int attr;
    private static final AudioFeatures$AudioType[] $VALUES;
    public static final AudioFeatures$AudioType MUSIC;
    public static final AudioFeatures$AudioType SPEECH;

    private static final AudioFeatures$AudioType[] $values(){
       AudioFeatures$AudioType[] uAudioTypeAr = new AudioFeatures$AudioType[]{AudioFeatures$AudioType.MUSIC,AudioFeatures$AudioType.SPEECH};
       return uAudioTypeAr;
    }
    static {
       AudioFeatures$AudioType.MUSIC = new AudioFeatures$AudioType("MUSIC", 0, 2);
       AudioFeatures$AudioType.SPEECH = new AudioFeatures$AudioType("SPEECH", 1, 1);
       AudioFeatures$AudioType.$VALUES = AudioFeatures$AudioType.$values();
    }
    private void AudioFeatures$AudioType(String p0,int p1,int p2){
       this.attr = p2;
    }
    public static AudioFeatures$AudioType valueOf(String p0){
       return Enum.valueOf(AudioFeatures$AudioType.class, p0);
    }
    public static AudioFeatures$AudioType[] values(){
       return AudioFeatures$AudioType.$VALUES.clone();
    }
    public final int getAttr(){
       return this.attr;
    }
}
